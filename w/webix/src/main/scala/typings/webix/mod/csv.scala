package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait csv extends StObject {
  
  var delimiter: DelimiterConfig = js.native
  
  var escape: Boolean = js.native
  
  def parse(text: String): js.Array[Any] = js.native
  def parse(text: String, delimiter: DelimiterConfig): js.Array[Any] = js.native
  
  def stringify(data: js.Array[Any]): String = js.native
  def stringify(data: js.Array[Any], delimiter: DelimiterConfig): String = js.native
}
object csv {
  
  inline def apply: typings.webix.webix.csv = ^.asInstanceOf[js.Dynamic].selectDynamic("csv").asInstanceOf[typings.webix.webix.csv]
}
