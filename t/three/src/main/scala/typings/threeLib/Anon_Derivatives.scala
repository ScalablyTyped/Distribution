package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Derivatives extends js.Object {
  var derivatives: scala.Boolean
  var drawBuffers: scala.Boolean
  var fragDepth: scala.Boolean
  var shaderTextureLOD: scala.Boolean
}

object Anon_Derivatives {
  @scala.inline
  def apply(
    derivatives: scala.Boolean,
    drawBuffers: scala.Boolean,
    fragDepth: scala.Boolean,
    shaderTextureLOD: scala.Boolean
  ): Anon_Derivatives = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("derivatives")(derivatives)
    __obj.updateDynamic("drawBuffers")(drawBuffers)
    __obj.updateDynamic("fragDepth")(fragDepth)
    __obj.updateDynamic("shaderTextureLOD")(shaderTextureLOD)
    __obj.asInstanceOf[Anon_Derivatives]
  }
}

