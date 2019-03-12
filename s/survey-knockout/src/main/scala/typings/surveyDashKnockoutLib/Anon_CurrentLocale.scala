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
    getLocales: () => js.Array[java.lang.String],
    getString: java.lang.String => js.Any,
    localeNames: org.scalablytyped.runtime.StringDictionary[js.Any],
    locales: org.scalablytyped.runtime.StringDictionary[js.Any],
    supportedLocales: js.Array[_]
  ): Anon_CurrentLocale = {
    val __obj = js.Dynamic.literal(currentLocale = currentLocale, currentLocaleValue = currentLocaleValue, defaultLocale = defaultLocale, defaultLocaleValue = defaultLocaleValue, getLocales = js.Any.fromFunction0(getLocales), getString = js.Any.fromFunction1(getString), localeNames = localeNames, locales = locales, supportedLocales = supportedLocales)
  
    __obj.asInstanceOf[Anon_CurrentLocale]
  }
}

