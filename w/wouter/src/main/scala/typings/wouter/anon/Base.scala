package typings.wouter.anon

import typings.wouter.useLocationMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base extends StObject {
  
  var base: js.UndefOr[Path] = js.undefined
}
object Base {
  
  inline def apply(): Base = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Base]
  }
  
  extension [Self <: Base](x: Self) {
    
    inline def setBase(value: Path): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
  }
}
