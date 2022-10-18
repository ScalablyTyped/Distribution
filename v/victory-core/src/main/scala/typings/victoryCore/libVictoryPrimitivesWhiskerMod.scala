package typings.victoryCore

import typings.react.mod.ReactElement
import typings.victoryCore.anon.DisableInlineStyles
import typings.victoryCore.anon.Role
import typings.victoryCore.libVictoryUtilCommonPropsMod.VictoryCommonPrimitiveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryPrimitivesWhiskerMod {
  
  object Whisker {
    
    inline def apply(props: WhiskerProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("victory-core/lib/victory-primitives/whisker", "Whisker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-primitives/whisker", "Whisker.defaultProps")
    @js.native
    def defaultProps: Role = js.native
    inline def defaultProps_=(x: Role): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-primitives/whisker", "Whisker.propTypes")
    @js.native
    def propTypes: DisableInlineStyles = js.native
    inline def propTypes_=(x: DisableInlineStyles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait WhiskerAxes extends StObject {
    
    var x1: js.UndefOr[Double] = js.undefined
    
    var x2: js.UndefOr[Double] = js.undefined
    
    var y1: js.UndefOr[Double] = js.undefined
    
    var y2: js.UndefOr[Double] = js.undefined
  }
  object WhiskerAxes {
    
    inline def apply(): WhiskerAxes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WhiskerAxes]
    }
    
    extension [Self <: WhiskerAxes](x: Self) {
      
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
  
  trait WhiskerProps
    extends StObject
       with VictoryCommonPrimitiveProps {
    
    var groupComponent: js.UndefOr[ReactElement] = js.undefined
    
    var lineComponent: js.UndefOr[ReactElement] = js.undefined
    
    var majorWhisker: js.UndefOr[WhiskerAxes] = js.undefined
    
    var minorWhisker: js.UndefOr[WhiskerAxes] = js.undefined
  }
  object WhiskerProps {
    
    inline def apply(): WhiskerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WhiskerProps]
    }
    
    extension [Self <: WhiskerProps](x: Self) {
      
      inline def setGroupComponent(value: ReactElement): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
      
      inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
      
      inline def setLineComponent(value: ReactElement): Self = StObject.set(x, "lineComponent", value.asInstanceOf[js.Any])
      
      inline def setLineComponentUndefined: Self = StObject.set(x, "lineComponent", js.undefined)
      
      inline def setMajorWhisker(value: WhiskerAxes): Self = StObject.set(x, "majorWhisker", value.asInstanceOf[js.Any])
      
      inline def setMajorWhiskerUndefined: Self = StObject.set(x, "majorWhisker", js.undefined)
      
      inline def setMinorWhisker(value: WhiskerAxes): Self = StObject.set(x, "minorWhisker", value.asInstanceOf[js.Any])
      
      inline def setMinorWhiskerUndefined: Self = StObject.set(x, "minorWhisker", js.undefined)
    }
  }
}
