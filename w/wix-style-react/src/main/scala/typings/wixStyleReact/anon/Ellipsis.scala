package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ellipsis extends StObject {
  
  var ellipsis: Requireable[Boolean]
  
  var id: Validator[String]
  
  var skin: Validator[String]
  
  var subtitle: Requireable[String]
  
  var text: Validator[String]
}
object Ellipsis {
  
  inline def apply(
    ellipsis: Requireable[Boolean],
    id: Validator[String],
    skin: Validator[String],
    subtitle: Requireable[String],
    text: Validator[String]
  ): Ellipsis = {
    val __obj = js.Dynamic.literal(ellipsis = ellipsis.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], skin = skin.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ellipsis]
  }
  
  extension [Self <: Ellipsis](x: Self) {
    
    inline def setEllipsis(value: Requireable[Boolean]): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    inline def setId(value: Validator[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSkin(value: Validator[String]): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: Requireable[String]): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setText(value: Validator[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
