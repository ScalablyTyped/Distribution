package typings.treat

import typings.treat.distDeclarationsSrcTypesMod.ClassRef
import typings.treat.distDeclarationsSrcTypesMod.Style
import typings.treat.distDeclarationsSrcTypesMod.ThemeRef
import typings.treat.distDeclarationsSrcTypesMod.TreatTheme
import typings.treat.themeMod.ThemeOrAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcProcessSelectorsMod {
  
  @JSImport("treat/dist/declarations/src/processSelectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addLocalClassRef(classRef: ClassRef): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("addLocalClassRef")(classRef.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def combinedThemeSelector(selector: String, themes: js.Array[TreatTheme[ThemeOrAny]]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("combinedThemeSelector")(selector.asInstanceOf[js.Any], themes.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def interpolateSelector(selector: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolateSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def interpolateSelector(selector: String, themeRef: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateSelector")(selector.asInstanceOf[js.Any], themeRef.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isThemedSelector(selector: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThemedSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def processSelectors(hasStyleThemeRefThemes: ProcessSelectorsParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("processSelectors")(hasStyleThemeRefThemes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ProcessSelectorsParams extends StObject {
    
    var style: Style
    
    var themeRef: js.UndefOr[ThemeRef] = js.undefined
    
    var themes: js.Array[TreatTheme[ThemeOrAny]]
  }
  object ProcessSelectorsParams {
    
    inline def apply(style: Style, themes: js.Array[TreatTheme[ThemeOrAny]]): ProcessSelectorsParams = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], themes = themes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessSelectorsParams]
    }
    
    extension [Self <: ProcessSelectorsParams](x: Self) {
      
      inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setThemeRef(value: ThemeRef): Self = StObject.set(x, "themeRef", value.asInstanceOf[js.Any])
      
      inline def setThemeRefUndefined: Self = StObject.set(x, "themeRef", js.undefined)
      
      inline def setThemes(value: js.Array[TreatTheme[ThemeOrAny]]): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
      
      inline def setThemesVarargs(value: TreatTheme[ThemeOrAny]*): Self = StObject.set(x, "themes", js.Array(value*))
    }
  }
}
