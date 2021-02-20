package typings.webxr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRHitTestResult extends StObject {
  
  // When anchor system is enabled
  var createAnchor: js.UndefOr[js.Function1[/* pose */ XRRigidTransform, js.Promise[XRAnchor]]] = js.native
  
  def getPose(baseSpace: XRSpace): js.UndefOr[XRPose] = js.native
}
object XRHitTestResult {
  
  @scala.inline
  def apply(getPose: XRSpace => js.UndefOr[XRPose]): XRHitTestResult = {
    val __obj = js.Dynamic.literal(getPose = js.Any.fromFunction1(getPose))
    __obj.asInstanceOf[XRHitTestResult]
  }
  
  @scala.inline
  implicit class XRHitTestResultMutableBuilder[Self <: XRHitTestResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateAnchor(value: /* pose */ XRRigidTransform => js.Promise[XRAnchor]): Self = StObject.set(x, "createAnchor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateAnchorUndefined: Self = StObject.set(x, "createAnchor", js.undefined)
    
    @scala.inline
    def setGetPose(value: XRSpace => js.UndefOr[XRPose]): Self = StObject.set(x, "getPose", js.Any.fromFunction1(value))
  }
}
