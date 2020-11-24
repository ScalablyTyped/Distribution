package typings.three.webXRMod

import typings.three.anon.PlaneDetectionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRSession extends js.Object {
  
  var addEventListener: js.Function = js.native
  
  def cancelAnimationFrame(id: Double): Unit = js.native
  
  def end(): js.Promise[Unit] = js.native
  
  var environmentBlendMode: XREnvironmentBlendMode = js.native
  
  var inputSources: js.Array[XRInputSource] = js.native
  
  var removeEventListener: js.Function = js.native
  
  var renderState: XRRenderState = js.native
  
  def requestAnimationFrame(callback: XRFrameRequestCallback): Double = js.native
  
  // legacy AR hit test
  def requestHitTest(ray: XRRay, referenceSpace: XRReferenceSpace): js.Promise[js.Array[XRHitResult]] = js.native
  
  // hit test
  def requestHitTestSource(options: XRHitTestOptionsInit): js.Promise[XRHitTestSource] = js.native
  
  def requestHitTestSourceForTransientInput(options: XRTransientInputHitTestOptionsInit): js.Promise[XRTransientInputHitTestSource] = js.native
  
  def requestReferenceSpace(`type`: XRReferenceSpaceType): js.Promise[XRReferenceSpace] = js.native
  
  def updateRenderState(renderStateInit: XRRenderStateInit): js.Promise[Unit] = js.native
  
  // legacy plane detection
  def updateWorldTrackingState(options: PlaneDetectionState): Unit = js.native
  
  var visibilityState: XRVisibilityState = js.native
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
  implicit class XRSessionOps[Self <: XRSession] (val x: Self) extends AnyVal {
    
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
    def setAddEventListener(value: js.Function): Self = this.set("addEventListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelAnimationFrame(value: Double => Unit): Self = this.set("cancelAnimationFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnd(value: () => js.Promise[Unit]): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnvironmentBlendMode(value: XREnvironmentBlendMode): Self = this.set("environmentBlendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSourcesVarargs(value: XRInputSource*): Self = this.set("inputSources", js.Array(value :_*))
    
    @scala.inline
    def setInputSources(value: js.Array[XRInputSource]): Self = this.set("inputSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveEventListener(value: js.Function): Self = this.set("removeEventListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderState(value: XRRenderState): Self = this.set("renderState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestAnimationFrame(value: XRFrameRequestCallback => Double): Self = this.set("requestAnimationFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestHitTest(value: (XRRay, XRReferenceSpace) => js.Promise[js.Array[XRHitResult]]): Self = this.set("requestHitTest", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRequestHitTestSource(value: XRHitTestOptionsInit => js.Promise[XRHitTestSource]): Self = this.set("requestHitTestSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestHitTestSourceForTransientInput(value: XRTransientInputHitTestOptionsInit => js.Promise[XRTransientInputHitTestSource]): Self = this.set("requestHitTestSourceForTransientInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestReferenceSpace(value: XRReferenceSpaceType => js.Promise[XRReferenceSpace]): Self = this.set("requestReferenceSpace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateRenderState(value: XRRenderStateInit => js.Promise[Unit]): Self = this.set("updateRenderState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateWorldTrackingState(value: PlaneDetectionState => Unit): Self = this.set("updateWorldTrackingState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisibilityState(value: XRVisibilityState): Self = this.set("visibilityState", value.asInstanceOf[js.Any])
  }
}
