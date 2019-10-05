package typings.webcl

import typings.webcl.WEBCL.WebCL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var webcl: WebCL
}

object Window {
  @scala.inline
  def apply(webcl: WebCL): Window = {
    val __obj = js.Dynamic.literal(webcl = webcl)
  
    __obj.asInstanceOf[Window]
  }
}

