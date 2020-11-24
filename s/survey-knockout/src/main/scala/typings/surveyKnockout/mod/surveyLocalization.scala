package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "surveyLocalization")
@js.native
object surveyLocalization extends js.Object {
  
  var currentLocale: String = js.native
  
  var currentLocaleValue: String = js.native
  
  var defaultLocale: String = js.native
  
  var defaultLocaleValue: String = js.native
  
  def getCurrentStrings(): js.Any = js.native
  
  def getLocaleStrings(loc: String): js.Any = js.native
  
  def getLocales(): js.Array[String] = js.native
  
  def getString(strName: String): js.Any = js.native
  
  var localeNames: StringDictionary[js.Any] = js.native
  
  var locales: StringDictionary[js.Any] = js.native
  
  var supportedLocales: js.Array[_] = js.native
}
