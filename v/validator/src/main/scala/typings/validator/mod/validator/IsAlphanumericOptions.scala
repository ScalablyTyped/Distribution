package typings.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsAlphanumericOptions extends StObject {
  
  /**
    * @default undefined
    */
  var ignore: js.UndefOr[String | js.RegExp] = js.undefined
}
object IsAlphanumericOptions {
  
  inline def apply(): IsAlphanumericOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsAlphanumericOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsAlphanumericOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnore(value: String | js.RegExp): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
  }
}
