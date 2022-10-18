package typings.tsLoader.distInterfacesMod

import typings.typescript.mod.FileReference
import typings.typescript.mod.ModuleKind.CommonJS
import typings.typescript.mod.ModuleKind.ESNext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSInternal extends StObject {
  
  var getModeForFileReference: js.UndefOr[
    js.Function2[
      /* ref */ FileReference | String, 
      /* containingFileMode */ js.UndefOr[ESNext | CommonJS], 
      js.UndefOr[ESNext | CommonJS]
    ]
  ] = js.undefined
}
object TSInternal {
  
  inline def apply(): TSInternal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TSInternal]
  }
  
  extension [Self <: TSInternal](x: Self) {
    
    inline def setGetModeForFileReference(
      value: (/* ref */ FileReference | String, /* containingFileMode */ js.UndefOr[ESNext | CommonJS]) => js.UndefOr[ESNext | CommonJS]
    ): Self = StObject.set(x, "getModeForFileReference", js.Any.fromFunction2(value))
    
    inline def setGetModeForFileReferenceUndefined: Self = StObject.set(x, "getModeForFileReference", js.undefined)
  }
}
