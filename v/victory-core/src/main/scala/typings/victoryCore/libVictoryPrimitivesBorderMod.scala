package typings.victoryCore

import typings.react.mod.ReactElement
import typings.victoryCore.anon.ClipPath
import typings.victoryCore.anon.Role
import typings.victoryCore.libVictoryUtilCommonPropsMod.VictoryCommonPrimitiveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryPrimitivesBorderMod {
  
  object Border {
    
    inline def apply(props: BorderProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("victory-core/lib/victory-primitives/border", "Border")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-primitives/border", "Border.defaultProps")
    @js.native
    def defaultProps: Role = js.native
    inline def defaultProps_=(x: Role): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-primitives/border", "Border.propTypes")
    @js.native
    def propTypes: ClipPath = js.native
    inline def propTypes_=(x: ClipPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait BorderProps
    extends StObject
       with VictoryCommonPrimitiveProps {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var rectComponent: js.UndefOr[ReactElement] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object BorderProps {
    
    inline def apply(): BorderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BorderProps]
    }
    
    extension [Self <: BorderProps](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setRectComponent(value: ReactElement): Self = StObject.set(x, "rectComponent", value.asInstanceOf[js.Any])
      
      inline def setRectComponentUndefined: Self = StObject.set(x, "rectComponent", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
