package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JsxFlags extends js.Object

@JSImport("typescript", "JsxFlags")
@js.native
object JsxFlags extends js.Object {
  @js.native
  sealed trait IntrinsicElement
    extends typescriptLib.typescriptMod.JsxFlags
  
  /** An element inferred from the string index signature of the JSX.IntrinsicElements interface */
  @js.native
  sealed trait IntrinsicIndexedElement
    extends typescriptLib.typescriptMod.JsxFlags
  
  /** An element from a named property of the JSX.IntrinsicElements interface */
  @js.native
  sealed trait IntrinsicNamedElement
    extends typescriptLib.typescriptMod.JsxFlags
  
  @js.native
  sealed trait None
    extends typescriptLib.typescriptMod.JsxFlags
  
  /* 3 */ val IntrinsicElement: IntrinsicElement with scala.Double = js.native
  /* 2 */ val IntrinsicIndexedElement: IntrinsicIndexedElement with scala.Double = js.native
  /* 1 */ val IntrinsicNamedElement: IntrinsicNamedElement with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.JsxFlags with scala.Double] = js.native
}

