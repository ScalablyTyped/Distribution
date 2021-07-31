package typings.vegaTypings.markMod

import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.encodeMod.RectEncodeEntry
import typings.vegaTypings.vegaTypingsStrings.rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RectMark
  extends StObject
     with BaseMark
     with Encodable[RectEncodeEntry]
     with Mark {
  
  var `type`: rect
}
object RectMark {
  
  @scala.inline
  def apply(): RectMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("rect")
    __obj.asInstanceOf[RectMark]
  }
  
  @scala.inline
  implicit class RectMarkMutableBuilder[Self <: RectMark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: rect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
