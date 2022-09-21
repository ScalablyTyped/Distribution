package typings.watch

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.fsMod.Stats
import typings.watch.watchStrings.changed
import typings.watch.watchStrings.created
import typings.watch.watchStrings.removed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("watch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMonitor(root: String, callback: js.Function1[/* monitor */ Monitor, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createMonitor")(root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createMonitor(root: String, options: Options, callback: js.Function1[/* monitor */ Monitor, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createMonitor")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unwatchTree(root: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unwatchTree")(root.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def walk(
    root: String,
    callback: js.Function2[/* error */ js.Error | Null, /* files */ js.UndefOr[Files], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def walk(
    root: String,
    options: WalkOptions,
    callback: js.Function2[/* error */ js.Error | Null, /* files */ js.UndefOr[Files], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def watchTree(root: String, callback: js.Function3[/* f */ String, /* curr */ Stats, /* prev */ Stats, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("watchTree")(root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def watchTree(
    root: String,
    options: Options,
    callback: js.Function3[/* f */ String, /* curr */ Stats, /* prev */ Stats, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("watchTree")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait BaseOptions extends StObject {
    
    var filter: js.UndefOr[js.Function2[/* path */ String, /* stat */ Stats, Boolean]] = js.undefined
    
    var ignoreDotFiles: js.UndefOr[Boolean] = js.undefined
  }
  object BaseOptions {
    
    inline def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    extension [Self <: BaseOptions](x: Self) {
      
      inline def setFilter(value: (/* path */ String, /* stat */ Stats) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setIgnoreDotFiles(value: Boolean): Self = StObject.set(x, "ignoreDotFiles", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDotFilesUndefined: Self = StObject.set(x, "ignoreDotFiles", js.undefined)
    }
  }
  
  type Files = StringDictionary[Stats]
  
  @js.native
  trait Monitor extends EventEmitter {
    
    var files: Files = js.native
    
    def on(event: created | removed, listener: js.Function2[/* f */ String, /* stat */ Stats, Unit]): this.type = js.native
    @JSName("on")
    def on_changed(
      event: changed,
      listener: js.Function3[/* f */ String, /* current */ Stats, /* prev */ Stats, Unit]
    ): this.type = js.native
    
    def stop(): Unit = js.native
  }
  
  trait Options
    extends StObject
       with BaseOptions {
    
    var interval: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    }
  }
  
  trait WalkOptions
    extends StObject
       with BaseOptions {
    
    var ignoreDirectoryPattern: js.UndefOr[js.RegExp] = js.undefined
    
    var ignoreNotPermitted: js.UndefOr[Boolean] = js.undefined
    
    var ignoreUnreadableDir: js.UndefOr[Boolean] = js.undefined
  }
  object WalkOptions {
    
    inline def apply(): WalkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WalkOptions]
    }
    
    extension [Self <: WalkOptions](x: Self) {
      
      inline def setIgnoreDirectoryPattern(value: js.RegExp): Self = StObject.set(x, "ignoreDirectoryPattern", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDirectoryPatternUndefined: Self = StObject.set(x, "ignoreDirectoryPattern", js.undefined)
      
      inline def setIgnoreNotPermitted(value: Boolean): Self = StObject.set(x, "ignoreNotPermitted", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNotPermittedUndefined: Self = StObject.set(x, "ignoreNotPermitted", js.undefined)
      
      inline def setIgnoreUnreadableDir(value: Boolean): Self = StObject.set(x, "ignoreUnreadableDir", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUnreadableDirUndefined: Self = StObject.set(x, "ignoreUnreadableDir", js.undefined)
    }
  }
}
