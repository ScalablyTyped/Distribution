package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InstantiableSymbol extends js.Object {
  def getAllowedToReferenceTypeParameters(): js.Array[PullTypeParameterSymbol]
  def getIsSpecialized(): scala.Boolean
  def getTypeParameterArgumentMap(): TypeArgumentMap
}

