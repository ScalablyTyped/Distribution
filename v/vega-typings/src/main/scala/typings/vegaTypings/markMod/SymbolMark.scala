package typings.vegaTypings.markMod

import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.encodeMod.SymbolEncodeEntry
import typings.vegaTypings.vegaTypingsStrings.symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolMark
  extends StObject
     with BaseMark
     with Encodable[SymbolEncodeEntry]
     with Mark {
  
  var `type`: symbol
}
object SymbolMark {
  
  inline def apply(): SymbolMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("symbol")
    __obj.asInstanceOf[SymbolMark]
  }
  
  extension [Self <: SymbolMark](x: Self) {
    
    inline def setType(value: symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
