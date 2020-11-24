package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** XPathPatterns. */
@js.native
trait XPathPatterns extends js.Object {
  
  /** An array to XPaths. */
  var xpaths: js.UndefOr[js.Array[String]] = js.native
}
object XPathPatterns {
  
  @scala.inline
  def apply(): XPathPatterns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XPathPatterns]
  }
  
  @scala.inline
  implicit class XPathPatternsOps[Self <: XPathPatterns] (val x: Self) extends AnyVal {
    
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
    def setXpathsVarargs(value: String*): Self = this.set("xpaths", js.Array(value :_*))
    
    @scala.inline
    def setXpaths(value: js.Array[String]): Self = this.set("xpaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXpaths: Self = this.set("xpaths", js.undefined)
  }
}
