package typings.umbraco.umbraco.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourcePromise extends js.Object {
  var data: js.Any
  var errorMsg: String
  var status: Double
}

object IResourcePromise {
  @scala.inline
  def apply(data: js.Any, errorMsg: String, status: Double): IResourcePromise = {
    val __obj = js.Dynamic.literal(data = data, errorMsg = errorMsg, status = status)
  
    __obj.asInstanceOf[IResourcePromise]
  }
}

