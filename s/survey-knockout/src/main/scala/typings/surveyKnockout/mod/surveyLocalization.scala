package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object surveyLocalization {
  
  @JSImport("survey-knockout", "surveyLocalization")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "surveyLocalization.currentLocale")
  @js.native
  def currentLocale: String = js.native
  
  @JSImport("survey-knockout", "surveyLocalization.currentLocaleValue")
  @js.native
  def currentLocaleValue: String = js.native
  inline def currentLocaleValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentLocaleValue")(x.asInstanceOf[js.Any])
  
  inline def currentLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentLocale")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "surveyLocalization.defaultLocale")
  @js.native
  def defaultLocale: String = js.native
  
  @JSImport("survey-knockout", "surveyLocalization.defaultLocaleValue")
  @js.native
  def defaultLocaleValue: String = js.native
  inline def defaultLocaleValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocaleValue")(x.asInstanceOf[js.Any])
  
  inline def defaultLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
  
  inline def getCurrentStrings(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentStrings")().asInstanceOf[Any]
  inline def getCurrentStrings(locale: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentStrings")(locale.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getLocaleStrings(loc: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleStrings")(loc.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getLocales(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocales")().asInstanceOf[Any]
  inline def getLocales(removeDefaultLoc: Boolean): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocales")(removeDefaultLoc.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getString(strName: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getString")(strName.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getString(strName: String, locale: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getString")(strName.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("survey-knockout", "surveyLocalization.localeNames")
  @js.native
  def localeNames: Any = js.native
  inline def localeNames_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localeNames")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "surveyLocalization.locales")
  @js.native
  def locales: Any = js.native
  inline def locales_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locales")(x.asInstanceOf[js.Any])
  
  inline def onGetExternalString(name: String, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("onGetExternalString")(name.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("survey-knockout", "surveyLocalization.supportedLocales")
  @js.native
  def supportedLocales: Any = js.native
  inline def supportedLocales_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedLocales")(x.asInstanceOf[js.Any])
}
