package typings.three.webXRMod

import typings.three.anon.DetectedPlanes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRFrame extends StObject {
  
  def createAnchor(pose: XRRigidTransform, space: XRSpace): js.Promise[XRAnchor]
  
  // AR
  def getHitTestResults(hitTestSource: XRHitTestSource): js.Array[XRHitTestResult]
  
  def getHitTestResultsForTransientInput(hitTestSource: XRTransientInputHitTestSource): js.Array[XRTransientInputHitTestResult]
  
  // Hand tracking
  def getJointPose(joint: XRJointSpace, baseSpace: XRSpace): XRJointPose
  
  def getPose(space: XRSpace, baseSpace: XRSpace): js.UndefOr[XRPose]
  
  def getViewerPose(referenceSpace: XRReferenceSpace): js.UndefOr[XRViewerPose]
  
  val session: XRSession
  
  // Anchors
  var trackedAnchors: js.UndefOr[XRAnchorSet] = js.undefined
  
  // Planes
  var worldInformation: DetectedPlanes
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
  implicit class XRFrameMutableBuilder[Self <: XRFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateAnchor(value: (XRRigidTransform, XRSpace) => js.Promise[XRAnchor]): Self = StObject.set(x, "createAnchor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetHitTestResults(value: XRHitTestSource => js.Array[XRHitTestResult]): Self = StObject.set(x, "getHitTestResults", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHitTestResultsForTransientInput(value: XRTransientInputHitTestSource => js.Array[XRTransientInputHitTestResult]): Self = StObject.set(x, "getHitTestResultsForTransientInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetJointPose(value: (XRJointSpace, XRSpace) => XRJointPose): Self = StObject.set(x, "getJointPose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetPose(value: (XRSpace, XRSpace) => js.UndefOr[XRPose]): Self = StObject.set(x, "getPose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetViewerPose(value: XRReferenceSpace => js.UndefOr[XRViewerPose]): Self = StObject.set(x, "getViewerPose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSession(value: XRSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackedAnchors(value: XRAnchorSet): Self = StObject.set(x, "trackedAnchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackedAnchorsUndefined: Self = StObject.set(x, "trackedAnchors", js.undefined)
    
    @scala.inline
    def setWorldInformation(value: DetectedPlanes): Self = StObject.set(x, "worldInformation", value.asInstanceOf[js.Any])
  }
}
