package typings.victory.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined victory.victory.Omit<victory.victory.BlockProps, 'left' | 'right'> */
@js.native
trait OmitBlockPropsleftright extends js.Object {
  
  var bottom: js.UndefOr[Double] = js.native
  
  var top: js.UndefOr[Double] = js.native
}
object OmitBlockPropsleftright {
  
  @scala.inline
  def apply(): OmitBlockPropsleftright = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitBlockPropsleftright]
  }
  
  @scala.inline
  implicit class OmitBlockPropsleftrightOps[Self <: OmitBlockPropsleftright] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
}
