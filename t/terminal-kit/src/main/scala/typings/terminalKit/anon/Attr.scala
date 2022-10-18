package typings.terminalKit.anon

import typings.terminalKit.screenBufferMod.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attr extends StObject {
  
  var attr: Attributes | Double
  
  var char: js.UndefOr[String] = js.undefined
}
object Attr {
  
  inline def apply(attr: Attributes | Double): Attr = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attr]
  }
  
  extension [Self <: Attr](x: Self) {
    
    inline def setAttr(value: Attributes | Double): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setChar(value: String): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
    
    inline def setCharUndefined: Self = StObject.set(x, "char", js.undefined)
  }
}
