package typings.three.webXRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRTransientInputHitTestResult extends js.Object {
  
  val inputSource: XRInputSource = js.native
  
  val results: js.Array[XRHitTestResult] = js.native
}
object XRTransientInputHitTestResult {
  
  @scala.inline
  def apply(inputSource: XRInputSource, results: js.Array[XRHitTestResult]): XRTransientInputHitTestResult = {
    val __obj = js.Dynamic.literal(inputSource = inputSource.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRTransientInputHitTestResult]
  }
  
  @scala.inline
  implicit class XRTransientInputHitTestResultOps[Self <: XRTransientInputHitTestResult] (val x: Self) extends AnyVal {
    
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
    def setInputSource(value: XRInputSource): Self = this.set("inputSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: XRHitTestResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[XRHitTestResult]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
}
