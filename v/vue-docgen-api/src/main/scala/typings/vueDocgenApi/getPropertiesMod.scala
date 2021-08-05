package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPropertiesMod {
  
  @JSImport("vue-docgen-api/dist/script-handlers/utils/getProperties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(path: NodePath[js.Any, js.Any], id: String): js.Array[NodePath[js.Any, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Array[NodePath[js.Any, js.Any]]]
}
