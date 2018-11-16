package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JsxFlags extends js.Object

@JSImport("typescript/ts", "JsxFlags")
@js.native
object JsxFlags extends js.Object {
  @js.native
  sealed trait IntrinsicElement
    extends typescriptLib.typescriptMod.tsNs.JsxFlags
  
  /** An element inferred from the string index signature of the JSX.IntrinsicElements interface */
  @js.native
  sealed trait IntrinsicIndexedElement
    extends typescriptLib.typescriptMod.tsNs.JsxFlags
  
  /** An element from a named property of the JSX.IntrinsicElements interface */
  @js.native
  sealed trait IntrinsicNamedElement
    extends typescriptLib.typescriptMod.tsNs.JsxFlags
  
  @js.native
  sealed trait None
    extends typescriptLib.typescriptMod.tsNs.JsxFlags
  
}

