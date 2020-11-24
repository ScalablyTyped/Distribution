package typings.viewerjs.Viewer

import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomEvent
  extends CustomEvent[js.Any] {
  
  @JSName("detail")
  var detail_ZoomEvent: ZoomEventData = js.native
}
