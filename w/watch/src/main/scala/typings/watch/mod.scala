package typings.watch

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.fsMod.Stats
import typings.std.RegExp
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
  
  @scala.inline
  def createMonitor(root: String, callback: js.Function1[/* monitor */ Monitor, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createMonitor")(root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def createMonitor(root: String, options: Options, callback: js.Function1[/* monitor */ Monitor, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createMonitor")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def unwatchTree(root: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unwatchTree")(root.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def watchTree(
    root: String,
    callback: js.Function3[/* f */ FileOrFiles, /* curr */ Stats, /* prev */ Stats, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("watchTree")(root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def watchTree(
    root: String,
    options: Options,
    callback: js.Function3[/* f */ FileOrFiles, /* curr */ Stats, /* prev */ Stats, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("watchTree")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type FileOrFiles = Stats | StringDictionary[Stats]
  
  @js.native
  trait Monitor extends EventEmitter {
    
    var files: StringDictionary[Stats] = js.native
    
    @JSName("on")
    def on_changed(
      event: changed,
      listener: js.Function3[/* f */ FileOrFiles, /* current */ Stats, /* prev */ Stats, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_created(event: created, listener: js.Function2[/* f */ FileOrFiles, /* stat */ Stats, Unit]): this.type = js.native
    @JSName("on")
    def on_removed(event: removed, listener: js.Function2[/* f */ FileOrFiles, /* stat */ Stats, Unit]): this.type = js.native
    
    def stop(): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var filter: js.UndefOr[js.Function2[/* path */ String, /* stat */ Stats, Boolean]] = js.undefined
    
    var ignoreDirectoryPattern: js.UndefOr[RegExp] = js.undefined
    
    var ignoreDotFiles: js.UndefOr[Boolean] = js.undefined
    
    var ignoreNotPermitted: js.UndefOr[Boolean] = js.undefined
    
    var ignoreUnreadableDir: js.UndefOr[Boolean] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: (/* path */ String, /* stat */ Stats) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setIgnoreDirectoryPattern(value: RegExp): Self = StObject.set(x, "ignoreDirectoryPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDirectoryPatternUndefined: Self = StObject.set(x, "ignoreDirectoryPattern", js.undefined)
      
      @scala.inline
      def setIgnoreDotFiles(value: Boolean): Self = StObject.set(x, "ignoreDotFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDotFilesUndefined: Self = StObject.set(x, "ignoreDotFiles", js.undefined)
      
      @scala.inline
      def setIgnoreNotPermitted(value: Boolean): Self = StObject.set(x, "ignoreNotPermitted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreNotPermittedUndefined: Self = StObject.set(x, "ignoreNotPermitted", js.undefined)
      
      @scala.inline
      def setIgnoreUnreadableDir(value: Boolean): Self = StObject.set(x, "ignoreUnreadableDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUnreadableDirUndefined: Self = StObject.set(x, "ignoreUnreadableDir", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    }
  }
}
