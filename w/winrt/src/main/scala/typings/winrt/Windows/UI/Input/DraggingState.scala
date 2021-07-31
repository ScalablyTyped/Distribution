package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DraggingState extends StObject
@JSGlobal("Windows.UI.Input.DraggingState")
@js.native
object DraggingState extends StObject {
  
  @js.native
  sealed trait completed
    extends StObject
       with DraggingState
  
  @js.native
  sealed trait continuing
    extends StObject
       with DraggingState
  
  @js.native
  sealed trait started
    extends StObject
       with DraggingState
}
