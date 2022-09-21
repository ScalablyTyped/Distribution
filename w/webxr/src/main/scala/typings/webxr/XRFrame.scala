package typings.webxr

import typings.std.DOMHighResTimeStamp
import typings.webxr.anon.DetectedPlanes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a snapshot of the state of all of the tracked objects for an XRSession. Applications
  * can acquire an XRFrame by calling requestAnimationFrame() on an XRSession with an
  * XRFrameRequestCallback. When the callback is called it will be passed an XRFrame.
  * Events which need to communicate tracking state, such as the select event, will also provide an
  * XRFrame.
  *
  * ref: https://immersive-web.github.io/webxr/#xrframe-interface
  */
trait XRFrame extends StObject {
  
  var createAnchor: js.UndefOr[
    js.Function2[/* pose */ XRRigidTransform, /* space */ XRSpace, js.UndefOr[js.Promise[XRAnchor]]]
  ] = js.undefined
  
  def getHitTestResults(hitTestSource: XRHitTestSource): js.Array[XRHitTestResult]
  
  def getHitTestResultsForTransientInput(hitTestSource: XRTransientInputHitTestSource): js.Array[XRTransientInputHitTestResult]
  
  var getJointPose: js.UndefOr[
    js.Function2[/* joint */ XRJointSpace, /* baseSpace */ XRSpace, js.UndefOr[XRJointPose]]
  ] = js.undefined
  
  /**
    * Provides the pose of space relative to baseSpace as an XRPose, at the time represented by
    * the XRFrame.
    *
    * @param space
    * @param baseSpace
    */
  def getPose(space: XRSpace, baseSpace: XRSpace): js.UndefOr[XRPose]
  
  /**
    * Provides the pose of the viewer relative to referenceSpace as an XRViewerPose, at the
    * XRFrame's time.
    *
    * @param referenceSpace
    */
  def getViewerPose(referenceSpace: XRReferenceSpace): js.UndefOr[XRViewerPose]
  
  val predictedDisplayTime: DOMHighResTimeStamp
  
  val session: XRSession
  
  var trackedAnchors: js.UndefOr[XRAnchorSet] = js.undefined
  
  var worldInformation: js.UndefOr[DetectedPlanes] = js.undefined
}
object XRFrame {
  
  inline def apply(
    getHitTestResults: XRHitTestSource => js.Array[XRHitTestResult],
    getHitTestResultsForTransientInput: XRTransientInputHitTestSource => js.Array[XRTransientInputHitTestResult],
    getPose: (XRSpace, XRSpace) => js.UndefOr[XRPose],
    getViewerPose: XRReferenceSpace => js.UndefOr[XRViewerPose],
    predictedDisplayTime: DOMHighResTimeStamp,
    session: XRSession
  ): XRFrame = {
    val __obj = js.Dynamic.literal(getHitTestResults = js.Any.fromFunction1(getHitTestResults), getHitTestResultsForTransientInput = js.Any.fromFunction1(getHitTestResultsForTransientInput), getPose = js.Any.fromFunction2(getPose), getViewerPose = js.Any.fromFunction1(getViewerPose), predictedDisplayTime = predictedDisplayTime.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRFrame]
  }
  
  extension [Self <: XRFrame](x: Self) {
    
    inline def setCreateAnchor(value: (/* pose */ XRRigidTransform, /* space */ XRSpace) => js.UndefOr[js.Promise[XRAnchor]]): Self = StObject.set(x, "createAnchor", js.Any.fromFunction2(value))
    
    inline def setCreateAnchorUndefined: Self = StObject.set(x, "createAnchor", js.undefined)
    
    inline def setGetHitTestResults(value: XRHitTestSource => js.Array[XRHitTestResult]): Self = StObject.set(x, "getHitTestResults", js.Any.fromFunction1(value))
    
    inline def setGetHitTestResultsForTransientInput(value: XRTransientInputHitTestSource => js.Array[XRTransientInputHitTestResult]): Self = StObject.set(x, "getHitTestResultsForTransientInput", js.Any.fromFunction1(value))
    
    inline def setGetJointPose(value: (/* joint */ XRJointSpace, /* baseSpace */ XRSpace) => js.UndefOr[XRJointPose]): Self = StObject.set(x, "getJointPose", js.Any.fromFunction2(value))
    
    inline def setGetJointPoseUndefined: Self = StObject.set(x, "getJointPose", js.undefined)
    
    inline def setGetPose(value: (XRSpace, XRSpace) => js.UndefOr[XRPose]): Self = StObject.set(x, "getPose", js.Any.fromFunction2(value))
    
    inline def setGetViewerPose(value: XRReferenceSpace => js.UndefOr[XRViewerPose]): Self = StObject.set(x, "getViewerPose", js.Any.fromFunction1(value))
    
    inline def setPredictedDisplayTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "predictedDisplayTime", value.asInstanceOf[js.Any])
    
    inline def setSession(value: XRSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setTrackedAnchors(value: XRAnchorSet): Self = StObject.set(x, "trackedAnchors", value.asInstanceOf[js.Any])
    
    inline def setTrackedAnchorsUndefined: Self = StObject.set(x, "trackedAnchors", js.undefined)
    
    inline def setWorldInformation(value: DetectedPlanes): Self = StObject.set(x, "worldInformation", value.asInstanceOf[js.Any])
    
    inline def setWorldInformationUndefined: Self = StObject.set(x, "worldInformation", js.undefined)
  }
}
