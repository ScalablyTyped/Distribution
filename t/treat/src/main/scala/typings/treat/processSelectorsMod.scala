package typings.treat

import typings.treat.typesMod.Style
import typings.treat.typesMod.ThemeRef
import typings.treat.typesMod.TreatTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processSelectorsMod {
  
  @JSImport("treat/lib/types/processSelectors", "addLocalClassRef")
  @js.native
  def addLocalClassRef(classRef: String): Double = js.native
  
  @JSImport("treat/lib/types/processSelectors", "combinedThemeSelector")
  @js.native
  def combinedThemeSelector(selector: String, themes: js.Array[TreatTheme[_]]): String = js.native
  
  @JSImport("treat/lib/types/processSelectors", "interpolateSelector")
  @js.native
  def interpolateSelector(selector: String): String = js.native
  @JSImport("treat/lib/types/processSelectors", "interpolateSelector")
  @js.native
  def interpolateSelector(selector: String, themeRef: String): String = js.native
  
  @JSImport("treat/lib/types/processSelectors", "isThemedSelector")
  @js.native
  def isThemedSelector(selector: String): Boolean = js.native
  
  @JSImport("treat/lib/types/processSelectors", "processSelectors")
  @js.native
  def processSelectors(hasStyleThemeRefThemes: ProcessSelectorsParams): Unit = js.native
  
  @js.native
  trait ProcessSelectorsParams extends StObject {
    
    var style: Style = js.native
    
    var themeRef: js.UndefOr[ThemeRef] = js.native
    
    var themes: js.Array[
        TreatTheme[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ _
        ]
      ] = js.native
  }
  object ProcessSelectorsParams {
    
    @scala.inline
    def apply(
      style: Style,
      themes: js.Array[
          TreatTheme[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ _
          ]
        ]
    ): ProcessSelectorsParams = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], themes = themes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessSelectorsParams]
    }
    
    @scala.inline
    implicit class ProcessSelectorsParamsMutableBuilder[Self <: ProcessSelectorsParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeRef(value: ThemeRef): Self = StObject.set(x, "themeRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeRefUndefined: Self = StObject.set(x, "themeRef", js.undefined)
      
      @scala.inline
      def setThemes(
        value: js.Array[
              TreatTheme[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ _
              ]
            ]
      ): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemesVarargs(value: TreatTheme[js.Any]*): Self = StObject.set(x, "themes", js.Array(value :_*))
    }
  }
}
