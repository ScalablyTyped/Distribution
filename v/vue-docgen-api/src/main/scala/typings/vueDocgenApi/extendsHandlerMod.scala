package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import typings.babelTypes.mod.File_
import typings.vueDocgenApi.parseMod.ParseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendsHandlerMod {
  
  @JSImport("vue-docgen-api/dist/script-handlers/extendsHandler", JSImport.Default)
  @js.native
  def default(
    documentation: typings.vueDocgenApi.documentationMod.default,
    componentDefinition: NodePath[_, _],
    astPath: File_,
    opt: ParseOptions
  ): js.Promise[Unit] = js.native
}
