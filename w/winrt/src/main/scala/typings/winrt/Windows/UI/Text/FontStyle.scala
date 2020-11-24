package typings.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FontStyle extends js.Object
@JSGlobal("Windows.UI.Text.FontStyle")
@js.native
object FontStyle extends js.Object {
  
  @js.native
  sealed trait italic extends FontStyle
  
  @js.native
  sealed trait normal extends FontStyle
  
  @js.native
  sealed trait oblique extends FontStyle
}
