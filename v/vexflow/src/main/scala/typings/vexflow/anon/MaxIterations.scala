package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxIterations extends js.Object {
  
  var maxIterations: js.UndefOr[Double] = js.native
  
  var softmaxFactor: js.UndefOr[Double] = js.native
}
object MaxIterations {
  
  @scala.inline
  def apply(): MaxIterations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxIterations]
  }
  
  @scala.inline
  implicit class MaxIterationsOps[Self <: MaxIterations] (val x: Self) extends AnyVal {
    
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
    def setMaxIterations(value: Double): Self = this.set("maxIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxIterations: Self = this.set("maxIterations", js.undefined)
    
    @scala.inline
    def setSoftmaxFactor(value: Double): Self = this.set("softmaxFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftmaxFactor: Self = this.set("softmaxFactor", js.undefined)
  }
}
