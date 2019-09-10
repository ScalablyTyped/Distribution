package typings.tsutils.utilUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LateBoundPropertyNames extends js.Object {
  var known: Boolean
  var names: js.Array[PropertyName]
}

object LateBoundPropertyNames {
  @scala.inline
  def apply(known: Boolean, names: js.Array[PropertyName]): LateBoundPropertyNames = {
    val __obj = js.Dynamic.literal(known = known, names = names)
  
    __obj.asInstanceOf[LateBoundPropertyNames]
  }
}

