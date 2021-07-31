package typings.tuyaPanelKit.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "I18N")
@js.native
class I18N protected () extends StObject {
  def this(args: js.Any*) = this()
  
  def getDpLang(code: String): String = js.native
  def getDpLang(code: String, value: String): String = js.native
  def getDpLang(code: String, value: Boolean): String = js.native
  
  def getFaultStrings(faultCode: String, faultValue: String, onlyPrior: Boolean): String = js.native
  
  def getLang(key: String): String = js.native
  def getLang(key: String, defaultString: String): String = js.native
  
  def getRangeStrings(dpCode: String): Record[String, String] = js.native
}
