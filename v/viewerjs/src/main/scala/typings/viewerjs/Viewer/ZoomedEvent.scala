package typings.viewerjs.Viewer

import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomedEvent
  extends CustomEvent[js.Any] {
  
  @JSName("detail")
  var detail_ZoomedEvent: ZoomEventData = js.native
}
