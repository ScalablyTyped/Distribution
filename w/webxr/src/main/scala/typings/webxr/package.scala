package typings.webxr

import typings.std.DOMHighResTimeStamp
import typings.std.EventTarget
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// Experimental/Draft features
// Anchors
type XRAnchorSet = Set[XRAnchor]

type XRDOMOverlayType = "screen" | "floating" | "head-locked"

type XREnvironmentBlendMode = "opaque" | "additive" | "alpha-blend"

/**
  * Eye types
  */
type XREye = "none" | "left" | "right"

type XRFrameRequestCallback = js.Function2[/* time */ DOMHighResTimeStamp, /* frame */ XRFrame, Unit]

// Hand Tracking
type XRHandJoint = "wrist" | "thumb-metacarpal" | "thumb-phalanx-proximal" | "thumb-phalanx-distal" | "thumb-tip" | "index-finger-metacarpal" | "index-finger-phalanx-proximal" | "index-finger-phalanx-intermediate" | "index-finger-phalanx-distal" | "index-finger-tip" | "middle-finger-metacarpal" | "middle-finger-phalanx-proximal" | "middle-finger-phalanx-intermediate" | "middle-finger-phalanx-distal" | "middle-finger-tip" | "ring-finger-metacarpal" | "ring-finger-phalanx-proximal" | "ring-finger-phalanx-intermediate" | "ring-finger-phalanx-distal" | "ring-finger-tip" | "pinky-finger-metacarpal" | "pinky-finger-phalanx-proximal" | "pinky-finger-phalanx-intermediate" | "pinky-finger-phalanx-distal" | "pinky-finger-tip"

/**
  * Handedness types
  */
type XRHandedness = "none" | "left" | "right"

type XRHitTestTrackableType = "point" | "plane" | "mesh"

type XRInputSourceChangeEventHandler = js.Function1[/* evt */ XRInputSourceChangeEvent, Any]

type XRInputSourceEventHandler = js.Function1[/* evt */ XRInputSourceEvent, Any]

/**
  * Type of XR events available
  */
type XRInputSourceEventType = "select" | "selectend" | "selectstart" | "squeeze" | "squeezeend" | "squeezestart"

// WebXR Layers
/**
  * The base class for XRWebGLLayer and other layer types introduced by future extensions.
  * ref: https://immersive-web.github.io/webxr/#xrlayer-interface
  */
// tslint:disable-next-line no-empty-interface
type XRLayer = EventTarget

type XRLayerEventType = "redraw"

type XRLayerLayout = "default" | "mono" | "stereo" | "stereo-left-right" | "stereo-top-bottom"

type XRPlaneOrientation = "horizontal" | "vertical"

// Plane detection
type XRPlaneSet = Set[XRPlane]

type XRReferenceSpaceEventHandler = js.Function1[/* event */ XRReferenceSpaceEvent, Any]

/**
  * Reference space types
  */
type XRReferenceSpaceType = "viewer" | "local" | "local-floor" | "bounded-floor" | "unbounded"

type XRSessionEventHandler = js.Function1[/* evt */ XRSessionEvent, Any]

type XRSessionEventType = "end" | "visibilitychange" | "frameratechange"

/**
  * Available session modes
  *
  * ref: https://immersive-web.github.io/webxr/#xrsessionmode-enum
  */
type XRSessionMode = "inline" | "immersive-vr" | "immersive-ar"

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

/**
  * InputSource target ray modes
  */
type XRTargetRayMode = "gaze" | "tracked-pointer" | "screen"

type XRTextureType = "texture" | "texture-array"

/**
  * ref: https://immersive-web.github.io/webxr/#xrsession-interface
  */
type XRVisibilityState = "visible" | "visible-blurred" | "hidden"
