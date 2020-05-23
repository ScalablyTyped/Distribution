package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullTypeParameterSymbol")
@js.native
class PullTypeParameterSymbol protected ()
  extends typings.typescriptServices.TypeScript.PullTypeParameterSymbol {
  def this(name: String) = this()
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  /* CompleteClass */
  override def getIsSpecialized(): Boolean = js.native
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}

