package typings.tokeyCssSelectorParser.distAstTypesMod

import typings.tokeyCore.distTypesMod.Token
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Greaterthansign
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Plussign
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Tilde
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.combinator
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.space
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Combinator
  extends StObject
     with Token[combinator]
     with _SelectorNode {
  
  var after: String
  
  var before: String
  
  var combinator: space | Plussign | Tilde | Greaterthansign
  
  var invalid: Boolean
}
object Combinator {
  
  inline def apply(
    after: String,
    before: String,
    combinator: space | Plussign | Tilde | Greaterthansign,
    end: Double,
    invalid: Boolean,
    start: Double,
    value: String
  ): Combinator = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], combinator = combinator.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("combinator")
    __obj.asInstanceOf[Combinator]
  }
  
  extension [Self <: Combinator](x: Self) {
    
    inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setCombinator(value: space | Plussign | Tilde | Greaterthansign): Self = StObject.set(x, "combinator", value.asInstanceOf[js.Any])
    
    inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
  }
}
