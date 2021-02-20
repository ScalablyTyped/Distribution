package typings.stylableModuleUtils

import typings.stylableCore.stylableTransformerMod.StylableResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleSourceMod {
  
  @JSImport("@stylable/module-utils/cjs/module-source", "createModuleSource")
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
  
  @JSImport("@stylable/module-utils/cjs/module-source", "generateModuleSource")
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
  @JSImport("@stylable/module-utils/cjs/module-source", "generateModuleSource")
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
}
