package typings.wixDesignSystemsLocaleUtils

import typings.wixDesignSystemsLocaleUtils.distTypesConstantsMod.SupportedWixLocales_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDateTimeFormatGetYearGetYearMod {
  
  @JSImport("wix-design-systems-locale-utils/dist/types/dateTimeFormat/getYear/getYear", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getYear(locale: SupportedWixLocales_, date: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getYear")(locale.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
}
