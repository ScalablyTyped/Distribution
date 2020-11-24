package typings.stylableModuleUtils.moduleFactoryMod

import typings.stylableCore.stylableMod.StylableConfig
import typings.stylableModuleUtils.anon.PartialOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/module-utils/cjs/module-factory", "stylableModuleFactory")
@js.native
object stylableModuleFactory extends js.Object {
  
  def apply(stylableOptions: StylableConfig): js.Function2[/* source */ String, /* path */ String, String] = js.native
  def apply(
    stylableOptions: StylableConfig,
    hasRuntimePathRuntimeStylesheetIdInjectCSSRenderableOnlyStaticImports: PartialOptions
  ): js.Function2[/* source */ String, /* path */ String, String] = js.native
}
