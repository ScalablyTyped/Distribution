package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActualSignatureInfo extends js.Object {
  var currentParameter: Double
  var currentParameterIsTypeParameter: Boolean
  var parameterLimChar: Double
  var parameterMinChar: Double
}

object ActualSignatureInfo {
  @scala.inline
  def apply(
    currentParameter: Double,
    currentParameterIsTypeParameter: Boolean,
    parameterLimChar: Double,
    parameterMinChar: Double
  ): ActualSignatureInfo = {
    val __obj = js.Dynamic.literal(currentParameter = currentParameter.asInstanceOf[js.Any], currentParameterIsTypeParameter = currentParameterIsTypeParameter.asInstanceOf[js.Any], parameterLimChar = parameterLimChar.asInstanceOf[js.Any], parameterMinChar = parameterMinChar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActualSignatureInfo]
  }
}

