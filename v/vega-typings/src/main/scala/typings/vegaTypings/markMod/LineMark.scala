package typings.vegaTypings.markMod

import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.encodeMod.LineEncodeEntry
import typings.vegaTypings.vegaTypingsStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineMark
  extends BaseMark
     with Encodable[LineEncodeEntry]
     with Mark {
  
  var `type`: line = js.native
}
object LineMark {
  
  @scala.inline
  def apply(`type`: line): LineMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineMark]
  }
  
  @scala.inline
  implicit class LineMarkMutableBuilder[Self <: LineMark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
