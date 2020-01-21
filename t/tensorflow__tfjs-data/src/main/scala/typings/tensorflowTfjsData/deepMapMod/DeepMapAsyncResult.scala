package typings.tensorflowTfjsData.deepMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeepMapAsyncResult extends js.Object {
  var recurse: Boolean
  var value: js.Promise[_]
}

object DeepMapAsyncResult {
  @scala.inline
  def apply(recurse: Boolean, value: js.Promise[_]): DeepMapAsyncResult = {
    val __obj = js.Dynamic.literal(recurse = recurse.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeepMapAsyncResult]
  }
}

