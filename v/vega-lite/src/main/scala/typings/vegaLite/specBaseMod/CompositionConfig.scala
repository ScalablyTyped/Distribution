package typings.vegaLite.specBaseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-lite.vega-lite/build/src/spec/base.ColumnMixins & {  spacing :number | undefined} */
@js.native
trait CompositionConfig extends StObject {
  
  /**
    * The number of columns to include in the view composition layout.
    *
    * __Default value__: `undefined` -- An infinite number of columns (a single row) will be assumed. This is equivalent to
    * `hconcat` (for `concat`) and to using the `column` channel (for `facet` and `repeat`).
    *
    * __Note__:
    *
    * 1) This property is only for:
    * - the general (wrappable) `concat` operator (not `hconcat`/`vconcat`)
    * - the `facet` and `repeat` operator with one field/repetition definition (without row/column nesting)
    *
    * 2) Setting the `columns` to `1` is equivalent to `vconcat` (for `concat`) and to using the `row` channel (for `facet` and `repeat`).
    */
  var columns: js.UndefOr[Double] = js.native
  
  /**
    * The default spacing in pixels between composed sub-views.
    *
    * __Default value__: `20`
    */
  var spacing: js.UndefOr[Double] = js.native
}
object CompositionConfig {
  
  @scala.inline
  def apply(): CompositionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositionConfig]
  }
  
  @scala.inline
  implicit class CompositionConfigMutableBuilder[Self <: CompositionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
