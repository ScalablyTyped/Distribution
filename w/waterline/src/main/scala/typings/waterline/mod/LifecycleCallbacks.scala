package typings.waterline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleCallbacks extends StObject {
  
  var afterCreate: js.UndefOr[
    (js.Array[js.Function2[/* newlyCreatedRecord */ js.Any, /* next */ js.Function, Unit]]) | (js.Function2[/* newlyCreatedRecord */ js.Any, /* next */ js.Function, Unit])
  ] = js.undefined
  
  var afterDestroy: js.UndefOr[
    (js.Array[js.Function2[/* destroyedInstance */ js.Any, /* next */ js.Function, Unit]]) | (js.Function2[/* destroyedInstance */ js.Any, /* next */ js.Function, Unit])
  ] = js.undefined
  
  var afterUpdate: js.UndefOr[
    (js.Array[js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
  ] = js.undefined
  
  var beforeCreate: js.UndefOr[
    (js.Array[js.Function2[/* values */ js.Any, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])
  ] = js.undefined
  
  var beforeDestroy: js.UndefOr[
    (js.Array[js.Function2[/* criteria */ js.Any, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
  ] = js.undefined
  
  var beforeUpdate: js.UndefOr[
    (js.Array[js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
  ] = js.undefined
  
  var beforeValidate: js.UndefOr[
    (js.Array[js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])
  ] = js.undefined
}
object LifecycleCallbacks {
  
  @scala.inline
  def apply(): LifecycleCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleCallbacks]
  }
  
  @scala.inline
  implicit class LifecycleCallbacksMutableBuilder[Self <: LifecycleCallbacks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterCreate(
      value: (js.Array[js.Function2[/* newlyCreatedRecord */ js.Any, /* next */ js.Function, Unit]]) | (js.Function2[/* newlyCreatedRecord */ js.Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "afterCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterCreateFunction2(value: (/* newlyCreatedRecord */ js.Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "afterCreate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterCreateUndefined: Self = StObject.set(x, "afterCreate", js.undefined)
    
    @scala.inline
    def setAfterCreateVarargs(value: (js.Function2[/* newlyCreatedRecord */ js.Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "afterCreate", js.Array(value :_*))
    
    @scala.inline
    def setAfterDestroy(
      value: (js.Array[js.Function2[/* destroyedInstance */ js.Any, /* next */ js.Function, Unit]]) | (js.Function2[/* destroyedInstance */ js.Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "afterDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterDestroyFunction2(value: (/* destroyedInstance */ js.Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "afterDestroy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterDestroyUndefined: Self = StObject.set(x, "afterDestroy", js.undefined)
    
    @scala.inline
    def setAfterDestroyVarargs(value: (js.Function2[/* destroyedInstance */ js.Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "afterDestroy", js.Array(value :_*))
    
    @scala.inline
    def setAfterUpdate(
      value: (js.Array[js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "afterUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUpdateFunction2(value: (/* valuesToUpdate */ js.Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterUpdateUndefined: Self = StObject.set(x, "afterUpdate", js.undefined)
    
    @scala.inline
    def setAfterUpdateVarargs(value: (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "afterUpdate", js.Array(value :_*))
    
    @scala.inline
    def setBeforeCreate(
      value: (js.Array[js.Function2[/* values */ js.Any, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "beforeCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeCreateFunction2(value: (/* vaues */ js.Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "beforeCreate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeCreateUndefined: Self = StObject.set(x, "beforeCreate", js.undefined)
    
    @scala.inline
    def setBeforeCreateVarargs(value: (js.Function2[/* values */ js.Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "beforeCreate", js.Array(value :_*))
    
    @scala.inline
    def setBeforeDestroy(
      value: (js.Array[js.Function2[/* criteria */ js.Any, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "beforeDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeDestroyFunction2(value: (/* valuesToUpdate */ js.Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "beforeDestroy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
    
    @scala.inline
    def setBeforeDestroyVarargs(value: (js.Function2[/* criteria */ js.Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "beforeDestroy", js.Array(value :_*))
    
    @scala.inline
    def setBeforeUpdate(
      value: (js.Array[js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "beforeUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeUpdateFunction2(value: (/* valuesToUpdate */ js.Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", js.undefined)
    
    @scala.inline
    def setBeforeUpdateVarargs(value: (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "beforeUpdate", js.Array(value :_*))
    
    @scala.inline
    def setBeforeValidate(
      value: (js.Array[js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])
    ): Self = StObject.set(x, "beforeValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeValidateFunction2(value: (/* vaues */ js.Any, /* next */ js.Function) => Unit): Self = StObject.set(x, "beforeValidate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeValidateUndefined: Self = StObject.set(x, "beforeValidate", js.undefined)
    
    @scala.inline
    def setBeforeValidateVarargs(value: (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])*): Self = StObject.set(x, "beforeValidate", js.Array(value :_*))
  }
}
