package typings
package yaddaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Init extends js.Object {
  def init(options: js.Any): scala.Unit
}

object Anon_Init {
  @scala.inline
  def apply(init: js.Any => scala.Unit): Anon_Init = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
  
    __obj.asInstanceOf[Anon_Init]
  }
}

