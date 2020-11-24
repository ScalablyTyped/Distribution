package typings.styletronStandard.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined styletron-standard.styletron-standard.KeyframesPercentageObject & {  from :styletron-standard.styletron-standard.Properties | undefined,   to :styletron-standard.styletron-standard.Properties | undefined} */
@js.native
trait KeyframesObject extends /* key */ StringDictionary[Properties] {
  
  var from: js.UndefOr[Properties] = js.native
  
  var to: js.UndefOr[Properties] = js.native
}
object KeyframesObject {
  
  @scala.inline
  def apply(): KeyframesObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyframesObject]
  }
  
  @scala.inline
  implicit class KeyframesObjectOps[Self <: KeyframesObject] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: Properties): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setTo(value: Properties): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
