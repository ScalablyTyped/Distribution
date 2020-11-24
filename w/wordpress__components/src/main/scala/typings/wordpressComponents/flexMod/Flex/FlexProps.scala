package typings.wordpressComponents.flexMod.Flex

import typings.csstype.mod.AlignItemsProperty
import typings.csstype.mod.JustifyContentProperty
import typings.wordpressComponents.wordpressComponentsStrings.bottom
import typings.wordpressComponents.wordpressComponentsStrings.left
import typings.wordpressComponents.wordpressComponentsStrings.right
import typings.wordpressComponents.wordpressComponentsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexProps extends js.Object {
  
  /**
    * Sets align-items. Top and bottom are shorthand for flex-start and flex-end respectively.
    */
  var align: js.UndefOr[AlignItemsProperty | top | bottom] = js.native
  
  /**
    * Determines the spacing in between children components. The `gap` value is a multiplier to the base value of `4`.
    */
  var gap: js.UndefOr[Double] = js.native
  
  /**
    * Reverses the flex direction.
    */
  var isReversed: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets jusifty-content. Left and right are shorthand for flex-start and flex-end respectively, not the actual CSS value.
    */
  var justify: js.UndefOr[JustifyContentProperty | left | right] = js.native
}
object FlexProps {
  
  @scala.inline
  def apply(): FlexProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexProps]
  }
  
  @scala.inline
  implicit class FlexPropsOps[Self <: FlexProps] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: AlignItemsProperty | top | bottom): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setGap(value: Double): Self = this.set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    
    @scala.inline
    def setIsReversed(value: Boolean): Self = this.set("isReversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsReversed: Self = this.set("isReversed", js.undefined)
    
    @scala.inline
    def setJustify(value: JustifyContentProperty | left | right): Self = this.set("justify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustify: Self = this.set("justify", js.undefined)
  }
}
