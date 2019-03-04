package typings
package yazlLib.yazlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadStreamOptions extends Options {
  var size: scala.Double
}

object ReadStreamOptions {
  @scala.inline
  def apply(
    compress: scala.Boolean,
    forceZip64Format: scala.Boolean,
    mode: scala.Double,
    mtime: stdLib.Date,
    size: scala.Double
  ): ReadStreamOptions = {
    val __obj = js.Dynamic.literal(compress = compress, forceZip64Format = forceZip64Format, mode = mode, mtime = mtime, size = size)
  
    __obj.asInstanceOf[ReadStreamOptions]
  }
}

