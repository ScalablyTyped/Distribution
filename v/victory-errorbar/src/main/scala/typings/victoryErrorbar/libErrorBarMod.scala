package typings.victoryErrorbar

import typings.react.mod.ReactElement
import typings.victoryErrorbar.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libErrorBarMod {
  
  @JSImport("victory-errorbar/lib/error-bar", "ErrorBar")
  @js.native
  val ErrorBar: Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonPrimitiveProps * / any */ trait ErrorBarProps extends StObject {
    
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    var datum: js.UndefOr[Any] = js.undefined
    
    var errorX: js.UndefOr[Double | js.Array[Any] | Boolean] = js.undefined
    
    var errorY: js.UndefOr[Double | js.Array[Any] | Boolean] = js.undefined
    
    var groupComponent: js.UndefOr[ReactElement] = js.undefined
    
    var lineComponent: js.UndefOr[ReactElement] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object ErrorBarProps {
    
    inline def apply(): ErrorBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBarProps]
    }
    
    extension [Self <: ErrorBarProps](x: Self) {
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setDatum(value: Any): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      inline def setErrorX(value: Double | js.Array[Any] | Boolean): Self = StObject.set(x, "errorX", value.asInstanceOf[js.Any])
      
      inline def setErrorXUndefined: Self = StObject.set(x, "errorX", js.undefined)
      
      inline def setErrorXVarargs(value: Any*): Self = StObject.set(x, "errorX", js.Array(value*))
      
      inline def setErrorY(value: Double | js.Array[Any] | Boolean): Self = StObject.set(x, "errorY", value.asInstanceOf[js.Any])
      
      inline def setErrorYUndefined: Self = StObject.set(x, "errorY", js.undefined)
      
      inline def setErrorYVarargs(value: Any*): Self = StObject.set(x, "errorY", js.Array(value*))
      
      inline def setGroupComponent(value: ReactElement): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
      
      inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
      
      inline def setLineComponent(value: ReactElement): Self = StObject.set(x, "lineComponent", value.asInstanceOf[js.Any])
      
      inline def setLineComponentUndefined: Self = StObject.set(x, "lineComponent", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ErrorProps extends StObject {
    
    var bottom: js.UndefOr[Error] = js.undefined
    
    var left: js.UndefOr[Error] = js.undefined
    
    var right: js.UndefOr[Error] = js.undefined
    
    var top: js.UndefOr[Error] = js.undefined
  }
  object ErrorProps {
    
    inline def apply(): ErrorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorProps]
    }
    
    extension [Self <: ErrorProps](x: Self) {
      
      inline def setBottom(value: Error): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Error): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Error): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Error): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
