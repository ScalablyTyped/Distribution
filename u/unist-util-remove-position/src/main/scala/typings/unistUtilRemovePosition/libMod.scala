package typings.unistUtilRemovePosition

import typings.unist.mod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("unist-util-remove-position/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removePosition[Tree /* <: typings.unist.mod.Node[Data] */](tree: Tree): Tree = ^.asInstanceOf[js.Dynamic].applyDynamic("removePosition")(tree.asInstanceOf[js.Any]).asInstanceOf[Tree]
  inline def removePosition[Tree /* <: typings.unist.mod.Node[Data] */](tree: Tree, options: Boolean): Tree = (^.asInstanceOf[js.Dynamic].applyDynamic("removePosition")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Tree]
  inline def removePosition[Tree /* <: typings.unist.mod.Node[Data] */](tree: Tree, options: Options): Tree = (^.asInstanceOf[js.Dynamic].applyDynamic("removePosition")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Tree]
  
  type Node = typings.unist.mod.Node[Data]
  
  trait Options extends StObject {
    
    /**
      * Whether to use `delete` to remove `position` fields.
      *
      * The default is to set them to `undefined`.
      */
    var force: js.UndefOr[Boolean | Null] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceNull: Self = StObject.set(x, "force", null)
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    }
  }
}
