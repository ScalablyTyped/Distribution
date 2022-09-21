package typings.vscodeOniguruma

import typings.std.Record
import typings.std.Response
import typings.std.WebAssembly.ImportValue
import typings.std.WebAssembly.WebAssemblyInstantiatedSource
import typings.vscodeOniguruma.vscodeOnigurumaNumbers.`0`
import typings.vscodeOniguruma.vscodeOnigurumaNumbers.`1`
import typings.vscodeOniguruma.vscodeOnigurumaNumbers.`2`
import typings.vscodeOniguruma.vscodeOnigurumaNumbers.`4`
import typings.vscodeOniguruma.vscodeOnigurumaNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vscode-oniguruma", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-oniguruma", "OnigScanner")
  @js.native
  open class OnigScanner protected () extends StObject {
    def this(patterns: js.Array[String]) = this()
    
    def dispose(): Unit = js.native
    
    def findNextMatchSync(string: String, startPosition: Double): IOnigMatch | Null = js.native
    def findNextMatchSync(string: String, startPosition: Double, debugCall: Boolean): IOnigMatch | Null = js.native
    def findNextMatchSync(string: String, startPosition: Double, options: Double): IOnigMatch | Null = js.native
    def findNextMatchSync(string: OnigString, startPosition: Double): IOnigMatch | Null = js.native
    def findNextMatchSync(string: OnigString, startPosition: Double, debugCall: Boolean): IOnigMatch | Null = js.native
    def findNextMatchSync(string: OnigString, startPosition: Double, options: Double): IOnigMatch | Null = js.native
  }
  
  @JSImport("vscode-oniguruma", "OnigString")
  @js.native
  open class OnigString protected () extends StObject {
    def this(content: String) = this()
    
    val content: String = js.native
    
    def dispose(): Unit = js.native
  }
  
  inline def createOnigScanner(patterns: js.Array[String]): OnigScanner = ^.asInstanceOf[js.Dynamic].applyDynamic("createOnigScanner")(patterns.asInstanceOf[js.Any]).asInstanceOf[OnigScanner]
  
  inline def createOnigString(str: String): OnigString = ^.asInstanceOf[js.Dynamic].applyDynamic("createOnigString")(str.asInstanceOf[js.Any]).asInstanceOf[OnigString]
  
  inline def loadWASM(data: js.typedarray.ArrayBuffer): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadWASM")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def loadWASM(data: Response): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadWASM")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def loadWASM(options: IOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadWASM")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setDefaultDebugCall(defaultDebugCall: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultDebugCall")(defaultDebugCall.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeOniguruma.vscodeOnigurumaNumbers.`0`
    - typings.vscodeOniguruma.vscodeOnigurumaNumbers.`1`
    - typings.vscodeOniguruma.vscodeOnigurumaNumbers.`2`
    - typings.vscodeOniguruma.vscodeOnigurumaNumbers.`4`
    - typings.vscodeOniguruma.vscodeOnigurumaNumbers.`8`
  */
  trait FindOption extends StObject
  object FindOption {
    
    /**
    	 * used for debugging purposes.
    	 */
    inline def DebugCall: `8` = 8.asInstanceOf[`8`]
    
    inline def None: `0` = 0.asInstanceOf[`0`]
    
    /**
    	 * equivalent of ONIG_OPTION_NOT_BEGIN_POSITION: (start) isn't considered as start position of search (* fail \G)
    	 */
    inline def NotBeginPosition: `4` = 4.asInstanceOf[`4`]
    
    /**
    	 * equivalent of ONIG_OPTION_NOT_BEGIN_STRING: (str) isn't considered as begin of string (* fail \A)
    	 */
    inline def NotBeginString: `1` = 1.asInstanceOf[`1`]
    
    /**
    	 * equivalent of ONIG_OPTION_NOT_END_STRING: (end) isn't considered as end of string (* fail \z, \Z)
    	 */
    inline def NotEndString: `2` = 2.asInstanceOf[`2`]
  }
  
  trait ICommonOptions extends StObject {
    
    var print: js.UndefOr[js.Function1[/* str */ String, Unit]] = js.undefined
  }
  object ICommonOptions {
    
    inline def apply(): ICommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICommonOptions]
    }
    
    extension [Self <: ICommonOptions](x: Self) {
      
      inline def setPrint(value: /* str */ String => Unit): Self = StObject.set(x, "print", js.Any.fromFunction1(value))
      
      inline def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
    }
  }
  
  trait IDataOptions
    extends StObject
       with ICommonOptions
       with IOptions {
    
    var data: js.typedarray.ArrayBuffer | Response
  }
  object IDataOptions {
    
    inline def apply(data: js.typedarray.ArrayBuffer | Response): IDataOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDataOptions]
    }
    
    extension [Self <: IDataOptions](x: Self) {
      
      inline def setData(value: js.typedarray.ArrayBuffer | Response): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait IInstantiatorOptions
    extends StObject
       with ICommonOptions
       with IOptions {
    
    def instantiator(): js.Promise[WebAssemblyInstantiatedSource]
    def instantiator(importObject: Record[String, Record[String, ImportValue]]): js.Promise[WebAssemblyInstantiatedSource]
    @JSName("instantiator")
    var instantiator_Original: WebAssemblyInstantiator
  }
  object IInstantiatorOptions {
    
    inline def apply(
      instantiator: /* importObject */ js.UndefOr[Record[String, Record[String, ImportValue]]] => js.Promise[WebAssemblyInstantiatedSource]
    ): IInstantiatorOptions = {
      val __obj = js.Dynamic.literal(instantiator = js.Any.fromFunction1(instantiator))
      __obj.asInstanceOf[IInstantiatorOptions]
    }
    
    extension [Self <: IInstantiatorOptions](x: Self) {
      
      inline def setInstantiator(
        value: /* importObject */ js.UndefOr[Record[String, Record[String, ImportValue]]] => js.Promise[WebAssemblyInstantiatedSource]
      ): Self = StObject.set(x, "instantiator", js.Any.fromFunction1(value))
    }
  }
  
  trait IOnigCaptureIndex extends StObject {
    
    var end: Double
    
    var length: Double
    
    var start: Double
  }
  object IOnigCaptureIndex {
    
    inline def apply(end: Double, length: Double, start: Double): IOnigCaptureIndex = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOnigCaptureIndex]
    }
    
    extension [Self <: IOnigCaptureIndex](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOnigMatch extends StObject {
    
    var captureIndices: js.Array[IOnigCaptureIndex]
    
    var index: Double
  }
  object IOnigMatch {
    
    inline def apply(captureIndices: js.Array[IOnigCaptureIndex], index: Double): IOnigMatch = {
      val __obj = js.Dynamic.literal(captureIndices = captureIndices.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOnigMatch]
    }
    
    extension [Self <: IOnigMatch](x: Self) {
      
      inline def setCaptureIndices(value: js.Array[IOnigCaptureIndex]): Self = StObject.set(x, "captureIndices", value.asInstanceOf[js.Any])
      
      inline def setCaptureIndicesVarargs(value: IOnigCaptureIndex*): Self = StObject.set(x, "captureIndices", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeOniguruma.mod.IInstantiatorOptions
    - typings.vscodeOniguruma.mod.IDataOptions
  */
  trait IOptions extends StObject
  object IOptions {
    
    inline def IDataOptions(data: js.typedarray.ArrayBuffer | Response): typings.vscodeOniguruma.mod.IDataOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vscodeOniguruma.mod.IDataOptions]
    }
    
    inline def IInstantiatorOptions(
      instantiator: /* importObject */ js.UndefOr[Record[String, Record[String, ImportValue]]] => js.Promise[WebAssemblyInstantiatedSource]
    ): typings.vscodeOniguruma.mod.IInstantiatorOptions = {
      val __obj = js.Dynamic.literal(instantiator = js.Any.fromFunction1(instantiator))
      __obj.asInstanceOf[typings.vscodeOniguruma.mod.IInstantiatorOptions]
    }
  }
  
  type WebAssemblyInstantiator = js.Function1[
    /* importObject */ js.UndefOr[Record[String, Record[String, ImportValue]]], 
    js.Promise[WebAssemblyInstantiatedSource]
  ]
}
