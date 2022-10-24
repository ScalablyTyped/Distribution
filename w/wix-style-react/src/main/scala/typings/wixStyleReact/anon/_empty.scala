package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _empty extends StObject {
  
  @JSName("&")
  var Ampersand: Margin
  
  @JSName("& > *")
  var `Ampersand Greaterthansign Asterisk`: MarginString
}
object _empty {
  
  inline def apply(Ampersand: Margin, `Ampersand Greaterthansign Asterisk`: MarginString): _empty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("&")(Ampersand.asInstanceOf[js.Any])
    __obj.updateDynamic("& > *")((`Ampersand Greaterthansign Asterisk`).asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty]
  }
  
  extension [Self <: _empty](x: Self) {
    
    inline def setAmpersand(value: Margin): Self = StObject.set(x, "&", value.asInstanceOf[js.Any])
    
    inline def `setAmpersand Greaterthansign Asterisk`(value: MarginString): Self = StObject.set(x, "& > *", value.asInstanceOf[js.Any])
  }
}
