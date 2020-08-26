package typings.venn.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutParameter extends js.Object {
  var lossFunction: js.UndefOr[
    js.Function2[/* sets */ StringDictionary[Circle], /* overlaps */ js.Array[Overlap], Double]
  ] = js.native
  var restarts: js.UndefOr[Double] = js.native
}

object LayoutParameter {
  @scala.inline
  def apply(): LayoutParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutParameter]
  }
  @scala.inline
  implicit class LayoutParameterOps[Self <: LayoutParameter] (val x: Self) extends AnyVal {
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
    def setLossFunction(value: (/* sets */ StringDictionary[Circle], /* overlaps */ js.Array[Overlap]) => Double): Self = this.set("lossFunction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLossFunction: Self = this.set("lossFunction", js.undefined)
    @scala.inline
    def setRestarts(value: Double): Self = this.set("restarts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestarts: Self = this.set("restarts", js.undefined)
  }
  
}

