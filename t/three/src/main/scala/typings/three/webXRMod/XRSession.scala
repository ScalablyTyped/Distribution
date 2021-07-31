package typings.three.webXRMod

import typings.three.anon.PlaneDetectionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRSession extends StObject {
  
  var addEventListener: js.Function
  
  def cancelAnimationFrame(id: Double): Unit
  
  def end(): js.Promise[Unit]
  
  var environmentBlendMode: XREnvironmentBlendMode
  
  var inputSources: js.Array[XRInputSource]
  
  var removeEventListener: js.Function
  
  var renderState: XRRenderState
  
  def requestAnimationFrame(callback: XRFrameRequestCallback): Double
  
  // legacy AR hit test
  def requestHitTest(ray: XRRay, referenceSpace: XRReferenceSpace): js.Promise[js.Array[XRHitResult]]
  
  // hit test
  def requestHitTestSource(options: XRHitTestOptionsInit): js.Promise[XRHitTestSource]
  
  def requestHitTestSourceForTransientInput(options: XRTransientInputHitTestOptionsInit): js.Promise[XRTransientInputHitTestSource]
  
  def requestReferenceSpace(`type`: XRReferenceSpaceType): js.Promise[XRReferenceSpace]
  
  def updateRenderState(renderStateInit: XRRenderStateInit): js.Promise[Unit]
  
  // legacy plane detection
  def updateWorldTrackingState(options: PlaneDetectionState): Unit
  
  var visibilityState: XRVisibilityState
}
object XRSession {
  
  @scala.inline
  def apply(
    addEventListener: js.Function,
    cancelAnimationFrame: Double => Unit,
    end: () => js.Promise[Unit],
    environmentBlendMode: XREnvironmentBlendMode,
    inputSources: js.Array[XRInputSource],
    removeEventListener: js.Function,
    renderState: XRRenderState,
    requestAnimationFrame: XRFrameRequestCallback => Double,
    requestHitTest: (XRRay, XRReferenceSpace) => js.Promise[js.Array[XRHitResult]],
    requestHitTestSource: XRHitTestOptionsInit => js.Promise[XRHitTestSource],
    requestHitTestSourceForTransientInput: XRTransientInputHitTestOptionsInit => js.Promise[XRTransientInputHitTestSource],
    requestReferenceSpace: XRReferenceSpaceType => js.Promise[XRReferenceSpace],
    updateRenderState: XRRenderStateInit => js.Promise[Unit],
    updateWorldTrackingState: PlaneDetectionState => Unit,
    visibilityState: XRVisibilityState
  ): XRSession = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], cancelAnimationFrame = js.Any.fromFunction1(cancelAnimationFrame), end = js.Any.fromFunction0(end), environmentBlendMode = environmentBlendMode.asInstanceOf[js.Any], inputSources = inputSources.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any], renderState = renderState.asInstanceOf[js.Any], requestAnimationFrame = js.Any.fromFunction1(requestAnimationFrame), requestHitTest = js.Any.fromFunction2(requestHitTest), requestHitTestSource = js.Any.fromFunction1(requestHitTestSource), requestHitTestSourceForTransientInput = js.Any.fromFunction1(requestHitTestSourceForTransientInput), requestReferenceSpace = js.Any.fromFunction1(requestReferenceSpace), updateRenderState = js.Any.fromFunction1(updateRenderState), updateWorldTrackingState = js.Any.fromFunction1(updateWorldTrackingState), visibilityState = visibilityState.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRSession]
  }
  
  @scala.inline
  implicit class XRSessionMutableBuilder[Self <: XRSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEventListener(value: js.Function): Self = StObject.set(x, "addEventListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelAnimationFrame(value: Double => Unit): Self = StObject.set(x, "cancelAnimationFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnd(value: () => js.Promise[Unit]): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnvironmentBlendMode(value: XREnvironmentBlendMode): Self = StObject.set(x, "environmentBlendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSources(value: js.Array[XRInputSource]): Self = StObject.set(x, "inputSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSourcesVarargs(value: XRInputSource*): Self = StObject.set(x, "inputSources", js.Array(value :_*))
    
    @scala.inline
    def setRemoveEventListener(value: js.Function): Self = StObject.set(x, "removeEventListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderState(value: XRRenderState): Self = StObject.set(x, "renderState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestAnimationFrame(value: XRFrameRequestCallback => Double): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestHitTest(value: (XRRay, XRReferenceSpace) => js.Promise[js.Array[XRHitResult]]): Self = StObject.set(x, "requestHitTest", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRequestHitTestSource(value: XRHitTestOptionsInit => js.Promise[XRHitTestSource]): Self = StObject.set(x, "requestHitTestSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestHitTestSourceForTransientInput(value: XRTransientInputHitTestOptionsInit => js.Promise[XRTransientInputHitTestSource]): Self = StObject.set(x, "requestHitTestSourceForTransientInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestReferenceSpace(value: XRReferenceSpaceType => js.Promise[XRReferenceSpace]): Self = StObject.set(x, "requestReferenceSpace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateRenderState(value: XRRenderStateInit => js.Promise[Unit]): Self = StObject.set(x, "updateRenderState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateWorldTrackingState(value: PlaneDetectionState => Unit): Self = StObject.set(x, "updateWorldTrackingState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisibilityState(value: XRVisibilityState): Self = StObject.set(x, "visibilityState", value.asInstanceOf[js.Any])
  }
}
