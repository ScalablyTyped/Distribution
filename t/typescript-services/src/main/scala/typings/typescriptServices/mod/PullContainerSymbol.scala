package typings.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullContainerSymbol")
@js.native
class PullContainerSymbol protected ()
  extends typings.typescriptServices.TypeScript.PullContainerSymbol {
  def this(name: String, kind: typings.typescriptServices.TypeScript.PullElementKind) = this()
}

/* static members */
@JSImport("typescript-services", "PullContainerSymbol")
@js.native
object PullContainerSymbol extends js.Object {
  def usedAsSymbol(
    containerSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    symbol: typings.typescriptServices.TypeScript.PullSymbol
  ): Boolean = js.native
}

