package typings.yazl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndOptions extends js.Object {
  var forceZip64Format: Boolean
}

object EndOptions {
  @scala.inline
  def apply(forceZip64Format: Boolean): EndOptions = {
    val __obj = js.Dynamic.literal(forceZip64Format = forceZip64Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndOptions]
  }
}

