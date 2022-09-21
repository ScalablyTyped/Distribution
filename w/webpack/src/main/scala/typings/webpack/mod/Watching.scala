package typings.webpack.mod

import typings.webpack.anon.AggregateTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "Watching")
@js.native
abstract class Watching () extends StObject {
  
  var blocked: Boolean = js.native
  
  var callbacks: js.Array[CallbackFunction[Unit]] = js.native
  
  def close(callback: CallbackFunction[Unit]): Unit = js.native
  
  var closed: Boolean = js.native
  
  var compiler: Compiler = js.native
  
  def handler(): Any = js.native
  def handler(err: js.Error): Any = js.native
  def handler(err: js.Error, result: Stats): Any = js.native
  def handler(err: Null, result: Stats): Any = js.native
  def handler(err: Unit, result: Stats): Any = js.native
  @JSName("handler")
  var handler_Original: CallbackFunction[Stats] = js.native
  
  var invalid: Boolean = js.native
  
  def invalidate(): Unit = js.native
  def invalidate(callback: CallbackFunction[Unit]): Unit = js.native
  
  var lastWatcherStartTime: js.UndefOr[Double] = js.native
  
  var pausedWatcher: js.UndefOr[Null | Watcher] = js.native
  
  def resume(): Unit = js.native
  
  var running: Boolean = js.native
  
  var startTime: Null | Double = js.native
  
  def suspend(): Unit = js.native
  
  var suspended: Boolean = js.native
  
  def watch(files: js.Iterable[String], dirs: js.Iterable[String], missing: js.Iterable[String]): Unit = js.native
  
  var watchOptions: AggregateTimeout = js.native
  
  var watcher: js.UndefOr[Null | Watcher] = js.native
}
