package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInformation extends js.Object {
  var byteOrderMark: ByteOrderMark
  var contents: String
}

object FileInformation {
  @scala.inline
  def apply(byteOrderMark: ByteOrderMark, contents: String): FileInformation = {
    val __obj = js.Dynamic.literal(byteOrderMark = byteOrderMark.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInformation]
  }
}

