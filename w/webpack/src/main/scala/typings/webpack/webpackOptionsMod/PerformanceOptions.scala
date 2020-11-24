package typings.webpack.webpackOptionsMod

import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackStrings.error
import typings.webpack.webpackStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceOptions extends js.Object {
  
  /**
  	 * Filter function to select assets that are checked
  	 */
  var assetFilter: js.UndefOr[js.Function] = js.native
  
  /**
  	 * Sets the format of the hints: warnings, errors or nothing at all
  	 */
  var hints: js.UndefOr[`false` | warning | error] = js.native
  
  /**
  	 * Filesize limit (in bytes) when exceeded, that webpack will provide performance hints
  	 */
  var maxAssetSize: js.UndefOr[Double] = js.native
  
  /**
  	 * Total size of an entry point (in bytes)
  	 */
  var maxEntrypointSize: js.UndefOr[Double] = js.native
}
object PerformanceOptions {
  
  @scala.inline
  def apply(): PerformanceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceOptions]
  }
  
  @scala.inline
  implicit class PerformanceOptionsOps[Self <: PerformanceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssetFilter(value: js.Function): Self = this.set("assetFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetFilter: Self = this.set("assetFilter", js.undefined)
    
    @scala.inline
    def setHints(value: `false` | warning | error): Self = this.set("hints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHints: Self = this.set("hints", js.undefined)
    
    @scala.inline
    def setMaxAssetSize(value: Double): Self = this.set("maxAssetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAssetSize: Self = this.set("maxAssetSize", js.undefined)
    
    @scala.inline
    def setMaxEntrypointSize(value: Double): Self = this.set("maxEntrypointSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxEntrypointSize: Self = this.set("maxEntrypointSize", js.undefined)
  }
}
