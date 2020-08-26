package typings.textTable.mod

import typings.textTable.textTableStrings.Dot
import typings.textTable.textTableStrings.c
import typings.textTable.textTableStrings.l
import typings.textTable.textTableStrings.r
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** An array of alignment types for each column, default ['l','l',...]. */
  var align: js.UndefOr[js.Array[js.UndefOr[l | r | c | Dot | Null]]] = js.native
  /** Separator to use between columns, (default: ' '). */
  var hsep: js.UndefOr[String] = js.native
  /** A callback function to use when calculating the string length. */
  var stringLength: js.UndefOr[js.Function1[/* str */ String, Double]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAlignVarargs(value: (js.UndefOr[l | r | c | Dot | Null])*): Self = this.set("align", js.Array(value :_*))
    @scala.inline
    def setAlign(value: js.Array[js.UndefOr[l | r | c | Dot | Null]]): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setHsep(value: String): Self = this.set("hsep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsep: Self = this.set("hsep", js.undefined)
    @scala.inline
    def setStringLength(value: /* str */ String => Double): Self = this.set("stringLength", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStringLength: Self = this.set("stringLength", js.undefined)
  }
  
}

