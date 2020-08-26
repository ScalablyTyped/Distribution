package typings.tensorflowTfjsCore.modelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaGraph extends js.Object {
  var signatureDefs: SignatureDef = js.native
  var tags: js.Array[String] = js.native
}

object MetaGraph {
  @scala.inline
  def apply(signatureDefs: SignatureDef, tags: js.Array[String]): MetaGraph = {
    val __obj = js.Dynamic.literal(signatureDefs = signatureDefs.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaGraph]
  }
  @scala.inline
  implicit class MetaGraphOps[Self <: MetaGraph] (val x: Self) extends AnyVal {
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
    def setSignatureDefs(value: SignatureDef): Self = this.set("signatureDefs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

