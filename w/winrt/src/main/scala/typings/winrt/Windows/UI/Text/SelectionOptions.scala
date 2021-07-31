package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionOptions extends StObject
@JSGlobal("Windows.UI.Text.SelectionOptions")
@js.native
object SelectionOptions extends StObject {
  
  @js.native
  sealed trait active
    extends StObject
       with SelectionOptions
  
  @js.native
  sealed trait atEndOfLine
    extends StObject
       with SelectionOptions
  
  @js.native
  sealed trait overtype
    extends StObject
       with SelectionOptions
  
  @js.native
  sealed trait replace
    extends StObject
       with SelectionOptions
  
  @js.native
  sealed trait startActive
    extends StObject
       with SelectionOptions
}
