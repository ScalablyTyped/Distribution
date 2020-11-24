package typings.synaptic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Activationsentences extends js.Object {
  
  var activation_sentences: js.Any = js.native
  
  var inputs: js.Any = js.native
  
  var layers: js.Any = js.native
  
  var memory: js.Any = js.native
  
  var neurons: js.Any = js.native
  
  var outputs: js.Any = js.native
  
  var propagation_sentences: js.Any = js.native
  
  var targets: js.Any = js.native
  
  var trace_sentences: js.Any = js.native
  
  var variables: js.Any = js.native
}
object Activationsentences {
  
  @scala.inline
  def apply(
    activation_sentences: js.Any,
    inputs: js.Any,
    layers: js.Any,
    memory: js.Any,
    neurons: js.Any,
    outputs: js.Any,
    propagation_sentences: js.Any,
    targets: js.Any,
    trace_sentences: js.Any,
    variables: js.Any
  ): Activationsentences = {
    val __obj = js.Dynamic.literal(activation_sentences = activation_sentences.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], neurons = neurons.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], propagation_sentences = propagation_sentences.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], trace_sentences = trace_sentences.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activationsentences]
  }
  
  @scala.inline
  implicit class ActivationsentencesOps[Self <: Activationsentences] (val x: Self) extends AnyVal {
    
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
    def setActivation_sentences(value: js.Any): Self = this.set("activation_sentences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: js.Any): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayers(value: js.Any): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemory(value: js.Any): Self = this.set("memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeurons(value: js.Any): Self = this.set("neurons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputs(value: js.Any): Self = this.set("outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagation_sentences(value: js.Any): Self = this.set("propagation_sentences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargets(value: js.Any): Self = this.set("targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrace_sentences(value: js.Any): Self = this.set("trace_sentences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: js.Any): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
}
