package typings.uifabricUtilities.selectionTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionDirection extends js.Object
@JSImport("@uifabric/utilities/lib/selection/Selection.types", "SelectionDirection")
@js.native
object SelectionDirection extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionDirection with Double] = js.native
  
  @js.native
  sealed trait horizontal extends SelectionDirection
  /* 0 */ @js.native
  object horizontal extends TopLevel[horizontal with Double]
  
  @js.native
  sealed trait vertical extends SelectionDirection
  /* 1 */ @js.native
  object vertical extends TopLevel[vertical with Double]
}
