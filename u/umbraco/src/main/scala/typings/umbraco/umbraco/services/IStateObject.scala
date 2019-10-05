package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * State Object
  */
trait IStateObject extends js.Object {
  var id: Double
  var name: String
  var parentId: Double
}

object IStateObject {
  @scala.inline
  def apply(id: Double, name: String, parentId: Double): IStateObject = {
    val __obj = js.Dynamic.literal(id = id, name = name, parentId = parentId)
  
    __obj.asInstanceOf[IStateObject]
  }
}

