package typings.vscodeTextmate

import typings.vscodeTextmate.releaseThemeMod.FontStyle
import typings.vscodeTextmate.vscodeTextmateInts.`-1`
import typings.vscodeTextmate.vscodeTextmateInts.`0`
import typings.vscodeTextmate.vscodeTextmateInts.`1`
import typings.vscodeTextmate.vscodeTextmateInts.`2`
import typings.vscodeTextmate.vscodeTextmateInts.`3`
import typings.vscodeTextmate.vscodeTextmateInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseEncodedTokenAttributesMod {
  
  @JSImport("vscode-textmate/release/encodedTokenAttributes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object EncodedTokenAttributes {
    
    @JSImport("vscode-textmate/release/encodedTokenAttributes", "EncodedTokenAttributes")
    @js.native
    val ^ : js.Any = js.native
    
    inline def containsBalancedBrackets(encodedTokenAttributes: EncodedTokenAttributes): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsBalancedBrackets")(encodedTokenAttributes.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def getBackground(encodedTokenAttributes: EncodedTokenAttributes): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackground")(encodedTokenAttributes.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getFontStyle(encodedTokenAttributes: EncodedTokenAttributes): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontStyle")(encodedTokenAttributes.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getForeground(encodedTokenAttributes: EncodedTokenAttributes): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getForeground")(encodedTokenAttributes.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getLanguageId(encodedTokenAttributes: EncodedTokenAttributes): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguageId")(encodedTokenAttributes.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getTokenType(encodedTokenAttributes: EncodedTokenAttributes): StandardTokenType = ^.asInstanceOf[js.Dynamic].applyDynamic("getTokenType")(encodedTokenAttributes.asInstanceOf[js.Any]).asInstanceOf[StandardTokenType]
    
    inline def print(encodedTokenAttributes: EncodedTokenAttributes): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(encodedTokenAttributes.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Updates the fields in `metadata`.
      * A value of `0`, `NotSet` or `null` indicates that the corresponding field should be left as is.
      */
    inline def set(
      encodedTokenAttributes: EncodedTokenAttributes,
      languageId: Double | `0`,
      tokenType: OptionalStandardTokenType | `8`,
      containsBalancedBrackets: Boolean | Null,
      fontStyle: FontStyle | `-1`,
      foreground: Double | `0`,
      background: Double | `0`
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(encodedTokenAttributes.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any], tokenType.asInstanceOf[js.Any], containsBalancedBrackets.asInstanceOf[js.Any], fontStyle.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def toBinaryStr(encodedTokenAttributes: EncodedTokenAttributes): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBinaryStr")(encodedTokenAttributes.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  type EncodedTokenAttributes = Double
  
  inline def toOptionalTokenType(standardType: StandardTokenType): OptionalStandardTokenType = ^.asInstanceOf[js.Dynamic].applyDynamic("toOptionalTokenType")(standardType.asInstanceOf[js.Any]).asInstanceOf[OptionalStandardTokenType]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeTextmate.vscodeTextmateInts.`0`
    - typings.vscodeTextmate.vscodeTextmateInts.`1`
    - typings.vscodeTextmate.vscodeTextmateInts.`2`
    - typings.vscodeTextmate.vscodeTextmateInts.`3`
    - typings.vscodeTextmate.vscodeTextmateInts.`8`
  */
  trait OptionalStandardTokenType extends StObject
  object OptionalStandardTokenType {
    
    inline def Comment: `1` = 1.asInstanceOf[`1`]
    
    inline def NotSet: `8` = 8.asInstanceOf[`8`]
    
    inline def Other: `0` = 0.asInstanceOf[`0`]
    
    inline def RegEx: `3` = 3.asInstanceOf[`3`]
    
    inline def String: `2` = 2.asInstanceOf[`2`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeTextmate.vscodeTextmateInts.`0`
    - typings.vscodeTextmate.vscodeTextmateInts.`1`
    - typings.vscodeTextmate.vscodeTextmateInts.`2`
    - typings.vscodeTextmate.vscodeTextmateInts.`3`
  */
  trait StandardTokenType extends StObject
  object StandardTokenType {
    
    inline def Comment: `1` = 1.asInstanceOf[`1`]
    
    inline def Other: `0` = 0.asInstanceOf[`0`]
    
    inline def RegEx: `3` = 3.asInstanceOf[`3`]
    
    inline def String: `2` = 2.asInstanceOf[`2`]
  }
}
