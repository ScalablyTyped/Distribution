package typings.yarnpkgParsers.anon

import typings.yarnpkgParsers.libGrammarsShellMod.ArithmeticPrimary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with ArithmeticPrimary {
  
  var `type`: /* template literal string: number */ String
  
  var value: Double
}
object Type {
  
  inline def apply(`type`: /* template literal string: number */ String, value: Double): Type = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setType(value: /* template literal string: number */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
