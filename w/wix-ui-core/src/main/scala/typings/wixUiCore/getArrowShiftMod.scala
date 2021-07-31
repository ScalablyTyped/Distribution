package typings.wixUiCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getArrowShiftMod {
  
  @JSImport("wix-ui-core/dist/src/components/popover/utils/getArrowShift", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getArrowShift(shift: Double, direction: String): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrowShift")(shift.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
}
