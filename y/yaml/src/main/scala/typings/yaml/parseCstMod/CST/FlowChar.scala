package typings.yaml.parseCstMod.CST

import typings.yaml.yamlStrings.Colon
import typings.yaml.yamlStrings.Comma
import typings.yaml.yamlStrings.Leftcurlybracket
import typings.yaml.yamlStrings.Questionmark
import typings.yaml.yamlStrings.Rightcurlybracket
import typings.yaml.yamlStrings.`[`
import typings.yaml.yamlStrings.`]`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowChar extends StObject {
  
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
  implicit class FlowCharMutableBuilder[Self <: FlowChar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChar(value: Leftcurlybracket | Rightcurlybracket | `[` | `]` | Comma | Questionmark | Colon): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigOffset(value: Double): Self = StObject.set(x, "origOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigOffsetUndefined: Self = StObject.set(x, "origOffset", js.undefined)
  }
}
