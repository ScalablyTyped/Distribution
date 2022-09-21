package typings.webxr.global

import typings.webxr.XRReferenceSpaceEventInit
import typings.webxr.webxrStrings.reset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * XRReferenceSpaceEvents are fired to indicate changes to the state of an XRReferenceSpace.
  *
  * ref: https://immersive-web.github.io/webxr/#xrreferencespaceevent-interface
  */
// tslint:disable-next-line no-unnecessary-class
@JSGlobal("XRReferenceSpaceEvent")
@js.native
open class XRReferenceSpaceEvent protected ()
  extends StObject
     with typings.webxr.XRReferenceSpaceEvent {
  def this(`type`: reset) = this()
  def this(`type`: reset, eventInitDict: XRReferenceSpaceEventInit) = this()
}
