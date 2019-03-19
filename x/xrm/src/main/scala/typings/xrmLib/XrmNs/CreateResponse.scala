package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the WebAPI CreateRecord request response
  */
trait CreateResponse extends js.Object {
  var entityType: java.lang.String
  var id: java.lang.String
}

object CreateResponse {
  @scala.inline
  def apply(entityType: java.lang.String, id: java.lang.String): CreateResponse = {
    val __obj = js.Dynamic.literal(entityType = entityType, id = id)
  
    __obj.asInstanceOf[CreateResponse]
  }
}

