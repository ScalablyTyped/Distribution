package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isExportedAssignmentMod {
  
  @JSImport("vue-docgen-api/dist/utils/isExportedAssignment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(path: NodePath[js.Any, js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
