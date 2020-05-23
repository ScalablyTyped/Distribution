package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingsPerObject extends js.Object {
  var bindingsPerObject: Double
  var objects: InUse
}

object BindingsPerObject {
  @scala.inline
  def apply(bindingsPerObject: Double, objects: InUse): BindingsPerObject = {
    val __obj = js.Dynamic.literal(bindingsPerObject = bindingsPerObject.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingsPerObject]
  }
}

