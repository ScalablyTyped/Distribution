package typings.yaml.anon

import typings.yaml.yamlStrings.`1Dot1`
import typings.yaml.yamlStrings.`1Dot2`
import typings.yaml.yamlStrings.next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Explicit extends StObject {
  
  var explicit: js.UndefOr[Boolean] = js.undefined
  
  var version: `1Dot1` | `1Dot2` | next
}
object Explicit {
  
  inline def apply(version: `1Dot1` | `1Dot2` | next): Explicit = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explicit]
  }
  
  extension [Self <: Explicit](x: Self) {
    
    inline def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
    
    inline def setExplicitUndefined: Self = StObject.set(x, "explicit", js.undefined)
    
    inline def setVersion(value: `1Dot1` | `1Dot2` | next): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
