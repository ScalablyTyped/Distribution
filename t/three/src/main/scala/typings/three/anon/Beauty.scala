package typings.three.anon

import typings.three.threeInts.`3`
import typings.three.threeInts.`4`
import typings.three.threeInts.`5`
import typings.three.threeInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Beauty extends StObject {
  
  var Beauty: `3`
  
  var Default: typings.three.threeInts.`0`
  
  var Depth: `4`
  
  var Metalness: `7`
  
  var Normal: `5`
  
  var SSR: typings.three.threeInts.`1`
}
object Beauty {
  
  inline def apply(): Beauty = {
    val __obj = js.Dynamic.literal(Beauty = 3, Default = 0, Depth = 4, Metalness = 7, Normal = 5, SSR = 1)
    __obj.asInstanceOf[Beauty]
  }
  
  extension [Self <: Beauty](x: Self) {
    
    inline def setBeauty(value: `3`): Self = StObject.set(x, "Beauty", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: typings.three.threeInts.`0`): Self = StObject.set(x, "Default", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: `4`): Self = StObject.set(x, "Depth", value.asInstanceOf[js.Any])
    
    inline def setMetalness(value: `7`): Self = StObject.set(x, "Metalness", value.asInstanceOf[js.Any])
    
    inline def setNormal(value: `5`): Self = StObject.set(x, "Normal", value.asInstanceOf[js.Any])
    
    inline def setSSR(value: typings.three.threeInts.`1`): Self = StObject.set(x, "SSR", value.asInstanceOf[js.Any])
  }
}
