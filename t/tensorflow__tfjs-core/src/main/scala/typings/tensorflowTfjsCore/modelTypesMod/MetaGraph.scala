package typings.tensorflowTfjsCore.modelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaGraph extends js.Object {
  var signatureDefs: SignatureDef
  var tags: js.Array[String]
}

object MetaGraph {
  @scala.inline
  def apply(signatureDefs: SignatureDef, tags: js.Array[String]): MetaGraph = {
    val __obj = js.Dynamic.literal(signatureDefs = signatureDefs.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MetaGraph]
  }
}

