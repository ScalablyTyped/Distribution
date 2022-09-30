package typings.victoryLine

import typings.react.mod.FC
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object curveMod {
  
  @JSImport("victory-line/lib/curve", "Curve")
  @js.native
  val Curve: FC[CurveProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonPrimitiveProps * / any */ trait CurveProps extends StObject {
    
    var ariaLabel: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrCallback */ Any
      ] = js.undefined
    
    var interpolation: js.UndefOr[String | js.Function] = js.undefined
    
    var openCurve: js.UndefOr[Boolean] = js.undefined
    
    var pathComponent: js.UndefOr[ReactElement] = js.undefined
    
    var tabIndex: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ] = js.undefined
  }
  object CurveProps {
    
    inline def apply(): CurveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CurveProps]
    }
    
    extension [Self <: CurveProps](x: Self) {
      
      inline def setAriaLabel(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrCallback */ Any
      ): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setInterpolation(value: String | js.Function): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
      
      inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
      
      inline def setOpenCurve(value: Boolean): Self = StObject.set(x, "openCurve", value.asInstanceOf[js.Any])
      
      inline def setOpenCurveUndefined: Self = StObject.set(x, "openCurve", js.undefined)
      
      inline def setPathComponent(value: ReactElement): Self = StObject.set(x, "pathComponent", value.asInstanceOf[js.Any])
      
      inline def setPathComponentUndefined: Self = StObject.set(x, "pathComponent", js.undefined)
      
      inline def setTabIndex(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
}
