package typings.waterline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleCallbacks extends StObject {
  
  var afterCreate: js.UndefOr[
    (js.Array[js.Function2[/* newlyCreatedRecord */ Any, /* next */ js.Function, Unit]]) | (js.Function2[/* newlyCreatedRecord */ Any, /* next */ js.Function, Unit])
  ] = js.undefined
  
  var afterDestroy: js.UndefOr[
    (js.Array[js.Function2[/* destroyedInstance */ Any, /* next */ js.Function, Unit]]) | (js.Function2[/* destroyedInstance */ Any, /* next */ js.Function, Unit])
  ] = js.undefined
  
  var afterUpdate: js.UndefOr[
    (js.Array[js.Function2[/* valuesToUpdate */ Any, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ Any, /* next */ js.Function, Unit])
  ] = js.undefined
  
  var beforeCreate: js.UndefOr[
    (js.Array[js.Function2[/* values */ Any, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ Any, /* next */ js.Function, Unit])
  ] = js.undefined
  
  var beforeDestroy: js.UndefOr[
    (js.Array[js.Function2[/* criteria */ Any, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ Any, /* next */ js.Function, Unit])
  ] = js.undefined
  
  var beforeUpdate: js.UndefOr[
    (js.Array[js.Function2[/* valuesToUpdate */ Any, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ Any, /* next */ js.Function, Unit])
  ] = js.undefined
  
  var beforeValidate: js.UndefOr[
    (js.Array[js.Function2[/* vaues */ Any, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ Any, /* next */ js.Function, Unit])
  ] = js.undefined
}
object LifecycleCallbacks {
  
  inline def apply(): LifecycleCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleCallbacks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LifecycleCallbacks] (val x: Self) extends AnyVal {
    
    inline def setAfterCreate(
      value: (js.Array[js.Function2[/* newlyCreatedRecord */ Any, /* next */ js.Function, Unit]]) | (js.Function2[/* newlyCreatedRecord */ Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "afterCreate", value.asInstanceOf[js.Any])
    
    inline def setAfterCreateFunction2(value: (/* newlyCreatedRecord */ Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "afterCreate", js.Any.fromFunction2(value))
    
    inline def setAfterCreateUndefined: Self = StObject.set(x, "afterCreate", js.undefined)
    
    inline def setAfterCreateVarargs(value: (js.Function2[/* newlyCreatedRecord */ Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "afterCreate", js.Array(value*))
    
    inline def setAfterDestroy(
      value: (js.Array[js.Function2[/* destroyedInstance */ Any, /* next */ js.Function, Unit]]) | (js.Function2[/* destroyedInstance */ Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "afterDestroy", value.asInstanceOf[js.Any])
    
    inline def setAfterDestroyFunction2(value: (/* destroyedInstance */ Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "afterDestroy", js.Any.fromFunction2(value))
    
    inline def setAfterDestroyUndefined: Self = StObject.set(x, "afterDestroy", js.undefined)
    
    inline def setAfterDestroyVarargs(value: (js.Function2[/* destroyedInstance */ Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "afterDestroy", js.Array(value*))
    
    inline def setAfterUpdate(
      value: (js.Array[js.Function2[/* valuesToUpdate */ Any, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "afterUpdate", value.asInstanceOf[js.Any])
    
    inline def setAfterUpdateFunction2(value: (/* valuesToUpdate */ Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction2(value))
    
    inline def setAfterUpdateUndefined: Self = StObject.set(x, "afterUpdate", js.undefined)
    
    inline def setAfterUpdateVarargs(value: (js.Function2[/* valuesToUpdate */ Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "afterUpdate", js.Array(value*))
    
    inline def setBeforeCreate(
      value: (js.Array[js.Function2[/* values */ Any, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "beforeCreate", value.asInstanceOf[js.Any])
    
    inline def setBeforeCreateFunction2(value: (/* vaues */ Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "beforeCreate", js.Any.fromFunction2(value))
    
    inline def setBeforeCreateUndefined: Self = StObject.set(x, "beforeCreate", js.undefined)
    
    inline def setBeforeCreateVarargs(value: (js.Function2[/* values */ Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "beforeCreate", js.Array(value*))
    
    inline def setBeforeDestroy(
      value: (js.Array[js.Function2[/* criteria */ Any, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "beforeDestroy", value.asInstanceOf[js.Any])
    
    inline def setBeforeDestroyFunction2(value: (/* valuesToUpdate */ Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "beforeDestroy", js.Any.fromFunction2(value))
    
    inline def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
    
    inline def setBeforeDestroyVarargs(value: (js.Function2[/* criteria */ Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "beforeDestroy", js.Array(value*))
    
    inline def setBeforeUpdate(
      value: (js.Array[js.Function2[/* valuesToUpdate */ Any, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "beforeUpdate", value.asInstanceOf[js.Any])
    
    inline def setBeforeUpdateFunction2(value: (/* valuesToUpdate */ Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction2(value))
    
    inline def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", js.undefined)
    
    inline def setBeforeUpdateVarargs(value: (js.Function2[/* valuesToUpdate */ Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "beforeUpdate", js.Array(value*))
    
    inline def setBeforeValidate(
      value: (js.Array[js.Function2[/* vaues */ Any, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "beforeValidate", value.asInstanceOf[js.Any])
    
    inline def setBeforeValidateFunction2(value: (/* vaues */ Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "beforeValidate", js.Any.fromFunction2(value))
    
    inline def setBeforeValidateUndefined: Self = StObject.set(x, "beforeValidate", js.undefined)
    
    inline def setBeforeValidateVarargs(value: (js.Function2[/* vaues */ Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "beforeValidate", js.Array(value*))
  }
}
