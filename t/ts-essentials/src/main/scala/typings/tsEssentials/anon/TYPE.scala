package typings.tsEssentials.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TYPE[K] extends js.Object {
  var __TYPE__ : K = js.native
}

object TYPE {
  @scala.inline
  def apply[K](__TYPE__ : K): TYPE[K] = {
    val __obj = js.Dynamic.literal(__TYPE__ = __TYPE__.asInstanceOf[js.Any])
    __obj.asInstanceOf[TYPE[K]]
  }
  @scala.inline
  implicit class TYPEOps[Self <: TYPE[_], K] (val x: Self with TYPE[K]) extends AnyVal {
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
    def set__TYPE__(value: K): Self = this.set("__TYPE__", value.asInstanceOf[js.Any])
  }
  
}

