package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsScaling extends js.Object {
  var customScalingFunction: js.UndefOr[
    js.Function4[
      /* min */ js.UndefOr[scala.Double], 
      /* max */ js.UndefOr[scala.Double], 
      /* total */ js.UndefOr[scala.Double], 
      /* value */ js.UndefOr[scala.Double], 
      scala.Double
    ]
  ] = js.undefined
  var label: js.UndefOr[scala.Boolean | visLib.Anon_MaxVisible] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
}

