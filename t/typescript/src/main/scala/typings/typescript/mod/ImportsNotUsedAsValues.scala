package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImportsNotUsedAsValues extends js.Object
@JSImport("typescript", "ImportsNotUsedAsValues")
@js.native
object ImportsNotUsedAsValues extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImportsNotUsedAsValues with Double] = js.native
  
  @js.native
  sealed trait Error extends ImportsNotUsedAsValues
  /* 2 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait Preserve extends ImportsNotUsedAsValues
  /* 1 */ @js.native
  object Preserve extends TopLevel[Preserve with Double]
  
  @js.native
  sealed trait Remove extends ImportsNotUsedAsValues
  /* 0 */ @js.native
  object Remove extends TopLevel[Remove with Double]
}
