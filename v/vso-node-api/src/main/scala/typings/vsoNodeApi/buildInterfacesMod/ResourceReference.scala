package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceReference extends js.Object {
  /**
    * An alias to be used when referencing the resource.
    */
  var alias: String = js.native
}

object ResourceReference {
  @scala.inline
  def apply(alias: String): ResourceReference = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceReference]
  }
  @scala.inline
  implicit class ResourceReferenceOps[Self <: ResourceReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
  }
  
}

