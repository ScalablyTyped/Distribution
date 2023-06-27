package typings.unistUtilPosition

import typings.unist.mod.Data
import typings.unist.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("unist-util-position/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pointEnd(): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("pointEnd")().asInstanceOf[Point]
  inline def pointEnd(node: Node): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("pointEnd")(node.asInstanceOf[js.Any]).asInstanceOf[Point]
  inline def pointEnd(node: NodeLike): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("pointEnd")(node.asInstanceOf[js.Any]).asInstanceOf[Point]
  
  inline def pointStart(): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("pointStart")().asInstanceOf[Point]
  inline def pointStart(node: Node): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("pointStart")(node.asInstanceOf[js.Any]).asInstanceOf[Point]
  inline def pointStart(node: NodeLike): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("pointStart")(node.asInstanceOf[js.Any]).asInstanceOf[Point]
  
  inline def position(): Position_ = ^.asInstanceOf[js.Dynamic].applyDynamic("position")().asInstanceOf[Position_]
  inline def position(node: Node): Position_ = ^.asInstanceOf[js.Dynamic].applyDynamic("position")(node.asInstanceOf[js.Any]).asInstanceOf[Position_]
  inline def position(node: NodeLike): Position_ = ^.asInstanceOf[js.Dynamic].applyDynamic("position")(node.asInstanceOf[js.Any]).asInstanceOf[Position_]
  
  type Node = typings.unist.mod.Node[Data]
  
  trait NodeLike extends StObject {
    
    var position: js.UndefOr[PositionLike | Null] = js.undefined
    
    var `type`: String
  }
  object NodeLike {
    
    inline def apply(`type`: String): NodeLike = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeLike] (val x: Self) extends AnyVal {
      
      inline def setPosition(value: PositionLike): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionNull: Self = StObject.set(x, "position", null)
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Point = typings.unist.mod.Point
  
  trait PointLike extends StObject {
    
    var column: js.UndefOr[Double | Null] = js.undefined
    
    var line: js.UndefOr[Double | Null] = js.undefined
    
    var offset: js.UndefOr[Double | Null] = js.undefined
  }
  object PointLike {
    
    inline def apply(): PointLike = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointLike] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnNull: Self = StObject.set(x, "column", null)
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineNull: Self = StObject.set(x, "line", null)
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetNull: Self = StObject.set(x, "offset", null)
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  trait PositionLike extends StObject {
    
    var end: js.UndefOr[PointLike | Null] = js.undefined
    
    var start: js.UndefOr[PointLike | Null] = js.undefined
  }
  object PositionLike {
    
    inline def apply(): PositionLike = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PositionLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PositionLike] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: PointLike): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndNull: Self = StObject.set(x, "end", null)
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: PointLike): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartNull: Self = StObject.set(x, "start", null)
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  type Position_ = Position
}
