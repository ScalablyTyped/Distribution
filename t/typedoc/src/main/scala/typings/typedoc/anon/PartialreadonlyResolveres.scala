package typings.typedoc.anon

import typings.typedoc.typedocStrings.expand
import typings.typedoc.typedocStrings.packages
import typings.typedoc.typedocStrings.resolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{ readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'}> */
trait PartialreadonlyResolveres extends StObject {
  
  var Expand: js.UndefOr[expand] = js.undefined
  
  var Packages: js.UndefOr[packages] = js.undefined
  
  var Resolve: js.UndefOr[resolve] = js.undefined
}
object PartialreadonlyResolveres {
  
  inline def apply(): PartialreadonlyResolveres = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialreadonlyResolveres]
  }
  
  extension [Self <: PartialreadonlyResolveres](x: Self) {
    
    inline def setExpand(value: expand): Self = StObject.set(x, "Expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "Expand", js.undefined)
    
    inline def setPackages(value: packages): Self = StObject.set(x, "Packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "Packages", js.undefined)
    
    inline def setResolve(value: resolve): Self = StObject.set(x, "Resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveUndefined: Self = StObject.set(x, "Resolve", js.undefined)
  }
}
