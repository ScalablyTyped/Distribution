package typings.webix.webixMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateCollection extends js.Object {
  def clearValidation(): Unit = js.native
  def validate(): Boolean = js.native
  def validate(id: String): Boolean = js.native
}

@JSImport("webix", "ValidateCollection")
@js.native
object ValidateCollection extends TopLevel[ValidateCollection]

