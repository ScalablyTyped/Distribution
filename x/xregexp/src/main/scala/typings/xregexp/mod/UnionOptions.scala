package typings.xregexp.mod

import typings.xregexp.xregexpStrings.none
import typings.xregexp.xregexpStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional options for when doing a RegExp union.
  */
@js.native
trait UnionOptions extends js.Object {
  /**
    * The conjunction to use for the union. Default is `none`.
    */
  var conjunction: js.UndefOr[or | none | Null] = js.native
}

object UnionOptions {
  @scala.inline
  def apply(): UnionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnionOptions]
  }
  @scala.inline
  implicit class UnionOptionsOps[Self <: UnionOptions] (val x: Self) extends AnyVal {
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
    def setConjunction(value: or | none): Self = this.set("conjunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConjunction: Self = this.set("conjunction", js.undefined)
    @scala.inline
    def setConjunctionNull: Self = this.set("conjunction", null)
  }
  
}

