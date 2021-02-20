package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CoreVirtualKeyStates extends StObject
@JSGlobal("Windows.UI.Core.CoreVirtualKeyStates")
@js.native
object CoreVirtualKeyStates extends StObject {
  
  @js.native
  sealed trait down extends CoreVirtualKeyStates
  
  @js.native
  sealed trait locked extends CoreVirtualKeyStates
  
  @js.native
  sealed trait none extends CoreVirtualKeyStates
}
