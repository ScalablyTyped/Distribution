package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import typings.babelTypes.mod.File_
import typings.vueDocgenApi.documentationMod.default
import typings.vueDocgenApi.parseMod.ParseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseScriptMod {
  
  @JSImport("vue-docgen-api/dist/parse-script", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(source: String, preHandlers: js.Array[Handler], handlers: js.Array[Handler], options: ParseOptions): js.Promise[js.UndefOr[js.Array[typings.vueDocgenApi.documentationMod.default]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], preHandlers.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[typings.vueDocgenApi.documentationMod.default]]]]
  inline def default(
    source: String,
    preHandlers: js.Array[Handler],
    handlers: js.Array[Handler],
    options: ParseOptions,
    documentation: Unit,
    forceSingleExport: Boolean
  ): js.Promise[js.UndefOr[js.Array[typings.vueDocgenApi.documentationMod.default]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], preHandlers.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any], options.asInstanceOf[js.Any], documentation.asInstanceOf[js.Any], forceSingleExport.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[typings.vueDocgenApi.documentationMod.default]]]]
  inline def default(
    source: String,
    preHandlers: js.Array[Handler],
    handlers: js.Array[Handler],
    options: ParseOptions,
    documentation: typings.vueDocgenApi.documentationMod.default
  ): js.Promise[js.UndefOr[js.Array[typings.vueDocgenApi.documentationMod.default]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], preHandlers.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any], options.asInstanceOf[js.Any], documentation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[typings.vueDocgenApi.documentationMod.default]]]]
  inline def default(
    source: String,
    preHandlers: js.Array[Handler],
    handlers: js.Array[Handler],
    options: ParseOptions,
    documentation: typings.vueDocgenApi.documentationMod.default,
    forceSingleExport: Boolean
  ): js.Promise[js.UndefOr[js.Array[typings.vueDocgenApi.documentationMod.default]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], preHandlers.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any], options.asInstanceOf[js.Any], documentation.asInstanceOf[js.Any], forceSingleExport.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Array[typings.vueDocgenApi.documentationMod.default]]]]
  
  type Handler = js.Function4[
    /* doc */ default, 
    /* componentDefinition */ NodePath[js.Any, js.Any], 
    /* ast */ File_, 
    /* opt */ ParseOptions, 
    js.Promise[Unit]
  ]
}
