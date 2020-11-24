package typings.yawnYaml.cjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YAWN extends js.Object {
  
  def getRemark(path: String): String = js.native
  
  var json: js.Any = js.native
  
  def setRemark(path: String, remark: String): Boolean = js.native
  
  var yaml: String = js.native
}
object YAWN {
  
  @scala.inline
  def apply(getRemark: String => String, json: js.Any, setRemark: (String, String) => Boolean, yaml: String): YAWN = {
    val __obj = js.Dynamic.literal(getRemark = js.Any.fromFunction1(getRemark), json = json.asInstanceOf[js.Any], setRemark = js.Any.fromFunction2(setRemark), yaml = yaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAWN]
  }
  
  @scala.inline
  implicit class YAWNOps[Self <: YAWN] (val x: Self) extends AnyVal {
    
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
    def setGetRemark(value: String => String): Self = this.set("getRemark", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJson(value: js.Any): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRemark(value: (String, String) => Boolean): Self = this.set("setRemark", js.Any.fromFunction2(value))
    
    @scala.inline
    def setYaml(value: String): Self = this.set("yaml", value.asInstanceOf[js.Any])
  }
}
