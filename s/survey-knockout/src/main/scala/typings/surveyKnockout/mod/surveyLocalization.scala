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
  
  inline def getCurrentStrings(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentStrings")().asInstanceOf[js.Any]
  
  inline def getLocaleStrings(loc: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleStrings")(loc.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def getLocales(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocales")().asInstanceOf[js.Array[String]]
  
  inline def getString(strName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getString")(strName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("survey-knockout", "surveyLocalization.supportedLocales")
  @js.native
  def supportedLocales: js.Array[js.Any] = js.native
  inline def supportedLocales_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedLocales")(x.asInstanceOf[js.Any])
}
