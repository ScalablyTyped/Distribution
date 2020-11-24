package typings.tensorflowTfjsConverter.operationsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrParamMapper extends ParamMapper {
  
  var tfDeprecatedName: js.UndefOr[String] = js.native
  
  var tfName: js.UndefOr[String] = js.native
}
object AttrParamMapper {
  
  @scala.inline
  def apply(name: String, `type`: ParamType): AttrParamMapper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrParamMapper]
  }
  
  @scala.inline
  implicit class AttrParamMapperOps[Self <: AttrParamMapper] (val x: Self) extends AnyVal {
    
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
    def setTfDeprecatedName(value: String): Self = this.set("tfDeprecatedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTfDeprecatedName: Self = this.set("tfDeprecatedName", js.undefined)
    
    @scala.inline
    def setTfName(value: String): Self = this.set("tfName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTfName: Self = this.set("tfName", js.undefined)
  }
}
