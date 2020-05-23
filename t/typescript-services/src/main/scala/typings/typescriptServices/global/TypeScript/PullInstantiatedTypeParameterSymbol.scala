package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullInstantiatedTypeParameterSymbol")
@js.native
class PullInstantiatedTypeParameterSymbol protected ()
  extends typings.typescriptServices.TypeScript.PullInstantiatedTypeParameterSymbol {
  def this(
    rootTypeParameter: typings.typescriptServices.TypeScript.PullTypeSymbol,
    constraintType: typings.typescriptServices.TypeScript.PullTypeSymbol
  ) = this()
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  /* CompleteClass */
  override def getIsSpecialized(): Boolean = js.native
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}

