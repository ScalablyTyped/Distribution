package typings.webpack.webpackOptionsMod

import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackStrings.error
import typings.webpack.webpackStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceOptions extends StObject {
  
  /**
  	 * Filter function to select assets that are checked
  	 */
  var assetFilter: js.UndefOr[js.Function] = js.undefined
  
  /**
  	 * Sets the format of the hints: warnings, errors or nothing at all
  	 */
  var hints: js.UndefOr[`false` | warning | error] = js.undefined
  
  /**
  	 * Filesize limit (in bytes) when exceeded, that webpack will provide performance hints
  	 */
  var maxAssetSize: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Total size of an entry point (in bytes)
  	 */
  var maxEntrypointSize: js.UndefOr[Double] = js.undefined
}
object PerformanceOptions {
  
  @scala.inline
  def apply(): PerformanceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceOptions]
  }
  
  @scala.inline
  implicit class PerformanceOptionsMutableBuilder[Self <: PerformanceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetFilter(value: js.Function): Self = StObject.set(x, "assetFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetFilterUndefined: Self = StObject.set(x, "assetFilter", js.undefined)
    
    @scala.inline
    def setHints(value: `false` | warning | error): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
    
    @scala.inline
    def setMaxAssetSize(value: Double): Self = StObject.set(x, "maxAssetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAssetSizeUndefined: Self = StObject.set(x, "maxAssetSize", js.undefined)
    
    @scala.inline
    def setMaxEntrypointSize(value: Double): Self = StObject.set(x, "maxEntrypointSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxEntrypointSizeUndefined: Self = StObject.set(x, "maxEntrypointSize", js.undefined)
  }
}
