package typings.vinylFs

import typings.globStream.mod.Options
import typings.node.NodeJS.ReadWriteStream
import typings.std.Date
import typings.std.Error
import typings.vinyl.mod.File
import typings.vinylFs.anon.Cwd
import typings.vinylFs.anon.DirMode
import typings.vinylFs.vinylFsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vinyl-fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dest(folder: String): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("dest")(folder.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def dest(folder: String, opt: DestOptions): ReadWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("dest")(folder.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def dest(getFolderPath: js.Function1[/* file */ File, String]): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("dest")(getFolderPath.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  inline def src(globs: String): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("src")(globs.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def src(globs: String, opt: SrcOptions): ReadWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("src")(globs.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def src(globs: js.Array[String]): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("src")(globs.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def src(globs: js.Array[String], opt: SrcOptions): ReadWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("src")(globs.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  inline def symlink(folder: String): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(folder.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def symlink(folder: String, opts: Cwd): ReadWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(folder.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def symlink(getFolderPath: js.Function1[/* File */ File, String]): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(getFolderPath.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def symlink(getFolderPath: js.Function1[/* File */ File, String], opts: DirMode): ReadWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(getFolderPath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  trait DestOptions extends StObject {
    
    /**
      * Specify the working directory the folder is relative to
      * Default is process.cwd()
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /** Specify the mode the directory should be created with. Default is the process mode */
    var dirMode: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Specify the mode the files should be created with
      * Default is the mode of the input file (file.stat.mode)
      * or the process mode if the input file has no mode property
      */
    var mode: js.UndefOr[Double | String] = js.undefined
    
    /** Specify if existing files with the same path should be overwritten or not. Default is true, to always overwrite existing files */
    var overwrite: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When creating a symlink, whether or not the created symlink should be relative. If false,
      * the symlink will be absolute. Note: This option will be ignored if a junction is being created.
      */
    var relativeSymlinks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables sourcemap support on files passed through the stream. Will write inline soucemaps if
      * specified as true. Specifying a string path will write external sourcemaps at the given path.
      */
    var sourcemaps: js.UndefOr[`true` | String] = js.undefined
    
    /* When creating a symlink, whether or not a directory symlink should be created as a junction. */
    var useJunctions: js.UndefOr[Boolean] = js.undefined
  }
  object DestOptions {
    
    inline def apply(): DestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestOptions]
    }
    
    extension [Self <: DestOptions](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDirMode(value: Double | String): Self = StObject.set(x, "dirMode", value.asInstanceOf[js.Any])
      
      inline def setDirModeUndefined: Self = StObject.set(x, "dirMode", js.undefined)
      
      inline def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setRelativeSymlinks(value: Boolean): Self = StObject.set(x, "relativeSymlinks", value.asInstanceOf[js.Any])
      
      inline def setRelativeSymlinksUndefined: Self = StObject.set(x, "relativeSymlinks", js.undefined)
      
      inline def setSourcemaps(value: `true` | String): Self = StObject.set(x, "sourcemaps", value.asInstanceOf[js.Any])
      
      inline def setSourcemapsUndefined: Self = StObject.set(x, "sourcemaps", js.undefined)
      
      inline def setUseJunctions(value: Boolean): Self = StObject.set(x, "useJunctions", value.asInstanceOf[js.Any])
      
      inline def setUseJunctionsUndefined: Self = StObject.set(x, "useJunctions", js.undefined)
    }
  }
  
  trait SrcOptions
    extends StObject
       with Options {
    
    /**
      * Setting this to false will make file.contents a paused stream
      * If true it will buffer the file contents
      * Default: true
      */
    var buffer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The mode the directory should be created with.
      * Default: the process mode
      */
    var dirMode: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether or not to recursively resolve symlinks to their targets.
      * Setting to `false` to preserve them as symlinks and make `file.symlink`
      * equal the original symlink's target path.
      * Default: true
      */
    var followSymlinks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Setting this to true will create a duplex stream, one that passes
      * through items and emits globbed files.
      * Default: false
      */
    var passthrough: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Setting this to false will ignore the contents of the file and disable
      * writing to disk to speed up operations
      * Default: true
      */
    var read: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the symlink should be relative or absolute.
      * Default: false
      */
    var relative: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Causes the BOM to be removed on UTF-8 encoded files. Set to false if you need the BOM for some reason.
      * Default: true
      */
    var removeBOM: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not to recursively resolve symlinks to their targets. Setting to false to
      * preserve them as symlinks and make file.symlink equal the original symlink's target path.
      * Default: false
      */
    var resolveSymlinks: js.UndefOr[Boolean] = js.undefined
    
    /** Only find files that have been modified since the time specified */
    var since: js.UndefOr[Date | Double] = js.undefined
    
    /**
      * Setting this to true will enable sourcemaps.
      * Default: false
      */
    var sourcemaps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Causes the BOM to be stripped on UTF-8 encoded files. Set to `false`
      * if you need the BOM for some reason.
      */
    var stripBOM: js.UndefOr[Boolean] = js.undefined
  }
  object SrcOptions {
    
    inline def apply(): SrcOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SrcOptions]
    }
    
    extension [Self <: SrcOptions](x: Self) {
      
      inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setDirMode(value: Double): Self = StObject.set(x, "dirMode", value.asInstanceOf[js.Any])
      
      inline def setDirModeUndefined: Self = StObject.set(x, "dirMode", js.undefined)
      
      inline def setFollowSymlinks(value: Boolean): Self = StObject.set(x, "followSymlinks", value.asInstanceOf[js.Any])
      
      inline def setFollowSymlinksUndefined: Self = StObject.set(x, "followSymlinks", js.undefined)
      
      inline def setPassthrough(value: Boolean): Self = StObject.set(x, "passthrough", value.asInstanceOf[js.Any])
      
      inline def setPassthroughUndefined: Self = StObject.set(x, "passthrough", js.undefined)
      
      inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setRemoveBOM(value: Boolean): Self = StObject.set(x, "removeBOM", value.asInstanceOf[js.Any])
      
      inline def setRemoveBOMUndefined: Self = StObject.set(x, "removeBOM", js.undefined)
      
      inline def setResolveSymlinks(value: Boolean): Self = StObject.set(x, "resolveSymlinks", value.asInstanceOf[js.Any])
      
      inline def setResolveSymlinksUndefined: Self = StObject.set(x, "resolveSymlinks", js.undefined)
      
      inline def setSince(value: Date | Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
      
      inline def setSourcemaps(value: Boolean): Self = StObject.set(x, "sourcemaps", value.asInstanceOf[js.Any])
      
      inline def setSourcemapsUndefined: Self = StObject.set(x, "sourcemaps", js.undefined)
      
      inline def setStripBOM(value: Boolean): Self = StObject.set(x, "stripBOM", value.asInstanceOf[js.Any])
      
      inline def setStripBOMUndefined: Self = StObject.set(x, "stripBOM", js.undefined)
    }
  }
  
  object global {
    
    object NodeJS {
      
      @js.native
      trait WritableStream extends StObject {
        
        def write(buffer: js.Any): Boolean = js.native
        def write(buffer: js.Any, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
      }
    }
  }
}
