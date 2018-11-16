package typings
package webpackLib.webpackMod.webpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object StatsNs {
  type Preset = scala.Boolean | webpackLib.webpackLibStrings.`errors-only` | webpackLib.webpackLibStrings.minimal | webpackLib.webpackLibStrings.none | webpackLib.webpackLibStrings.normal | webpackLib.webpackLibStrings.verbose
  type StatsExcludeFilter = java.lang.String | js.Array[java.lang.String] | stdLib.RegExp | js.Array[stdLib.RegExp] | (js.Function1[/* assetName */ java.lang.String, scala.Boolean]) | (js.Array[js.Function1[/* assetName */ java.lang.String, scala.Boolean]])
  type ToJsonOptions = Preset | ToJsonOptionsObject
  type ToStringOptions = Preset | ToStringOptionsObject
}
