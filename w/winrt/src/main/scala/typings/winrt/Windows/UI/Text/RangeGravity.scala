package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RangeGravity extends StObject
@JSGlobal("Windows.UI.Text.RangeGravity")
@js.native
object RangeGravity extends StObject {
  
  @js.native
  sealed trait backward
    extends StObject
       with RangeGravity
  
  @js.native
  sealed trait forward
    extends StObject
       with RangeGravity
  
  @js.native
  sealed trait inward
    extends StObject
       with RangeGravity
  
  @js.native
  sealed trait outward
    extends StObject
       with RangeGravity
  
  @js.native
  sealed trait uIBehavior
    extends StObject
       with RangeGravity
}
