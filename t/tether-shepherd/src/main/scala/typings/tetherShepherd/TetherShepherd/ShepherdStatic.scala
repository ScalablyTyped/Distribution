package typings.tetherShepherd.TetherShepherd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShepherdStatic extends js.Object {
  
  var Tour: IShepherdTour = js.native
  
  var activeTour: IShepherdTour = js.native
  
  def off(eventName: String): js.Any = js.native
  def off(eventName: String, handler: js.Function): js.Any = js.native
  
  def on(eventName: String, handler: js.Function): js.Any = js.native
  def on(eventName: String, handler: js.Function, context: js.Any): js.Any = js.native
  
  def once(eventName: String, handler: js.Function): js.Any = js.native
  def once(eventName: String, handler: js.Function, context: js.Any): js.Any = js.native
}
