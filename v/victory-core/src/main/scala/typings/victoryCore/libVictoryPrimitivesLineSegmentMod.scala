package typings.victoryCore

import typings.react.mod.ReactElement
import typings.victoryCore.anon.ClipPath
import typings.victoryCore.anon.LineComponent
import typings.victoryCore.libVictoryUtilCommonPropsMod.VictoryCommonPrimitiveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryPrimitivesLineSegmentMod {
  
  object LineSegment {
    
    inline def apply(props: LineSegmentProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("victory-core/lib/victory-primitives/line-segment", "LineSegment")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-primitives/line-segment", "LineSegment.defaultProps")
    @js.native
    def defaultProps: LineComponent = js.native
    inline def defaultProps_=(x: LineComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-primitives/line-segment", "LineSegment.propTypes")
    @js.native
    def propTypes: ClipPath = js.native
    inline def propTypes_=(x: ClipPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait LineSegmentProps
    extends StObject
       with VictoryCommonPrimitiveProps {
    
    var datum: js.UndefOr[Any] = js.undefined
    
    var lineComponent: js.UndefOr[ReactElement] = js.undefined
    
    var x1: js.UndefOr[Double] = js.undefined
    
    var x2: js.UndefOr[Double] = js.undefined
    
    var y1: js.UndefOr[Double] = js.undefined
    
    var y2: js.UndefOr[Double] = js.undefined
  }
  object LineSegmentProps {
    
    inline def apply(): LineSegmentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineSegmentProps]
    }
    
    extension [Self <: LineSegmentProps](x: Self) {
      
      inline def setDatum(value: Any): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      inline def setLineComponent(value: ReactElement): Self = StObject.set(x, "lineComponent", value.asInstanceOf[js.Any])
      
      inline def setLineComponentUndefined: Self = StObject.set(x, "lineComponent", js.undefined)
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    }
  }
}
