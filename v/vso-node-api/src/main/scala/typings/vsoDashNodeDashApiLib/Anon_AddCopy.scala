package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddCopy extends js.Object {
  var add: scala.Double
  var copy: scala.Double
  var move: scala.Double
  var remove: scala.Double
  var replace: scala.Double
  var test: scala.Double
}

object Anon_AddCopy {
  @scala.inline
  def apply(
    add: scala.Double,
    copy: scala.Double,
    move: scala.Double,
    remove: scala.Double,
    replace: scala.Double,
    test: scala.Double
  ): Anon_AddCopy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("move")(move)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("replace")(replace)
    __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[Anon_AddCopy]
  }
}

