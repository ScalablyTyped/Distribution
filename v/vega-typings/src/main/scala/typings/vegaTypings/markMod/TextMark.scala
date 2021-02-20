package typings.vegaTypings.markMod

import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.encodeMod.TextEncodeEntry
import typings.vegaTypings.vegaTypingsStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextMark
  extends BaseMark
     with Encodable[TextEncodeEntry]
     with Mark {
  
  var `type`: text = js.native
}
object TextMark {
  
  @scala.inline
  def apply(`type`: text): TextMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMark]
  }
  
  @scala.inline
  implicit class TextMarkMutableBuilder[Self <: TextMark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
