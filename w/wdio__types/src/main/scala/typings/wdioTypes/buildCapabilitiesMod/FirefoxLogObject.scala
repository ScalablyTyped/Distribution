package typings.wdioTypes.buildCapabilitiesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirefoxLogObject extends StObject {
  
  var level: FirefoxLogLevels
}
object FirefoxLogObject {
  
  inline def apply(level: FirefoxLogLevels): FirefoxLogObject = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirefoxLogObject]
  }
  
  extension [Self <: FirefoxLogObject](x: Self) {
    
    inline def setLevel(value: FirefoxLogLevels): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
