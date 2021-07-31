package typings.vegaLite.specBaseMod

import typings.vegaLite.vegaSchemaMod.RowCol
import typings.vegaTypings.layoutMod.LayoutAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericCompositionLayout
  extends StObject
     with BoundsMixins {
  
  /**
    * The alignment to apply to grid rows and columns.
    * The supported string values are `"all"`, `"each"`, and `"none"`.
    *
    * - For `"none"`, a flow layout will be used, in which adjacent subviews are simply placed one after the other.
    * - For `"each"`, subviews will be aligned into a clean grid structure, but each row or column may be of variable size.
    * - For `"all"`, subviews will be aligned and each row or column will be sized identically based on the maximum observed size. String values for this property will be applied to both grid rows and columns.
    *
    * Alternatively, an object value of the form `{"row": string, "column": string}` can be used to supply different alignments for rows and columns.
    *
    * __Default value:__ `"all"`.
    */
  var align: js.UndefOr[LayoutAlign | RowCol[LayoutAlign]] = js.undefined
  
  /**
    * Boolean flag indicating if subviews should be centered relative to their respective rows or columns.
    *
    * An object value of the form `{"row": boolean, "column": boolean}` can be used to supply different centering values for rows and columns.
    *
    * __Default value:__ `false`
    */
  var center: js.UndefOr[Boolean | RowCol[Boolean]] = js.undefined
  
  /**
    * The spacing in pixels between sub-views of the composition operator.
    * An object of the form `{"row": number, "column": number}` can be used to set
    * different spacing values for rows and columns.
    *
    * __Default value__: Depends on `"spacing"` property of [the view composition configuration](https://vega.github.io/vega-lite/docs/config.html#view-config) (`20` by default)
    */
  var spacing: js.UndefOr[Double | RowCol[Double]] = js.undefined
}
object GenericCompositionLayout {
  
  @scala.inline
  def apply(): GenericCompositionLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericCompositionLayout]
  }
  
  @scala.inline
  implicit class GenericCompositionLayoutMutableBuilder[Self <: GenericCompositionLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: LayoutAlign | RowCol[LayoutAlign]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setCenter(value: Boolean | RowCol[Boolean]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double | RowCol[Double]): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
