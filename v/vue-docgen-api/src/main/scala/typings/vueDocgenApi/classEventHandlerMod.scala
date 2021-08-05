package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import typings.babelTypes.mod.File_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classEventHandlerMod {
  
  @JSImport("vue-docgen-api/dist/script-handlers/classEventHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    documentation: typings.vueDocgenApi.documentationMod.default,
    path: NodePath[js.Any, js.Any],
    astPath: File_
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any], astPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
