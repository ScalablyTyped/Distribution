package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SrcString extends StObject {
  
  var src: String
  
  var status: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImageStatus */ js.Any
}
object SrcString {
  
  inline def apply(
    src: String,
    status: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImageStatus */ js.Any
  ): SrcString = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SrcString]
  }
  
  extension [Self <: SrcString](x: Self) {
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setStatus(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImageStatus */ js.Any
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
