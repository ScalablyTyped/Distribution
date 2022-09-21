package typings.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillLayout
  extends StObject
     with Layout
     with _AnyLayout {
  
  var `fill-sort-key`: js.UndefOr[Double | Expression] = js.undefined
}
object FillLayout {
  
  inline def apply(): FillLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillLayout]
  }
  
  extension [Self <: FillLayout](x: Self) {
    
    inline def `setFill-sort-key`(value: Double | Expression): Self = StObject.set(x, "fill-sort-key", value.asInstanceOf[js.Any])
    
    inline def `setFill-sort-keyUndefined`: Self = StObject.set(x, "fill-sort-key", js.undefined)
  }
}
