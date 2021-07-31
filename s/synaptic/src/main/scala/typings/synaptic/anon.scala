package typings.synaptic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Activationsentences extends StObject {
    
    var activation_sentences: js.Any
    
    var inputs: js.Any
    
    var layers: js.Any
    
    var memory: js.Any
    
    var neurons: js.Any
    
    var outputs: js.Any
    
    var propagation_sentences: js.Any
    
    var targets: js.Any
    
    var trace_sentences: js.Any
    
    var variables: js.Any
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
    implicit class ActivationsentencesMutableBuilder[Self <: Activationsentences] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivation_sentences(value: js.Any): Self = StObject.set(x, "activation_sentences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputs(value: js.Any): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayers(value: js.Any): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemory(value: js.Any): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeurons(value: js.Any): Self = StObject.set(x, "neurons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputs(value: js.Any): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropagation_sentences(value: js.Any): Self = StObject.set(x, "propagation_sentences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargets(value: js.Any): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrace_sentences(value: js.Any): Self = StObject.set(x, "trace_sentences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariables(value: js.Any): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
  
  trait Code extends StObject {
    
    var code: String
    
    var link: String
  }
  object Code {
    
    @scala.inline
    def apply(code: String, link: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    }
  }
  
  trait Connection extends StObject {
    
    var connection: js.Any
    
    var result: js.Any
  }
  object Connection {
    
    @scala.inline
    def apply(connection: js.Any, result: js.Any): Connection = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connection]
    }
    
    @scala.inline
    implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnection(value: js.Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Connections extends StObject {
    
    var connections: Double
    
    var neurons: Double
  }
  object Connections {
    
    @scala.inline
    def apply(connections: Double, neurons: Double): Connections = {
      val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any], neurons = neurons.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connections]
    }
    
    @scala.inline
    implicit class ConnectionsMutableBuilder[Self <: Connections] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnections(value: Double): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeurons(value: Double): Self = StObject.set(x, "neurons", value.asInstanceOf[js.Any])
    }
  }
  
  trait Test extends StObject {
    
    var test: js.Any
    
    var train: js.Any
  }
  object Test {
    
    @scala.inline
    def apply(test: js.Any, train: js.Any): Test = {
      val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any], train = train.asInstanceOf[js.Any])
      __obj.asInstanceOf[Test]
    }
    
    @scala.inline
    implicit class TestMutableBuilder[Self <: Test] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTest(value: js.Any): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrain(value: js.Any): Self = StObject.set(x, "train", value.asInstanceOf[js.Any])
    }
  }
}
