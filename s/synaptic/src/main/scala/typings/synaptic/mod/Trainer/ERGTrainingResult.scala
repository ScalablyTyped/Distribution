package typings.synaptic.mod.Trainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ERGTrainingResult extends js.Object {
  
  var error: Double = js.native
  
  var generate: js.Any = js.native
  
  var iterations: Double = js.native
  
  var test: js.Any = js.native
  
  var time: Double = js.native
}
object ERGTrainingResult {
  
  @scala.inline
  def apply(error: Double, generate: js.Any, iterations: Double, test: js.Any, time: Double): ERGTrainingResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], generate = generate.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ERGTrainingResult]
  }
  
  @scala.inline
  implicit class ERGTrainingResultOps[Self <: ERGTrainingResult] (val x: Self) extends AnyVal {
    
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
    def setError(value: Double): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerate(value: js.Any): Self = this.set("generate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: js.Any): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
  }
}
