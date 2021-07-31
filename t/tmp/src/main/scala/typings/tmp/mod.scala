package typings.tmp

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tmp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def dir(cb: DirCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dir")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def dir(options: DirOptions, cb: DirCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dir")(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def dirSync(): DirResult = ^.asInstanceOf[js.Dynamic].applyDynamic("dirSync")().asInstanceOf[DirResult]
  @scala.inline
  def dirSync(options: DirOptions): DirResult = ^.asInstanceOf[js.Dynamic].applyDynamic("dirSync")(options.asInstanceOf[js.Any]).asInstanceOf[DirResult]
  
  @scala.inline
  def file(cb: FileCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def file(options: FileOptions, cb: FileCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fileSync(): FileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSync")().asInstanceOf[FileResult]
  @scala.inline
  def fileSync(options: FileOptions): FileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSync")(options.asInstanceOf[js.Any]).asInstanceOf[FileResult]
  
  @scala.inline
  def setGracefulCleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGracefulCleanup")().asInstanceOf[Unit]
  
  @scala.inline
  def tmpName(cb: TmpNameCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpName")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def tmpName(options: TmpNameOptions, cb: TmpNameCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tmpName")(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def tmpNameSync(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpNameSync")().asInstanceOf[String]
  @scala.inline
  def tmpNameSync(options: TmpNameOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpNameSync")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("tmp", "tmpdir")
  @js.native
  val tmpdir: String = js.native
  
  type DirCallback = js.Function3[
    /* err */ Error | Null, 
    /* name */ String, 
    /* removeCallback */ js.Function0[Unit], 
    Unit
  ]
  
  trait DirOptions
    extends StObject
       with TmpNameOptions {
    
    var keep: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var unsafeCleanup: js.UndefOr[Boolean] = js.undefined
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
  
  trait DirResult extends StObject {
    
    var name: String
    
    def removeCallback(): Unit
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
  
  trait FileOptions
    extends StObject
       with TmpNameOptions {
    
    var detachDescriptor: js.UndefOr[Boolean] = js.undefined
    
    var discardDescriptor: js.UndefOr[Boolean] = js.undefined
    
    var keep: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
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
  
  trait FileResult extends StObject {
    
    var fd: Double
    
    var name: String
    
    def removeCallback(): Unit
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
  
  trait TmpNameOptions extends StObject {
    
    var dir: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var postfix: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var tmpdir: js.UndefOr[String] = js.undefined
    
    var tries: js.UndefOr[Double] = js.undefined
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
