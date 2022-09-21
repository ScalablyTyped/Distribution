package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownStatsModuleTraceDependency extends StObject {
  
  var loc: js.UndefOr[String] = js.undefined
}
object KnownStatsModuleTraceDependency {
  
  inline def apply(): KnownStatsModuleTraceDependency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnownStatsModuleTraceDependency]
  }
  
  extension [Self <: KnownStatsModuleTraceDependency](x: Self) {
    
    inline def setLoc(value: String): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
  }
}
