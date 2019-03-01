package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alignrests extends js.Object {
  var align_rests: scala.Boolean
  var auto_beam: scala.Boolean
}

object Anon_Alignrests {
  @scala.inline
  def apply(align_rests: scala.Boolean, auto_beam: scala.Boolean): Anon_Alignrests = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("align_rests")(align_rests)
    __obj.updateDynamic("auto_beam")(auto_beam)
    __obj.asInstanceOf[Anon_Alignrests]
  }
}

