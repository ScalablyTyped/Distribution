package typings.uirouterAngularjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolve extends js.Object {
  def resolve(): js.Any = js.native
}

object Resolve {
  @scala.inline
  def apply(resolve: () => js.Any): Resolve = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction0(resolve))
    __obj.asInstanceOf[Resolve]
  }
  @scala.inline
  implicit class ResolveOps[Self <: Resolve] (val x: Self) extends AnyVal {
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
    def setResolve(value: () => js.Any): Self = this.set("resolve", js.Any.fromFunction0(value))
  }
  
}

