package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object StatsNs {
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - webpackLib.webpackLibStrings.`errors-only`
    - webpackLib.webpackLibStrings.`errors-warnings`
    - webpackLib.webpackLibStrings.minimal
    - webpackLib.webpackLibStrings.none
    - webpackLib.webpackLibStrings.normal
    - webpackLib.webpackLibStrings.verbose
  */
  type Preset = _Preset | scala.Boolean
  type StatsExcludeFilter = java.lang.String | (js.Array[
    (js.Function1[/* assetName */ java.lang.String, scala.Boolean]) | stdLib.RegExp | java.lang.String
  ]) | stdLib.RegExp | (js.Function1[/* assetName */ java.lang.String, scala.Boolean])
  /* Rewritten from type alias, can be one of: 
    - Preset
    - ToJsonOptionsObject
  */
  type ToJsonOptions = _ToJsonOptions | scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - Preset
    - ToStringOptionsObject
  */
  type ToStringOptions = _ToStringOptions | scala.Boolean
}
