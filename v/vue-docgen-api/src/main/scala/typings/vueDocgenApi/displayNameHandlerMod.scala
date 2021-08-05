package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object displayNameHandlerMod {
  
  @JSImport("vue-docgen-api/dist/script-handlers/displayNameHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(documentation: typings.vueDocgenApi.documentationMod.default, compDef: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(documentation.asInstanceOf[js.Any], compDef.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
