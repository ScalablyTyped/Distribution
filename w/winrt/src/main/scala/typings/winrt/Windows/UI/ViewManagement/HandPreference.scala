package typings.winrt.Windows.UI.ViewManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HandPreference extends StObject
@JSGlobal("Windows.UI.ViewManagement.HandPreference")
@js.native
object HandPreference extends StObject {
  
  @js.native
  sealed trait leftHanded
    extends StObject
       with HandPreference
  
  @js.native
  sealed trait rightHanded
    extends StObject
       with HandPreference
}
