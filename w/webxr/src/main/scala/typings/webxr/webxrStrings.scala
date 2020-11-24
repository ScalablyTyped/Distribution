package typings.webxr

import typings.webxr.mod.XREnvironmentBlendMode
import typings.webxr.mod.XREventType
import typings.webxr.mod.XREye
import typings.webxr.mod.XRHandedness
import typings.webxr.mod.XRReferenceSpaceType
import typings.webxr.mod.XRSessionMode
import typings.webxr.mod.XRTargetRayMode
import typings.webxr.mod.XRVisibilityState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webxrStrings {
  
  @scala.inline
  def Horizontal: Horizontal = "Horizontal".asInstanceOf[Horizontal]
  
  @scala.inline
  def Vertical: Vertical = "Vertical".asInstanceOf[Vertical]
  
  @scala.inline
  def additive: additive = "additive".asInstanceOf[additive]
  
  @scala.inline
  def `alpha-blend`: `alpha-blend` = "alpha-blend".asInstanceOf[`alpha-blend`]
  
  @scala.inline
  def `bounded-floor`: `bounded-floor` = "bounded-floor".asInstanceOf[`bounded-floor`]
  
  @scala.inline
  def devicechange: devicechange = "devicechange".asInstanceOf[devicechange]
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @scala.inline
  def gaze: gaze = "gaze".asInstanceOf[gaze]
  
  @scala.inline
  def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @scala.inline
  def `immersive-ar`: `immersive-ar` = "immersive-ar".asInstanceOf[`immersive-ar`]
  
  @scala.inline
  def `immersive-vr`: `immersive-vr` = "immersive-vr".asInstanceOf[`immersive-vr`]
  
  @scala.inline
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @scala.inline
  def inputsourceschange: inputsourceschange = "inputsourceschange".asInstanceOf[inputsourceschange]
  
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  
  @scala.inline
  def `local-floor`: `local-floor` = "local-floor".asInstanceOf[`local-floor`]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def opaque: opaque = "opaque".asInstanceOf[opaque]
  
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @scala.inline
  def screen: screen = "screen".asInstanceOf[screen]
  
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  
  @scala.inline
  def selectend: selectend = "selectend".asInstanceOf[selectend]
  
  @scala.inline
  def selectstart: selectstart = "selectstart".asInstanceOf[selectstart]
  
  @scala.inline
  def squeeze: squeeze = "squeeze".asInstanceOf[squeeze]
  
  @scala.inline
  def squeezeend: squeezeend = "squeezeend".asInstanceOf[squeezeend]
  
  @scala.inline
  def squeezestart: squeezestart = "squeezestart".asInstanceOf[squeezestart]
  
  @scala.inline
  def `tracked-pointer`: `tracked-pointer` = "tracked-pointer".asInstanceOf[`tracked-pointer`]
  
  @scala.inline
  def unbounded: unbounded = "unbounded".asInstanceOf[unbounded]
  
  @scala.inline
  def viewer: viewer = "viewer".asInstanceOf[viewer]
  
  @scala.inline
  def visibilitychange: visibilitychange = "visibilitychange".asInstanceOf[visibilitychange]
  
  @scala.inline
  def visible: visible = "visible".asInstanceOf[visible]
  
  @scala.inline
  def `visible-blurred`: `visible-blurred` = "visible-blurred".asInstanceOf[`visible-blurred`]
  
  @js.native
  sealed trait Horizontal extends js.Object
  
  @js.native
  sealed trait Vertical extends js.Object
  
  @js.native
  sealed trait additive extends XREnvironmentBlendMode
  
  @js.native
  sealed trait `alpha-blend` extends XREnvironmentBlendMode
  
  @js.native
  sealed trait `bounded-floor` extends XRReferenceSpaceType
  
  @js.native
  sealed trait devicechange extends XREventType
  
  @js.native
  sealed trait end extends XREventType
  
  @js.native
  sealed trait gaze extends XRTargetRayMode
  
  @js.native
  sealed trait hidden extends XRVisibilityState
  
  @js.native
  sealed trait `immersive-ar` extends XRSessionMode
  
  @js.native
  sealed trait `immersive-vr` extends XRSessionMode
  
  @js.native
  sealed trait `inline` extends XRSessionMode
  
  @js.native
  sealed trait inputsourceschange extends XREventType
  
  @js.native
  sealed trait left
    extends XREye
       with XRHandedness
  
  @js.native
  sealed trait local extends XRReferenceSpaceType
  
  @js.native
  sealed trait `local-floor` extends XRReferenceSpaceType
  
  @js.native
  sealed trait none
    extends XREye
       with XRHandedness
  
  @js.native
  sealed trait opaque extends XREnvironmentBlendMode
  
  @js.native
  sealed trait reset extends XREventType
  
  @js.native
  sealed trait right
    extends XREye
       with XRHandedness
  
  @js.native
  sealed trait screen extends XRTargetRayMode
  
  @js.native
  sealed trait select extends XREventType
  
  @js.native
  sealed trait selectend extends XREventType
  
  @js.native
  sealed trait selectstart extends XREventType
  
  @js.native
  sealed trait squeeze extends XREventType
  
  @js.native
  sealed trait squeezeend extends XREventType
  
  @js.native
  sealed trait squeezestart extends XREventType
  
  @js.native
  sealed trait `tracked-pointer` extends XRTargetRayMode
  
  @js.native
  sealed trait unbounded extends XRReferenceSpaceType
  
  @js.native
  sealed trait viewer extends XRReferenceSpaceType
  
  @js.native
  sealed trait visibilitychange extends XREventType
  
  @js.native
  sealed trait visible extends XRVisibilityState
  
  @js.native
  sealed trait `visible-blurred` extends XRVisibilityState
}
