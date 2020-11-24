package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import typings.webix.webix.ui.baseview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait markup extends js.Object {
  
  var attribute: js.Any = js.native
  
  var dataTag: js.Any = js.native
  
  def init(node: String, target: String): baseview = js.native
  
  var namespace: js.Any = js.native
  
  def parse(data: js.Any, datatype: String): Unit = js.native
}
@JSImport("webix", "markup")
@js.native
object markup
  extends TopLevel[typings.webix.webix.markup]
