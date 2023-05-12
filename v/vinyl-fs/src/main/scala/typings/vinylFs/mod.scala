package typings.vinylFs

import typings.globStream.mod.Options
import typings.node.NodeJS.ReadWriteStream
import typings.vinyl.mod.File
import typings.vinylFs.anon.Cwd
import typings.vinylFs.vinylFsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vinyl-fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dest(folder: String): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("dest")(folder.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def dest(folder: String, opt: DestOptions): ReadWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("dest")(folder.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def dest(folder: js.Function1[/* file */ File, String]): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("dest")(folder.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def dest(folder: js.Function1[/* file */ File, String], opt: DestOptions): ReadWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("dest")(folder.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  inline def src(globs: String): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("src")(globs.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def src(globs: String, opt: SrcOptions): ReadWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("src")(globs.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def src(globs: js.Array[String]): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("src")(globs.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def src(globs: js.Array[String], opt: SrcOptions): ReadWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("src")(globs.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  inline def symlink(folder: String): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(folder.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def symlink(folder: String, opts: Cwd): ReadWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(folder.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def symlink(folder: js.Function1[/* File */ File, String]): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(folder.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def symlink(folder: js.Function1[/* File */ File, String], opts: Cwd): ReadWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(folder.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  trait DestOptions extends StObject {
    
    /** Whether or not new data should be appended after existing file contents (if any). Default is false, to always replace existing contents */
    var append: js.UndefOr[Boolean | (js.Function1[/* file */ File, Boolean])] = js.undefined
    
    /**
      * Specify the working directory the folder is relative to
      * Default is process.cwd()
      */
    var cwd: js.UndefOr[String | (js.Function1[/* file */ File, String])] = js.undefined
    
    /** Specify the mode the directory should be created with. Default is the process mode */
    var dirMode: js.UndefOr[Double | (js.Function1[/* file */ File, Double])] = js.undefined
    
    /** Optionally transcode to the given encoding. The default is 'utf8'. */
    var encoding: js.UndefOr[String | `false` | (js.Function1[/* file */ File, String | `false`])] = js.undefined
    
    /**
      * Specify the mode the files should be created with
      * Default is the mode of the input file (file.stat.mode)
      * or the process mode if the input file has no mode property
      */
    var mode: js.UndefOr[Double | (js.Function1[/* file */ File, Double])] = js.undefined
    
    /** Specify if existing files with the same path should be overwritten or not. Default is true, to always overwrite existing files */
    var overwrite: js.UndefOr[Boolean | (js.Function1[/* file */ File, Boolean])] = js.undefined
    
    /**
      * When creating a symlink, whether or not the created symlink should be relative. If false,
      * the symlink will be absolute. Note: This option will be ignored if a junction is being created.
      */
    var relativeSymlinks: js.UndefOr[Boolean | (js.Function1[/* file */ File, Boolean])] = js.undefined
    
    /**
      * Enables sourcemap support on files passed through the stream. Will write inline soucemaps if
      * specified as true. Specifying a string path will write external sourcemaps at the given path.
      */
    var sourcemaps: js.UndefOr[Boolean | String | (js.Function1[/* file */ File, js.UndefOr[String | `false`]])] = js.undefined
    
    /* When creating a symlink, whether or not a directory symlink should be created as a junction. */
    var useJunctions: js.UndefOr[Boolean | (js.Function1[/* file */ File, Boolean])] = js.undefined
  }
  object DestOptions {
    
    inline def apply(): DestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DestOptions] (val x: Self) extends AnyVal {
      
      inline def setAppend(value: Boolean | (js.Function1[/* file */ File, Boolean])): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendFunction1(value: /* file */ File => Boolean): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setCwd(value: String | (js.Function1[/* file */ File, String])): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdFunction1(value: /* file */ File => String): Self = StObject.set(x, "cwd", js.Any.fromFunction1(value))
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDirMode(value: Double | (js.Function1[/* file */ File, Double])): Self = StObject.set(x, "dirMode", value.asInstanceOf[js.Any])
      
      inline def setDirModeFunction1(value: /* file */ File => Double): Self = StObject.set(x, "dirMode", js.Any.fromFunction1(value))
      
      inline def setDirModeUndefined: Self = StObject.set(x, "dirMode", js.undefined)
      
      inline def setEncoding(value: String | `false` | (js.Function1[/* file */ File, String | `false`])): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingFunction1(value: /* file */ File => String | `false`): Self = StObject.set(x, "encoding", js.Any.fromFunction1(value))
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setMode(value: Double | (js.Function1[/* file */ File, Double])): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeFunction1(value: /* file */ File => Double): Self = StObject.set(x, "mode", js.Any.fromFunction1(value))
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOverwrite(value: Boolean | (js.Function1[/* file */ File, Boolean])): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteFunction1(value: /* file */ File => Boolean): Self = StObject.set(x, "overwrite", js.Any.fromFunction1(value))
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setRelativeSymlinks(value: Boolean | (js.Function1[/* file */ File, Boolean])): Self = StObject.set(x, "relativeSymlinks", value.asInstanceOf[js.Any])
      
      inline def setRelativeSymlinksFunction1(value: /* file */ File => Boolean): Self = StObject.set(x, "relativeSymlinks", js.Any.fromFunction1(value))
      
      inline def setRelativeSymlinksUndefined: Self = StObject.set(x, "relativeSymlinks", js.undefined)
      
      inline def setSourcemaps(value: Boolean | String | (js.Function1[/* file */ File, js.UndefOr[String | `false`]])): Self = StObject.set(x, "sourcemaps", value.asInstanceOf[js.Any])
      
      inline def setSourcemapsFunction1(value: /* file */ File => js.UndefOr[String | `false`]): Self = StObject.set(x, "sourcemaps", js.Any.fromFunction1(value))
      
      inline def setSourcemapsUndefined: Self = StObject.set(x, "sourcemaps", js.undefined)
      
      inline def setUseJunctions(value: Boolean | (js.Function1[/* file */ File, Boolean])): Self = StObject.set(x, "useJunctions", value.asInstanceOf[js.Any])
      
      inline def setUseJunctionsFunction1(value: /* file */ File => Boolean): Self = StObject.set(x, "useJunctions", js.Any.fromFunction1(value))
      
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
    var buffer: js.UndefOr[Boolean | (js.Function1[/* file */ File, Boolean])] = js.undefined
    
    /** Optionally transcode from the given encoding. The default is 'utf8'. */
    var encoding: js.UndefOr[String | `false` | (js.Function1[/* file */ File, String | `false`])] = js.undefined
    
    /**
      * Setting this to false will ignore the contents of the file and disable
      * writing to disk to speed up operations
      * Default: true
      */
    var read: js.UndefOr[Boolean | (js.Function1[/* file */ File, Boolean])] = js.undefined
    
    /**
      * Causes the BOM to be removed on UTF-8 encoded files. Set to false if you need the BOM for some reason.
      * Default: true
      */
    var removeBOM: js.UndefOr[Boolean | (js.Function1[/* file */ File, Boolean])] = js.undefined
    
    /**
      * Whether or not to recursively resolve symlinks to their targets. Setting to false to
      * preserve them as symlinks and make file.symlink equal the original symlink's target path.
      * Default: false
      */
    var resolveSymlinks: js.UndefOr[Boolean | (js.Function1[/* file */ File, Boolean])] = js.undefined
    
    /** Only find files that have been modified since the time specified */
    var since: js.UndefOr[js.Date | Double | (js.Function1[/* file */ File, js.Date | Double])] = js.undefined
    
    /**
      * Setting this to true will enable sourcemaps.
      * Default: false
      */
    var sourcemaps: js.UndefOr[Boolean | (js.Function1[/* file */ File, Boolean])] = js.undefined
  }
  object SrcOptions {
    
    inline def apply(): SrcOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SrcOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SrcOptions] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: Boolean | (js.Function1[/* file */ File, Boolean])): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferFunction1(value: /* file */ File => Boolean): Self = StObject.set(x, "buffer", js.Any.fromFunction1(value))
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setEncoding(value: String | `false` | (js.Function1[/* file */ File, String | `false`])): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingFunction1(value: /* file */ File => String | `false`): Self = StObject.set(x, "encoding", js.Any.fromFunction1(value))
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setRead(value: Boolean | (js.Function1[/* file */ File, Boolean])): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setReadFunction1(value: /* file */ File => Boolean): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setRemoveBOM(value: Boolean | (js.Function1[/* file */ File, Boolean])): Self = StObject.set(x, "removeBOM", value.asInstanceOf[js.Any])
      
      inline def setRemoveBOMFunction1(value: /* file */ File => Boolean): Self = StObject.set(x, "removeBOM", js.Any.fromFunction1(value))
      
      inline def setRemoveBOMUndefined: Self = StObject.set(x, "removeBOM", js.undefined)
      
      inline def setResolveSymlinks(value: Boolean | (js.Function1[/* file */ File, Boolean])): Self = StObject.set(x, "resolveSymlinks", value.asInstanceOf[js.Any])
      
      inline def setResolveSymlinksFunction1(value: /* file */ File => Boolean): Self = StObject.set(x, "resolveSymlinks", js.Any.fromFunction1(value))
      
      inline def setResolveSymlinksUndefined: Self = StObject.set(x, "resolveSymlinks", js.undefined)
      
      inline def setSince(value: js.Date | Double | (js.Function1[/* file */ File, js.Date | Double])): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      inline def setSinceFunction1(value: /* file */ File => js.Date | Double): Self = StObject.set(x, "since", js.Any.fromFunction1(value))
      
      inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
      
      inline def setSourcemaps(value: Boolean | (js.Function1[/* file */ File, Boolean])): Self = StObject.set(x, "sourcemaps", value.asInstanceOf[js.Any])
      
      inline def setSourcemapsFunction1(value: /* file */ File => Boolean): Self = StObject.set(x, "sourcemaps", js.Any.fromFunction1(value))
      
      inline def setSourcemapsUndefined: Self = StObject.set(x, "sourcemaps", js.undefined)
    }
  }
  
  object global {
    
    object NodeJS {
      
      @js.native
      trait WritableStream extends StObject {
        
        def write(buffer: Any): Boolean = js.native
        def write(buffer: Any, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
      }
    }
  }
}
