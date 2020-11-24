package typings.svgSpritemapWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sizes extends js.Object {
  
  /**
    * Whether to include the width and height attributes on the root SVG element.
    * The default value for this option is based on the value of the sprite.generate.use option but when specified will always overwrite it.
    */
  var sizes: js.UndefOr[Boolean] = js.native
}
object Sizes {
  
  @scala.inline
  def apply(): Sizes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sizes]
  }
  
  @scala.inline
  implicit class SizesOps[Self <: Sizes] (val x: Self) extends AnyVal {
    
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
    def setSizes(value: Boolean): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
  }
}
