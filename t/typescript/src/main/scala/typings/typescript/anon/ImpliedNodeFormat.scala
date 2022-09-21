package typings.typescript.anon

import typings.typescript.mod.ModuleKind.CommonJS
import typings.typescript.mod.ModuleKind.ESNext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImpliedNodeFormat extends StObject {
  
  var impliedNodeFormat: js.UndefOr[ESNext | CommonJS] = js.undefined
}
object ImpliedNodeFormat {
  
  inline def apply(): ImpliedNodeFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImpliedNodeFormat]
  }
  
  extension [Self <: ImpliedNodeFormat](x: Self) {
    
    inline def setImpliedNodeFormat(value: ESNext | CommonJS): Self = StObject.set(x, "impliedNodeFormat", value.asInstanceOf[js.Any])
    
    inline def setImpliedNodeFormatUndefined: Self = StObject.set(x, "impliedNodeFormat", js.undefined)
  }
}
