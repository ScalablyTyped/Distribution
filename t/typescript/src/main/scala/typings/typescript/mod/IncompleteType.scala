package typings.typescript.mod

import typings.typescript.typescriptInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncompleteType
  extends StObject
     with FlowType {
  
  var flags: TypeFlags | `0`
  
  var `type`: Type
}
object IncompleteType {
  
  inline def apply(flags: TypeFlags | `0`, `type`: Type): IncompleteType = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncompleteType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncompleteType] (val x: Self) extends AnyVal {
    
    inline def setFlags(value: TypeFlags | `0`): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
