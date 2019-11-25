package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DerivativesDrawBuffers extends js.Object {
  var derivatives: Boolean
  var drawBuffers: Boolean
  var fragDepth: Boolean
  var shaderTextureLOD: Boolean
}

object Anon_DerivativesDrawBuffers {
  @scala.inline
  def apply(derivatives: Boolean, drawBuffers: Boolean, fragDepth: Boolean, shaderTextureLOD: Boolean): Anon_DerivativesDrawBuffers = {
    val __obj = js.Dynamic.literal(derivatives = derivatives.asInstanceOf[js.Any], drawBuffers = drawBuffers.asInstanceOf[js.Any], fragDepth = fragDepth.asInstanceOf[js.Any], shaderTextureLOD = shaderTextureLOD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DerivativesDrawBuffers]
  }
}

