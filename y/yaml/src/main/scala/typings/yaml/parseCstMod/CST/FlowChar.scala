package typings.yaml.parseCstMod.CST

import typings.yaml.yamlStrings.Colon
import typings.yaml.yamlStrings.Comma
import typings.yaml.yamlStrings.Leftcurlybracket
import typings.yaml.yamlStrings.Questionmark
import typings.yaml.yamlStrings.Rightcurlybracket
import typings.yaml.yamlStrings.`[`
import typings.yaml.yamlStrings.`]`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowChar extends js.Object {
  
  var char: Leftcurlybracket | Rightcurlybracket | `[` | `]` | Comma | Questionmark | Colon = js.native
  
  var offset: Double = js.native
  
  var origOffset: js.UndefOr[Double] = js.native
}
object FlowChar {
  
  @scala.inline
  def apply(
    char: Leftcurlybracket | Rightcurlybracket | `[` | `]` | Comma | Questionmark | Colon,
    offset: Double
  ): FlowChar = {
    val __obj = js.Dynamic.literal(char = char.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowChar]
  }
  
  @scala.inline
  implicit class FlowCharOps[Self <: FlowChar] (val x: Self) extends AnyVal {
    
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
    def setChar(value: Leftcurlybracket | Rightcurlybracket | `[` | `]` | Comma | Questionmark | Colon): Self = this.set("char", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigOffset(value: Double): Self = this.set("origOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigOffset: Self = this.set("origOffset", js.undefined)
  }
}
