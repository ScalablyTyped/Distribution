package typings.worldCurrencies

import typings.worldCurrencies.mod.MinorUnit
import typings.worldCurrencies.mod.Unit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Major extends StObject {
    
    var major: Unit
    
    var minor: MinorUnit
    
    var minor2: js.UndefOr[MinorUnit] = js.undefined
  }
  object Major {
    
    inline def apply(major: Unit, minor: MinorUnit): Major = {
      val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Major]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Major] (val x: Self) extends AnyVal {
      
      inline def setMajor(value: Unit): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMinor(value: MinorUnit): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      inline def setMinor2(value: MinorUnit): Self = StObject.set(x, "minor2", value.asInstanceOf[js.Any])
      
      inline def setMinor2Undefined: Self = StObject.set(x, "minor2", js.undefined)
    }
  }
}
