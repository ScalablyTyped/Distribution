package typings.webxr

import typings.webxr.mod.XREnvironmentBlendMode
import typings.webxr.mod.XREventType
import typings.webxr.mod.XREye
import typings.webxr.mod.XRHandedness
import typings.webxr.mod.XRReferenceSpaceType
import typings.webxr.mod.XRSessionMode
import typings.webxr.mod.XRTargetRayMode
import typings.webxr.mod.XRVisibilityState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webxrStrings {
  
  @js.native
  sealed trait Horizontal extends StObject
  @scala.inline
  def Horizontal: Horizontal = "Horizontal".asInstanceOf[Horizontal]
  
  @js.native
  sealed trait Vertical extends StObject
  @scala.inline
  def Vertical: Vertical = "Vertical".asInstanceOf[Vertical]
  
  @js.native
  sealed trait additive
    extends StObject
       with XREnvironmentBlendMode
  @scala.inline
  def additive: additive = "additive".asInstanceOf[additive]
  
  @js.native
  sealed trait `alpha-blend`
    extends StObject
       with XREnvironmentBlendMode
  @scala.inline
  def `alpha-blend`: `alpha-blend` = "alpha-blend".asInstanceOf[`alpha-blend`]
  
  @js.native
  sealed trait `bounded-floor`
    extends StObject
       with XRReferenceSpaceType
  @scala.inline
  def `bounded-floor`: `bounded-floor` = "bounded-floor".asInstanceOf[`bounded-floor`]
  
  @js.native
  sealed trait devicechange
    extends StObject
       with XREventType
  @scala.inline
  def devicechange: devicechange = "devicechange".asInstanceOf[devicechange]
  
  @js.native
  sealed trait end
    extends StObject
       with XREventType
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait gaze
    extends StObject
       with XRTargetRayMode
  @scala.inline
  def gaze: gaze = "gaze".asInstanceOf[gaze]
  
  @js.native
  sealed trait hidden
    extends StObject
       with XRVisibilityState
  @scala.inline
  def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait `immersive-ar`
    extends StObject
       with XRSessionMode
  @scala.inline
  def `immersive-ar`: `immersive-ar` = "immersive-ar".asInstanceOf[`immersive-ar`]
  
  @js.native
  sealed trait `immersive-vr`
    extends StObject
       with XRSessionMode
  @scala.inline
  def `immersive-vr`: `immersive-vr` = "immersive-vr".asInstanceOf[`immersive-vr`]
  
  @js.native
  sealed trait `inline`
    extends StObject
       with XRSessionMode
  @scala.inline
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @js.native
  sealed trait inputsourceschange
    extends StObject
       with XREventType
  @scala.inline
  def inputsourceschange: inputsourceschange = "inputsourceschange".asInstanceOf[inputsourceschange]
  
  @js.native
  sealed trait left
    extends StObject
       with XREye
       with XRHandedness
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait local
    extends StObject
       with XRReferenceSpaceType
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait `local-floor`
    extends StObject
       with XRReferenceSpaceType
  @scala.inline
  def `local-floor`: `local-floor` = "local-floor".asInstanceOf[`local-floor`]
  
  @js.native
  sealed trait none
    extends StObject
       with XREye
       with XRHandedness
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait opaque
    extends StObject
       with XREnvironmentBlendMode
  @scala.inline
  def opaque: opaque = "opaque".asInstanceOf[opaque]
  
  @js.native
  sealed trait reset
    extends StObject
       with XREventType
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  
  @js.native
  sealed trait right
    extends StObject
       with XREye
       with XRHandedness
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait screen
    extends StObject
       with XRTargetRayMode
  @scala.inline
  def screen: screen = "screen".asInstanceOf[screen]
  
  @js.native
  sealed trait select
    extends StObject
       with XREventType
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait selectend
    extends StObject
       with XREventType
  @scala.inline
  def selectend: selectend = "selectend".asInstanceOf[selectend]
  
  @js.native
  sealed trait selectstart
    extends StObject
       with XREventType
  @scala.inline
  def selectstart: selectstart = "selectstart".asInstanceOf[selectstart]
  
  @js.native
  sealed trait squeeze
    extends StObject
       with XREventType
  @scala.inline
  def squeeze: squeeze = "squeeze".asInstanceOf[squeeze]
  
  @js.native
  sealed trait squeezeend
    extends StObject
       with XREventType
  @scala.inline
  def squeezeend: squeezeend = "squeezeend".asInstanceOf[squeezeend]
  
  @js.native
  sealed trait squeezestart
    extends StObject
       with XREventType
  @scala.inline
  def squeezestart: squeezestart = "squeezestart".asInstanceOf[squeezestart]
  
  @js.native
  sealed trait `tracked-pointer`
    extends StObject
       with XRTargetRayMode
  @scala.inline
  def `tracked-pointer`: `tracked-pointer` = "tracked-pointer".asInstanceOf[`tracked-pointer`]
  
  @js.native
  sealed trait unbounded
    extends StObject
       with XRReferenceSpaceType
  @scala.inline
  def unbounded: unbounded = "unbounded".asInstanceOf[unbounded]
  
  @js.native
  sealed trait viewer
    extends StObject
       with XRReferenceSpaceType
  @scala.inline
  def viewer: viewer = "viewer".asInstanceOf[viewer]
  
  @js.native
  sealed trait visibilitychange
    extends StObject
       with XREventType
  @scala.inline
  def visibilitychange: visibilitychange = "visibilitychange".asInstanceOf[visibilitychange]
  
  @js.native
  sealed trait visible
    extends StObject
       with XRVisibilityState
  @scala.inline
  def visible: visible = "visible".asInstanceOf[visible]
  
  @js.native
  sealed trait `visible-blurred`
    extends StObject
       with XRVisibilityState
  @scala.inline
  def `visible-blurred`: `visible-blurred` = "visible-blurred".asInstanceOf[`visible-blurred`]
}
