package typings.tensorflow

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait Types extends StObject
  // TODO: This is an initial stab - work in progress.
  @JSImport("tensorflow", "Types")
  @js.native
  object Types extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Types with Double] = js.native
    
    @js.native
    sealed trait float extends Types
    /* 1 */ val float: typings.tensorflow.mod.Types.float with Double = js.native
    
    @js.native
    sealed trait int32 extends Types
    /* 3 */ val int32: typings.tensorflow.mod.Types.int32 with Double = js.native
  }
  
  @JSImport("tensorflow", "graph")
  @js.native
  def graph(graphDef: String): Graph_ = js.native
  @JSImport("tensorflow", "graph")
  @js.native
  def graph(graphDef: js.Object): Graph_ = js.native
  @JSImport("tensorflow", "graph")
  @js.native
  def graph(graphDef: Buffer): Graph_ = js.native
  
  @JSImport("tensorflow", "tensor")
  @js.native
  def tensor(value: Buffer): Tensor_ = js.native
  @JSImport("tensorflow", "tensor")
  @js.native
  def tensor(value: Buffer, `type`: js.UndefOr[scala.Nothing], shape: js.Array[Double]): Tensor_ = js.native
  @JSImport("tensorflow", "tensor")
  @js.native
  def tensor(value: Buffer, `type`: Types): Tensor_ = js.native
  @JSImport("tensorflow", "tensor")
  @js.native
  def tensor(value: Buffer, `type`: Types, shape: js.Array[Double]): Tensor_ = js.native
  @JSImport("tensorflow", "tensor")
  @js.native
  def tensor(value: TensorValue): Tensor_ = js.native
  @JSImport("tensorflow", "tensor")
  @js.native
  def tensor(value: TensorValue, `type`: js.UndefOr[scala.Nothing], shape: js.Array[Double]): Tensor_ = js.native
  @JSImport("tensorflow", "tensor")
  @js.native
  def tensor(value: TensorValue, `type`: Types): Tensor_ = js.native
  @JSImport("tensorflow", "tensor")
  @js.native
  def tensor(value: TensorValue, `type`: Types, shape: js.Array[Double]): Tensor_ = js.native
  
  @js.native
  trait Graph_ extends StObject {
    
    def createSession(): Session = js.native
    
    def delete(): js.Any = js.native
  }
  object Graph_ {
    
    @scala.inline
    def apply(createSession: () => Session, delete: () => js.Any): Graph_ = {
      val __obj = js.Dynamic.literal(createSession = js.Any.fromFunction0(createSession), delete = js.Any.fromFunction0(delete))
      __obj.asInstanceOf[Graph_]
    }
    
    @scala.inline
    implicit class Graph_MutableBuilder[Self <: Graph_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateSession(value: () => Session): Self = StObject.set(x, "createSession", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDelete(value: () => js.Any): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Session extends StObject {
    
    def delete(): js.Any = js.native
    
    def run(inputs: SessionRunInputs, outputs: SessionRunOutputs): SessionRunResult = js.native
    def run(inputs: SessionRunInputs, outputs: SessionRunOutputs, targets: SessionRunTargets): SessionRunResult = js.native
  }
  
  type SessionRunInputs = StringDictionary[Tensor_ | TensorValue]
  
  type SessionRunOutputs = String | js.Array[String]
  
  type SessionRunResult = Tensor_ | TensorMap
  
  type SessionRunTargets = String | js.Array[String]
  
  type TensorData = Number
  
  type TensorMap = StringDictionary[Tensor_]
  
  type TensorValue = TensorData | (js.Array[
    (js.Array[(js.Array[js.Array[TensorData] | TensorData]) | TensorData]) | TensorData
  ])
  
  @js.native
  trait Tensor_ extends StObject {
    
    var shape: js.Array[Double] = js.native
    
    var `type`: Types = js.native
    
    var value: Buffer | TensorValue = js.native
  }
  object Tensor_ {
    
    @scala.inline
    def apply(shape: js.Array[Double], `type`: Types, value: Buffer | TensorValue): Tensor_ = {
      val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tensor_]
    }
    
    @scala.inline
    implicit class Tensor_MutableBuilder[Self <: Tensor_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value :_*))
      
      @scala.inline
      def setType(value: Types): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Buffer | TensorValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: ((js.Array[(js.Array[js.Array[TensorData] | TensorData]) | TensorData]) | TensorData)*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
