package typings.vegaTypings.markMod

import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.encodeMod.TextEncodeEntry
import typings.vegaTypings.vegaTypingsStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextMark
  extends StObject
     with BaseMark
     with Encodable[TextEncodeEntry]
     with Mark {
  
  var `type`: text
}
object TextMark {
  
  @scala.inline
  def apply(): TextMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[TextMark]
  }
  
  @scala.inline
  implicit class TextMarkMutableBuilder[Self <: TextMark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
