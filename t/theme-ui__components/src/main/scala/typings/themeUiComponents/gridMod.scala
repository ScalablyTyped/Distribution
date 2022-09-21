package typings.themeUiComponents

import typings.std.HTMLDivElement
import typings.themeUiComponents.themeUiComponentsStrings.fill
import typings.themeUiComponents.themeUiComponentsStrings.fit
import typings.themeUiComponents.typesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Grid", "Grid")
  @js.native
  val Grid: ForwardRef[HTMLDivElement, GridProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof @theme-ui/components.@theme-ui/components/dist/declarations/src/types.Assign<react.react.ComponentPropsWithRef<'div'>, @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps>, 'ref'> ]: @theme-ui/components.@theme-ui/components/dist/declarations/src/types.Assign<react.react.ComponentPropsWithRef<'div'>, @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps>[P]} */ trait GridProps extends StObject {
    
    /**
      * 	Number of columns to use for the layout (cannot be used in conjunction with the width prop)
      */
    var columns: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponsiveStyleValue<string | number> */ Any
      ] = js.undefined
    
    /**
      * Space between child elements
      */
    var gap: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponsiveStyleValue<string | number> */ Any
      ] = js.undefined
    
    /**
      * Auto-repeat track behaviour (default is fit)
      */
    var repeat: js.UndefOr[fit | fill] = js.undefined
    
    /**
      * Minimum width of child elements
      */
    var width: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponsiveStyleValue<string | number> */ Any
      ] = js.undefined
  }
  object GridProps {
    
    inline def apply(): GridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridProps]
    }
    
    extension [Self <: GridProps](x: Self) {
      
      inline def setColumns(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponsiveStyleValue<string | number> */ Any
      ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setGap(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponsiveStyleValue<string | number> */ Any
      ): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setRepeat(value: fit | fill): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      inline def setWidth(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponsiveStyleValue<string | number> */ Any
      ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
