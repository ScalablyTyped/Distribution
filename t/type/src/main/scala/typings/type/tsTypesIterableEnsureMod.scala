package typings.`type`

import typings.`type`.tsTypesEnsureMod.EnsureBaseOptions
import typings.`type`.tsTypesEnsureMod.EnsureDefault
import typings.`type`.tsTypesEnsureMod.EnsureFunction
import typings.`type`.tsTypesEnsureMod.EnsureIsOptional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsTypesIterableEnsureMod {
  
  @JSImport("type/ts-types/iterable/ensure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](value: Any): js.Array[T] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T] | Null]
  inline def default[T](value: Any, options: IterableEnsureOptions & EnsureBaseOptions & EnsureIsOptional): js.Array[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T] | Null]
  
  inline def default_T_Array[T](value: Any): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def default_T_Array[T](
    value: Any,
    options: IterableEnsureOptions & EnsureBaseOptions & EnsureIsOptional & EnsureDefault[js.Array[T]]
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  trait IterableEnsureOptions extends StObject {
    
    var allowString: js.UndefOr[Boolean] = js.undefined
    
    var denyEmpty: js.UndefOr[Boolean] = js.undefined
    
    var ensureItem: js.UndefOr[EnsureFunction] = js.undefined
  }
  object IterableEnsureOptions {
    
    inline def apply(): IterableEnsureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IterableEnsureOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IterableEnsureOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowString(value: Boolean): Self = StObject.set(x, "allowString", value.asInstanceOf[js.Any])
      
      inline def setAllowStringUndefined: Self = StObject.set(x, "allowString", js.undefined)
      
      inline def setDenyEmpty(value: Boolean): Self = StObject.set(x, "denyEmpty", value.asInstanceOf[js.Any])
      
      inline def setDenyEmptyUndefined: Self = StObject.set(x, "denyEmpty", js.undefined)
      
      inline def setEnsureItem(value: EnsureFunction): Self = StObject.set(x, "ensureItem", value.asInstanceOf[js.Any])
      
      inline def setEnsureItemUndefined: Self = StObject.set(x, "ensureItem", js.undefined)
    }
  }
}
