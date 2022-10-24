package typings.wixStyleReact.anon

import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeType extends StObject {
  
  var size: Validator[String]
  
  var `type`: Validator[String]
}
object SizeType {
  
  inline def apply(size: Validator[String], `type`: Validator[String]): SizeType = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeType]
  }
  
  extension [Self <: SizeType](x: Self) {
    
    inline def setSize(value: Validator[String]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: Validator[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
