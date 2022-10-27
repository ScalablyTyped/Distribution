package typings.vite.anon

import typings.rollup.mod.SourceMapInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InMap extends StObject {
  
  var inMap: js.UndefOr[SourceMapInput] = js.undefined
  
  var ssr: js.UndefOr[Boolean] = js.undefined
}
object InMap {
  
  inline def apply(): InMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InMap]
  }
  
  extension [Self <: InMap](x: Self) {
    
    inline def setInMap(value: SourceMapInput): Self = StObject.set(x, "inMap", value.asInstanceOf[js.Any])
    
    inline def setInMapNull: Self = StObject.set(x, "inMap", null)
    
    inline def setInMapUndefined: Self = StObject.set(x, "inMap", js.undefined)
    
    inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
    
    inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
  }
}
