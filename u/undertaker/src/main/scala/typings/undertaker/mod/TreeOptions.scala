package typings.undertaker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeOptions extends js.Object {
  
  /**
    * Whether or not the whole tree should be returned.
    * Default: false
    */
  var deep: js.UndefOr[Boolean] = js.native
}
object TreeOptions {
  
  @scala.inline
  def apply(): TreeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeOptions]
  }
  
  @scala.inline
  implicit class TreeOptionsOps[Self <: TreeOptions] (val x: Self) extends AnyVal {
    
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
    def setDeep(value: Boolean): Self = this.set("deep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeep: Self = this.set("deep", js.undefined)
  }
}
