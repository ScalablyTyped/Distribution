package typings.vegaTypings.typesSpecMarkMod

import typings.vegaTypings.typesSpecEncodeMod.Encodable
import typings.vegaTypings.typesSpecEncodeMod.RuleEncodeEntry
import typings.vegaTypings.vegaTypingsStrings.rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleMark
  extends StObject
     with BaseMark
     with Encodable[RuleEncodeEntry]
     with Mark {
  
  var `type`: rule
}
object RuleMark {
  
  inline def apply(): RuleMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("rule")
    __obj.asInstanceOf[RuleMark]
  }
  
  extension [Self <: RuleMark](x: Self) {
    
    inline def setType(value: rule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
