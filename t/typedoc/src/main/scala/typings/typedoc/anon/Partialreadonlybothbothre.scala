package typings.typedoc.anon

import typings.typedoc.typedocStrings.both
import typings.typedoc.typedocStrings.docs
import typings.typedoc.typedocStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{ readonly both :'both',  readonly docs :'docs',  readonly none :'none'}> */
trait Partialreadonlybothbothre extends StObject {
  
  var both: js.UndefOr[typings.typedoc.typedocStrings.both] = js.undefined
  
  var docs: js.UndefOr[typings.typedoc.typedocStrings.docs] = js.undefined
  
  var none: js.UndefOr[typings.typedoc.typedocStrings.none] = js.undefined
}
object Partialreadonlybothbothre {
  
  inline def apply(): Partialreadonlybothbothre = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialreadonlybothbothre]
  }
  
  extension [Self <: Partialreadonlybothbothre](x: Self) {
    
    inline def setBoth(value: both): Self = StObject.set(x, "both", value.asInstanceOf[js.Any])
    
    inline def setBothUndefined: Self = StObject.set(x, "both", js.undefined)
    
    inline def setDocs(value: docs): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    inline def setNone(value: none): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
  }
}
