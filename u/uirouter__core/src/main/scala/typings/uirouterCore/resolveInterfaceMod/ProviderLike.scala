package typings.uirouterCore.resolveInterfaceMod

import typings.uirouterCore.stateInterfaceMod.ResolveTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderLike extends ResolveTypes {
  var deps: js.UndefOr[js.Array[_]] = js.native
  var provide: js.Any = js.native
  var useClass: js.UndefOr[js.Any] = js.native
  var useExisting: js.UndefOr[js.Any] = js.native
  var useFactory: js.UndefOr[js.Function] = js.native
  var useValue: js.UndefOr[js.Any] = js.native
}

object ProviderLike {
  @scala.inline
  def apply(provide: js.Any): ProviderLike = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderLike]
  }
  @scala.inline
  implicit class ProviderLikeOps[Self <: ProviderLike] (val x: Self) extends AnyVal {
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
    def setProvide(value: js.Any): Self = this.set("provide", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepsVarargs(value: js.Any*): Self = this.set("deps", js.Array(value :_*))
    @scala.inline
    def setDeps(value: js.Array[_]): Self = this.set("deps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeps: Self = this.set("deps", js.undefined)
    @scala.inline
    def setUseClass(value: js.Any): Self = this.set("useClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseClass: Self = this.set("useClass", js.undefined)
    @scala.inline
    def setUseExisting(value: js.Any): Self = this.set("useExisting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseExisting: Self = this.set("useExisting", js.undefined)
    @scala.inline
    def setUseFactory(value: js.Function): Self = this.set("useFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFactory: Self = this.set("useFactory", js.undefined)
    @scala.inline
    def setUseValue(value: js.Any): Self = this.set("useValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseValue: Self = this.set("useValue", js.undefined)
  }
  
}

