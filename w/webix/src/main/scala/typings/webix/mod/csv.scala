package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait csv extends js.Object {
  
  var delimiter: js.Any = js.native
  
  var escape: Boolean = js.native
  
  def parse(text: String): js.Array[_] = js.native
  def parse(text: String, delimiter: js.Any): js.Array[_] = js.native
  
  def stringify(data: js.Array[_]): String = js.native
  def stringify(data: js.Array[_], delimiter: js.Any): String = js.native
}
@JSImport("webix", "csv")
@js.native
object csv
  extends TopLevel[typings.webix.webix.csv]
