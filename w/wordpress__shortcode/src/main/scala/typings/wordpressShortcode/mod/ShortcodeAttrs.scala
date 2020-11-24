package typings.wordpressShortcode.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShortcodeAttrs extends js.Object {
  
  var named: Record[String, js.UndefOr[String]] = js.native
  
  var numeric: js.Array[String] = js.native
}
object ShortcodeAttrs {
  
  @scala.inline
  def apply(named: Record[String, js.UndefOr[String]], numeric: js.Array[String]): ShortcodeAttrs = {
    val __obj = js.Dynamic.literal(named = named.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcodeAttrs]
  }
  
  @scala.inline
  implicit class ShortcodeAttrsOps[Self <: ShortcodeAttrs] (val x: Self) extends AnyVal {
    
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
    def setNamed(value: Record[String, js.UndefOr[String]]): Self = this.set("named", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericVarargs(value: String*): Self = this.set("numeric", js.Array(value :_*))
    
    @scala.inline
    def setNumeric(value: js.Array[String]): Self = this.set("numeric", value.asInstanceOf[js.Any])
  }
}
