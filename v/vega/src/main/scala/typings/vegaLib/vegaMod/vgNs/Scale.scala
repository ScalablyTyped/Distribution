package typings
package vegaLib.vegaMod.vgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Scale extends js.Object {
  // -- Time/Quantitative scale properties
  var clamp: js.UndefOr[scala.Boolean] = js.undefined
  var domain: js.UndefOr[js.Any] = js.undefined
  var domainMax: js.UndefOr[js.Any] = js.undefined
  var domainMin: js.UndefOr[js.Any] = js.undefined
  // -- Quantitative scale properties
  var exponent: js.UndefOr[scala.Double] = js.undefined
  // TODO docs
  // -- Common scale properties
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** boolean for quantitative scales, string for time scales */
  var nice: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  // -- Ordinal scale properties
  var points: js.UndefOr[scala.Boolean] = js.undefined
  var range: js.UndefOr[js.Any] = js.undefined
  var rangeMax: js.UndefOr[js.Any] = js.undefined
  var rangeMin: js.UndefOr[js.Any] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var round: js.UndefOr[scala.Boolean] = js.undefined
  var sort: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var zero: js.UndefOr[scala.Boolean] = js.undefined
}

