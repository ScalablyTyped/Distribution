package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Line extends StObject {
  
  var line: Any
  
  var skin: Any
}
object Line {
  
  inline def apply(line: Any, skin: Any): Line = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], skin = skin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
  
  extension [Self <: Line](x: Self) {
    
    inline def setLine(value: Any): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setSkin(value: Any): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
  }
}
