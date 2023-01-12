package typings.yarnpkgParsers.anon

import typings.yarnpkgParsers.libGrammarsShellMod.ArgumentSegment
import typings.yarnpkgParsers.libGrammarsShellMod.ValueArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlternativeValue
  extends StObject
     with ArgumentSegment {
  
  var alternativeValue: js.UndefOr[js.Array[ValueArgument]] = js.undefined
  
  var defaultValue: js.UndefOr[js.Array[ValueArgument]] = js.undefined
  
  var name: String
  
  var quoted: Boolean
  
  var `type`: /* template literal string: variable */ String
}
object AlternativeValue {
  
  inline def apply(name: String, quoted: Boolean, `type`: /* template literal string: variable */ String): AlternativeValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlternativeValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlternativeValue] (val x: Self) extends AnyVal {
    
    inline def setAlternativeValue(value: js.Array[ValueArgument]): Self = StObject.set(x, "alternativeValue", value.asInstanceOf[js.Any])
    
    inline def setAlternativeValueUndefined: Self = StObject.set(x, "alternativeValue", js.undefined)
    
    inline def setAlternativeValueVarargs(value: ValueArgument*): Self = StObject.set(x, "alternativeValue", js.Array(value*))
    
    inline def setDefaultValue(value: js.Array[ValueArgument]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDefaultValueVarargs(value: ValueArgument*): Self = StObject.set(x, "defaultValue", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQuoted(value: Boolean): Self = StObject.set(x, "quoted", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* template literal string: variable */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
