package typings.webpackMerge.mod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.mod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpackMerge extends js.Object {
  @JSName("multiple")
  var multiple_Original: MultipleConfigurationMergeFunction = js.native
  @JSName("smart")
  var smart_Original: ConfigurationMergeFunction = js.native
  @JSName("unique")
  var unique_Original: UniqueFunction = js.native
  def apply(configs: Configuration*): Configuration = js.native
  def apply(customizeOptions: CustomizeOptions): ConfigurationMergeFunction = js.native
  def multiple(configs: MultipleConfiguration*): js.Array[Configuration] = js.native
  def smart(configs: Configuration*): Configuration = js.native
  def smartStrategy(options: StringDictionary[MergeStrategy]): ConfigurationMergeFunction = js.native
  def strategy(options: StringDictionary[MergeStrategy]): ConfigurationMergeFunction = js.native
  def unique(field: String, fields: js.Array[String], keyFn: js.Function1[/* field */ js.Any, String]): CustomizeArrayFunction = js.native
}

