package typings.vegaLite.buildSrcSpecBaseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositionConfig
  extends StObject
     with ColumnMixins {
  
  /**
    * The default spacing in pixels between composed sub-views.
    *
    * __Default value__: `20`
    */
  var spacing: js.UndefOr[Double] = js.undefined
}
object CompositionConfig {
  
  inline def apply(): CompositionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompositionConfig] (val x: Self) extends AnyVal {
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
