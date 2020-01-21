package typings.tsutils

import typings.typescript.mod.ExternalModuleReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonModuleReference extends js.Object {
  var moduleReference: ExternalModuleReference
}

object AnonModuleReference {
  @scala.inline
  def apply(moduleReference: ExternalModuleReference): AnonModuleReference = {
    val __obj = js.Dynamic.literal(moduleReference = moduleReference.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonModuleReference]
  }
}

