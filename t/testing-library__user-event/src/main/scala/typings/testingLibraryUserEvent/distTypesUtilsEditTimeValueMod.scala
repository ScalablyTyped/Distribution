package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.anon.HTMLInputElementtypedatet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsEditTimeValueMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/edit/timeValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildTimeValue(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildTimeValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isValidDateOrTimeValue(element: HTMLInputElementtypedatet, value: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidDateOrTimeValue")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
