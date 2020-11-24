package typings.sugar.sugarjs.Object

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectMergeOptions[T] extends js.Object {
  
  var deep: js.UndefOr[Boolean] = js.native
  
  var descriptor: js.UndefOr[Boolean] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var resolve: js.UndefOr[Boolean | resolveFn[T]] = js.native
}
object ObjectMergeOptions {
  
  @scala.inline
  def apply[T](): ObjectMergeOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectMergeOptions[T]]
  }
  
  @scala.inline
  implicit class ObjectMergeOptionsOps[Self <: ObjectMergeOptions[_], T] (val x: Self with ObjectMergeOptions[T]) extends AnyVal {
    
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
    def setDeep(value: Boolean): Self = this.set("deep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeep: Self = this.set("deep", js.undefined)
    
    @scala.inline
    def setDescriptor(value: Boolean): Self = this.set("descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptor: Self = this.set("descriptor", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setResolveFunction5(value: (/* key */ String, T, T, /* target */ js.Object, /* source */ js.Object) => Boolean): Self = this.set("resolve", js.Any.fromFunction5(value))
    
    @scala.inline
    def setResolve(value: Boolean | resolveFn[T]): Self = this.set("resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
  }
}
