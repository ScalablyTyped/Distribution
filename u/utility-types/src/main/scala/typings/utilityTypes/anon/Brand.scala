package typings.utilityTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Brand[A /* <: js.Object */] extends js.Object {
  var __brand: /* keyof A */ String = js.native
}

object Brand {
  @scala.inline
  def apply[/* <: js.Object */ A](__brand: /* keyof A */ String): Brand[A] = {
    val __obj = js.Dynamic.literal(__brand = __brand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brand[A]]
  }
  @scala.inline
  implicit class BrandOps[Self <: Brand[_], /* <: js.Object */ A] (val x: Self with Brand[A]) extends AnyVal {
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
    def set__brand(value: /* keyof A */ String): Self = this.set("__brand", value.asInstanceOf[js.Any])
  }
  
}

