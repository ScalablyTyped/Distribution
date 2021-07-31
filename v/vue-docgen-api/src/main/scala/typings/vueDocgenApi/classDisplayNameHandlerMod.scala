package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classDisplayNameHandlerMod {
  
  @JSImport("vue-docgen-api/dist/script-handlers/classDisplayNameHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
