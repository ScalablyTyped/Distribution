package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintTaskCompletion extends StObject
@JSGlobal("Windows.Graphics.Printing.PrintTaskCompletion")
@js.native
object PrintTaskCompletion extends StObject {
  
  @js.native
  sealed trait abandoned extends PrintTaskCompletion
  
  @js.native
  sealed trait canceled extends PrintTaskCompletion
  
  @js.native
  sealed trait failed extends PrintTaskCompletion
  
  @js.native
  sealed trait submitted extends PrintTaskCompletion
}
