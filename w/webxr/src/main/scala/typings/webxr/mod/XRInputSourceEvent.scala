package typings.webxr.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRInputSourceEvent extends Event {
  
  val frame: XRFrame = js.native
  
  val inputSource: XRInputSource = js.native
}
