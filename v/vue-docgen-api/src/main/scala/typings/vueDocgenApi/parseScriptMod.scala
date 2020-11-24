package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import typings.babelTypes.mod.File_
import typings.vueDocgenApi.documentationMod.default
import typings.vueDocgenApi.parseMod.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-docgen-api/dist/parse-script", JSImport.Namespace)
@js.native
object parseScriptMod extends js.Object {
  
  def default(source: String, preHandlers: js.Array[Handler], handlers: js.Array[Handler], options: ParseOptions): js.Promise[js.UndefOr[js.Array[typings.vueDocgenApi.documentationMod.default]]] = js.native
  def default(
    source: String,
    preHandlers: js.Array[Handler],
    handlers: js.Array[Handler],
    options: ParseOptions,
    documentation: js.UndefOr[scala.Nothing],
    forceSingleExport: Boolean
  ): js.Promise[js.UndefOr[js.Array[typings.vueDocgenApi.documentationMod.default]]] = js.native
  def default(
    source: String,
    preHandlers: js.Array[Handler],
    handlers: js.Array[Handler],
    options: ParseOptions,
    documentation: typings.vueDocgenApi.documentationMod.default
  ): js.Promise[js.UndefOr[js.Array[typings.vueDocgenApi.documentationMod.default]]] = js.native
  def default(
    source: String,
    preHandlers: js.Array[Handler],
    handlers: js.Array[Handler],
    options: ParseOptions,
    documentation: typings.vueDocgenApi.documentationMod.default,
    forceSingleExport: Boolean
  ): js.Promise[js.UndefOr[js.Array[typings.vueDocgenApi.documentationMod.default]]] = js.native
  
  type Handler = js.Function4[
    /* doc */ default, 
    /* componentDefinition */ NodePath[js.Any, js.Any], 
    /* ast */ File_, 
    /* opt */ ParseOptions, 
    js.Promise[Unit]
  ]
}
