package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "StylesManager")
@js.native
class StylesManager () extends js.Object {
  def initializeStyles(sheet: stdLib.CSSStyleSheet): scala.Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "StylesManager")
@js.native
object StylesManager extends js.Object {
  var Media: org.scalablytyped.runtime.StringDictionary[surveyDashKnockoutLib.Anon_Media] = js.native
  var Styles: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var ThemeColors: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.native
  var ThemeCss: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var bootstrapThemeCss: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var bootstrapmaterialThemeCss: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def applyTheme(): scala.Unit = js.native
  def applyTheme(themeName: java.lang.String): scala.Unit = js.native
  def applyTheme(themeName: java.lang.String, themeSelector: java.lang.String): scala.Unit = js.native
  def createSheet(styleSheetId: java.lang.String): stdLib.CSSStyleSheet = js.native
  def findSheet(styleSheetId: java.lang.String): stdLib.CSSStyleSheet = js.native
}

