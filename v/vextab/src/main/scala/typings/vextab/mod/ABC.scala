package typings.vextab.mod

import typings.vextab.vextabStrings.Numbersign
import typings.vextab.vextabStrings.NumbersignNumbersign
import typings.vextab.vextabStrings._empty
import typings.vextab.vextabStrings.b
import typings.vextab.vextabStrings.bb
import typings.vextab.vextabStrings.c
import typings.vextab.vextabStrings.n
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ABC extends StObject {
  
  var accidental: js.UndefOr[Null | _empty | Numbersign | NumbersignNumbersign | b | bb | n] = js.undefined
  
  var accidental_type: Null | c
  
  var key: Any
}
object ABC {
  
  inline def apply(key: Any): ABC = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], accidental_type = null)
    __obj.asInstanceOf[ABC]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ABC] (val x: Self) extends AnyVal {
    
    inline def setAccidental(value: _empty | Numbersign | NumbersignNumbersign | b | bb | n): Self = StObject.set(x, "accidental", value.asInstanceOf[js.Any])
    
    inline def setAccidentalNull: Self = StObject.set(x, "accidental", null)
    
    inline def setAccidentalUndefined: Self = StObject.set(x, "accidental", js.undefined)
    
    inline def setAccidental_type(value: c): Self = StObject.set(x, "accidental_type", value.asInstanceOf[js.Any])
    
    inline def setAccidental_typeNull: Self = StObject.set(x, "accidental_type", null)
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
