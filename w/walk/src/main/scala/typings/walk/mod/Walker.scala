package typings.walk.mod

import typings.walk.walkStrings.end
import typings.walk.walkStrings.names
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Walker extends js.Object {
  
  def on(event: WalkStatArrayEvent, cb: WalkStatArrayEventCallback): Unit = js.native
  def on(event: WalkStatEvent, cb: WalkStatEventCallback): Unit = js.native
  @JSName("on")
  def on_end(event: end, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_names(event: names, cb: WalkNamesEventCallback): Unit = js.native
  
  def pause(): Unit = js.native
  
  def resume(): Unit = js.native
}
