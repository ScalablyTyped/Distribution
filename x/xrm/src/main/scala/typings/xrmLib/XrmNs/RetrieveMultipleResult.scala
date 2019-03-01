package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the WebAPI RetrieveMultiple request response
  */
trait RetrieveMultipleResult extends js.Object {
  /**
    * An array of JSON objects, where each object represents the retrieved entity record containing attributes and their values as key: value pairs. The Id of the entity record is retrieved by default.
    */
  var entities: js.Array[_]
  /**
    * If the number of records being retrieved is more than the value specified in the maxPageSize parameter, this attribute returns the URL to return next set of records.
    */
  var nextLink: java.lang.String
}

object RetrieveMultipleResult {
  @scala.inline
  def apply(entities: js.Array[_], nextLink: java.lang.String): RetrieveMultipleResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entities")(entities)
    __obj.updateDynamic("nextLink")(nextLink)
    __obj.asInstanceOf[RetrieveMultipleResult]
  }
}

