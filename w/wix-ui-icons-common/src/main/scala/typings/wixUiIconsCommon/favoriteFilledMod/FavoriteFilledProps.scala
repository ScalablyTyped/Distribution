package typings.wixUiIconsCommon.favoriteFilledMod

import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FavoriteFilledProps extends SVGAttributes[SVGElement] {
  
  var size: js.UndefOr[String] = js.native
}
object FavoriteFilledProps {
  
  @scala.inline
  def apply(): FavoriteFilledProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FavoriteFilledProps]
  }
  
  @scala.inline
  implicit class FavoriteFilledPropsOps[Self <: FavoriteFilledProps] (val x: Self) extends AnyVal {
    
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
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
