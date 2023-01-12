package typings.tensorflowTfjsData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilDeepMapMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/util/deep_map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canTensorify(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canTensorify")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def deepMap(input: Any, mapFn: js.Function1[/* x */ Any, DeepMapResult]): Any | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("deepMap")(input.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[Any | js.Array[Any]]
  
  inline def deepMapAndAwaitAll(input: Any, mapFn: js.Function1[/* x */ Any, DeepMapAsyncResult]): js.Promise[Any | js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("deepMapAndAwaitAll")(input.asInstanceOf[js.Any], mapFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any | js.Array[Any]]]
  
  inline def deepZip(inputs: js.Array[Any]): Any | js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepZip")(inputs.asInstanceOf[js.Any]).asInstanceOf[Any | js.Array[Any]]
  inline def deepZip(inputs: js.Array[Any], zipFn: js.Function1[/* xs */ js.Array[Any], DeepMapResult]): Any | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("deepZip")(inputs.asInstanceOf[js.Any], zipFn.asInstanceOf[js.Any])).asInstanceOf[Any | js.Array[Any]]
  
  inline def isIterable(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def zipToList(x: js.Array[Any]): DeepMapResult = ^.asInstanceOf[js.Dynamic].applyDynamic("zipToList")(x.asInstanceOf[js.Any]).asInstanceOf[DeepMapResult]
  
  trait DeepMapAsyncResult extends StObject {
    
    var recurse: Boolean
    
    var value: js.Promise[Any]
  }
  object DeepMapAsyncResult {
    
    inline def apply(recurse: Boolean, value: js.Promise[Any]): DeepMapAsyncResult = {
      val __obj = js.Dynamic.literal(recurse = recurse.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeepMapAsyncResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeepMapAsyncResult] (val x: Self) extends AnyVal {
      
      inline def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Promise[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeepMapResult extends StObject {
    
    var recurse: Boolean
    
    var value: Any
  }
  object DeepMapResult {
    
    inline def apply(recurse: Boolean, value: Any): DeepMapResult = {
      val __obj = js.Dynamic.literal(recurse = recurse.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeepMapResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeepMapResult] (val x: Self) extends AnyVal {
      
      inline def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
