package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullContainerSymbol")
@js.native
class PullContainerSymbol protected ()
  extends typings.typescriptServices.TypeScript.PullContainerSymbol {
  def this(name: String, kind: typings.typescriptServices.TypeScript.PullElementKind) = this()
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

