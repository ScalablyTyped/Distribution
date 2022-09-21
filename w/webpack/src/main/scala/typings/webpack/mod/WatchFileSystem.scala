package typings.webpack.mod

import typings.std.Map
import typings.std.Set
import typings.webpack.webpackStrings.ignore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchFileSystem extends StObject {
  
  @JSName("watch")
  def watch_ignore(
    files: js.Iterable[String],
    directories: js.Iterable[String],
    missing: js.Iterable[String],
    startTime: Double,
    options: WatchOptions,
    callback: js.Function5[
      /* arg0 */ js.UndefOr[js.Error], 
      /* arg1 */ Map[String, FileSystemInfoEntry | ignore], 
      /* arg2 */ Map[String, FileSystemInfoEntry | ignore], 
      /* arg3 */ Set[String], 
      /* arg4 */ Set[String], 
      Unit
    ],
    callbackUndelayed: js.Function2[/* arg0 */ String, /* arg1 */ Double, Unit]
  ): Watcher
}
object WatchFileSystem {
  
  inline def apply(
    watch: (js.Iterable[String], js.Iterable[String], js.Iterable[String], Double, WatchOptions, js.Function5[
      /* arg0 */ js.UndefOr[js.Error], 
      /* arg1 */ Map[String, FileSystemInfoEntry | ignore], 
      /* arg2 */ Map[String, FileSystemInfoEntry | ignore], 
      /* arg3 */ Set[String], 
      /* arg4 */ Set[String], 
      Unit
    ], js.Function2[/* arg0 */ String, /* arg1 */ Double, Unit]) => Watcher
  ): WatchFileSystem = {
    val __obj = js.Dynamic.literal(watch = js.Any.fromFunction7(watch))
    __obj.asInstanceOf[WatchFileSystem]
  }
  
  extension [Self <: WatchFileSystem](x: Self) {
    
    inline def setWatch(
      value: (js.Iterable[String], js.Iterable[String], js.Iterable[String], Double, WatchOptions, js.Function5[
          /* arg0 */ js.UndefOr[js.Error], 
          /* arg1 */ Map[String, FileSystemInfoEntry | ignore], 
          /* arg2 */ Map[String, FileSystemInfoEntry | ignore], 
          /* arg3 */ Set[String], 
          /* arg4 */ Set[String], 
          Unit
        ], js.Function2[/* arg0 */ String, /* arg1 */ Double, Unit]) => Watcher
    ): Self = StObject.set(x, "watch", js.Any.fromFunction7(value))
  }
}
