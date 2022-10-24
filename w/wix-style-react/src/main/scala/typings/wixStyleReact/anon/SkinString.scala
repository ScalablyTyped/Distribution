package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkinString extends StObject {
  
  var skin: String
}
object SkinString {
  
  inline def apply(skin: String): SkinString = {
    val __obj = js.Dynamic.literal(skin = skin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkinString]
  }
  
  extension [Self <: SkinString](x: Self) {
    
    inline def setSkin(value: String): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
  }
}
