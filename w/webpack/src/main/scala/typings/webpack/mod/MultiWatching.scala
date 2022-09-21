package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiWatching extends StObject {
  
  def close(callback: CallbackFunction[Unit]): Unit = js.native
  
  var compiler: MultiCompiler = js.native
  
  def invalidate(): Unit = js.native
  def invalidate(callback: Any): Unit = js.native
  
  def resume(): Unit = js.native
  
  def suspend(): Unit = js.native
  
  var watchings: js.Array[Watching] = js.native
}
