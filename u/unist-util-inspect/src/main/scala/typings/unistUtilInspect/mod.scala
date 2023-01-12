package typings.unistUtilInspect

import typings.unist.mod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-inspect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inspect(tree: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(tree.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def inspect(tree: Any, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def inspectColor(tree: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inspectColor")(tree.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def inspectColor(tree: Any, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspectColor")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def inspectNoColor(node: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inspectNoColor")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def inspectNoColor(node: Any, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspectNoColor")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type InspectOptions = Options
  
  type Node = typings.unist.mod.Node[Data]
  
  trait Options extends StObject {
    
    var showPositions: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setShowPositions(value: Boolean): Self = StObject.set(x, "showPositions", value.asInstanceOf[js.Any])
      
      inline def setShowPositionsUndefined: Self = StObject.set(x, "showPositions", js.undefined)
    }
  }
  
  type Point = typings.unist.mod.Point
  
  type Position = typings.unist.mod.Position
}
