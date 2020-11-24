package typings.typedoc.tsInternalMod

import typings.typedoc.typedocStrings.`object`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TsConfigOnlyOption
  extends CommandLineOptionBase
     with CommandLineOption {
  
  @JSName("type")
  var type_TsConfigOnlyOption: `object` = js.native
}
object TsConfigOnlyOption {
  
  @scala.inline
  def apply(name: String, `type`: `object`): TsConfigOnlyOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TsConfigOnlyOption]
  }
  
  @scala.inline
  implicit class TsConfigOnlyOptionOps[Self <: TsConfigOnlyOption] (val x: Self) extends AnyVal {
    
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
    def setType(value: `object`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
