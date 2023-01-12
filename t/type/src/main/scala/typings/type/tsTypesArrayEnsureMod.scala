package typings.`type`

import typings.`type`.tsTypesEnsureMod.EnsureBaseOptions
import typings.`type`.tsTypesEnsureMod.EnsureDefault
import typings.`type`.tsTypesEnsureMod.EnsureFunction
import typings.`type`.tsTypesEnsureMod.EnsureIsOptional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsTypesArrayEnsureMod {
  
  @JSImport("type/ts-types/array/ensure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](value: Any): js.Array[T] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T] | Null]
  inline def default[T](value: Any, options: EnsureArrayOptions & EnsureBaseOptions & EnsureIsOptional): js.Array[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T] | Null]
  
  inline def default_T_Array[T](value: Any): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def default_T_Array[T](
    value: Any,
    options: EnsureArrayOptions & EnsureBaseOptions & EnsureIsOptional & EnsureDefault[js.Array[T]]
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  trait EnsureArrayOptions extends StObject {
    
    var ensureItem: js.UndefOr[EnsureFunction] = js.undefined
  }
  object EnsureArrayOptions {
    
    inline def apply(): EnsureArrayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnsureArrayOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnsureArrayOptions] (val x: Self) extends AnyVal {
      
      inline def setEnsureItem(value: EnsureFunction): Self = StObject.set(x, "ensureItem", value.asInstanceOf[js.Any])
      
      inline def setEnsureItemUndefined: Self = StObject.set(x, "ensureItem", js.undefined)
    }
  }
}
