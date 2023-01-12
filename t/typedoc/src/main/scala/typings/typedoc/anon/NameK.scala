package typings.typedoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameK[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 67, starting with typings.typedoc.typedocStrings.searchCategoryBoosts, typings.typedoc.typedocStrings.version, typings.typedoc.typedocStrings.out */ Any */] extends StObject {
  
  var name: K
}
object NameK {
  
  inline def apply[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 67, starting with typings.typedoc.typedocStrings.searchCategoryBoosts, typings.typedoc.typedocStrings.version, typings.typedoc.typedocStrings.out */ Any */](name: K): NameK[K] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameK[K]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameK[?], K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 67, starting with typings.typedoc.typedocStrings.searchCategoryBoosts, typings.typedoc.typedocStrings.version, typings.typedoc.typedocStrings.out */ Any */] (val x: Self & NameK[K]) extends AnyVal {
    
    inline def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
