package typings.tmpDashPromise.tmpDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryResult extends js.Object {
  var path: String
  def cleanup(): Unit
}

object DirectoryResult {
  @scala.inline
  def apply(cleanup: () => Unit, path: String): DirectoryResult = {
    val __obj = js.Dynamic.literal(cleanup = js.Any.fromFunction0(cleanup), path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectoryResult]
  }
}

