package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TabLeader extends StObject
@JSGlobal("Windows.UI.Text.TabLeader")
@js.native
object TabLeader extends StObject {
  
  @js.native
  sealed trait dashes
    extends StObject
       with TabLeader
  
  @js.native
  sealed trait dots
    extends StObject
       with TabLeader
  
  @js.native
  sealed trait equals
    extends StObject
       with TabLeader
  
  @js.native
  sealed trait lines
    extends StObject
       with TabLeader
  
  @js.native
  sealed trait spaces
    extends StObject
       with TabLeader
  
  @js.native
  sealed trait thickLines
    extends StObject
       with TabLeader
}
