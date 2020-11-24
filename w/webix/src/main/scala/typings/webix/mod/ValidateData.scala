package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateData extends js.Object {
  
  def clearValidation(): Unit = js.native
  
  def validate(): Boolean = js.native
  def validate(mode: js.Any): Boolean = js.native
}
@JSImport("webix", "ValidateData")
@js.native
object ValidateData extends TopLevel[ValidateData]
