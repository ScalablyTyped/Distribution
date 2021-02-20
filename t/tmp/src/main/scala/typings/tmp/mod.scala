package typings.tmp

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tmp", "dir")
  @js.native
  def dir(cb: DirCallback): Unit = js.native
  @JSImport("tmp", "dir")
  @js.native
  def dir(options: DirOptions, cb: DirCallback): Unit = js.native
  
  @JSImport("tmp", "dirSync")
  @js.native
  def dirSync(): DirResult = js.native
  @JSImport("tmp", "dirSync")
  @js.native
  def dirSync(options: DirOptions): DirResult = js.native
  
  @JSImport("tmp", "file")
  @js.native
  def file(cb: FileCallback): Unit = js.native
  @JSImport("tmp", "file")
  @js.native
  def file(options: FileOptions, cb: FileCallback): Unit = js.native
  
  @JSImport("tmp", "fileSync")
  @js.native
  def fileSync(): FileResult = js.native
  @JSImport("tmp", "fileSync")
  @js.native
  def fileSync(options: FileOptions): FileResult = js.native
  
  @JSImport("tmp", "setGracefulCleanup")
  @js.native
  def setGracefulCleanup(): Unit = js.native
  
  @JSImport("tmp", "tmpName")
  @js.native
  def tmpName(cb: TmpNameCallback): Unit = js.native
  @JSImport("tmp", "tmpName")
  @js.native
  def tmpName(options: TmpNameOptions, cb: TmpNameCallback): Unit = js.native
  
  @JSImport("tmp", "tmpNameSync")
  @js.native
  def tmpNameSync(): String = js.native
  @JSImport("tmp", "tmpNameSync")
  @js.native
  def tmpNameSync(options: TmpNameOptions): String = js.native
  
  @JSImport("tmp", "tmpdir")
  @js.native
  val tmpdir: String = js.native
  
  type DirCallback = js.Function3[
    /* err */ Error | Null, 
    /* name */ String, 
    /* removeCallback */ js.Function0[Unit], 
    Unit
  ]
  
  @js.native
  trait DirOptions extends TmpNameOptions {
    
    var keep: js.UndefOr[Boolean] = js.native
    
    var mode: js.UndefOr[Double] = js.native
    
    var unsafeCleanup: js.UndefOr[Boolean] = js.native
  }
  object DirOptions {
    
    @scala.inline
    def apply(): DirOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirOptions]
    }
    
    @scala.inline
    implicit class DirOptionsMutableBuilder[Self <: DirOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeep(value: Boolean): Self = StObject.set(x, "keep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepUndefined: Self = StObject.set(x, "keep", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setUnsafeCleanup(value: Boolean): Self = StObject.set(x, "unsafeCleanup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafeCleanupUndefined: Self = StObject.set(x, "unsafeCleanup", js.undefined)
    }
  }
  
  @js.native
  trait DirResult extends StObject {
    
    var name: String = js.native
    
    def removeCallback(): Unit = js.native
  }
  object DirResult {
    
    @scala.inline
    def apply(name: String, removeCallback: () => Unit): DirResult = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], removeCallback = js.Any.fromFunction0(removeCallback))
      __obj.asInstanceOf[DirResult]
    }
    
    @scala.inline
    implicit class DirResultMutableBuilder[Self <: DirResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveCallback(value: () => Unit): Self = StObject.set(x, "removeCallback", js.Any.fromFunction0(value))
    }
  }
  
  type FileCallback = js.Function4[
    /* err */ Error | Null, 
    /* name */ String, 
    /* fd */ Double, 
    /* removeCallback */ js.Function0[Unit], 
    Unit
  ]
  
  @js.native
  trait FileOptions extends TmpNameOptions {
    
    var detachDescriptor: js.UndefOr[Boolean] = js.native
    
    var discardDescriptor: js.UndefOr[Boolean] = js.native
    
    var keep: js.UndefOr[Boolean] = js.native
    
    var mode: js.UndefOr[Double] = js.native
  }
  object FileOptions {
    
    @scala.inline
    def apply(): FileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileOptions]
    }
    
    @scala.inline
    implicit class FileOptionsMutableBuilder[Self <: FileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetachDescriptor(value: Boolean): Self = StObject.set(x, "detachDescriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachDescriptorUndefined: Self = StObject.set(x, "detachDescriptor", js.undefined)
      
      @scala.inline
      def setDiscardDescriptor(value: Boolean): Self = StObject.set(x, "discardDescriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscardDescriptorUndefined: Self = StObject.set(x, "discardDescriptor", js.undefined)
      
      @scala.inline
      def setKeep(value: Boolean): Self = StObject.set(x, "keep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepUndefined: Self = StObject.set(x, "keep", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  @js.native
  trait FileResult extends StObject {
    
    var fd: Double = js.native
    
    var name: String = js.native
    
    def removeCallback(): Unit = js.native
  }
  object FileResult {
    
    @scala.inline
    def apply(fd: Double, name: String, removeCallback: () => Unit): FileResult = {
      val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], removeCallback = js.Any.fromFunction0(removeCallback))
      __obj.asInstanceOf[FileResult]
    }
    
    @scala.inline
    implicit class FileResultMutableBuilder[Self <: FileResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveCallback(value: () => Unit): Self = StObject.set(x, "removeCallback", js.Any.fromFunction0(value))
    }
  }
  
  type TmpNameCallback = js.Function2[/* err */ Error | Null, /* name */ String, Unit]
  
  @js.native
  trait TmpNameOptions extends StObject {
    
    var dir: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var postfix: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var template: js.UndefOr[String] = js.native
    
    var tmpdir: js.UndefOr[String] = js.native
    
    var tries: js.UndefOr[Double] = js.native
  }
  object TmpNameOptions {
    
    @scala.inline
    def apply(): TmpNameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TmpNameOptions]
    }
    
    @scala.inline
    implicit class TmpNameOptionsMutableBuilder[Self <: TmpNameOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPostfix(value: String): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostfixUndefined: Self = StObject.set(x, "postfix", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTmpdir(value: String): Self = StObject.set(x, "tmpdir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTmpdirUndefined: Self = StObject.set(x, "tmpdir", js.undefined)
      
      @scala.inline
      def setTries(value: Double): Self = StObject.set(x, "tries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriesUndefined: Self = StObject.set(x, "tries", js.undefined)
    }
  }
}
