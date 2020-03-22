package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCopy extends js.Object {
  var add: Double
  var copy: Double
  var move: Double
  var remove: Double
  var replace: Double
  var test: Double
}

object AnonCopy {
  @scala.inline
  def apply(add: Double, copy: Double, move: Double, remove: Double, replace: Double, test: Double): AnonCopy = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCopy]
  }
}

