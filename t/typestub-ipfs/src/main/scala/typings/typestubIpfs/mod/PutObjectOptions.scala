package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectOptions extends StObject {
  
  var enc: js.UndefOr[Any] = js.undefined
}
object PutObjectOptions {
  
  inline def apply(): PutObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutObjectOptions]
  }
  
  extension [Self <: PutObjectOptions](x: Self) {
    
    inline def setEnc(value: Any): Self = StObject.set(x, "enc", value.asInstanceOf[js.Any])
    
    inline def setEncUndefined: Self = StObject.set(x, "enc", js.undefined)
  }
}
