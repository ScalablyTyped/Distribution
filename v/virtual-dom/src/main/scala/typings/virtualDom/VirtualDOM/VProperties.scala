package typings.virtualDom.VirtualDOM

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VProperties
  extends /**
  The relaxation on `style` above is the reason why we need `any` as an option
  on the indexer type.
  */
/* index */ StringDictionary[
      js.Any | String | Boolean | Double | VHook | EventHandler | (StringDictionary[String | Boolean | Double])
    ] {
  
  var attributes: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    I would like to use {[index: string]: string}, but then we couldn't use an
    object literal when setting the styles, since TypeScript doesn't seem to
    infer that {'fontSize': string; 'fontWeight': string;} is actually quite
    assignable to the type { [index: string]: string; }
    */
  var style: js.UndefOr[js.Any] = js.native
}
object VProperties {
  
  @scala.inline
  def apply(): VProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VProperties]
  }
  
  @scala.inline
  implicit class VPropertiesOps[Self <: VProperties] (val x: Self) extends AnyVal {
    
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
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
