package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable0
import typings.yandexMaps.mod.util.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofutil extends StObject {
  
  var Storage: Instantiable0[typings.yandexMaps.mod.util.Storage]
  
  val bounds: Typeofbounds
  
  val cursor: Typeofcursor
}
object Typeofutil {
  
  inline def apply(Storage: Instantiable0[Storage], bounds: Typeofbounds, cursor: Typeofcursor): Typeofutil = {
    val __obj = js.Dynamic.literal(Storage = Storage.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofutil]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofutil] (val x: Self) extends AnyVal {
    
    inline def setBounds(value: Typeofbounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setCursor(value: Typeofcursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: Instantiable0[Storage]): Self = StObject.set(x, "Storage", value.asInstanceOf[js.Any])
  }
}
