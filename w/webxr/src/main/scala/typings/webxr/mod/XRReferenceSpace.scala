package typings.webxr.mod

import typings.std.Event
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRReferenceSpace
  extends StObject
     with EventTarget {
  
  def getOffsetReferenceSpace(originOffset: XRRigidTransform): XRReferenceSpace = js.native
  
  def onreset(event: Event): js.Any = js.native
  @JSName("onreset")
  var onreset_Original: XREventHandler = js.native
}
