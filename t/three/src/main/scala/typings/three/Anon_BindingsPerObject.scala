package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BindingsPerObject extends js.Object {
  var bindingsPerObject: Double
  var objects: Anon_InUse
}

object Anon_BindingsPerObject {
  @scala.inline
  def apply(bindingsPerObject: Double, objects: Anon_InUse): Anon_BindingsPerObject = {
    val __obj = js.Dynamic.literal(bindingsPerObject = bindingsPerObject, objects = objects)
  
    __obj.asInstanceOf[Anon_BindingsPerObject]
  }
}

