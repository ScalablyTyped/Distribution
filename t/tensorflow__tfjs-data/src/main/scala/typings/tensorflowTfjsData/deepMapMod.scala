package typings.tensorflowTfjsData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deepMapMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/util/deep_map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canTensorify(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canTensorify")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def deepMap(input: js.Any, mapFn: js.Function1[/* x */ js.Any, DeepMapResult]): js.Any | js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("deepMap")(input.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[js.Any | js.Array[js.Any]]
  
  inline def deepMapAndAwaitAll(input: js.Any, mapFn: js.Function1[/* x */ js.Any, DeepMapAsyncResult]): js.Promise[js.Any | js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("deepMapAndAwaitAll")(input.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any | js.Array[js.Any]]]
  
  inline def deepZip(inputs: js.Array[js.Any]): js.Any | js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepZip")(inputs.asInstanceOf[js.Any]).asInstanceOf[js.Any | js.Array[js.Any]]
  inline def deepZip(inputs: js.Array[js.Any], zipFn: js.Function1[/* xs */ js.Array[js.Any], DeepMapResult]): js.Any | js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("deepZip")(inputs.asInstanceOf[js.Any], zipFn.asInstanceOf[js.Any])).asInstanceOf[js.Any | js.Array[js.Any]]
  
  inline def isIterable(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def zipToList(x: js.Array[js.Any]): DeepMapResult = ^.asInstanceOf[js.Dynamic].applyDynamic("zipToList")(x.asInstanceOf[js.Any]).asInstanceOf[DeepMapResult]
  
  trait DeepMapAsyncResult extends StObject {
    
    var recurse: Boolean
    
    var value: js.Promise[js.Any]
  }
  object DeepMapAsyncResult {
    
    inline def apply(recurse: Boolean, value: js.Promise[js.Any]): DeepMapAsyncResult = {
      val __obj = js.Dynamic.literal(recurse = recurse.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeepMapAsyncResult]
    }
    
    extension [Self <: DeepMapAsyncResult](x: Self) {
      
      inline def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Promise[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeepMapResult extends StObject {
    
    var recurse: Boolean
    
    var value: js.Any
  }
  object DeepMapResult {
    
    inline def apply(recurse: Boolean, value: js.Any): DeepMapResult = {
      val __obj = js.Dynamic.literal(recurse = recurse.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeepMapResult]
    }
    
    extension [Self <: DeepMapResult](x: Self) {
      
      inline def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
