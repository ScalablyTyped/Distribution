package typings.victoryArea

import typings.react.mod.FC
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object areaMod {
  
  @JSImport("victory-area/lib/area", "Area")
  @js.native
  val Area: FC[AreaProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonPrimitiveProps * / any */ trait AreaProps extends StObject {
    
    var groupComponent: js.UndefOr[ReactElement] = js.undefined
    
    var horizontal: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonThemeProps * / any['horizontal'] */ js.Any
      ] = js.undefined
    
    var interpolation: js.UndefOr[String | js.Function] = js.undefined
    
    var pathComponent: js.UndefOr[ReactElement] = js.undefined
  }
  object AreaProps {
    
    inline def apply(): AreaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AreaProps]
    }
    
    extension [Self <: AreaProps](x: Self) {
      
      inline def setGroupComponent(value: ReactElement): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
      
      inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
      
      inline def setHorizontal(
        value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonThemeProps * / any['horizontal'] */ js.Any
      ): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setInterpolation(value: String | js.Function): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
      
      inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
      
      inline def setPathComponent(value: ReactElement): Self = StObject.set(x, "pathComponent", value.asInstanceOf[js.Any])
      
      inline def setPathComponentUndefined: Self = StObject.set(x, "pathComponent", js.undefined)
    }
  }
}
