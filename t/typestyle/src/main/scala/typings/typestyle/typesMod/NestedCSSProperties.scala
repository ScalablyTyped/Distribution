package typings.typestyle.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NestedCSSProperties extends CSSProperties {
  
  /**
    * A debug only (stripped in process.env.NODE_ENV !== 'production') name
    * Helps you figure out where the class is coming from if you care
    **/
  @JSName("$debugName")
  var $debugName: js.UndefOr[String] = js.native
  
  @JSName("$nest")
  var $nest: js.UndefOr[NestedCSSSelectors] = js.native
}
object NestedCSSProperties {
  
  @scala.inline
  def apply(): NestedCSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NestedCSSProperties]
  }
  
  @scala.inline
  implicit class NestedCSSPropertiesOps[Self <: NestedCSSProperties] (val x: Self) extends AnyVal {
    
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
    def set$debugName(value: String): Self = this.set("$debugName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$debugName: Self = this.set("$debugName", js.undefined)
    
    @scala.inline
    def set$nest(value: NestedCSSSelectors): Self = this.set("$nest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$nest: Self = this.set("$nest", js.undefined)
  }
}
