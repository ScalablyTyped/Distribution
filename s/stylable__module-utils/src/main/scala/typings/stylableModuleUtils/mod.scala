package typings.stylableModuleUtils

import typings.stylableCore.stylableMod.StylableConfig
import typings.stylableCore.stylableTransformerMod.StylableResults
import typings.stylableModuleUtils.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stylable/module-utils", "createModuleSource")
  @js.native
  def createModuleSource(
    stylableResult: StylableResults,
    moduleFormat: js.UndefOr[String],
    includeCSSInJS: Boolean,
    moduleId: js.UndefOr[String],
    renderableOnly: js.UndefOr[Boolean],
    depth: js.UndefOr[String | Double],
    staticRequests: js.UndefOr[js.Array[String]],
    runtimeRequest: js.UndefOr[String],
    afterModule: js.UndefOr[js.Array[String]]
  ): String = js.native
  
  @JSImport("@stylable/module-utils", "generateModuleSource")
  @js.native
  def generateModuleSource(
    stylableResult: StylableResults,
    moduleId: String,
    beforeModule: js.Array[String],
    renderer: String,
    createFunction: String,
    createRenderableFunction: String,
    css: String,
    depth: String,
    exportsArgument: String,
    afterModule: String
  ): String = js.native
  @JSImport("@stylable/module-utils", "generateModuleSource")
  @js.native
  def generateModuleSource(
    stylableResult: StylableResults,
    moduleId: String,
    beforeModule: js.Array[String],
    renderer: String,
    createFunction: String,
    createRenderableFunction: String,
    css: String,
    depth: String,
    exportsArgument: String,
    afterModule: String,
    renderableOnly: Boolean
  ): String = js.native
  
  @JSImport("@stylable/module-utils", "stylableModuleFactory")
  @js.native
  def stylableModuleFactory(stylableOptions: StylableConfig): js.Function2[/* source */ String, /* path */ String, String] = js.native
  @JSImport("@stylable/module-utils", "stylableModuleFactory")
  @js.native
  def stylableModuleFactory(
    stylableOptions: StylableConfig,
    hasRuntimePathRuntimeStylesheetIdInjectCSSRenderableOnlyStaticImports: PartialOptions
  ): js.Function2[/* source */ String, /* path */ String, String] = js.native
}
