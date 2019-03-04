package typings
package ydnDashDbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Push extends js.Object {
  def push(value: js.Any): scala.Unit
}

object Anon_Push {
  @scala.inline
  def apply(push: js.Function1[js.Any, scala.Unit]): Anon_Push = {
    val __obj = js.Dynamic.literal(push = push)
  
    __obj.asInstanceOf[Anon_Push]
  }
}

