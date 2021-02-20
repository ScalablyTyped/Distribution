package typings.winrtUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HandPreference extends StObject
/** Defines the set of directional preferences for the user interface presented by the app view. */
@JSGlobal("Windows.UI.ViewManagement.HandPreference")
@js.native
object HandPreference extends StObject {
  
  /** The preferred layout is for left-directional users. */
  @js.native
  sealed trait leftHanded extends HandPreference
  
  /** The preferred layout is for right-directional users. */
  @js.native
  sealed trait rightHanded extends HandPreference
}
