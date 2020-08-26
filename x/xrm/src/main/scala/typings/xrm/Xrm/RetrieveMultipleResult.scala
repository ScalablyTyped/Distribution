package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the WebAPI RetrieveMultiple request response
  */
@js.native
trait RetrieveMultipleResult extends js.Object {
  /**
    * An array of JSON objects, where each object represents the retrieved entity record containing attributes and their values as key: value pairs. The Id of the entity record is retrieved by default.
    */
  var entities: js.Array[_] = js.native
  /**
    * If the number of records being retrieved is more than the value specified in the maxPageSize parameter, this attribute returns the URL to return next set of records.
    */
  var nextLink: String = js.native
}

object RetrieveMultipleResult {
  @scala.inline
  def apply(entities: js.Array[_], nextLink: String): RetrieveMultipleResult = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], nextLink = nextLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveMultipleResult]
  }
  @scala.inline
  implicit class RetrieveMultipleResultOps[Self <: RetrieveMultipleResult] (val x: Self) extends AnyVal {
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
    def setEntitiesVarargs(value: js.Any*): Self = this.set("entities", js.Array(value :_*))
    @scala.inline
    def setEntities(value: js.Array[_]): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextLink(value: String): Self = this.set("nextLink", value.asInstanceOf[js.Any])
  }
  
}

