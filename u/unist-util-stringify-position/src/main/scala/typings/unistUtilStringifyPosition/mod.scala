package typings.unistUtilStringifyPosition

import typings.unist.mod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-stringify-position", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringifyPosition(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyPosition")().asInstanceOf[String]
  inline def stringifyPosition(value: typings.unist.mod.Node[Data]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyPosition")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringifyPosition(value: typings.unist.mod.Point): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyPosition")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringifyPosition(value: typings.unist.mod.Position): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyPosition")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringifyPosition(value: NodeLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyPosition")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type Node = typings.unist.mod.Node[Data]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped object */ trait NodeLike extends StObject {
    
    var position: js.UndefOr[Position] = js.undefined
    
    var `type`: String
  }
  object NodeLike {
    
    inline def apply(`type`: String): NodeLike = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeLike]
    }
    
    extension [Self <: NodeLike](x: Self) {
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Point = typings.unist.mod.Point
  
  type Position = typings.unist.mod.Position
}
