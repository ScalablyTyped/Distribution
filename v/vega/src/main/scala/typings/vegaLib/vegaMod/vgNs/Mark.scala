package typings
package vegaLib.vegaMod.vgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Mark extends js.Object {
  var delay: js.UndefOr[ValueRefs] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
      * "linear-in" | "linear-out" | "linear-in-out" | "linear-out-in" | "quad-in" | "quad-out" | "quad-in-out" |
      * "quad-out-in" | "cubic-in" | "cubic-out" | "cubic-in-out" | "cubic-out-in" | "sin-in" | "sin-out" | "sin-in-out" |
      * "sin-out-in" | "exp-in" | "exp-out" | "exp-in-out" | "exp-out-in" | "circle-in" | "circle-out" | "circle-in-out" |
      * "circle-out-in" | "bounce-in" | "bounce-out" | "bounce-in-out" | "bounce-out-in"
      */
  var ease: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[vegaLib.vegaMod.vgNs.MarkNs.From] = js.undefined
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
   // "rect" | "symbol" | "path" | "arc" | "area" | "line" | "rule" | "image" | "text" | "group"
  var name: js.UndefOr[java.lang.String] = js.undefined
  // Runtime PropertySets
  var properties: js.UndefOr[PropertySets] = js.undefined
  // TODO docs
  // Stuff from Spec.Mark
  var `type`: java.lang.String
}

