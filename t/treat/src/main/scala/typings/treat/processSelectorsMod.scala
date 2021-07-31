package typings.treat

import typings.treat.typesMod.Style
import typings.treat.typesMod.ThemeRef
import typings.treat.typesMod.TreatTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processSelectorsMod {
  
  @JSImport("treat/lib/types/processSelectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addLocalClassRef(classRef: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("addLocalClassRef")(classRef.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def combinedThemeSelector(selector: String, themes: js.Array[TreatTheme[js.Any]]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("combinedThemeSelector")(selector.asInstanceOf[js.Any], themes.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def interpolateSelector(selector: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolateSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def interpolateSelector(selector: String, themeRef: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateSelector")(selector.asInstanceOf[js.Any], themeRef.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def isThemedSelector(selector: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThemedSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def processSelectors(hasStyleThemeRefThemes: ProcessSelectorsParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("processSelectors")(hasStyleThemeRefThemes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ProcessSelectorsParams extends StObject {
    
    var style: Style
    
    var themeRef: js.UndefOr[ThemeRef] = js.undefined
    
    var themes: js.Array[
        TreatTheme[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
        ]
      ]
  }
  object ProcessSelectorsParams {
    
    @scala.inline
    def apply(
      style: Style,
      themes: js.Array[
          TreatTheme[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
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
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemesVarargs(
        value: (TreatTheme[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
            ])*
      ): Self = StObject.set(x, "themes", js.Array(value :_*))
    }
  }
}
