package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImportsNotUsedAsValues extends StObject
@JSImport("typescript", "ImportsNotUsedAsValues")
@js.native
object ImportsNotUsedAsValues extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImportsNotUsedAsValues & Double] = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with ImportsNotUsedAsValues
  /* 2 */ val Error: typings.typescript.mod.ImportsNotUsedAsValues.Error & Double = js.native
  
  @js.native
  sealed trait Preserve
    extends StObject
       with ImportsNotUsedAsValues
  /* 1 */ val Preserve: typings.typescript.mod.ImportsNotUsedAsValues.Preserve & Double = js.native
  
  @js.native
  sealed trait Remove
    extends StObject
       with ImportsNotUsedAsValues
  /* 0 */ val Remove: typings.typescript.mod.ImportsNotUsedAsValues.Remove & Double = js.native
}
