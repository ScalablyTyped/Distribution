package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import typings.babelTypes.mod.File_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveIdentifierMod {
  
  @JSImport("vue-docgen-api/dist/utils/resolveIdentifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ast: File_, path: NodePath[js.Any, js.Any]): (NodePath[js.Any, js.Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ast.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[(NodePath[js.Any, js.Any]) | Null]
}
