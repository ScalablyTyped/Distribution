package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JsxFlags extends js.Object
@JSImport("typescript", "JsxFlags")
@js.native
object JsxFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JsxFlags with Double] = js.native
  
  @js.native
  sealed trait IntrinsicElement extends JsxFlags
  /* 3 */ @js.native
  object IntrinsicElement extends TopLevel[IntrinsicElement with Double]
  
  /** An element inferred from the string index signature of the JSX.IntrinsicElements interface */
  @js.native
  sealed trait IntrinsicIndexedElement extends JsxFlags
  /* 2 */ @js.native
  object IntrinsicIndexedElement extends TopLevel[IntrinsicIndexedElement with Double]
  
  /** An element from a named property of the JSX.IntrinsicElements interface */
  @js.native
  sealed trait IntrinsicNamedElement extends JsxFlags
  /* 1 */ @js.native
  object IntrinsicNamedElement extends TopLevel[IntrinsicNamedElement with Double]
  
  @js.native
  sealed trait None extends JsxFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
