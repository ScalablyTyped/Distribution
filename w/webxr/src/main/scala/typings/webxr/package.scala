package typings.webxr

import typings.std.DOMHighResTimeStamp
import typings.std.EventTarget
import typings.std.Set
import typings.webxr.webxrStrings.redraw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// Experimental/Draft features
// Anchors
type XRAnchorSet = Set[XRAnchor]

type XRFrameRequestCallback = js.Function2[/* time */ DOMHighResTimeStamp, /* frame */ XRFrame, Unit]

type XRInputSourceChangeEventHandler = js.Function1[/* evt */ XRInputSourceChangeEvent, Any]

type XRInputSourceEventHandler = js.Function1[/* evt */ XRInputSourceEvent, Any]

// WebXR Layers
/**
  * The base class for XRWebGLLayer and other layer types introduced by future extensions.
  * ref: https://immersive-web.github.io/webxr/#xrlayer-interface
  */
// tslint:disable-next-line no-empty-interface
type XRLayer = EventTarget

type XRLayerEventType = redraw

// Plane detection
type XRPlaneSet = Set[XRPlane]

type XRReferenceSpaceEventHandler = js.Function1[/* event */ XRReferenceSpaceEvent, Any]

type XRSessionEventHandler = js.Function1[/* evt */ XRSessionEvent, Any]

/**
  * Represents a virtual coordinate system with an origin that corresponds to a physical location.
  * Spatial data that is requested from the API or given to the API is always expressed in relation
  * to a specific XRSpace at the time of a specific XRFrame. Numeric values such as pose positions
  * are coordinates in that space relative to its origin. The interface is intentionally opaque.
  *
  * ref: https://immersive-web.github.io/webxr/#xrspace-interface
  */
// tslint:disable-next-line no-empty-interface
type XRSpace = EventTarget

type XRSystemDeviceChangeEventHandler = js.Function1[/* event */ XRSystemDeviceChangeEvent, Any]

type XRSystemSessionGrantedEventHandler = js.Function1[/* event */ XRSystemSessionGrantedEvent, Any]
