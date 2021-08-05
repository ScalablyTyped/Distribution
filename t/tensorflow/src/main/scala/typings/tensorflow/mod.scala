package typings.tensorflow

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tensorflow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Types extends StObject
  // TODO: This is an initial stab - work in progress.
  @JSImport("tensorflow", "Types")
  @js.native
  object Types extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Types & Double] = js.native
    
    @js.native
    sealed trait float
      extends StObject
         with Types
    /* 1 */ val float: typings.tensorflow.mod.Types.float & Double = js.native
    
    @js.native
    sealed trait int32
      extends StObject
         with Types
    /* 3 */ val int32: typings.tensorflow.mod.Types.int32 & Double = js.native
  }
  
  inline def graph(graphDef: String): Graph_ = ^.asInstanceOf[js.Dynamic].applyDynamic("graph")(graphDef.asInstanceOf[js.Any]).asInstanceOf[Graph_]
  inline def graph(graphDef: js.Object): Graph_ = ^.asInstanceOf[js.Dynamic].applyDynamic("graph")(graphDef.asInstanceOf[js.Any]).asInstanceOf[Graph_]
  inline def graph(graphDef: Buffer): Graph_ = ^.asInstanceOf[js.Dynamic].applyDynamic("graph")(graphDef.asInstanceOf[js.Any]).asInstanceOf[Graph_]
  
  inline def tensor(value: Buffer): Tensor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(value.asInstanceOf[js.Any]).asInstanceOf[Tensor_]
  inline def tensor(value: Buffer, `type`: Unit, shape: js.Array[Double]): Tensor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor_]
  inline def tensor(value: Buffer, `type`: Types): Tensor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Tensor_]
  inline def tensor(value: Buffer, `type`: Types, shape: js.Array[Double]): Tensor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor_]
  inline def tensor(value: TensorValue): Tensor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(value.asInstanceOf[js.Any]).asInstanceOf[Tensor_]
  inline def tensor(value: TensorValue, `type`: Unit, shape: js.Array[Double]): Tensor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor_]
  inline def tensor(value: TensorValue, `type`: Types): Tensor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Tensor_]
  inline def tensor(value: TensorValue, `type`: Types, shape: js.Array[Double]): Tensor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor_]
  
  trait Graph_ extends StObject {
    
    def createSession(): Session
    
    def delete(): js.Any
  }
  object Graph_ {
    
    inline def apply(createSession: () => Session, delete: () => js.Any): Graph_ = {
      val __obj = js.Dynamic.literal(createSession = js.Any.fromFunction0(createSession), delete = js.Any.fromFunction0(delete))
      __obj.asInstanceOf[Graph_]
    }
    
    extension [Self <: Graph_](x: Self) {
      
      inline def setCreateSession(value: () => Session): Self = StObject.set(x, "createSession", js.Any.fromFunction0(value))
      
      inline def setDelete(value: () => js.Any): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
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
  
  trait Tensor_ extends StObject {
    
    var shape: js.Array[Double]
    
    var `type`: Types
    
    var value: Buffer | TensorValue
  }
  object Tensor_ {
    
    inline def apply(shape: js.Array[Double], `type`: Types, value: Buffer | TensorValue): Tensor_ = {
      val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tensor_]
    }
    
    extension [Self <: Tensor_](x: Self) {
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value :_*))
      
      inline def setType(value: Types): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Buffer | TensorValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: ((js.Array[(js.Array[js.Array[TensorData] | TensorData]) | TensorData]) | TensorData)*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
