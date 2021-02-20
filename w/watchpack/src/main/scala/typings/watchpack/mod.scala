package typings.watchpack

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.Timer
import typings.node.eventsMod.EventEmitter
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("watchpack", JSImport.Namespace)
  @js.native
  class ^ protected () extends Watchpack {
    def this(options: WatchOptions) = this()
  }
  
  @js.native
  trait WatchOptions extends WatcherOptions {
    
    var aggregateTimeout: js.UndefOr[Double] = js.native
  }
  object WatchOptions {
    
    @scala.inline
    def apply(): WatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchOptions]
    }
    
    @scala.inline
    implicit class WatchOptionsMutableBuilder[Self <: WatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAggregateTimeout(value: Double): Self = StObject.set(x, "aggregateTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggregateTimeoutUndefined: Self = StObject.set(x, "aggregateTimeout", js.undefined)
    }
  }
  
  @js.native
  trait WatcherOptions extends StObject {
    
    var ignored: js.UndefOr[js.Array[String] | String | RegExp | (js.Function1[/* path */ String, Boolean])] = js.native
    
    var poll: js.UndefOr[Boolean | Double] = js.native
  }
  object WatcherOptions {
    
    @scala.inline
    def apply(): WatcherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatcherOptions]
    }
    
    @scala.inline
    implicit class WatcherOptionsMutableBuilder[Self <: WatcherOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnored(value: js.Array[String] | String | RegExp | (js.Function1[/* path */ String, Boolean])): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredFunction1(value: /* path */ String => Boolean): Self = StObject.set(x, "ignored", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
      
      @scala.inline
      def setIgnoredVarargs(value: String*): Self = StObject.set(x, "ignored", js.Array(value :_*))
      
      @scala.inline
      def setPoll(value: Boolean | Double): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
    }
  }
  
  @js.native
  trait Watchpack extends EventEmitter {
    
    def _dirWatcher(item: String, watcher: typings.watchpack.watcherMod.^): typings.watchpack.watcherMod.^ = js.native
    
    def _fileWatcher(file: String, watcher: typings.watchpack.watcherMod.^): typings.watchpack.watcherMod.^ = js.native
    
    def _onChange(item: String, mtime: Double): Unit = js.native
    def _onChange(item: String, mtime: Double, file: String): Unit = js.native
    
    def _onTimeout(): Unit = js.native
    
    var aggregateTimeout: Timer = js.native
    
    var aggregatedChanges: js.Array[String] = js.native
    
    def close(): Unit = js.native
    
    var dirWatchers: js.Array[typings.watchpack.watcherMod.^] = js.native
    
    var fileWatchers: js.Array[typings.watchpack.watcherMod.^] = js.native
    
    def getTimes(): StringDictionary[Double] = js.native
    
    var mtimes: StringDictionary[Double] = js.native
    
    var options: WatchOptions = js.native
    
    def pause(): Unit = js.native
    
    var paused: Boolean = js.native
    
    def watch(files: js.Array[String], directories: js.Array[String]): Unit = js.native
    def watch(files: js.Array[String], directories: js.Array[String], startTime: Double): Unit = js.native
    
    var watcherOptions: WatcherOptions = js.native
  }
}
