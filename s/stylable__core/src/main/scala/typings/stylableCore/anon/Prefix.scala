package typings.stylableCore.anon

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Prefix extends StObject {
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var used: js.UndefOr[Map[String, Namespace]] = js.undefined
}
object Prefix {
  
  inline def apply(): Prefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prefix]
  }
  
  extension [Self <: Prefix](x: Self) {
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setUsed(value: Map[String, Namespace]): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    
    inline def setUsedUndefined: Self = StObject.set(x, "used", js.undefined)
  }
}
