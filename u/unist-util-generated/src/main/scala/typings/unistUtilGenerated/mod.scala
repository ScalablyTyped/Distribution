package typings.unistUtilGenerated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-generated", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generated(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("generated")().asInstanceOf[Boolean]
  inline def generated(node: NodeLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("generated")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait NodeLike extends StObject {
    
    var position: js.UndefOr[PositionLike] = js.undefined
  }
  object NodeLike {
    
    inline def apply(): NodeLike = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeLike] (val x: Self) extends AnyVal {
      
      inline def setPosition(value: PositionLike): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
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
}
