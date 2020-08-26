package typings.tensorflowModelsUniversalSentenceEncoder.useQnaMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelOutput extends js.Object {
  var queryEmbedding: Tensor[Rank] = js.native
  var responseEmbedding: Tensor[Rank] = js.native
}

object ModelOutput {
  @scala.inline
  def apply(queryEmbedding: Tensor[Rank], responseEmbedding: Tensor[Rank]): ModelOutput = {
    val __obj = js.Dynamic.literal(queryEmbedding = queryEmbedding.asInstanceOf[js.Any], responseEmbedding = responseEmbedding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelOutput]
  }
  @scala.inline
  implicit class ModelOutputOps[Self <: ModelOutput] (val x: Self) extends AnyVal {
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
    def setQueryEmbedding(value: Tensor[Rank]): Self = this.set("queryEmbedding", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseEmbedding(value: Tensor[Rank]): Self = this.set("responseEmbedding", value.asInstanceOf[js.Any])
  }
  
}

