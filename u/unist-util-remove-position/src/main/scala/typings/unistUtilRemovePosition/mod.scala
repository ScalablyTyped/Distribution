package typings.unistUtilRemovePosition

import typings.unist.mod.Data
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-remove-position", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removePosition[Tree /* <: Node[Data] */](tree: Tree): Tree = ^.asInstanceOf[js.Dynamic].applyDynamic("removePosition")(tree.asInstanceOf[js.Any]).asInstanceOf[Tree]
  inline def removePosition[Tree /* <: Node[Data] */](tree: Tree, options: Boolean): Tree = (^.asInstanceOf[js.Dynamic].applyDynamic("removePosition")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Tree]
  inline def removePosition[Tree /* <: Node[Data] */](tree: Tree, options: typings.unistUtilRemovePosition.libMod.Options): Tree = (^.asInstanceOf[js.Dynamic].applyDynamic("removePosition")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Tree]
  
  type Options = typings.unistUtilRemovePosition.libMod.Options
}
