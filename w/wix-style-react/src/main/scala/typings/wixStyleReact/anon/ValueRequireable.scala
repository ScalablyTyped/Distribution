package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueRequireable extends StObject {
  
  var value: Requireable[String]
}
object ValueRequireable {
  
  inline def apply(value: Requireable[String]): ValueRequireable = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueRequireable]
  }
  
  extension [Self <: ValueRequireable](x: Self) {
    
    inline def setValue(value: Requireable[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
