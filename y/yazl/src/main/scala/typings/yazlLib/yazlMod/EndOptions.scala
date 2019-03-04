package typings
package yazlLib.yazlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndOptions extends js.Object {
  var forceZip64Format: scala.Boolean
}

object EndOptions {
  @scala.inline
  def apply(forceZip64Format: scala.Boolean): EndOptions = {
    val __obj = js.Dynamic.literal(forceZip64Format = forceZip64Format)
  
    __obj.asInstanceOf[EndOptions]
  }
}

