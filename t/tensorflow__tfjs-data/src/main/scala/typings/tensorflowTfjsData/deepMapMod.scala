package typings.tensorflowTfjsData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deepMapMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/util/deep_map", "canTensorify")
  @js.native
  def canTensorify(obj: js.Any): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/util/deep_map", "deepMap")
  @js.native
  def deepMap(input: js.Any, mapFn: js.Function1[/* x */ js.Any, DeepMapResult]): js.Any | js.Array[_] = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/util/deep_map", "deepMapAndAwaitAll")
  @js.native
  def deepMapAndAwaitAll(input: js.Any, mapFn: js.Function1[/* x */ js.Any, DeepMapAsyncResult]): js.Promise[_ | js.Array[_]] = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/util/deep_map", "deepZip")
  @js.native
  def deepZip(inputs: js.Array[_]): js.Any | js.Array[_] = js.native
  @JSImport("@tensorflow/tfjs-data/dist/util/deep_map", "deepZip")
  @js.native
  def deepZip(inputs: js.Array[_], zipFn: js.Function1[/* xs */ js.Array[_], DeepMapResult]): js.Any | js.Array[_] = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/util/deep_map", "isIterable")
  @js.native
  def isIterable(obj: js.Any): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/util/deep_map", "zipToList")
  @js.native
  def zipToList(x: js.Array[_]): DeepMapResult = js.native
  
  @js.native
  trait DeepMapAsyncResult extends StObject {
    
    var recurse: Boolean = js.native
    
    var value: js.Promise[_] = js.native
  }
  object DeepMapAsyncResult {
    
    @scala.inline
    def apply(recurse: Boolean, value: js.Promise[_]): DeepMapAsyncResult = {
      val __obj = js.Dynamic.literal(recurse = recurse.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeepMapAsyncResult]
    }
    
    @scala.inline
    implicit class DeepMapAsyncResultMutableBuilder[Self <: DeepMapAsyncResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Promise[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeepMapResult extends StObject {
    
    var recurse: Boolean = js.native
    
    var value: js.Any = js.native
  }
  object DeepMapResult {
    
    @scala.inline
    def apply(recurse: Boolean, value: js.Any): DeepMapResult = {
      val __obj = js.Dynamic.literal(recurse = recurse.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeepMapResult]
    }
    
    @scala.inline
    implicit class DeepMapResultMutableBuilder[Self <: DeepMapResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
