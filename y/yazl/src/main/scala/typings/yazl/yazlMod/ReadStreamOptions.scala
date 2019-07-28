package typings.yazl.yazlMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadStreamOptions extends Options {
  var size: Double
}

object ReadStreamOptions {
  @scala.inline
  def apply(compress: Boolean, forceZip64Format: Boolean, mode: Double, mtime: Date, size: Double): ReadStreamOptions = {
    val __obj = js.Dynamic.literal(compress = compress, forceZip64Format = forceZip64Format, mode = mode, mtime = mtime, size = size)
  
    __obj.asInstanceOf[ReadStreamOptions]
  }
}

