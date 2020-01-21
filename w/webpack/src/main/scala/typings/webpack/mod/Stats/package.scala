package typings.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Stats {
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.webpack.webpackStrings.`errors-only`
    - typings.webpack.webpackStrings.`errors-warnings`
    - typings.webpack.webpackStrings.minimal
    - typings.webpack.webpackStrings.none
    - typings.webpack.webpackStrings.normal
    - typings.webpack.webpackStrings.verbose
  */
  type Preset = typings.webpack.mod.Stats._Preset | scala.Boolean
  type StatsExcludeFilter = java.lang.String | (js.Array[
    (js.Function1[/* assetName */ java.lang.String, scala.Boolean]) | typings.std.RegExp | java.lang.String
  ]) | typings.std.RegExp | (js.Function1[/* assetName */ java.lang.String, scala.Boolean])
  /* Rewritten from type alias, can be one of: 
    - typings.webpack.mod.Stats.Preset
    - typings.webpack.mod.Stats.ToJsonOptionsObject
  */
  type ToJsonOptions = typings.webpack.mod.Stats._ToJsonOptions | scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.webpack.mod.Stats.Preset
    - typings.webpack.mod.Stats.ToStringOptionsObject
  */
  type ToStringOptions = typings.webpack.mod.Stats._ToStringOptions | scala.Boolean
}
