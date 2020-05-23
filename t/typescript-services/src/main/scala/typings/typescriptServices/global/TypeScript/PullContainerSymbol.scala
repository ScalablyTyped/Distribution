package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullContainerSymbol")
@js.native
class PullContainerSymbol protected ()
  extends typings.typescriptServices.TypeScript.PullContainerSymbol {
  def this(name: String, kind: typings.typescriptServices.TypeScript.PullElementKind) = this()
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  /* CompleteClass */
  override def getIsSpecialized(): Boolean = js.native
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}

/* static members */
@JSGlobal("TypeScript.PullContainerSymbol")
@js.native
object PullContainerSymbol extends js.Object {
  def usedAsSymbol(
    containerSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    symbol: typings.typescriptServices.TypeScript.PullSymbol
  ): Boolean = js.native
}

