package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait csv extends StObject {
  
  var delimiter: js.Any = js.native
  
  var escape: Boolean = js.native
  
  def parse(text: String): js.Array[js.Any] = js.native
  def parse(text: String, delimiter: js.Any): js.Array[js.Any] = js.native
  
  def stringify(data: js.Array[js.Any]): String = js.native
  def stringify(data: js.Array[js.Any], delimiter: js.Any): String = js.native
}
object csv {
  
  inline def apply: typings.webix.webix.csv = ^.asInstanceOf[js.Dynamic].selectDynamic("csv").asInstanceOf[typings.webix.webix.csv]
}
