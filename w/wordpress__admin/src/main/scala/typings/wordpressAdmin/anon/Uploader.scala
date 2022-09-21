package typings.wordpressAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uploader extends StObject {
  
  var uploader: js.UndefOr[Params] = js.undefined
}
object Uploader {
  
  inline def apply(): Uploader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Uploader]
  }
  
  extension [Self <: Uploader](x: Self) {
    
    inline def setUploader(value: Params): Self = StObject.set(x, "uploader", value.asInstanceOf[js.Any])
    
    inline def setUploaderUndefined: Self = StObject.set(x, "uploader", js.undefined)
  }
}
