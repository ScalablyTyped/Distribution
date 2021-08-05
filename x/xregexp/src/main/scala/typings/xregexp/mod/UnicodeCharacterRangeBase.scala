package typings.xregexp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Unicode character range base interface.
  */
trait UnicodeCharacterRangeBase extends StObject {
  
  /**
    * An alternate name for the character range.
    */
  var alias: js.UndefOr[String] = js.undefined
  
  /**
    * A combination of literal characters and `\xHH` or `\\uHHHH` escape sequences, with hyphens to create ranges.
    * Any regex metacharacters in the data should be escaped, apart from range-creating hyphens.
    * When `bmp` is not present this `name` will error in BMP mode, but works in astral mode.
    * When this is present, it is used in combination with `bmp` in astral mode.
    * This can additionally use character classes and alternation, and should use surrogate pairs to represent astral code points.
    */
  var astral: js.UndefOr[String] = js.undefined
  
  /**
    * A combination of literal characters and `\xHH` or `\\uHHHH` escape sequences, with hyphens to create ranges.
    * Any regex metacharacters in the data should be escaped, apart from range-creating hyphens.
    * When `astral` is not present, this is used BMP and astral modes.
    * When this is present, it is used in BMP mode and in combination with `astral` in astral mode.
    */
  var bmp: js.UndefOr[String] = js.undefined
  
  /**
    * Can be used to avoid duplicating character data if a Unicode token is defined as the exact inverse of another token.
    */
  var inverseOf: js.UndefOr[String] = js.undefined
  
  /**
    * This is needed when a token matches orphan high surrogates *and* uses surrogate pairs to match astral code points.
    */
  var isBmpLast: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the character range.
    */
  var name: String
}
object UnicodeCharacterRangeBase {
  
  inline def apply(name: String): UnicodeCharacterRangeBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnicodeCharacterRangeBase]
  }
  
  extension [Self <: UnicodeCharacterRangeBase](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAstral(value: String): Self = StObject.set(x, "astral", value.asInstanceOf[js.Any])
    
    inline def setAstralUndefined: Self = StObject.set(x, "astral", js.undefined)
    
    inline def setBmp(value: String): Self = StObject.set(x, "bmp", value.asInstanceOf[js.Any])
    
    inline def setBmpUndefined: Self = StObject.set(x, "bmp", js.undefined)
    
    inline def setInverseOf(value: String): Self = StObject.set(x, "inverseOf", value.asInstanceOf[js.Any])
    
    inline def setInverseOfUndefined: Self = StObject.set(x, "inverseOf", js.undefined)
    
    inline def setIsBmpLast(value: Boolean): Self = StObject.set(x, "isBmpLast", value.asInstanceOf[js.Any])
    
    inline def setIsBmpLastUndefined: Self = StObject.set(x, "isBmpLast", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
