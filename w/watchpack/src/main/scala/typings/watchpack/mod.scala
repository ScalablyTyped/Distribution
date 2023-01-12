package typings.watchpack

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.timersMod.global.NodeJS.Timer
import typings.std.Map
import typings.std.Set
import typings.watchpack.anon.Changes
import typings.watchpack.anon.Directories
import typings.watchpack.watchpackStrings.aggregated
import typings.watchpack.watchpackStrings.change
import typings.watchpack.watchpackStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("watchpack", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Watchpack {
    def this(options: WatchOptions) = this()
  }
  
  trait Entry extends StObject {
    
    /** A point in time at which is it safe to say all changes happened before that */
    var safeTime: Double
    
    /** Only for file entries: the last modified timestamp of the file */
    var timestamp: Double
  }
  object Entry {
    
    inline def apply(safeTime: Double, timestamp: Double): Entry = {
      val __obj = js.Dynamic.literal(safeTime = safeTime.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      inline def setSafeTime(value: Double): Self = StObject.set(x, "safeTime", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait WatchOptions
    extends StObject
       with WatcherOptions {
    
    var aggregateTimeout: js.UndefOr[Double] = js.undefined
  }
  object WatchOptions {
    
    inline def apply(): WatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WatchOptions] (val x: Self) extends AnyVal {
      
      inline def setAggregateTimeout(value: Double): Self = StObject.set(x, "aggregateTimeout", value.asInstanceOf[js.Any])
      
      inline def setAggregateTimeoutUndefined: Self = StObject.set(x, "aggregateTimeout", js.undefined)
    }
  }
  
  trait WatcherOptions extends StObject {
    
    var followSymlinks: js.UndefOr[Boolean] = js.undefined
    
    var ignored: js.UndefOr[
        js.Array[String] | String | js.RegExp | (js.Function1[/* path */ String, Boolean])
      ] = js.undefined
    
    var poll: js.UndefOr[Boolean | Double] = js.undefined
  }
  object WatcherOptions {
    
    inline def apply(): WatcherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatcherOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WatcherOptions] (val x: Self) extends AnyVal {
      
      inline def setFollowSymlinks(value: Boolean): Self = StObject.set(x, "followSymlinks", value.asInstanceOf[js.Any])
      
      inline def setFollowSymlinksUndefined: Self = StObject.set(x, "followSymlinks", js.undefined)
      
      inline def setIgnored(value: js.Array[String] | String | js.RegExp | (js.Function1[/* path */ String, Boolean])): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
      
      inline def setIgnoredFunction1(value: /* path */ String => Boolean): Self = StObject.set(x, "ignored", js.Any.fromFunction1(value))
      
      inline def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
      
      inline def setIgnoredVarargs(value: String*): Self = StObject.set(x, "ignored", js.Array(value*))
      
      inline def setPoll(value: Boolean | Double): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
      
      inline def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
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
    
    var aggregatedChanges: Set[String] = js.native
    
    var aggregatedRemovals: Set[String] = js.native
    
    /**
      * Stops emitting events and closes all watchers
      */
    def close(): Unit = js.native
    
    /**
      * Collects time info objects for all known files and directories
      * This includes info from files not directly watched
      */
    def collectTimeInfoEntries(fileInfoEntries: Map[String, Entry], directoryInfoEntries: Map[String, Entry]): Unit = js.native
    
    var dirWatchers: js.Array[typings.watchpack.watcherMod.^] = js.native
    
    var fileWatchers: js.Array[typings.watchpack.watcherMod.^] = js.native
    
    /**
      * Returns the current aggregated info and removes that from the watcher
      * The next aggregated event won't include that info and will only emitted when futher changes happen
      * Can be used when paused
      */
    def getAggregated(): Changes = js.native
    
    /**
      * Returns a `Map` with all known time info objects for files and directories
      * Similar to `collectTimeInfoEntries()` but returns a single map with all entries
      */
    def getTimeInfoEntries(): Map[String, Entry] = js.native
    
    /**
      * Returns an object with all known change times for files
      * This include timestamps from files not directly watched
      * Key: absolute path, value: timestamp as number
      * @deprecated
      */
    def getTimes(): StringDictionary[Double] = js.native
    
    /** Last modified times for files by path */
    var mtimes: StringDictionary[Double] = js.native
    
    @JSName("on")
    def on_aggregated(
      eventName: aggregated,
      listener: js.Function2[/* changes */ Set[String], /* removals */ Set[String], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_change(
      eventName: change,
      listener: js.Function3[/* filePath */ String, /* modifiedTime */ Double, /* explanation */ String, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_remove(eventName: remove, listener: js.Function2[/* filePath */ String, /* explanation */ String, Unit]): this.type = js.native
    
    var options: WatchOptions = js.native
    
    /**
      * Stops emitting events, but keeps watchers open
      * The next "watch" call can reuse the watchers
      * The watcher will keep aggregating events which can be received with `getAggregated()`
      */
    def pause(): Unit = js.native
    
    var paused: Boolean = js.native
    
    /**
      * Starts watching these files and directories
      * Calling this again will override the files and directories
      */
    def watch(options: Directories): Unit = js.native
    
    var watcherOptions: WatcherOptions = js.native
  }
}
