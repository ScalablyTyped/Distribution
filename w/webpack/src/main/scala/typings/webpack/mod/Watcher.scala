package typings.webpack.mod

import typings.std.Map
import typings.std.Set
import typings.webpack.webpackStrings.ignore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Watcher extends StObject {
  
  /**
  	 * closes the watcher and all underlying file watchers
  	 */
  def close(): Unit
  
  /**
  	 * get current aggregated changes that have not yet send to callback
  	 */
  var getAggregatedChanges: js.UndefOr[js.Function0[Set[String]]] = js.undefined
  
  /**
  	 * get current aggregated removals that have not yet send to callback
  	 */
  var getAggregatedRemovals: js.UndefOr[js.Function0[Set[String]]] = js.undefined
  
  /**
  	 * get info about directories
  	 */
  def getContextTimeInfoEntries(): Map[String, FileSystemInfoEntry | ignore]
  
  /**
  	 * get info about files
  	 */
  def getFileTimeInfoEntries(): Map[String, FileSystemInfoEntry | ignore]
  
  /**
  	 * get info about timestamps and changes
  	 */
  var getInfo: js.UndefOr[js.Function0[WatcherInfo]] = js.undefined
  
  /**
  	 * closes the watcher, but keeps underlying file watchers alive until the next watch call
  	 */
  def pause(): Unit
}
object Watcher {
  
  inline def apply(
    close: () => Unit,
    getContextTimeInfoEntries: () => Map[String, FileSystemInfoEntry | ignore],
    getFileTimeInfoEntries: () => Map[String, FileSystemInfoEntry | ignore],
    pause: () => Unit
  ): Watcher = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getContextTimeInfoEntries = js.Any.fromFunction0(getContextTimeInfoEntries), getFileTimeInfoEntries = js.Any.fromFunction0(getFileTimeInfoEntries), pause = js.Any.fromFunction0(pause))
    __obj.asInstanceOf[Watcher]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Watcher] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setGetAggregatedChanges(value: () => Set[String]): Self = StObject.set(x, "getAggregatedChanges", js.Any.fromFunction0(value))
    
    inline def setGetAggregatedChangesUndefined: Self = StObject.set(x, "getAggregatedChanges", js.undefined)
    
    inline def setGetAggregatedRemovals(value: () => Set[String]): Self = StObject.set(x, "getAggregatedRemovals", js.Any.fromFunction0(value))
    
    inline def setGetAggregatedRemovalsUndefined: Self = StObject.set(x, "getAggregatedRemovals", js.undefined)
    
    inline def setGetContextTimeInfoEntries(value: () => Map[String, FileSystemInfoEntry | ignore]): Self = StObject.set(x, "getContextTimeInfoEntries", js.Any.fromFunction0(value))
    
    inline def setGetFileTimeInfoEntries(value: () => Map[String, FileSystemInfoEntry | ignore]): Self = StObject.set(x, "getFileTimeInfoEntries", js.Any.fromFunction0(value))
    
    inline def setGetInfo(value: () => WatcherInfo): Self = StObject.set(x, "getInfo", js.Any.fromFunction0(value))
    
    inline def setGetInfoUndefined: Self = StObject.set(x, "getInfo", js.undefined)
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
  }
}
