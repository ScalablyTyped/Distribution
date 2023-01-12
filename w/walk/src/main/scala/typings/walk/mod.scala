package typings.walk

import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.Stats
import typings.walk.walkStrings.FIFO
import typings.walk.walkStrings.blockDevice
import typings.walk.walkStrings.characterDevice
import typings.walk.walkStrings.directory
import typings.walk.walkStrings.end
import typings.walk.walkStrings.file
import typings.walk.walkStrings.names
import typings.walk.walkStrings.socket
import typings.walk.walkStrings.symbolicLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("walk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def walk(path: String): Walker = ^.asInstanceOf[js.Dynamic].applyDynamic("walk")(path.asInstanceOf[js.Any]).asInstanceOf[Walker]
  inline def walk(path: String, options: WalkOptions): Walker = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Walker]
  
  inline def walkSync(path: String): Walker = ^.asInstanceOf[js.Dynamic].applyDynamic("walkSync")(path.asInstanceOf[js.Any]).asInstanceOf[Walker]
  inline def walkSync(path: String, options: WalkOptions): Walker = (^.asInstanceOf[js.Dynamic].applyDynamic("walkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Walker]
  
  type WalkNamesEventCallback = js.Function3[/* base */ String, /* names */ js.Array[String], /* next */ WalkNext, Unit]
  
  type WalkNext = js.Function0[Unit]
  
  trait WalkOptions extends StObject {
    
    var filters: js.UndefOr[js.Array[String]] = js.undefined
    
    var followLinks: js.UndefOr[Boolean] = js.undefined
    
    var listeners: js.UndefOr[WalkOptionsListeners] = js.undefined
  }
  object WalkOptions {
    
    inline def apply(): WalkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WalkOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WalkOptions] (val x: Self) extends AnyVal {
      
      inline def setFilters(value: js.Array[String]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: String*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setFollowLinks(value: Boolean): Self = StObject.set(x, "followLinks", value.asInstanceOf[js.Any])
      
      inline def setFollowLinksUndefined: Self = StObject.set(x, "followLinks", js.undefined)
      
      inline def setListeners(value: WalkOptionsListeners): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    }
  }
  
  trait WalkOptionsListeners extends StObject {
    
    var directories: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
    
    var directory: js.UndefOr[WalkStatEventCallback] = js.undefined
    
    var directoryError: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
    
    var end: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
    
    var errors: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
    
    var file: js.UndefOr[WalkStatEventCallback] = js.undefined
    
    var files: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
    
    var names: js.UndefOr[WalkNamesEventCallback] = js.undefined
    
    var nodeError: js.UndefOr[WalkStatArrayEventCallback] = js.undefined
  }
  object WalkOptionsListeners {
    
    inline def apply(): WalkOptionsListeners = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WalkOptionsListeners]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WalkOptionsListeners] (val x: Self) extends AnyVal {
      
      inline def setDirectories(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = StObject.set(x, "directories", js.Any.fromFunction3(value))
      
      inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      inline def setDirectory(value: (/* base */ String, /* names */ WalkStats, /* next */ WalkNext) => Unit): Self = StObject.set(x, "directory", js.Any.fromFunction3(value))
      
      inline def setDirectoryError(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = StObject.set(x, "directoryError", js.Any.fromFunction3(value))
      
      inline def setDirectoryErrorUndefined: Self = StObject.set(x, "directoryError", js.undefined)
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setEnd(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = StObject.set(x, "end", js.Any.fromFunction3(value))
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setErrors(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = StObject.set(x, "errors", js.Any.fromFunction3(value))
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setFile(value: (/* base */ String, /* names */ WalkStats, /* next */ WalkNext) => Unit): Self = StObject.set(x, "file", js.Any.fromFunction3(value))
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setFiles(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = StObject.set(x, "files", js.Any.fromFunction3(value))
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setNames(value: (/* base */ String, /* names */ js.Array[String], /* next */ WalkNext) => Unit): Self = StObject.set(x, "names", js.Any.fromFunction3(value))
      
      inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
      
      inline def setNodeError(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = StObject.set(x, "nodeError", js.Any.fromFunction3(value))
      
      inline def setNodeErrorUndefined: Self = StObject.set(x, "nodeError", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.walk.walkStrings.files
    - typings.walk.walkStrings.directories
    - typings.walk.walkStrings.errors
    - typings.walk.walkStrings.nodeError
    - typings.walk.walkStrings.directoryError
  */
  trait WalkStatArrayEvent extends StObject
  object WalkStatArrayEvent {
    
    inline def directories: typings.walk.walkStrings.directories = "directories".asInstanceOf[typings.walk.walkStrings.directories]
    
    inline def directoryError: typings.walk.walkStrings.directoryError = "directoryError".asInstanceOf[typings.walk.walkStrings.directoryError]
    
    inline def errors: typings.walk.walkStrings.errors = "errors".asInstanceOf[typings.walk.walkStrings.errors]
    
    inline def files: typings.walk.walkStrings.files = "files".asInstanceOf[typings.walk.walkStrings.files]
    
    inline def nodeError: typings.walk.walkStrings.nodeError = "nodeError".asInstanceOf[typings.walk.walkStrings.nodeError]
  }
  
  type WalkStatArrayEventCallback = js.Function3[/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.walk.walkStrings.file
    - typings.walk.walkStrings.directory
  */
  trait WalkStatEvent extends StObject
  object WalkStatEvent {
    
    inline def directory: typings.walk.walkStrings.directory = "directory".asInstanceOf[typings.walk.walkStrings.directory]
    
    inline def file: typings.walk.walkStrings.file = "file".asInstanceOf[typings.walk.walkStrings.file]
  }
  
  type WalkStatEventCallback = js.Function3[/* base */ String, /* names */ WalkStats, /* next */ WalkNext, Unit]
  
  @js.native
  trait WalkStats extends Stats {
    
    var error: js.UndefOr[ErrnoException] = js.native
    
    var name: String = js.native
    
    var `type`: file | directory | symbolicLink | blockDevice | characterDevice | FIFO | socket = js.native
  }
  
  @js.native
  trait Walker extends StObject {
    
    def on(event: WalkStatArrayEvent, cb: WalkStatArrayEventCallback): Unit = js.native
    def on(event: WalkStatEvent, cb: WalkStatEventCallback): Unit = js.native
    @JSName("on")
    def on_end(event: end, cb: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_names(event: names, cb: WalkNamesEventCallback): Unit = js.native
    
    def pause(): Unit = js.native
    
    def resume(): Unit = js.native
  }
}
