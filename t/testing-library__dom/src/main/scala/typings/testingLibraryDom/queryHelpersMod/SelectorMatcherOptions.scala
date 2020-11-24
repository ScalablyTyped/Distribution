package typings.testingLibraryDom.queryHelpersMod

import typings.testingLibraryDom.matchesMod.MatcherOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectorMatcherOptions extends MatcherOptions {
  
  var selector: js.UndefOr[String] = js.native
}
object SelectorMatcherOptions {
  
  @scala.inline
  def apply(): SelectorMatcherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectorMatcherOptions]
  }
  
  @scala.inline
  implicit class SelectorMatcherOptionsOps[Self <: SelectorMatcherOptions] (val x: Self) extends AnyVal {
    
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
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
}
