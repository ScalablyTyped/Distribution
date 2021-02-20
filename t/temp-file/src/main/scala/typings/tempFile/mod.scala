package typings.tempFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("temp-file", "TmpDir")
  @js.native
  class TmpDir () extends StObject {
    def this(debugName: String) = this()
    
    def cleanup(): js.Promise[_] = js.native
    
    def cleanupSync(): Unit = js.native
    
    def createTempDir(): js.Promise[String] = js.native
    def createTempDir(options: GetTempFileOptions): js.Promise[String] = js.native
    
    val debugName: js.Any = js.native
    
    def getTempDir(): js.Promise[String] = js.native
    def getTempDir(options: GetTempFileOptions): js.Promise[String] = js.native
    
    def getTempFile(): js.Promise[String] = js.native
    def getTempFile(options: js.UndefOr[scala.Nothing], isDir: Boolean): js.Promise[String] = js.native
    def getTempFile(options: GetTempFileOptions): js.Promise[String] = js.native
    def getTempFile(options: GetTempFileOptions, isDir: Boolean): js.Promise[String] = js.native
    
    var registered: js.Any = js.native
    
    def rootTempDir: js.Promise[String] = js.native
    
    var tempFiles: js.Any = js.native
  }
  
  @JSImport("temp-file", "getTempName")
  @js.native
  def getTempName(): String = js.native
  @JSImport("temp-file", "getTempName")
  @js.native
  def getTempName(prefix: String): String = js.native
  
  @js.native
  trait GetTempFileOptions extends StObject {
    
    var disposer: js.UndefOr[(js.Function1[/* file */ String, js.Promise[Unit]]) | Null] = js.native
    
    var prefix: js.UndefOr[String | Null] = js.native
    
    var suffix: js.UndefOr[String | Null] = js.native
  }
  object GetTempFileOptions {
    
    @scala.inline
    def apply(): GetTempFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTempFileOptions]
    }
    
    @scala.inline
    implicit class GetTempFileOptionsMutableBuilder[Self <: GetTempFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisposer(value: /* file */ String => js.Promise[Unit]): Self = StObject.set(x, "disposer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisposerNull: Self = StObject.set(x, "disposer", null)
      
      @scala.inline
      def setDisposerUndefined: Self = StObject.set(x, "disposer", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixNull: Self = StObject.set(x, "suffix", null)
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
}
