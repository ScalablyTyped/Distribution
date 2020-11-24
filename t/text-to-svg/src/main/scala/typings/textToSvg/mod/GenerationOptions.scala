package typings.textToSvg.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerationOptions extends FontOptions {
  
  /**
    * Key-value pairs of attributes for `<path>` element.
    */
  var attributes: js.UndefOr[StringDictionary[String] | Null] = js.native
}
object GenerationOptions {
  
  @scala.inline
  def apply(): GenerationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerationOptions]
  }
  
  @scala.inline
  implicit class GenerationOptionsOps[Self <: GenerationOptions] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: StringDictionary[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setAttributesNull: Self = this.set("attributes", null)
  }
}
