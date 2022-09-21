package typings.typedoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameK[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ Any */] extends StObject {
  
  var name: K
}
object NameK {
  
  inline def apply[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ Any */](name: K): NameK[K] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameK[K]]
  }
  
  extension [Self <: NameK[?], K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ Any */](x: Self & NameK[K]) {
    
    inline def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
