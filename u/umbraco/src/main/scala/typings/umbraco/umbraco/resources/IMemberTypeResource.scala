package typings.umbraco.umbraco.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.memberTypeResource
  * @description Loads in data for member types
  **/
@js.native
trait IMemberTypeResource extends js.Object {
  //return all member types
  def getTypes(): js.Any = js.native
}

object IMemberTypeResource {
  @scala.inline
  def apply(getTypes: () => js.Any): IMemberTypeResource = {
    val __obj = js.Dynamic.literal(getTypes = js.Any.fromFunction0(getTypes))
    __obj.asInstanceOf[IMemberTypeResource]
  }
  @scala.inline
  implicit class IMemberTypeResourceOps[Self <: IMemberTypeResource] (val x: Self) extends AnyVal {
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
    def setGetTypes(value: () => js.Any): Self = this.set("getTypes", js.Any.fromFunction0(value))
  }
  
}

