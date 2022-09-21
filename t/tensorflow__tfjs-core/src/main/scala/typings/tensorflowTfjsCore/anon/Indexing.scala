package typings.tensorflowTfjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indexing extends StObject {
  
  var indexing: js.UndefOr[String] = js.undefined
}
object Indexing {
  
  inline def apply(): Indexing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Indexing]
  }
  
  extension [Self <: Indexing](x: Self) {
    
    inline def setIndexing(value: String): Self = StObject.set(x, "indexing", value.asInstanceOf[js.Any])
    
    inline def setIndexingUndefined: Self = StObject.set(x, "indexing", js.undefined)
  }
}
