package typings.tmpDashPromise.tmpDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileResult extends DirectoryResult {
  var fd: Double
}

object FileResult {
  @scala.inline
  def apply(cleanup: () => Unit, fd: Double, path: String): FileResult = {
    val __obj = js.Dynamic.literal(cleanup = js.Any.fromFunction0(cleanup), fd = fd, path = path)
  
    __obj.asInstanceOf[FileResult]
  }
}

