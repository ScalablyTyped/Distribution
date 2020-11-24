package typings.webpackMerge.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpackMerge extends js.Object {
  
  def apply(
    configs: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any)*
  ): js.Any = js.native
  def apply(customizeOptions: CustomizeOptions): ConfigurationMergeFunction = js.native
  
  def multiple(configs: MultipleConfiguration*): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ _
  ] = js.native
  @JSName("multiple")
  var multiple_Original: MultipleConfigurationMergeFunction = js.native
  
  def smart(
    configs: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any)*
  ): js.Any = js.native
  
  def smartStrategy(options: StringDictionary[MergeStrategy]): ConfigurationMergeFunction = js.native
  
  @JSName("smart")
  var smart_Original: ConfigurationMergeFunction = js.native
  
  def strategy(options: StringDictionary[MergeStrategy]): ConfigurationMergeFunction = js.native
  
  def unique(field: String, fields: js.Array[String], keyFn: js.Function1[/* field */ js.Any, String]): CustomizeArrayFunction = js.native
  @JSName("unique")
  var unique_Original: UniqueFunction = js.native
}
