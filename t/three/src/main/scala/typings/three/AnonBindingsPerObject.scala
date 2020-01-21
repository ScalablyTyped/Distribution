package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBindingsPerObject extends js.Object {
  var bindingsPerObject: Double
  var objects: AnonInUse
}

object AnonBindingsPerObject {
  @scala.inline
  def apply(bindingsPerObject: Double, objects: AnonInUse): AnonBindingsPerObject = {
    val __obj = js.Dynamic.literal(bindingsPerObject = bindingsPerObject.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBindingsPerObject]
  }
}

