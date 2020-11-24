package typings.vueDocgenApi.slotHandlerLitteralMod

import typings.vueInbrowserCompilerUtils.typesMod.Param
import typings.vueInbrowserCompilerUtils.typesMod.ParamType
import typings.vueInbrowserCompilerUtils.typesMod.RootTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedParamTag
  extends Param
     with RootTag {
  
  @JSName("type")
  var type_TypedParamTag: ParamType = js.native
}
object TypedParamTag {
  
  @scala.inline
  def apply(title: String, `type`: ParamType): TypedParamTag = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedParamTag]
  }
  
  @scala.inline
  implicit class TypedParamTagOps[Self <: TypedParamTag] (val x: Self) extends AnyVal {
    
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
    def setType(value: ParamType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
