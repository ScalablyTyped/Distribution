package typings.wouter.anon

import typings.wouter.wouterUseLocationMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait To extends StObject {
  
  var href: Path
  
  var to: js.UndefOr[scala.Nothing] = js.undefined
}
object To {
  
  inline def apply(href: Path): To = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[To]
  }
  
  extension [Self <: To](x: Self) {
    
    inline def setHref(value: Path): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
  }
}
