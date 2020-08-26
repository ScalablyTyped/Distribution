package typings.twit.mod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymbolEntity extends js.Object {
  var indices: js.Tuple2[Double, Double] = js.native
  var text: String = js.native
}

object SymbolEntity {
  @scala.inline
  def apply(indices: js.Tuple2[Double, Double], text: String): SymbolEntity = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolEntity]
  }
  @scala.inline
  implicit class SymbolEntityOps[Self <: SymbolEntity] (val x: Self) extends AnyVal {
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
    def setIndices(value: js.Tuple2[Double, Double]): Self = this.set("indices", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

