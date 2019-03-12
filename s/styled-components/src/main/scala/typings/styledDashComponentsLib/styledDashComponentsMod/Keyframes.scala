package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyframes extends js.Object {
  def getName(): java.lang.String
}

object Keyframes {
  @scala.inline
  def apply(getName: () => java.lang.String): Keyframes = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName))
  
    __obj.asInstanceOf[Keyframes]
  }
}

