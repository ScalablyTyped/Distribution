package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullInstantiatedSignatureSymbol")
@js.native
class PullInstantiatedSignatureSymbol protected ()
  extends typings.typescriptServices.TypeScript.PullInstantiatedSignatureSymbol {
  def this(
    rootSignature: typings.typescriptServices.TypeScript.PullSignatureSymbol,
    _typeParameterArgumentMap: TypeArgumentMap
  ) = this()
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  /* CompleteClass */
  override def getIsSpecialized(): Boolean = js.native
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}

