package typings.synaptic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Activationsentences extends StObject {
    
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
  
  @js.native
  trait Code extends StObject {
    
    var code: String = js.native
    
    var link: String = js.native
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
  
  @js.native
  trait Connection extends StObject {
    
    var connection: js.Any = js.native
    
    var result: js.Any = js.native
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
  
  @js.native
  trait Connections extends StObject {
    
    var connections: Double = js.native
    
    var neurons: Double = js.native
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
  
  @js.native
  trait Test extends StObject {
    
    var test: js.Any = js.native
    
    var train: js.Any = js.native
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
