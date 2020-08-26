package typings.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Indices extends js.Object {
  var indices: js.Tuple2[Double, Double] = js.native
}

object Indices {
  @scala.inline
  def apply(indices: js.Tuple2[Double, Double]): Indices = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indices]
  }
  @scala.inline
  implicit class IndicesOps[Self <: Indices] (val x: Self) extends AnyVal {
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
  }
  
}

