package typings.synaptic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Activationsentences extends StObject {
    
    var activation_sentences: Any
    
    var inputs: Any
    
    var layers: Any
    
    var memory: Any
    
    var neurons: Any
    
    var outputs: Any
    
    var propagation_sentences: Any
    
    var targets: Any
    
    var trace_sentences: Any
    
    var variables: Any
  }
  object Activationsentences {
    
    inline def apply(
      activation_sentences: Any,
      inputs: Any,
      layers: Any,
      memory: Any,
      neurons: Any,
      outputs: Any,
      propagation_sentences: Any,
      targets: Any,
      trace_sentences: Any,
      variables: Any
    ): Activationsentences = {
      val __obj = js.Dynamic.literal(activation_sentences = activation_sentences.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], neurons = neurons.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], propagation_sentences = propagation_sentences.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], trace_sentences = trace_sentences.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[Activationsentences]
    }
    
    extension [Self <: Activationsentences](x: Self) {
      
      inline def setActivation_sentences(value: Any): Self = StObject.set(x, "activation_sentences", value.asInstanceOf[js.Any])
      
      inline def setInputs(value: Any): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setLayers(value: Any): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setMemory(value: Any): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setNeurons(value: Any): Self = StObject.set(x, "neurons", value.asInstanceOf[js.Any])
      
      inline def setOutputs(value: Any): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setPropagation_sentences(value: Any): Self = StObject.set(x, "propagation_sentences", value.asInstanceOf[js.Any])
      
      inline def setTargets(value: Any): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTrace_sentences(value: Any): Self = StObject.set(x, "trace_sentences", value.asInstanceOf[js.Any])
      
      inline def setVariables(value: Any): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
  
  trait Code extends StObject {
    
    var code: String
    
    var link: String
  }
  object Code {
    
    inline def apply(code: String, link: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    }
  }
  
  trait Connection extends StObject {
    
    var connection: Any
    
    var result: Any
  }
  object Connection {
    
    inline def apply(connection: Any, result: Any): Connection = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connection]
    }
    
    extension [Self <: Connection](x: Self) {
      
      inline def setConnection(value: Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Connections extends StObject {
    
    var connections: Double
    
    var neurons: Double
  }
  object Connections {
    
    inline def apply(connections: Double, neurons: Double): Connections = {
      val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any], neurons = neurons.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connections]
    }
    
    extension [Self <: Connections](x: Self) {
      
      inline def setConnections(value: Double): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      inline def setNeurons(value: Double): Self = StObject.set(x, "neurons", value.asInstanceOf[js.Any])
    }
  }
  
  trait Test extends StObject {
    
    var test: Any
    
    var train: Any
  }
  object Test {
    
    inline def apply(test: Any, train: Any): Test = {
      val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any], train = train.asInstanceOf[js.Any])
      __obj.asInstanceOf[Test]
    }
    
    extension [Self <: Test](x: Self) {
      
      inline def setTest(value: Any): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTrain(value: Any): Self = StObject.set(x, "train", value.asInstanceOf[js.Any])
    }
  }
}
