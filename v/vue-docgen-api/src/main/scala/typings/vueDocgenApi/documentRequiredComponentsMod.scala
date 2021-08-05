package typings.vueDocgenApi

import typings.vueDocgenApi.documentationMod.default
import typings.vueDocgenApi.parseMod.ParseOptions
import typings.vueDocgenApi.resolveRequiredMod.ImportedVariableSet
import typings.vueDocgenApi.vueDocgenApiStrings.`extends`
import typings.vueDocgenApi.vueDocgenApiStrings.mixin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentRequiredComponentsMod {
  
  @JSImport("vue-docgen-api/dist/utils/documentRequiredComponents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(documentation: Unit, varToFilePath: ImportedVariableSet, originObject: Unit, opt: ParseOptions): js.Promise[js.Array[typings.vueDocgenApi.documentationMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(documentation.asInstanceOf[js.Any], varToFilePath.asInstanceOf[js.Any], originObject.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.vueDocgenApi.documentationMod.default]]]
  inline def default(
    documentation: typings.vueDocgenApi.documentationMod.default,
    varToFilePath: ImportedVariableSet,
    originObject: Unit,
    opt: ParseOptions
  ): js.Promise[js.Array[typings.vueDocgenApi.documentationMod.default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(documentation.asInstanceOf[js.Any], varToFilePath.asInstanceOf[js.Any], originObject.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.vueDocgenApi.documentationMod.default]]]
  
  inline def default_extends(
    documentation: Unit,
    varToFilePath: ImportedVariableSet,
    originObject: `extends`,
    opt: ParseOptions
  ): js.Promise[js.Array[default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(documentation.asInstanceOf[js.Any], varToFilePath.asInstanceOf[js.Any], originObject.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[default]]]
  inline def default_extends(
    documentation: default,
    varToFilePath: ImportedVariableSet,
    originObject: `extends`,
    opt: ParseOptions
  ): js.Promise[js.Array[default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(documentation.asInstanceOf[js.Any], varToFilePath.asInstanceOf[js.Any], originObject.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[default]]]
  
  inline def default_mixin(documentation: Unit, varToFilePath: ImportedVariableSet, originObject: mixin, opt: ParseOptions): js.Promise[js.Array[default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(documentation.asInstanceOf[js.Any], varToFilePath.asInstanceOf[js.Any], originObject.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[default]]]
  inline def default_mixin(documentation: default, varToFilePath: ImportedVariableSet, originObject: mixin, opt: ParseOptions): js.Promise[js.Array[default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(documentation.asInstanceOf[js.Any], varToFilePath.asInstanceOf[js.Any], originObject.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[default]]]
}
