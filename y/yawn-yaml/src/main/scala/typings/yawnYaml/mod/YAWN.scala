package typings.yawnYaml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAWN extends js.Object {
  var json: js.Any
  var yaml: String
  def getRemark(path: String): String
  def setRemark(path: String, remark: String): Boolean
}

object YAWN {
  @scala.inline
  def apply(getRemark: String => String, json: js.Any, setRemark: (String, String) => Boolean, yaml: String): YAWN = {
    val __obj = js.Dynamic.literal(getRemark = js.Any.fromFunction1(getRemark), json = json.asInstanceOf[js.Any], setRemark = js.Any.fromFunction2(setRemark), yaml = yaml.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[YAWN]
  }
}

