package typings.yarnpkgParsers.anon

import typings.yarnpkgParsers.libGrammarsShellMod.ArgumentSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pattern
  extends StObject
     with ArgumentSegment {
  
  var pattern: String
  
  var `type`: /* template literal string: glob */ String
}
object Pattern {
  
  inline def apply(pattern: String, `type`: /* template literal string: glob */ String): Pattern = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  
  extension [Self <: Pattern](x: Self) {
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* template literal string: glob */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
