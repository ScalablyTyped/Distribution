package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectOptions extends StObject {
  
  var enc: js.UndefOr[js.Any] = js.undefined
}
object GetObjectOptions {
  
  @scala.inline
  def apply(): GetObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectOptions]
  }
  
  @scala.inline
  implicit class GetObjectOptionsMutableBuilder[Self <: GetObjectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnc(value: js.Any): Self = StObject.set(x, "enc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncUndefined: Self = StObject.set(x, "enc", js.undefined)
  }
}
