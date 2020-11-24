package typings.synaptic.mod.Trainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingPair extends js.Object {
  
  var input: js.Array[Double] = js.native
  
  var output: js.Array[Double] = js.native
}
object TrainingPair {
  
  @scala.inline
  def apply(input: js.Array[Double], output: js.Array[Double]): TrainingPair = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingPair]
  }
  
  @scala.inline
  implicit class TrainingPairOps[Self <: TrainingPair] (val x: Self) extends AnyVal {
    
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
    def setInputVarargs(value: Double*): Self = this.set("input", js.Array(value :_*))
    
    @scala.inline
    def setInput(value: js.Array[Double]): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputVarargs(value: Double*): Self = this.set("output", js.Array(value :_*))
    
    @scala.inline
    def setOutput(value: js.Array[Double]): Self = this.set("output", value.asInstanceOf[js.Any])
  }
}
