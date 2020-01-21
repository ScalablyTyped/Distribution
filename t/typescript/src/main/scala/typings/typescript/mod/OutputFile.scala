package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputFile extends js.Object {
  var name: java.lang.String
  var text: java.lang.String
  var writeByteOrderMark: Boolean
}

object OutputFile {
  @scala.inline
  def apply(name: java.lang.String, text: java.lang.String, writeByteOrderMark: Boolean): OutputFile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], writeByteOrderMark = writeByteOrderMark.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OutputFile]
  }
}

