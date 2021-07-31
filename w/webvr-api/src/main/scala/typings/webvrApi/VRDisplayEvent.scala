package typings.webvrApi

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VRDisplayEvent
  extends StObject
     with Event {
  
  val display: VRDisplay = js.native
  
  val reason: VRDisplayEventReasonDtAlias | Null = js.native
}
