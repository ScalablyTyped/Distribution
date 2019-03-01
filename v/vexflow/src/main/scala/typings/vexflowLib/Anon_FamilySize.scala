package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FamilySize extends js.Object {
  var family: java.lang.String
  var size: scala.Double
  var weight: java.lang.String
}

object Anon_FamilySize {
  @scala.inline
  def apply(family: java.lang.String, size: scala.Double, weight: java.lang.String): Anon_FamilySize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("family")(family)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[Anon_FamilySize]
  }
}

