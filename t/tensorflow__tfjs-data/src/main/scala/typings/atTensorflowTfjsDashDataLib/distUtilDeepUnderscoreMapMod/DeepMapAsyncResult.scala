package typings
package atTensorflowTfjsDashDataLib.distUtilDeepUnderscoreMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeepMapAsyncResult extends js.Object {
  var recurse: scala.Boolean
  var value: js.Promise[_]
}

object DeepMapAsyncResult {
  @scala.inline
  def apply(recurse: scala.Boolean, value: js.Promise[_]): DeepMapAsyncResult = {
    val __obj = js.Dynamic.literal(recurse = recurse, value = value)
  
    __obj.asInstanceOf[DeepMapAsyncResult]
  }
}

