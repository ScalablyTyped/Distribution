package typings
package umbracoLib.umbracoNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourcePromise extends js.Object {
  var data: js.Any
  var errorMsg: java.lang.String
  var status: scala.Double
}

object IResourcePromise {
  @scala.inline
  def apply(data: js.Any, errorMsg: java.lang.String, status: scala.Double): IResourcePromise = {
    val __obj = js.Dynamic.literal(data = data, errorMsg = errorMsg, status = status)
  
    __obj.asInstanceOf[IResourcePromise]
  }
}

