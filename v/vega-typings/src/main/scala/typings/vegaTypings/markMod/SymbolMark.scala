package typings.vegaTypings.markMod

import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.encodeMod.SymbolEncodeEntry
import typings.vegaTypings.vegaTypingsStrings.symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolMark
  extends BaseMark
     with Encodable[SymbolEncodeEntry]
     with Mark {
  
  var `type`: symbol = js.native
}
object SymbolMark {
  
  @scala.inline
  def apply(`type`: symbol): SymbolMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolMark]
  }
  
  @scala.inline
  implicit class SymbolMarkMutableBuilder[Self <: SymbolMark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
