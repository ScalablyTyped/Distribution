package typings.yaireoTagify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base interface for tag data. A tag always requires a value, but may have
  * more custom properties.
  *
  * `value` property must be unique, i.e. no two different tags may share the
  * same value.
  *
  * Note to TypeScript users: you can parametrize the tagify instance with a
  * type parameter that extends this interface for additional type safety.
  */
trait BaseTagData extends StObject {
  
  var value: String
}
object BaseTagData {
  
  inline def apply(value: String): BaseTagData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTagData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseTagData] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
