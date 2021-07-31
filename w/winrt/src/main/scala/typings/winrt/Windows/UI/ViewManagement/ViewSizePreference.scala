package typings.winrt.Windows.UI.ViewManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewSizePreference extends StObject
@JSGlobal("Windows.UI.ViewManagement.ViewSizePreference")
@js.native
object ViewSizePreference extends StObject {
  
  @js.native
  sealed trait default
    extends StObject
       with ViewSizePreference
  
  @js.native
  sealed trait useHalf
    extends StObject
       with ViewSizePreference
  
  @js.native
  sealed trait useLess
    extends StObject
       with ViewSizePreference
  
  @js.native
  sealed trait useMinimum
    extends StObject
       with ViewSizePreference
  
  @js.native
  sealed trait useMore
    extends StObject
       with ViewSizePreference
  
  @js.native
  sealed trait useNone
    extends StObject
       with ViewSizePreference
}
