package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvnWorkspace extends js.Object {
  var mappings: js.Array[SvnMappingDetails]
}

object SvnWorkspace {
  @scala.inline
  def apply(mappings: js.Array[SvnMappingDetails]): SvnWorkspace = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SvnWorkspace]
  }
}

