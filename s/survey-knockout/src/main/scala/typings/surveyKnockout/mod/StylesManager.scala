package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.CSSStyleSheet
import typings.surveyKnockout.anon.Media
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @scala.inline
  def Enabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "StylesManager.Media")
  @js.native
  def Media: StringDictionary[typings.surveyKnockout.anon.Media] = js.native
  @scala.inline
  def Media_=(x: StringDictionary[Media]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Media")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "StylesManager.Styles")
  @js.native
  def Styles: StringDictionary[String] = js.native
  @scala.inline
  def Styles_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Styles")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "StylesManager.ThemeColors")
  @js.native
  def ThemeColors: StringDictionary[StringDictionary[String]] = js.native
  @scala.inline
  def ThemeColors_=(x: StringDictionary[StringDictionary[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThemeColors")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "StylesManager.ThemeCss")
  @js.native
  def ThemeCss: StringDictionary[String] = js.native
  @scala.inline
  def ThemeCss_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThemeCss")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "StylesManager.applyTheme")
  @js.native
  def applyTheme(): Unit = js.native
  @JSImport("survey-knockout", "StylesManager.applyTheme")
  @js.native
  def applyTheme(themeName: js.UndefOr[scala.Nothing], themeSelector: String): Unit = js.native
  @JSImport("survey-knockout", "StylesManager.applyTheme")
  @js.native
  def applyTheme(themeName: String): Unit = js.native
  @JSImport("survey-knockout", "StylesManager.applyTheme")
  @js.native
  def applyTheme(themeName: String, themeSelector: String): Unit = js.native
  
  @JSImport("survey-knockout", "StylesManager.bootstrapThemeCss")
  @js.native
  def bootstrapThemeCss: StringDictionary[String] = js.native
  @scala.inline
  def bootstrapThemeCss_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bootstrapThemeCss")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "StylesManager.bootstrapmaterialThemeCss")
  @js.native
  def bootstrapmaterialThemeCss: StringDictionary[String] = js.native
  @scala.inline
  def bootstrapmaterialThemeCss_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bootstrapmaterialThemeCss")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "StylesManager.createSheet")
  @js.native
  def createSheet(styleSheetId: String): CSSStyleSheet = js.native
  
  @JSImport("survey-knockout", "StylesManager.findSheet")
  @js.native
  def findSheet(styleSheetId: String): js.Any = js.native
  
  @JSImport("survey-knockout", "StylesManager.modernThemeCss")
  @js.native
  def modernThemeCss: StringDictionary[String] = js.native
  @scala.inline
  def modernThemeCss_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modernThemeCss")(x.asInstanceOf[js.Any])
}
