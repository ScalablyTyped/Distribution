package typings.umbraco.umbracoNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.memberTypeResource
  * @description Loads in data for member types
  **/
trait IMemberTypeResource extends js.Object {
  //return all member types
  def getTypes(): js.Any
}

object IMemberTypeResource {
  @scala.inline
  def apply(getTypes: () => js.Any): IMemberTypeResource = {
    val __obj = js.Dynamic.literal(getTypes = js.Any.fromFunction0(getTypes))
  
    __obj.asInstanceOf[IMemberTypeResource]
  }
}

