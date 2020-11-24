package typings.wordpressShortcode.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@wordpress/shortcode.@wordpress/shortcode.ShortcodeAttrs> */
@js.native
trait PartialShortcodeAttrs extends js.Object {
  
  var named: js.UndefOr[Record[String, js.UndefOr[String]]] = js.native
  
  var numeric: js.UndefOr[js.Array[String]] = js.native
}
object PartialShortcodeAttrs {
  
  @scala.inline
  def apply(): PartialShortcodeAttrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShortcodeAttrs]
  }
  
  @scala.inline
  implicit class PartialShortcodeAttrsOps[Self <: PartialShortcodeAttrs] (val x: Self) extends AnyVal {
    
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
    def deleteNamed: Self = this.set("named", js.undefined)
    
    @scala.inline
    def setNumericVarargs(value: String*): Self = this.set("numeric", js.Array(value :_*))
    
    @scala.inline
    def setNumeric(value: js.Array[String]): Self = this.set("numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumeric: Self = this.set("numeric", js.undefined)
  }
}
