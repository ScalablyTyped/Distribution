package typings.webix.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  
  var config: StringDictionary[js.Any] = js.native
  
  def define(property: String, value: js.Any): Unit = js.native
  
  var name: String = js.native
}
@JSImport("webix", "Settings")
@js.native
object Settings extends TopLevel[Settings]
