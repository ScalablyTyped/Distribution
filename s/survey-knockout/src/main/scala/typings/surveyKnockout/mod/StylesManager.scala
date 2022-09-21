package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "StylesManager")
@js.native
open class StylesManager () extends StObject {
  
  def initializeStyles(sheet: Any): Unit = js.native
  
  var sheet: Any = js.native
}
/* static members */
object StylesManager {
  
  @JSImport("survey-knockout", "StylesManager")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "StylesManager.Enabled")
  @js.native
  def Enabled: Boolean = js.native
  inline def Enabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "StylesManager.Media")
  @js.native
  def Media: Any = js.native
  inline def Media_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Media")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "StylesManager.Styles")
  @js.native
  def Styles: Any = js.native
  inline def Styles_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Styles")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "StylesManager.SurveyJSStylesSheetId")
  @js.native
  def SurveyJSStylesSheetId: String = js.native
  inline def SurveyJSStylesSheetId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SurveyJSStylesSheetId")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "StylesManager.ThemeColors")
  @js.native
  def ThemeColors: Any = js.native
  inline def ThemeColors_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThemeColors")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "StylesManager.ThemeCss")
  @js.native
  def ThemeCss: Any = js.native
  inline def ThemeCss_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThemeCss")(x.asInstanceOf[js.Any])
  
  inline def applyTheme(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyTheme")().asInstanceOf[Unit]
  inline def applyTheme(themeName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyTheme")(themeName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def applyTheme(themeName: String, themeSelector: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTheme")(themeName.asInstanceOf[js.Any], themeSelector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyTheme(themeName: Unit, themeSelector: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTheme")(themeName.asInstanceOf[js.Any], themeSelector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("survey-knockout", "StylesManager.bootstrapThemeCss")
  @js.native
  def bootstrapThemeCss: Any = js.native
  inline def bootstrapThemeCss_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bootstrapThemeCss")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "StylesManager.bootstrapmaterialThemeCss")
  @js.native
  def bootstrapmaterialThemeCss: Any = js.native
  inline def bootstrapmaterialThemeCss_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bootstrapmaterialThemeCss")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "StylesManager.modernThemeCss")
  @js.native
  def modernThemeCss: Any = js.native
  inline def modernThemeCss_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modernThemeCss")(x.asInstanceOf[js.Any])
}
