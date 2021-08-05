package typings.stylableModuleUtils

import typings.stylableCore.stylableMod.StylableConfig
import typings.stylableCore.stylableTransformerMod.StylableResults
import typings.stylableModuleUtils.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stylable/module-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createModuleSource(
    stylableResult: StylableResults,
    moduleFormat: js.UndefOr[String],
    includeCSSInJS: Boolean,
    moduleId: js.UndefOr[String],
    renderableOnly: js.UndefOr[Boolean],
    depth: js.UndefOr[String | Double],
    staticRequests: js.UndefOr[js.Array[String]],
    runtimeRequest: js.UndefOr[String],
    afterModule: js.UndefOr[js.Array[String]]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createModuleSource")(stylableResult.asInstanceOf[js.Any], moduleFormat.asInstanceOf[js.Any], includeCSSInJS.asInstanceOf[js.Any], moduleId.asInstanceOf[js.Any], renderableOnly.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], staticRequests.asInstanceOf[js.Any], runtimeRequest.asInstanceOf[js.Any], afterModule.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generateModuleSource(
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
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateModuleSource")(stylableResult.asInstanceOf[js.Any], moduleId.asInstanceOf[js.Any], beforeModule.asInstanceOf[js.Any], renderer.asInstanceOf[js.Any], createFunction.asInstanceOf[js.Any], createRenderableFunction.asInstanceOf[js.Any], css.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], exportsArgument.asInstanceOf[js.Any], afterModule.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateModuleSource(
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
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateModuleSource")(stylableResult.asInstanceOf[js.Any], moduleId.asInstanceOf[js.Any], beforeModule.asInstanceOf[js.Any], renderer.asInstanceOf[js.Any], createFunction.asInstanceOf[js.Any], createRenderableFunction.asInstanceOf[js.Any], css.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], exportsArgument.asInstanceOf[js.Any], afterModule.asInstanceOf[js.Any], renderableOnly.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stylableModuleFactory(stylableOptions: StylableConfig): js.Function2[/* source */ String, /* path */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stylableModuleFactory")(stylableOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* source */ String, /* path */ String, String]]
  inline def stylableModuleFactory(
    stylableOptions: StylableConfig,
    hasRuntimePathRuntimeStylesheetIdInjectCSSRenderableOnlyStaticImports: PartialOptions
  ): js.Function2[/* source */ String, /* path */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("stylableModuleFactory")(stylableOptions.asInstanceOf[js.Any], hasRuntimePathRuntimeStylesheetIdInjectCSSRenderableOnlyStaticImports.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* source */ String, /* path */ String, String]]
}
