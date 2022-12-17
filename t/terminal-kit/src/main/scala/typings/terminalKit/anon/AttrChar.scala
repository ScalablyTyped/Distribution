package typings.terminalKit.anon

import typings.terminalKit.screenBufferMod.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrChar extends StObject {
  
  var attr: Attributes
  
  var char: String
}
object AttrChar {
  
  inline def apply(attr: Attributes, char: String): AttrChar = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrChar]
  }
  
  extension [Self <: AttrChar](x: Self) {
    
    inline def setAttr(value: Attributes): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setChar(value: String): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
  }
}
