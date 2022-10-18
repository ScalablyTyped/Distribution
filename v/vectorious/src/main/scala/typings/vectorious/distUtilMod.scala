package typings.vectorious

import typings.vectorious.distTypesMod.DType
import typings.vectorious.distTypesMod.TypedArray
import typings.vectorious.distTypesMod.TypedArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilMod {
  
  @JSImport("vectorious/dist/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flatten(array: js.Array[Any]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def getDtype(array: TypedArray): DType = ^.asInstanceOf[js.Dynamic].applyDynamic("get_dtype")(array.asInstanceOf[js.Any]).asInstanceOf[DType]
  
  inline def getLength(shape: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get_length")(shape.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getShape(array: Any): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("get_shape")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def getStrides(shape: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("get_strides")(shape.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def getType(dtype: DType): TypedArrayConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("get_type")(dtype.asInstanceOf[js.Any]).asInstanceOf[TypedArrayConstructor]
  
  inline def isTypedArray(array: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_typed_array")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
