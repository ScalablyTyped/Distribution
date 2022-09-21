package typings.webix.mod

import typings.webix.mod.^
import typings.webix.webix.ui.baseview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdSpace extends StObject {
  
  @JSName("$$")
  var DollarDollar: Any = js.native
  
  def innerId(id: String): Double | String = js.native
  def innerId(id: Double): Double | String = js.native
  
  def ui(view: Any): baseview = js.native
}
object IdSpace {
  
  inline def apply: IdSpace = ^.asInstanceOf[js.Dynamic].selectDynamic("IdSpace").asInstanceOf[IdSpace]
}
