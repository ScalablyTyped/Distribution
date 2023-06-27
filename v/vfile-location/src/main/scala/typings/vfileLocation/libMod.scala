package typings.vfileLocation

import typings.unist.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("vfile-location/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def location(file: VFile): Location_ = ^.asInstanceOf[js.Dynamic].applyDynamic("location")(file.asInstanceOf[js.Any]).asInstanceOf[Location_]
  inline def location(file: Value): Location_ = ^.asInstanceOf[js.Dynamic].applyDynamic("location")(file.asInstanceOf[js.Any]).asInstanceOf[Location_]
  
  trait Location_ extends StObject {
    
    /**
      *   Get the `offset` from a line/column based `Point` in the bound indices.
      */
    def toOffset(): js.UndefOr[Double]
    def toOffset(point: PointLike): js.UndefOr[Double]
    /**
      *   Get the `offset` from a line/column based `Point` in the bound indices.
      */
    @JSName("toOffset")
    var toOffset_Original: ToOffset
    
    /**
      *   Get the line/column based `Point` for `offset` in the bound indices.
      */
    def toPoint(): js.UndefOr[UnistPoint]
    def toPoint(offset: Double): js.UndefOr[UnistPoint]
    /**
      *   Get the line/column based `Point` for `offset` in the bound indices.
      */
    @JSName("toPoint")
    var toPoint_Original: ToPoint
  }
  object Location_ {
    
    inline def apply(
      toOffset: /* point */ js.UndefOr[PointLike | Null] => js.UndefOr[Double],
      toPoint: /* offset */ js.UndefOr[Double | Null] => js.UndefOr[UnistPoint]
    ): Location_ = {
      val __obj = js.Dynamic.literal(toOffset = js.Any.fromFunction1(toOffset), toPoint = js.Any.fromFunction1(toPoint))
      __obj.asInstanceOf[Location_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Location_] (val x: Self) extends AnyVal {
      
      inline def setToOffset(value: /* point */ js.UndefOr[PointLike | Null] => js.UndefOr[Double]): Self = StObject.set(x, "toOffset", js.Any.fromFunction1(value))
      
      inline def setToPoint(value: /* offset */ js.UndefOr[Double | Null] => js.UndefOr[UnistPoint]): Self = StObject.set(x, "toPoint", js.Any.fromFunction1(value))
    }
  }
  
  trait PointLike extends StObject {
    
    /**
      * Column.
      */
    var column: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Line.
      */
    var line: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Offset.
      */
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
  
  type ToOffset = js.Function1[/* point */ js.UndefOr[PointLike | Null], js.UndefOr[Double]]
  
  type ToPoint = js.Function1[/* offset */ js.UndefOr[Double | Null], js.UndefOr[UnistPoint]]
  
  type UnistPoint = Point
  
  type VFile = typings.vfile.mod.VFile
  
  type Value = typings.vfile.mod.Value
}
