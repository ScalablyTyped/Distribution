package typings.tmp

import typings.tmp.tmpBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tmp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dir(cb: DirCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dir")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def dir(options: DirOptions, cb: DirCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dir")(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def dirSync(): DirResult = ^.asInstanceOf[js.Dynamic].applyDynamic("dirSync")().asInstanceOf[DirResult]
  inline def dirSync(options: DirOptions): DirResult = ^.asInstanceOf[js.Dynamic].applyDynamic("dirSync")(options.asInstanceOf[js.Any]).asInstanceOf[DirResult]
  
  inline def file(cb: FileCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def file(options: FileOptionsDiscardFd, cb: FileCallbackNoFd): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def file(options: FileOptions, cb: FileCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fileSync(): FileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSync")().asInstanceOf[FileResult]
  inline def fileSync(options: FileOptions): FileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSync")(options.asInstanceOf[js.Any]).asInstanceOf[FileResult]
  inline def fileSync(options: FileOptionsDiscardFd): FileResultNoFd = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSync")(options.asInstanceOf[js.Any]).asInstanceOf[FileResultNoFd]
  
  inline def setGracefulCleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGracefulCleanup")().asInstanceOf[Unit]
  
  inline def tmpName(cb: TmpNameCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpName")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def tmpName(options: TmpNameOptions, cb: TmpNameCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tmpName")(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def tmpNameSync(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpNameSync")().asInstanceOf[String]
  inline def tmpNameSync(options: TmpNameOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpNameSync")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("tmp", "tmpdir")
  @js.native
  val tmpdir: String = js.native
  
  type DirCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* name */ String, 
    /* removeCallback */ js.Function0[Unit], 
    Unit
  ]
  
  trait DirOptions
    extends StObject
       with TmpNameOptions {
    
    /**
      * Signals that the temporary file or directory should not be deleted on exit
      *
      * - In order to clean up, you will have to call the provided `cleanupCallback` function manually.
      *
      * @default false
      */
    var keep: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The file mode to create with.
      * @default 0o700
      */
    var mode: js.UndefOr[Double] = js.undefined
    
    /**
      * Recursively removes the created temporary directory, even when it's not empty.
      * @default false
      */
    var unsafeCleanup: js.UndefOr[Boolean] = js.undefined
  }
  object DirOptions {
    
    inline def apply(): DirOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirOptions]
    }
    
    extension [Self <: DirOptions](x: Self) {
      
      inline def setKeep(value: Boolean): Self = StObject.set(x, "keep", value.asInstanceOf[js.Any])
      
      inline def setKeepUndefined: Self = StObject.set(x, "keep", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setUnsafeCleanup(value: Boolean): Self = StObject.set(x, "unsafeCleanup", value.asInstanceOf[js.Any])
      
      inline def setUnsafeCleanupUndefined: Self = StObject.set(x, "unsafeCleanup", js.undefined)
    }
  }
  
  trait DirResult extends StObject {
    
    var name: String
    
    def removeCallback(): Unit
  }
  object DirResult {
    
    inline def apply(name: String, removeCallback: () => Unit): DirResult = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], removeCallback = js.Any.fromFunction0(removeCallback))
      __obj.asInstanceOf[DirResult]
    }
    
    extension [Self <: DirResult](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRemoveCallback(value: () => Unit): Self = StObject.set(x, "removeCallback", js.Any.fromFunction0(value))
    }
  }
  
  type FileCallback = js.Function4[
    /* err */ js.Error | Null, 
    /* name */ String, 
    /* fd */ Double, 
    /* removeCallback */ js.Function0[Unit], 
    Unit
  ]
  
  type FileCallbackNoFd = js.Function4[
    /* err */ js.Error | Null, 
    /* name */ String, 
    /* fd */ Unit, 
    /* removeCallback */ js.Function0[Unit], 
    Unit
  ]
  
  trait FileOptions
    extends StObject
       with TmpNameOptions {
    
    /**
      * Detaches the file descriptor, caller is responsible for closing the file, `tmp` will no
      * longer try closing the file during garbage collection.
      * @default false
      */
    var detachDescriptor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Discards the file descriptor (closes file, fd is -1), `tmp` will no longer try closing
      * the file during garbage collection.
      * @default false
      */
    var discardDescriptor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Signals that the temporary file or directory should not be deleted on exit
      *
      * - In order to clean up, you will have to call the provided `cleanupCallback` function manually.
      *
      * @default false
      */
    var keep: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The file mode to create with.
      * @default 0o600
      */
    var mode: js.UndefOr[Double] = js.undefined
  }
  object FileOptions {
    
    inline def apply(): FileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileOptions]
    }
    
    extension [Self <: FileOptions](x: Self) {
      
      inline def setDetachDescriptor(value: Boolean): Self = StObject.set(x, "detachDescriptor", value.asInstanceOf[js.Any])
      
      inline def setDetachDescriptorUndefined: Self = StObject.set(x, "detachDescriptor", js.undefined)
      
      inline def setDiscardDescriptor(value: Boolean): Self = StObject.set(x, "discardDescriptor", value.asInstanceOf[js.Any])
      
      inline def setDiscardDescriptorUndefined: Self = StObject.set(x, "discardDescriptor", js.undefined)
      
      inline def setKeep(value: Boolean): Self = StObject.set(x, "keep", value.asInstanceOf[js.Any])
      
      inline def setKeepUndefined: Self = StObject.set(x, "keep", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait FileOptionsDiscardFd
    extends StObject
       with FileOptions {
    
    @JSName("discardDescriptor")
    var discardDescriptor_FileOptionsDiscardFd: `true`
  }
  object FileOptionsDiscardFd {
    
    inline def apply(): FileOptionsDiscardFd = {
      val __obj = js.Dynamic.literal(discardDescriptor = true)
      __obj.asInstanceOf[FileOptionsDiscardFd]
    }
    
    extension [Self <: FileOptionsDiscardFd](x: Self) {
      
      inline def setDiscardDescriptor(value: `true`): Self = StObject.set(x, "discardDescriptor", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileResult extends StObject {
    
    var fd: Double
    
    var name: String
    
    def removeCallback(): Unit
  }
  object FileResult {
    
    inline def apply(fd: Double, name: String, removeCallback: () => Unit): FileResult = {
      val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], removeCallback = js.Any.fromFunction0(removeCallback))
      __obj.asInstanceOf[FileResult]
    }
    
    extension [Self <: FileResult](x: Self) {
      
      inline def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRemoveCallback(value: () => Unit): Self = StObject.set(x, "removeCallback", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Omit<tmp.tmp.FileResult, 'fd'> */
  trait FileResultNoFd extends StObject {
    
    var name: String
    
    def removeCallback(): Unit
    @JSName("removeCallback")
    var removeCallback_Original: js.Function0[Unit]
  }
  object FileResultNoFd {
    
    inline def apply(name: String, removeCallback: () => Unit): FileResultNoFd = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], removeCallback = js.Any.fromFunction0(removeCallback))
      __obj.asInstanceOf[FileResultNoFd]
    }
    
    extension [Self <: FileResultNoFd](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRemoveCallback(value: () => Unit): Self = StObject.set(x, "removeCallback", js.Any.fromFunction0(value))
    }
  }
  
  type TmpNameCallback = js.Function2[/* err */ js.Error | Null, /* name */ String, Unit]
  
  trait TmpNameOptions extends StObject {
    
    /**
      * The optional temporary directory that must be relative to the system's default
      * temporary directory. Absolute paths are fine as long as they point to a
      * location under the system's default temporary directory. Any directories along
      * the so specified path must exist, otherwise a `ENOENT` error will be thrown
      * upon access, as tmp will not check the availability of the path, nor will it
      * establish the requested path for you.
      */
    var dir: js.UndefOr[String] = js.undefined
    
    /**
      * A fixed name that overrides random name generation, the name must
      * be relative and must not contain path segments.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The optional postfix.
      * @default ''
      */
    var postfix: js.UndefOr[String] = js.undefined
    
    /**
      * The optional prefix.
      * @default 'tmp'
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * [`mkstemp`](http://www.kernel.org/doc/man-pages/online/pages/man3/mkstemp.3.html)
      * like filename template, no default, must include `XXXXXX` once for random name generation,
      * e.g. `'foo-bar-XXXXXX'`.
      */
    var template: js.UndefOr[String] = js.undefined
    
    /**
      * Allows you to override the system's root tmp directory.
      */
    var tmpdir: js.UndefOr[String] = js.undefined
    
    /**
      * How many times should the function try to get a unique filename before giving up.
      * @default 3
      */
    var tries: js.UndefOr[Double] = js.undefined
  }
  object TmpNameOptions {
    
    inline def apply(): TmpNameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TmpNameOptions]
    }
    
    extension [Self <: TmpNameOptions](x: Self) {
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPostfix(value: String): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
      
      inline def setPostfixUndefined: Self = StObject.set(x, "postfix", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTmpdir(value: String): Self = StObject.set(x, "tmpdir", value.asInstanceOf[js.Any])
      
      inline def setTmpdirUndefined: Self = StObject.set(x, "tmpdir", js.undefined)
      
      inline def setTries(value: Double): Self = StObject.set(x, "tries", value.asInstanceOf[js.Any])
      
      inline def setTriesUndefined: Self = StObject.set(x, "tries", js.undefined)
    }
  }
}
