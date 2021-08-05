package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.CSSStyleSheet
import typings.surveyKnockout.anon.Media
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "StylesManager")
@js.native
class StylesManager () extends StObject {
  
  def initializeStyles(sheet: CSSStyleSheet): Unit = js.native
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
  def Media: StringDictionary[typings.surveyKnockout.anon.Media] = js.native
  inline def Media_=(x: StringDictionary[Media]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Media")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "StylesManager.Styles")
  @js.native
  def Styles: StringDictionary[String] = js.native
  inline def Styles_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Styles")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "StylesManager.ThemeColors")
  @js.native
  def ThemeColors: StringDictionary[StringDictionary[String]] = js.native
  inline def ThemeColors_=(x: StringDictionary[StringDictionary[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThemeColors")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "StylesManager.ThemeCss")
  @js.native
  def ThemeCss: StringDictionary[String] = js.native
  inline def ThemeCss_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThemeCss")(x.asInstanceOf[js.Any])
  
  inline def applyTheme(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyTheme")().asInstanceOf[Unit]
  inline def applyTheme(themeName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyTheme")(themeName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def applyTheme(themeName: String, themeSelector: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTheme")(themeName.asInstanceOf[js.Any], themeSelector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyTheme(themeName: Unit, themeSelector: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTheme")(themeName.asInstanceOf[js.Any], themeSelector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("survey-knockout", "StylesManager.bootstrapThemeCss")
  @js.native
  def bootstrapThemeCss: StringDictionary[String] = js.native
  inline def bootstrapThemeCss_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bootstrapThemeCss")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "StylesManager.bootstrapmaterialThemeCss")
  @js.native
  def bootstrapmaterialThemeCss: StringDictionary[String] = js.native
  inline def bootstrapmaterialThemeCss_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bootstrapmaterialThemeCss")(x.asInstanceOf[js.Any])
  
  inline def createSheet(styleSheetId: String): CSSStyleSheet = ^.asInstanceOf[js.Dynamic].applyDynamic("createSheet")(styleSheetId.asInstanceOf[js.Any]).asInstanceOf[CSSStyleSheet]
  
  inline def findSheet(styleSheetId: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findSheet")(styleSheetId.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("survey-knockout", "StylesManager.modernThemeCss")
  @js.native
  def modernThemeCss: StringDictionary[String] = js.native
  inline def modernThemeCss_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modernThemeCss")(x.asInstanceOf[js.Any])
}
