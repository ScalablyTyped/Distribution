package typings.testingLibraryDom.matchesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultNormalizerOptions extends js.Object {
  
  var collapseWhitespace: js.UndefOr[Boolean] = js.native
  
  var trim: js.UndefOr[Boolean] = js.native
}
object DefaultNormalizerOptions {
  
  @scala.inline
  def apply(): DefaultNormalizerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultNormalizerOptions]
  }
  
  @scala.inline
  implicit class DefaultNormalizerOptionsOps[Self <: DefaultNormalizerOptions] (val x: Self) extends AnyVal {
    
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
    def setCollapseWhitespace(value: Boolean): Self = this.set("collapseWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseWhitespace: Self = this.set("collapseWhitespace", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
  }
}
