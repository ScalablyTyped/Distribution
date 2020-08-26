package typings.xregexp.anon

import typings.xregexp.mod.MatchRecursiveValueNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<xregexp.xregexp.MatchRecursiveOptions, 'valueNames'>> */
@js.native
trait RequiredPickMatchRecursiv extends js.Object {
  var valueNames: MatchRecursiveValueNames = js.native
}

object RequiredPickMatchRecursiv {
  @scala.inline
  def apply(valueNames: MatchRecursiveValueNames): RequiredPickMatchRecursiv = {
    val __obj = js.Dynamic.literal(valueNames = valueNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMatchRecursiv]
  }
  @scala.inline
  implicit class RequiredPickMatchRecursivOps[Self <: RequiredPickMatchRecursiv] (val x: Self) extends AnyVal {
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
    def setValueNames(value: MatchRecursiveValueNames): Self = this.set("valueNames", value.asInstanceOf[js.Any])
  }
  
}

