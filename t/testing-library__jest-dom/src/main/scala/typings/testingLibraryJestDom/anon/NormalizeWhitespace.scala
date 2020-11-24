package typings.testingLibraryJestDom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizeWhitespace extends js.Object {
  
  var normalizeWhitespace: Boolean = js.native
}
object NormalizeWhitespace {
  
  @scala.inline
  def apply(normalizeWhitespace: Boolean): NormalizeWhitespace = {
    val __obj = js.Dynamic.literal(normalizeWhitespace = normalizeWhitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizeWhitespace]
  }
  
  @scala.inline
  implicit class NormalizeWhitespaceOps[Self <: NormalizeWhitespace] (val x: Self) extends AnyVal {
    
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
    def setNormalizeWhitespace(value: Boolean): Self = this.set("normalizeWhitespace", value.asInstanceOf[js.Any])
  }
}
