package typings.waterline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleCallbacks extends js.Object {
  
  var afterCreate: js.UndefOr[
    (js.Array[js.Function2[/* newlyCreatedRecord */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* newlyCreatedRecord */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  
  var afterDestroy: js.UndefOr[
    (js.Array[js.Function2[/* destroyedInstance */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* destroyedInstance */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  
  var afterUpdate: js.UndefOr[
    (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  
  var beforeCreate: js.UndefOr[
    (js.Array[js.Function2[/* values */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  
  var beforeDestroy: js.UndefOr[
    (js.Array[js.Function2[/* criteria */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  
  var beforeUpdate: js.UndefOr[
    (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
  
  var beforeValidate: js.UndefOr[
    (js.Array[js.Function2[/* vaues */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])
  ] = js.native
}
object LifecycleCallbacks {
  
  @scala.inline
  def apply(): LifecycleCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleCallbacks]
  }
  
  @scala.inline
  implicit class LifecycleCallbacksOps[Self <: LifecycleCallbacks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfterCreateFunction2(value: (/* newlyCreatedRecord */ js.Any, /* next */ js.Function) => Unit): Self = this.set("afterCreate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterCreateVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = this.set("afterCreate", js.Array(value :_*))
    
    @scala.inline
    def setAfterCreate(
      value: (js.Array[js.Function2[/* newlyCreatedRecord */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* newlyCreatedRecord */ js.Any, /* next */ js.Function, Unit])
    ): Self = this.set("afterCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterCreate: Self = this.set("afterCreate", js.undefined)
    
    @scala.inline
    def setAfterDestroyFunction2(value: (/* destroyedInstance */ js.Any, /* next */ js.Function) => Unit): Self = this.set("afterDestroy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterDestroyVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = this.set("afterDestroy", js.Array(value :_*))
    
    @scala.inline
    def setAfterDestroy(
      value: (js.Array[js.Function2[/* destroyedInstance */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* destroyedInstance */ js.Any, /* next */ js.Function, Unit])
    ): Self = this.set("afterDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterDestroy: Self = this.set("afterDestroy", js.undefined)
    
    @scala.inline
    def setAfterUpdateFunction2(value: (/* valuesToUpdate */ js.Any, /* next */ js.Function) => Unit): Self = this.set("afterUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterUpdateVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = this.set("afterUpdate", js.Array(value :_*))
    
    @scala.inline
    def setAfterUpdate(
      value: (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
    ): Self = this.set("afterUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterUpdate: Self = this.set("afterUpdate", js.undefined)
    
    @scala.inline
    def setBeforeCreateFunction2(value: (/* vaues */ js.Any, /* next */ js.Function) => Unit): Self = this.set("beforeCreate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeCreateVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = this.set("beforeCreate", js.Array(value :_*))
    
    @scala.inline
    def setBeforeCreate(
      value: (js.Array[js.Function2[/* values */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])
    ): Self = this.set("beforeCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeCreate: Self = this.set("beforeCreate", js.undefined)
    
    @scala.inline
    def setBeforeDestroyFunction2(value: (/* valuesToUpdate */ js.Any, /* next */ js.Function) => Unit): Self = this.set("beforeDestroy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeDestroyVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = this.set("beforeDestroy", js.Array(value :_*))
    
    @scala.inline
    def setBeforeDestroy(
      value: (js.Array[js.Function2[/* criteria */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
    ): Self = this.set("beforeDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeDestroy: Self = this.set("beforeDestroy", js.undefined)
    
    @scala.inline
    def setBeforeUpdateFunction2(value: (/* valuesToUpdate */ js.Any, /* next */ js.Function) => Unit): Self = this.set("beforeUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeUpdateVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = this.set("beforeUpdate", js.Array(value :_*))
    
    @scala.inline
    def setBeforeUpdate(
      value: (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
    ): Self = this.set("beforeUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeUpdate: Self = this.set("beforeUpdate", js.undefined)
    
    @scala.inline
    def setBeforeValidateFunction2(value: (/* vaues */ js.Any, /* next */ js.Function) => Unit): Self = this.set("beforeValidate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeValidateVarargs(value: (js.Function2[js.Any, /* next */ js.Function, Unit])*): Self = this.set("beforeValidate", js.Array(value :_*))
    
    @scala.inline
    def setBeforeValidate(
      value: (js.Array[js.Function2[/* vaues */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])
    ): Self = this.set("beforeValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeValidate: Self = this.set("beforeValidate", js.undefined)
  }
}
