package typings.winrt.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Panel extends js.Object
@JSGlobal("Windows.Devices.Enumeration.Panel")
@js.native
object Panel extends js.Object {
  
  @js.native
  sealed trait back extends Panel
  
  @js.native
  sealed trait bottom extends Panel
  
  @js.native
  sealed trait front extends Panel
  
  @js.native
  sealed trait left extends Panel
  
  @js.native
  sealed trait right extends Panel
  
  @js.native
  sealed trait top extends Panel
  
  @js.native
  sealed trait unknown extends Panel
}
