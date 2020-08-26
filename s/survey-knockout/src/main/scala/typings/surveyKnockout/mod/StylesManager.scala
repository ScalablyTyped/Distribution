package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.CSSStyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "StylesManager")
@js.native
class StylesManager () extends js.Object {
  def initializeStyles(sheet: CSSStyleSheet): Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "StylesManager")
@js.native
object StylesManager extends js.Object {
  var Enabled: Boolean = js.native
  var Media: StringDictionary[typings.surveyKnockout.anon.Media] = js.native
  var Styles: StringDictionary[String] = js.native
  var ThemeColors: StringDictionary[StringDictionary[String]] = js.native
  var ThemeCss: StringDictionary[String] = js.native
  var bootstrapThemeCss: StringDictionary[String] = js.native
  var bootstrapmaterialThemeCss: StringDictionary[String] = js.native
  var modernThemeCss: StringDictionary[String] = js.native
  def applyTheme(): Unit = js.native
  def applyTheme(themeName: js.UndefOr[scala.Nothing], themeSelector: String): Unit = js.native
  def applyTheme(themeName: String): Unit = js.native
  def applyTheme(themeName: String, themeSelector: String): Unit = js.native
  def createSheet(styleSheetId: String): CSSStyleSheet = js.native
  def findSheet(styleSheetId: String): CSSStyleSheet = js.native
}

