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
  @js.native
  sealed trait IntrinsicElement extends JsxFlags
  
  /** An element inferred from the string index signature of the JSX.IntrinsicElements interface */
  @js.native
  sealed trait IntrinsicIndexedElement extends JsxFlags
  
  /** An element from a named property of the JSX.IntrinsicElements interface */
  @js.native
  sealed trait IntrinsicNamedElement extends JsxFlags
  
  @js.native
  sealed trait None extends JsxFlags
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JsxFlags with Double] = js.native
  /* 3 */ @js.native
  object IntrinsicElement extends TopLevel[IntrinsicElement with Double]
  
  /* 2 */ @js.native
  object IntrinsicIndexedElement extends TopLevel[IntrinsicIndexedElement with Double]
  
  /* 1 */ @js.native
  object IntrinsicNamedElement extends TopLevel[IntrinsicNamedElement with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

