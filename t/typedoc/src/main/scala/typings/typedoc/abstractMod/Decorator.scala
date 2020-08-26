package typings.typedoc.abstractMod

import typings.typedoc.modelsTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decorator extends js.Object {
  var arguments: js.UndefOr[js.Any] = js.native
  var name: String = js.native
  var `type`: js.UndefOr[Type] = js.native
}

object Decorator {
  @scala.inline
  def apply(name: String): Decorator = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decorator]
  }
  @scala.inline
  implicit class DecoratorOps[Self <: Decorator] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setArguments(value: js.Any): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

