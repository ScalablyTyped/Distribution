package typings
package webclLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var webcl: webclLib.WEBCLNs.WebCL
}

object Window {
  @scala.inline
  def apply(webcl: webclLib.WEBCLNs.WebCL): Window = {
    val __obj = js.Dynamic.literal(webcl = webcl)
  
    __obj.asInstanceOf[Window]
  }
}

