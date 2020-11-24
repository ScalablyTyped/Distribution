package typings.webvrApi

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VRDisplayEvent extends Event {
  
  val display: VRDisplay = js.native
  
  val reason: VRDisplayEventReasonDtAlias | Null = js.native
}
