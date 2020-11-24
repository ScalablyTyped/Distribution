package typings.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TabLeader extends js.Object
@JSGlobal("Windows.UI.Text.TabLeader")
@js.native
object TabLeader extends js.Object {
  
  @js.native
  sealed trait dashes extends TabLeader
  
  @js.native
  sealed trait dots extends TabLeader
  
  @js.native
  sealed trait equals extends TabLeader
  
  @js.native
  sealed trait lines extends TabLeader
  
  @js.native
  sealed trait spaces extends TabLeader
  
  @js.native
  sealed trait thickLines extends TabLeader
}
