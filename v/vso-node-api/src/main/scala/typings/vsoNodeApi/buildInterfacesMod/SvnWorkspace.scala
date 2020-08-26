package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SvnWorkspace extends js.Object {
  var mappings: js.Array[SvnMappingDetails] = js.native
}

object SvnWorkspace {
  @scala.inline
  def apply(mappings: js.Array[SvnMappingDetails]): SvnWorkspace = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvnWorkspace]
  }
  @scala.inline
  implicit class SvnWorkspaceOps[Self <: SvnWorkspace] (val x: Self) extends AnyVal {
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
    def setMappingsVarargs(value: SvnMappingDetails*): Self = this.set("mappings", js.Array(value :_*))
    @scala.inline
    def setMappings(value: js.Array[SvnMappingDetails]): Self = this.set("mappings", value.asInstanceOf[js.Any])
  }
  
}

