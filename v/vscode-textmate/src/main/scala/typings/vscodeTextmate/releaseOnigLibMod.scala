package typings.vscodeTextmate

import typings.vscodeTextmate.releaseUtilsMod.OrMask
import typings.vscodeTextmate.vscodeTextmateInts.`0`
import typings.vscodeTextmate.vscodeTextmateInts.`1`
import typings.vscodeTextmate.vscodeTextmateInts.`2`
import typings.vscodeTextmate.vscodeTextmateInts.`4`
import typings.vscodeTextmate.vscodeTextmateInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseOnigLibMod {
  
  @JSImport("vscode-textmate/release/onigLib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def disposeOnigString(str: OnigString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disposeOnigString")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeTextmate.vscodeTextmateInts.`0`
    - typings.vscodeTextmate.vscodeTextmateInts.`1`
    - typings.vscodeTextmate.vscodeTextmateInts.`2`
    - typings.vscodeTextmate.vscodeTextmateInts.`4`
    - typings.vscodeTextmate.vscodeTextmateInts.`8`
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOnigCaptureIndex] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOnigLib extends StObject {
    
    def createOnigScanner(sources: js.Array[String]): OnigScanner
    
    def createOnigString(str: String): OnigString
  }
  object IOnigLib {
    
    inline def apply(createOnigScanner: js.Array[String] => OnigScanner, createOnigString: String => OnigString): IOnigLib = {
      val __obj = js.Dynamic.literal(createOnigScanner = js.Any.fromFunction1(createOnigScanner), createOnigString = js.Any.fromFunction1(createOnigString))
      __obj.asInstanceOf[IOnigLib]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOnigLib] (val x: Self) extends AnyVal {
      
      inline def setCreateOnigScanner(value: js.Array[String] => OnigScanner): Self = StObject.set(x, "createOnigScanner", js.Any.fromFunction1(value))
      
      inline def setCreateOnigString(value: String => OnigString): Self = StObject.set(x, "createOnigString", js.Any.fromFunction1(value))
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOnigMatch] (val x: Self) extends AnyVal {
      
      inline def setCaptureIndices(value: js.Array[IOnigCaptureIndex]): Self = StObject.set(x, "captureIndices", value.asInstanceOf[js.Any])
      
      inline def setCaptureIndicesVarargs(value: IOnigCaptureIndex*): Self = StObject.set(x, "captureIndices", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnigScanner extends StObject {
    
    var dispose: js.UndefOr[js.Function0[Unit]] = js.native
    
    def findNextMatchSync(string: String, startPosition: Double, options: OrMask[FindOption]): IOnigMatch | Null = js.native
    def findNextMatchSync(string: OnigString, startPosition: Double, options: OrMask[FindOption]): IOnigMatch | Null = js.native
  }
  
  trait OnigString extends StObject {
    
    val content: String
    
    var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object OnigString {
    
    inline def apply(content: String): OnigString = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnigString]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnigString] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    }
  }
}
