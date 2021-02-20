package typings.vegaLite.anon

import typings.vegaLite.toplevelMod.AutoSizeParams
import typings.vegaLite.toplevelMod.AutosizeType
import typings.vegaLite.vegaLiteStrings.container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  autosize :vega-lite.vega-lite/build/src/spec/toplevel.AutosizeType | vega-lite.vega-lite/build/src/spec/toplevel.AutoSizeParams} & vega-lite.vega-lite/build/src/spec.LayoutSizeMixins */
@js.native
trait autosizeAutosizeTypeAutoS extends StObject {
  
  var autosize: AutosizeType | AutoSizeParams = js.native
  
  /**
    * The height of a visualization.
    *
    * - For a plot with a continuous y-field, height should be a number.
    * - For a plot with either a discrete y-field or no y-field, height can be either a number indicating a fixed height or an object in the form of `{step: number}` defining the height per discrete step. (No y-field is equivalent to having one discrete step.)
    * - To enable responsive sizing on height, it should be set to `"container"`.
    *
    * __Default value:__ Based on `config.view.continuousHeight` for a plot with a continuous y-field and `config.view.discreteHeight` otherwise.
    *
    * __Note:__ For plots with [`row` and `column` channels](https://vega.github.io/vega-lite/docs/encoding.html#facet), this represents the height of a single view and the `"container"` option cannot be used.
    *
    * __See also:__ [`height`](https://vega.github.io/vega-lite/docs/size.html) documentation.
    */
  var height: js.UndefOr[Double | container | typings.vegaLite.specBaseMod.Step] = js.native
  
  /**
    * The width of a visualization.
    *
    * - For a plot with a continuous x-field, width should be a number.
    * - For a plot with either a discrete x-field or no x-field, width can be either a number indicating a fixed width or an object in the form of `{step: number}` defining the width per discrete step. (No x-field is equivalent to having one discrete step.)
    * - To enable responsive sizing on width, it should be set to `"container"`.
    *
    * __Default value:__
    * Based on `config.view.continuousWidth` for a plot with a continuous x-field and `config.view.discreteWidth` otherwise.
    *
    * __Note:__ For plots with [`row` and `column` channels](https://vega.github.io/vega-lite/docs/encoding.html#facet), this represents the width of a single view and the `"container"` option cannot be used.
    *
    * __See also:__ [`width`](https://vega.github.io/vega-lite/docs/size.html) documentation.
    */
  var width: js.UndefOr[Double | container | typings.vegaLite.specBaseMod.Step] = js.native
}
object autosizeAutosizeTypeAutoS {
  
  @scala.inline
  def apply(autosize: AutosizeType | AutoSizeParams): autosizeAutosizeTypeAutoS = {
    val __obj = js.Dynamic.literal(autosize = autosize.asInstanceOf[js.Any])
    __obj.asInstanceOf[autosizeAutosizeTypeAutoS]
  }
  
  @scala.inline
  implicit class autosizeAutosizeTypeAutoSMutableBuilder[Self <: autosizeAutosizeTypeAutoS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutosize(value: AutosizeType | AutoSizeParams): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double | container | typings.vegaLite.specBaseMod.Step): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | container | typings.vegaLite.specBaseMod.Step): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
