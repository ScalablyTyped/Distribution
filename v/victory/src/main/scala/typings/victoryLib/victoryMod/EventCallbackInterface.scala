package typings
package victoryLib.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Return value for eventHandlers values
  */
trait EventCallbackInterface[TTarget, TEventKey] extends js.Object {
  /**
    * Use only in:
    * - VictoryChart
    * - VictoryStack
    */
  var childName: js.UndefOr[java.lang.String] = js.undefined
  var eventKey: js.UndefOr[TEventKey] = js.undefined
  var target: js.UndefOr[TTarget] = js.undefined
  /**
    * Will be called with the calculated props for the individual selected element and result will override
    * props of selected element via object assignment
    * @param props
    */
  def mutation(props: js.Any): js.Any
}

