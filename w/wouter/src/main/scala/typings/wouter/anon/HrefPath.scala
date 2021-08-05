package typings.wouter.anon

import typings.wouter.useLocationMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HrefPath extends StObject {
  
  var href: Path
  
  var to: js.UndefOr[scala.Nothing] = js.undefined
}
object HrefPath {
  
  inline def apply(href: Path): HrefPath = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[HrefPath]
  }
  
  extension [Self <: HrefPath](x: Self) {
    
    inline def setHref(value: Path): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
  }
}
