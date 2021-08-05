package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import typings.babelTypes.mod.File_
import typings.vueDocgenApi.parseMod.ParseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendsHandlerMod {
  
  @JSImport("vue-docgen-api/dist/script-handlers/extendsHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    documentation: typings.vueDocgenApi.documentationMod.default,
    componentDefinition: NodePath[js.Any, js.Any],
    astPath: File_,
    opt: ParseOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(documentation.asInstanceOf[js.Any], componentDefinition.asInstanceOf[js.Any], astPath.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
