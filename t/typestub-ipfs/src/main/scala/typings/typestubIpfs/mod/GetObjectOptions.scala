package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectOptions extends StObject {
  
  var enc: js.UndefOr[Any] = js.undefined
}
object GetObjectOptions {
  
  inline def apply(): GetObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetObjectOptions] (val x: Self) extends AnyVal {
    
    inline def setEnc(value: Any): Self = StObject.set(x, "enc", value.asInstanceOf[js.Any])
    
    inline def setEncUndefined: Self = StObject.set(x, "enc", js.undefined)
  }
}
