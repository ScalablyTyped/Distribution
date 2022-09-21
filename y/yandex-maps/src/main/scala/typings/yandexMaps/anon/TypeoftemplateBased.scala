package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable1
import typings.yandexMaps.mod.layout.templateBased.Base
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeoftemplateBased extends StObject {
  
  var Base: Instantiable1[/* data */ js.Object, typings.yandexMaps.mod.layout.templateBased.Base]
}
object TypeoftemplateBased {
  
  inline def apply(Base: Instantiable1[/* data */ js.Object, Base]): TypeoftemplateBased = {
    val __obj = js.Dynamic.literal(Base = Base.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeoftemplateBased]
  }
  
  extension [Self <: TypeoftemplateBased](x: Self) {
    
    inline def setBase(value: Instantiable1[/* data */ js.Object, Base]): Self = StObject.set(x, "Base", value.asInstanceOf[js.Any])
  }
}
