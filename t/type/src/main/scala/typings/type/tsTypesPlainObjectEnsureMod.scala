package typings.`type`

import typings.`type`.tsTypesEnsureMod.EnsureBaseOptions
import typings.`type`.tsTypesEnsureMod.EnsureDefault
import typings.`type`.tsTypesEnsureMod.EnsureFunction
import typings.`type`.tsTypesEnsureMod.EnsureIsOptional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsTypesPlainObjectEnsureMod {
  
  @JSImport("type/ts-types/plain-object/ensure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def default(
    value: Any,
    options: PlainObjectEnsureOptions & EnsureBaseOptions & EnsureIsOptional & EnsureDefault[js.Object]
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def default_Union(value: Any): js.Object | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object | Null]
  inline def default_Union(value: Any, options: PlainObjectEnsureOptions & EnsureBaseOptions & EnsureIsOptional): js.Object | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object | Null]
  
  trait PlainObjectEnsureOptions extends StObject {
    
    var allowedKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    var ensurePropertyValue: js.UndefOr[EnsureFunction] = js.undefined
  }
  object PlainObjectEnsureOptions {
    
    inline def apply(): PlainObjectEnsureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlainObjectEnsureOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlainObjectEnsureOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowedKeys(value: js.Array[String]): Self = StObject.set(x, "allowedKeys", value.asInstanceOf[js.Any])
      
      inline def setAllowedKeysUndefined: Self = StObject.set(x, "allowedKeys", js.undefined)
      
      inline def setAllowedKeysVarargs(value: String*): Self = StObject.set(x, "allowedKeys", js.Array(value*))
      
      inline def setEnsurePropertyValue(value: EnsureFunction): Self = StObject.set(x, "ensurePropertyValue", value.asInstanceOf[js.Any])
      
      inline def setEnsurePropertyValueUndefined: Self = StObject.set(x, "ensurePropertyValue", js.undefined)
    }
  }
}
