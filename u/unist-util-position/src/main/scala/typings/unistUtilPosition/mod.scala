package typings.unistUtilPosition

import typings.std.Record
import typings.unist.mod.Data
import typings.unistUtilPosition.anon.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-position", JSImport.Namespace)
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
  
  type NodeLike = (Record[String, Any]) & Position
  
  type Point = typings.unist.mod.Point
  
  /* Inlined std.Partial<unist-util-position.unist-util-position.Point> */
  trait PointLike extends StObject {
    
    var column: js.UndefOr[Double] = js.undefined
    
    var line: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
  }
  object PointLike {
    
    inline def apply(): PointLike = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointLike] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  trait PositionLike extends StObject {
    
    var end: js.UndefOr[PointLike] = js.undefined
    
    var start: js.UndefOr[PointLike] = js.undefined
  }
  object PositionLike {
    
    inline def apply(): PositionLike = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PositionLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PositionLike] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: PointLike): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: PointLike): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  type Position_ = typings.unist.mod.Position
}
