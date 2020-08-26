package typings.textract.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait extractorExecOpts extends js.Object {
  var exec: StringDictionary[String] = js.native
}

object extractorExecOpts {
  @scala.inline
  def apply(exec: StringDictionary[String]): extractorExecOpts = {
    val __obj = js.Dynamic.literal(exec = exec.asInstanceOf[js.Any])
    __obj.asInstanceOf[extractorExecOpts]
  }
  @scala.inline
  implicit class extractorExecOptsOps[Self <: extractorExecOpts] (val x: Self) extends AnyVal {
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
    def setExec(value: StringDictionary[String]): Self = this.set("exec", value.asInstanceOf[js.Any])
  }
  
}

