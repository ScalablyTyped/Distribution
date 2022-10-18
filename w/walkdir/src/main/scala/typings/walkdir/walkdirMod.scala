package typings.walkdir

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.fsMod.Stats
import typings.walkdir.anon.WalkOptionsreturnobjectbo
import typings.walkdir.anon.WalkOptionsreturnobjectfa
import typings.walkdir.anon.WalkOptionsreturnobjecttr
import typings.walkdir.anon.syncfalseundefinedWalkOpt
import typings.walkdir.anon.synctruereturnobjectfalse
import typings.walkdir.anon.synctruereturnobjecttrueW
import typings.walkdir.walkdirStrings.blockdevice
import typings.walkdir.walkdirStrings.characterdevice
import typings.walkdir.walkdirStrings.directory
import typings.walkdir.walkdirStrings.empty
import typings.walkdir.walkdirStrings.error
import typings.walkdir.walkdirStrings.fail
import typings.walkdir.walkdirStrings.fifo
import typings.walkdir.walkdirStrings.file
import typings.walkdir.walkdirStrings.link
import typings.walkdir.walkdirStrings.path
import typings.walkdir.walkdirStrings.socket
import typings.walkdir.walkdirStrings.targetdirectory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object walkdirMod {
  
  inline def apply(path: String): WalkEmitter | js.Array[String] | StringDictionary[Stats] = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[WalkEmitter | js.Array[String] | StringDictionary[Stats]]
  inline def apply(path: String, options: Unit, eventListener: WalkEventListener): WalkEmitter | js.Array[String] | StringDictionary[Stats] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[WalkEmitter | js.Array[String] | StringDictionary[Stats]]
  inline def apply(path: String, options: syncfalseundefinedWalkOpt): WalkEmitter = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WalkEmitter]
  inline def apply(path: String, options: syncfalseundefinedWalkOpt, eventListener: WalkEventListener): WalkEmitter = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[WalkEmitter]
  inline def apply(path: String, options: synctruereturnobjectfalse): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def apply(path: String, options: synctruereturnobjectfalse, eventListener: WalkEventListener): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def apply(path: String, options: synctruereturnobjecttrueW): StringDictionary[Stats] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Stats]]
  inline def apply(path: String, options: synctruereturnobjecttrueW, eventListener: WalkEventListener): StringDictionary[Stats] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Stats]]
  inline def apply(path: String, options: WalkEventListener): WalkEmitter | js.Array[String] | StringDictionary[Stats] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WalkEmitter | js.Array[String] | StringDictionary[Stats]]
  inline def apply(path: String, options: WalkEventListener, eventListener: WalkEventListener): WalkEmitter | js.Array[String] | StringDictionary[Stats] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[WalkEmitter | js.Array[String] | StringDictionary[Stats]]
  inline def apply(path: String, options: WalkOptions): WalkEmitter | js.Array[String] | StringDictionary[Stats] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WalkEmitter | js.Array[String] | StringDictionary[Stats]]
  inline def apply(path: String, options: WalkOptions, eventListener: WalkEventListener): WalkEmitter | js.Array[String] | StringDictionary[Stats] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[WalkEmitter | js.Array[String] | StringDictionary[Stats]]
  
  @JSImport("walkdir/walkdir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def async(path: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def async(path: String, options: Unit, eventListener: WalkEventListener): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def async(path: String, options: WalkOptionsreturnobjectbo): js.Promise[js.Array[String] | StringDictionary[Stats]] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String] | StringDictionary[Stats]]]
  inline def async(path: String, options: WalkOptionsreturnobjectbo, eventListener: WalkEventListener): js.Promise[js.Array[String] | StringDictionary[Stats]] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String] | StringDictionary[Stats]]]
  inline def async(path: String, options: WalkOptionsreturnobjectfa): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def async(path: String, options: WalkOptionsreturnobjectfa, eventListener: WalkEventListener): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def async(path: String, options: WalkOptionsreturnobjecttr): js.Promise[StringDictionary[Stats]] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StringDictionary[Stats]]]
  inline def async(path: String, options: WalkOptionsreturnobjecttr, eventListener: WalkEventListener): js.Promise[StringDictionary[Stats]] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StringDictionary[Stats]]]
  
  inline def find(path: String): WalkEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any]).asInstanceOf[WalkEmitter]
  inline def find(path: String, options: Unit, eventListener: WalkEventListener): WalkEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[WalkEmitter]
  inline def find(path: String, options: syncfalseundefinedWalkOpt): WalkEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WalkEmitter]
  inline def find(path: String, options: syncfalseundefinedWalkOpt, eventListener: WalkEventListener): WalkEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[WalkEmitter]
  inline def find(path: String, options: synctruereturnobjectfalse): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def find(path: String, options: synctruereturnobjectfalse, eventListener: WalkEventListener): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def find(path: String, options: synctruereturnobjecttrueW): StringDictionary[Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Stats]]
  inline def find(path: String, options: synctruereturnobjecttrueW, eventListener: WalkEventListener): StringDictionary[Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Stats]]
  inline def find(path: String, options: WalkEventListener): WalkEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WalkEmitter]
  inline def find(path: String, options: WalkEventListener, eventListener: WalkEventListener): WalkEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[WalkEmitter]
  
  inline def sync(path: String): js.Array[String] | StringDictionary[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | StringDictionary[Stats]]
  inline def sync(path: String, eventListener: WalkEventListener): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def sync(path: String, options: Unit, eventListener: WalkEventListener): js.Array[String] | StringDictionary[Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | StringDictionary[Stats]]
  inline def sync(path: String, options: WalkOptionsreturnobjectbo): js.Array[String] | StringDictionary[Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | StringDictionary[Stats]]
  inline def sync(path: String, options: WalkOptionsreturnobjectbo, eventListener: WalkEventListener): js.Array[String] | StringDictionary[Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | StringDictionary[Stats]]
  inline def sync(path: String, options: WalkOptionsreturnobjectfa): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def sync(path: String, options: WalkOptionsreturnobjectfa, eventListener: WalkEventListener): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def sync(path: String, options: WalkOptionsreturnobjecttr): StringDictionary[Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Stats]]
  inline def sync(path: String, options: WalkOptionsreturnobjecttr, eventListener: WalkEventListener): StringDictionary[Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Stats]]
  
  inline def sync_Array(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def sync_Array(path: String, options: Unit, eventListener: WalkEventListener): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventListener.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @js.native
  trait WalkEmitter extends EventEmitter {
    
    /**
      * cancel a walk in progress 
      */
    def end(): Unit = js.native
    
    /**
      * pass paths to ignore for the remainder of the walk. directories ignored will not have events emitted for any of their children.
      * @param paths string|string[]
      */
    def ignore(paths: String): Unit = js.native
    def ignore(paths: js.Array[String]): Unit = js.native
    
    /**
      * found a block device / disk
      */
    @JSName("on")
    def on_blockdevice(
      event: blockdevice,
      listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]
    ): WalkEmitter = js.native
    /**
      * found a character device / tty / terminal
      */
    @JSName("on")
    def on_characterdevice(
      event: characterdevice,
      listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]
    ): WalkEmitter = js.native
    /**
      * found a directory
      */
    @JSName("on")
    def on_directory(
      event: directory,
      listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]
    ): WalkEmitter = js.native
    /**
      * helpful event that lets you know if a directory is empty
      */
    @JSName("on")
    def on_empty(
      event: empty,
      listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]
    ): WalkEmitter = js.native
    /**
      * emitted if there is an error from the file system reading the initial or target directory
      */
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): WalkEmitter = js.native
    /**
      *  emitted when there is an error from the filesystem reading as nested path.
      */
    @JSName("on")
    def on_fail(event: fail, listener: js.Function2[/* path */ String, /* error */ js.Error, Unit]): WalkEmitter = js.native
    /**
      * found a fifo
      */
    @JSName("on")
    def on_fifo(event: fifo, listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]): WalkEmitter = js.native
    /**
      * found a file
      */
    @JSName("on")
    def on_file(event: file, listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]): WalkEmitter = js.native
    /**
      * found a symlink
      */
    @JSName("on")
    def on_link(event: link, listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]): WalkEmitter = js.native
    /**
      * found a path. this is the expected use case. every path for everything inside target directory is emitted here.
      */
    @JSName("on")
    def on_path(
      event: path,
      listener: js.ThisFunction3[/* this */ this.type, /* path */ String, /* stat */ Stats, /* depth */ Double, Unit]
    ): WalkEmitter = js.native
    /**
      * found a socket
      */
    @JSName("on")
    def on_socket(
      event: socket,
      listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]
    ): WalkEmitter = js.native
    /**
      * the stat of the target directory. not emitted through any other event.
      */
    @JSName("on")
    def on_targetdirectory(
      event: targetdirectory,
      listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]
    ): WalkEmitter = js.native
    
    /**
      * pause the walk
      */
    def pause(): Unit = js.native
    
    /**
      * resume the walk
      */
    def resume(): Unit = js.native
  }
  
  type WalkEventListener = js.ThisFunction3[
    /* this */ WalkEmitter, 
    /* path */ String, 
    /* stat */ Stats, 
    /* ignore */ js.Function1[/* path */ String | js.Array[String], Unit], 
    Unit
  ]
  
  trait WalkOptions extends StObject {
    
    /**
      * filter. filter an array of paths from readdir
      */
    var filter: js.UndefOr[
        js.Function2[
          /* directory */ String, 
          /* files */ js.Array[String], 
          js.Array[String] | js.Promise[js.Array[String]]
        ]
      ] = js.undefined
    
    /*** 
      * default True. if false this will use stat insteqad of lstat and not find links at all.
      */
    var find_links: js.UndefOr[Boolean] = js.undefined
    
    /**
      * follow symlinks. default FALSE
      */
    var follow_symlinks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * provide an alternate implementation of fs like graceful-fs
      */
    var fs: js.UndefOr[Any] = js.undefined
    
    /**
      * only travel to max depth. emits an error if hit.
      */
    var max_depth: js.UndefOr[Double] = js.undefined
    
    /**
      * only go one level deep. convenience param.
      */ 
    var no_recurse: js.UndefOr[Boolean] = js.undefined
    
    // if true the sync return will be in {path:stat} format instead of [path,path,...]
    /**
      * dont build up an internal list or object of all of the paths. this can be an important optimization for listing HUGE trees.
      */
    var no_return: js.UndefOr[Boolean] = js.undefined
    
    /**
      * return an object of {path:stat} instead of just the resolved path names
      */
    var return_object: js.UndefOr[Boolean] = js.undefined
    
    /**
      * make this syncronous. the same as calling walkdir.sync
      */
    var sync: js.UndefOr[Boolean] = js.undefined
    
    /**
      * on filesystems where inodes are not unique like windows (or perhaps hardlinks) some files may not be emitted due to inode collision.
      * turning off this behavior may be required but at the same time may lead to hitting max_depth via link loop.
      */
    var track_inodes: js.UndefOr[Boolean] = js.undefined
  }
  object WalkOptions {
    
    inline def apply(): WalkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WalkOptions]
    }
    
    extension [Self <: WalkOptions](x: Self) {
      
      inline def setFilter(
        value: (/* directory */ String, /* files */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFind_links(value: Boolean): Self = StObject.set(x, "find_links", value.asInstanceOf[js.Any])
      
      inline def setFind_linksUndefined: Self = StObject.set(x, "find_links", js.undefined)
      
      inline def setFollow_symlinks(value: Boolean): Self = StObject.set(x, "follow_symlinks", value.asInstanceOf[js.Any])
      
      inline def setFollow_symlinksUndefined: Self = StObject.set(x, "follow_symlinks", js.undefined)
      
      inline def setFs(value: Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setMax_depth(value: Double): Self = StObject.set(x, "max_depth", value.asInstanceOf[js.Any])
      
      inline def setMax_depthUndefined: Self = StObject.set(x, "max_depth", js.undefined)
      
      inline def setNo_recurse(value: Boolean): Self = StObject.set(x, "no_recurse", value.asInstanceOf[js.Any])
      
      inline def setNo_recurseUndefined: Self = StObject.set(x, "no_recurse", js.undefined)
      
      inline def setNo_return(value: Boolean): Self = StObject.set(x, "no_return", value.asInstanceOf[js.Any])
      
      inline def setNo_returnUndefined: Self = StObject.set(x, "no_return", js.undefined)
      
      inline def setReturn_object(value: Boolean): Self = StObject.set(x, "return_object", value.asInstanceOf[js.Any])
      
      inline def setReturn_objectUndefined: Self = StObject.set(x, "return_object", js.undefined)
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      inline def setTrack_inodes(value: Boolean): Self = StObject.set(x, "track_inodes", value.asInstanceOf[js.Any])
      
      inline def setTrack_inodesUndefined: Self = StObject.set(x, "track_inodes", js.undefined)
    }
  }
}
