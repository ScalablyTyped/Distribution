package typings.unistUtilPositionFromEstree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-position-from-estree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def positionFromEstree(): Position = ^.asInstanceOf[js.Dynamic].applyDynamic("positionFromEstree")().asInstanceOf[Position]
  inline def positionFromEstree(value: NodeLike): Position = ^.asInstanceOf[js.Dynamic].applyDynamic("positionFromEstree")(value.asInstanceOf[js.Any]).asInstanceOf[Position]
  
  trait LocLike extends StObject {
    
    var end: js.UndefOr[PointLike | Null] = js.undefined
    
    var start: js.UndefOr[PointLike | Null] = js.undefined
  }
  object LocLike {
    
    inline def apply(): LocLike = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocLike] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: PointLike): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndNull: Self = StObject.set(x, "end", null)
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: PointLike): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartNull: Self = StObject.set(x, "start", null)
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait NodeLike extends StObject {
    
    var end: js.UndefOr[Double | Null] = js.undefined
    
    var loc: js.UndefOr[LocLike | Null] = js.undefined
    
    var range: js.UndefOr[RangeLike | Null] = js.undefined
    
    var start: js.UndefOr[Double | Null] = js.undefined
  }
  object NodeLike {
    
    inline def apply(): NodeLike = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeLike] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndNull: Self = StObject.set(x, "end", null)
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setLoc(value: LocLike): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocNull: Self = StObject.set(x, "loc", null)
      
      inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      inline def setRange(value: RangeLike): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeNull: Self = StObject.set(x, "range", null)
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartNull: Self = StObject.set(x, "start", null)
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait PointLike extends StObject {
    
    var column: js.UndefOr[Double | Null] = js.undefined
    
    var line: js.UndefOr[Double | Null] = js.undefined
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
    }
  }
  
  type Position = typings.unist.mod.Position
  
  type RangeLike = js.Tuple2[Double, Double]
}
