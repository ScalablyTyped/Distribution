package typings
package webpackDashMergeLib.webpackDashMergeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpackMerge extends js.Object {
  @JSName("multiple")
  var multiple_Original: ConfigurationMergeFunction = js.native
  @JSName("smart")
  var smart_Original: ConfigurationMergeFunction = js.native
  @JSName("unique")
  var unique_Original: UniqueFunction = js.native
  def apply(configs: webpackLib.webpackMod.Configuration*): webpackLib.webpackMod.Configuration = js.native
  def apply(customizeOptions: CustomizeOptions): ConfigurationMergeFunction = js.native
  def multiple(configs: webpackLib.webpackMod.Configuration*): webpackLib.webpackMod.Configuration = js.native
  def smart(configs: webpackLib.webpackMod.Configuration*): webpackLib.webpackMod.Configuration = js.native
  def smartStrategy(options: org.scalablytyped.runtime.StringDictionary[MergeStrategy]): ConfigurationMergeFunction = js.native
  def strategy(options: org.scalablytyped.runtime.StringDictionary[MergeStrategy]): ConfigurationMergeFunction = js.native
  def unique(
    field: java.lang.String,
    fields: js.Array[java.lang.String],
    keyFn: js.Function1[/* field */ js.Any, java.lang.String]
  ): CustomizeArrayFunction = js.native
}

