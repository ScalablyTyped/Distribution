package typings.themeUiCore

import typings.emotionSerialize.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait SxProp extends StObject {
    
    /**
      * Theme UI uses Emotion's JSX function. You can pass styles to it directly
      * using `css` prop.
      * @see https://theme-ui.com/sx-prop/#raw-css
      */
    var css: js.UndefOr[
        Interpolation[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUITheme */ Any
        ]
      ] = js.undefined
    
    /**
      * The sx prop lets you style elements inline, using values from your
      * theme.
      *
      * @see https://theme-ui.com/sx-prop/
      */
    var sx: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUIStyleObject */ Any
      ] = js.undefined
  }
  object SxProp {
    
    inline def apply(): SxProp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SxProp]
    }
    
    extension [Self <: SxProp](x: Self) {
      
      inline def setCss(
        value: Interpolation[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUITheme */ Any
            ]
      ): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssNull: Self = StObject.set(x, "css", null)
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setSx(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUIStyleObject */ Any
      ): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    }
  }
}
