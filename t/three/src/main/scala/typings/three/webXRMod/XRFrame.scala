package typings.three.webXRMod

import typings.three.anon.DetectedPlanes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRFrame extends js.Object {
  
  def createAnchor(pose: XRRigidTransform, space: XRSpace): js.Promise[XRAnchor] = js.native
  
  // AR
  def getHitTestResults(hitTestSource: XRHitTestSource): js.Array[XRHitTestResult] = js.native
  
  def getHitTestResultsForTransientInput(hitTestSource: XRTransientInputHitTestSource): js.Array[XRTransientInputHitTestResult] = js.native
  
  // Hand tracking
  def getJointPose(joint: XRJointSpace, baseSpace: XRSpace): XRJointPose = js.native
  
  def getPose(space: XRSpace, baseSpace: XRSpace): js.UndefOr[XRPose] = js.native
  
  def getViewerPose(referenceSpace: XRReferenceSpace): js.UndefOr[XRViewerPose] = js.native
  
  val session: XRSession = js.native
  
  // Anchors
  var trackedAnchors: js.UndefOr[XRAnchorSet] = js.native
  
  // Planes
  var worldInformation: DetectedPlanes = js.native
}
object XRFrame {
  
  @scala.inline
  def apply(
    createAnchor: (XRRigidTransform, XRSpace) => js.Promise[XRAnchor],
    getHitTestResults: XRHitTestSource => js.Array[XRHitTestResult],
    getHitTestResultsForTransientInput: XRTransientInputHitTestSource => js.Array[XRTransientInputHitTestResult],
    getJointPose: (XRJointSpace, XRSpace) => XRJointPose,
    getPose: (XRSpace, XRSpace) => js.UndefOr[XRPose],
    getViewerPose: XRReferenceSpace => js.UndefOr[XRViewerPose],
    session: XRSession,
    worldInformation: DetectedPlanes
  ): XRFrame = {
    val __obj = js.Dynamic.literal(createAnchor = js.Any.fromFunction2(createAnchor), getHitTestResults = js.Any.fromFunction1(getHitTestResults), getHitTestResultsForTransientInput = js.Any.fromFunction1(getHitTestResultsForTransientInput), getJointPose = js.Any.fromFunction2(getJointPose), getPose = js.Any.fromFunction2(getPose), getViewerPose = js.Any.fromFunction1(getViewerPose), session = session.asInstanceOf[js.Any], worldInformation = worldInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRFrame]
  }
  
  @scala.inline
  implicit class XRFrameOps[Self <: XRFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateAnchor(value: (XRRigidTransform, XRSpace) => js.Promise[XRAnchor]): Self = this.set("createAnchor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetHitTestResults(value: XRHitTestSource => js.Array[XRHitTestResult]): Self = this.set("getHitTestResults", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHitTestResultsForTransientInput(value: XRTransientInputHitTestSource => js.Array[XRTransientInputHitTestResult]): Self = this.set("getHitTestResultsForTransientInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetJointPose(value: (XRJointSpace, XRSpace) => XRJointPose): Self = this.set("getJointPose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetPose(value: (XRSpace, XRSpace) => js.UndefOr[XRPose]): Self = this.set("getPose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetViewerPose(value: XRReferenceSpace => js.UndefOr[XRViewerPose]): Self = this.set("getViewerPose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSession(value: XRSession): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldInformation(value: DetectedPlanes): Self = this.set("worldInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackedAnchors(value: XRAnchorSet): Self = this.set("trackedAnchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackedAnchors: Self = this.set("trackedAnchors", js.undefined)
  }
}
