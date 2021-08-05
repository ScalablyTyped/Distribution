package typings.tempFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("temp-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("temp-file", "TmpDir")
  @js.native
  class TmpDir () extends StObject {
    def this(debugName: String) = this()
    
    def cleanup(): js.Promise[js.Any] = js.native
    
    def cleanupSync(): Unit = js.native
    
    def createTempDir(): js.Promise[String] = js.native
    def createTempDir(options: GetTempFileOptions): js.Promise[String] = js.native
    
    /* private */ val debugName: js.Any = js.native
    
    def getTempDir(): js.Promise[String] = js.native
    def getTempDir(options: GetTempFileOptions): js.Promise[String] = js.native
    
    def getTempFile(): js.Promise[String] = js.native
    def getTempFile(options: Unit, isDir: Boolean): js.Promise[String] = js.native
    def getTempFile(options: GetTempFileOptions): js.Promise[String] = js.native
    def getTempFile(options: GetTempFileOptions, isDir: Boolean): js.Promise[String] = js.native
    
    /* private */ var registered: js.Any = js.native
    
    def rootTempDir: js.Promise[String] = js.native
    
    /* private */ var tempFiles: js.Any = js.native
  }
  
  inline def getTempName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTempName")().asInstanceOf[String]
  inline def getTempName(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTempName")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait GetTempFileOptions extends StObject {
    
    var disposer: js.UndefOr[(js.Function1[/* file */ String, js.Promise[Unit]]) | Null] = js.undefined
    
    var prefix: js.UndefOr[String | Null] = js.undefined
    
    var suffix: js.UndefOr[String | Null] = js.undefined
  }
  object GetTempFileOptions {
    
    inline def apply(): GetTempFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTempFileOptions]
    }
    
    extension [Self <: GetTempFileOptions](x: Self) {
      
      inline def setDisposer(value: /* file */ String => js.Promise[Unit]): Self = StObject.set(x, "disposer", js.Any.fromFunction1(value))
      
      inline def setDisposerNull: Self = StObject.set(x, "disposer", null)
      
      inline def setDisposerUndefined: Self = StObject.set(x, "disposer", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixNull: Self = StObject.set(x, "suffix", null)
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
}
