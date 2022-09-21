package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "I18N")
@js.native
open class I18N[LanMap /* <: I18NLanMap */, Lan /* <: /* import warning: importer.ImportType#apply Failed type conversion: LanMap[keyof LanMap] */ js.Any */] ()
  extends StObject
     with I18NCore[LanMap, Lan] {
  
  def getFaultStrings(faultCode: String, faultValue: String): String = js.native
  def getFaultStrings(faultCode: String, faultValue: String, onlyPrior: Boolean): String = js.native
}
