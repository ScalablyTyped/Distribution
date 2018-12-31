package typings
package victoryLib.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventPropTypeInterface[TTarget, TEventKey] extends js.Object {
  /**
    * Use only in:
    * - VictoryChart
    * - VictoryStack
    */
  var childName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Event handlers map. Keys are standard event names (such as onClick) and values are event callbacks
    */
  var eventHandlers: org.scalablytyped.runtime.StringDictionary[
    (victoryLib.Anon_Event[TTarget, TEventKey]) | (victoryLib.Anon_EventSyntheticEvent[TTarget, TEventKey])
  ]
  /**
    *
    */
  var eventKey: js.UndefOr[TEventKey] = js.undefined
  /**
    * Targets may be any valid style namespace for a given component
    */
  var target: TTarget
}

