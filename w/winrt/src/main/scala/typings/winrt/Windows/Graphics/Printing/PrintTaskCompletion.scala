package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintTaskCompletion extends StObject
@JSGlobal("Windows.Graphics.Printing.PrintTaskCompletion")
@js.native
object PrintTaskCompletion extends StObject {
  
  @js.native
  sealed trait abandoned
    extends StObject
       with PrintTaskCompletion
  
  @js.native
  sealed trait canceled
    extends StObject
       with PrintTaskCompletion
  
  @js.native
  sealed trait failed
    extends StObject
       with PrintTaskCompletion
  
  @js.native
  sealed trait submitted
    extends StObject
       with PrintTaskCompletion
}
