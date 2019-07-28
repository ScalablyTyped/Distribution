package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Derivatives extends js.Object {
  var derivatives: Boolean
  var drawBuffers: Boolean
  var fragDepth: Boolean
  var shaderTextureLOD: Boolean
}

object Anon_Derivatives {
  @scala.inline
  def apply(derivatives: Boolean, drawBuffers: Boolean, fragDepth: Boolean, shaderTextureLOD: Boolean): Anon_Derivatives = {
    val __obj = js.Dynamic.literal(derivatives = derivatives, drawBuffers = drawBuffers, fragDepth = fragDepth, shaderTextureLOD = shaderTextureLOD)
  
    __obj.asInstanceOf[Anon_Derivatives]
  }
}

