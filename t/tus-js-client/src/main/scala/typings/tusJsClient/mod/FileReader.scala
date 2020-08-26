package typings.tusJsClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileReader extends js.Object {
  def openFile(input: js.Any, chunkSize: Double): js.Promise[FileSource] = js.native
}

object FileReader {
  @scala.inline
  def apply(openFile: (js.Any, Double) => js.Promise[FileSource]): FileReader = {
    val __obj = js.Dynamic.literal(openFile = js.Any.fromFunction2(openFile))
    __obj.asInstanceOf[FileReader]
  }
  @scala.inline
  implicit class FileReaderOps[Self <: FileReader] (val x: Self) extends AnyVal {
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
    def setOpenFile(value: (js.Any, Double) => js.Promise[FileSource]): Self = this.set("openFile", js.Any.fromFunction2(value))
  }
  
}

