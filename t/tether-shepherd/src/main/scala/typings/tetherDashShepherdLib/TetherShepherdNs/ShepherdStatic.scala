package typings
package tetherDashShepherdLib.TetherShepherdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShepherdStatic extends js.Object {
  var Tour: IShepherdTour = js.native
  var activeTour: IShepherdTour = js.native
  def off(eventName: java.lang.String): js.Any = js.native
  def off(eventName: java.lang.String, handler: js.Function): js.Any = js.native
  def on(eventName: java.lang.String, handler: js.Function): js.Any = js.native
  def on(eventName: java.lang.String, handler: js.Function, context: js.Any): js.Any = js.native
  def once(eventName: java.lang.String, handler: js.Function): js.Any = js.native
  def once(eventName: java.lang.String, handler: js.Function, context: js.Any): js.Any = js.native
}

