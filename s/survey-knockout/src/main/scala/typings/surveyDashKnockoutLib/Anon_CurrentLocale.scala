package typings
package surveyDashKnockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentLocale extends js.Object {
  var currentLocale: java.lang.String
  var currentLocaleValue: java.lang.String
  var defaultLocale: java.lang.String
  var defaultLocaleValue: java.lang.String
  var localeNames: org.scalablytyped.runtime.StringDictionary[js.Any]
  var locales: org.scalablytyped.runtime.StringDictionary[js.Any]
  var supportedLocales: js.Array[_]
  def getLocales(): js.Array[java.lang.String]
  def getString(strName: java.lang.String): js.Any
}

object Anon_CurrentLocale {
  @scala.inline
  def apply(
    currentLocale: java.lang.String,
    currentLocaleValue: java.lang.String,
    defaultLocale: java.lang.String,
    defaultLocaleValue: java.lang.String,
    getLocales: js.Function0[js.Array[java.lang.String]],
    getString: js.Function1[java.lang.String, js.Any],
    localeNames: org.scalablytyped.runtime.StringDictionary[js.Any],
    locales: org.scalablytyped.runtime.StringDictionary[js.Any],
    supportedLocales: js.Array[_]
  ): Anon_CurrentLocale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentLocale")(currentLocale)
    __obj.updateDynamic("currentLocaleValue")(currentLocaleValue)
    __obj.updateDynamic("defaultLocale")(defaultLocale)
    __obj.updateDynamic("defaultLocaleValue")(defaultLocaleValue)
    __obj.updateDynamic("getLocales")(getLocales)
    __obj.updateDynamic("getString")(getString)
    __obj.updateDynamic("localeNames")(localeNames)
    __obj.updateDynamic("locales")(locales)
    __obj.updateDynamic("supportedLocales")(supportedLocales)
    __obj.asInstanceOf[Anon_CurrentLocale]
  }
}

