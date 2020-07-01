package typings.tusJsClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileReader extends js.Object {
  def openFile(input: js.Any, chunkSize: Double): js.Promise[FileSource]
}

object FileReader {
  @scala.inline
  def apply(openFile: (js.Any, Double) => js.Promise[FileSource]): FileReader = {
    val __obj = js.Dynamic.literal(openFile = js.Any.fromFunction2(openFile))
    __obj.asInstanceOf[FileReader]
  }
}

