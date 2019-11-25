package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the WebAPI CreateRecord request response
  */
trait CreateResponse extends js.Object {
  var entityType: String
  var id: String
}

object CreateResponse {
  @scala.inline
  def apply(entityType: String, id: String): CreateResponse = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateResponse]
  }
}

