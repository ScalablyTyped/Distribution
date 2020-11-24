package typings.winjs.mod.UI.XYFocus

import typings.std.CustomEvent
import typings.winjs.anon.KeyCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XYFocusEvent
  extends CustomEvent[js.Any] {
  
  @JSName("detail")
  var detail_XYFocusEvent: KeyCode = js.native
}
