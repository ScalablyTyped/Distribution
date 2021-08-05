package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import typings.babelTypes.mod.Decorator_
import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.JSXNamespacedName_
import typings.babelTypes.mod.SpreadElement_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getArgFromDecoratorMod {
  
  @JSImport("vue-docgen-api/dist/utils/getArgFromDecorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(path: NodePath[Decorator_, js.Any]): Null | (NodePath[Expression | SpreadElement_ | JSXNamespacedName_, js.Any]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[Null | (NodePath[Expression | SpreadElement_ | JSXNamespacedName_, js.Any])]
}
