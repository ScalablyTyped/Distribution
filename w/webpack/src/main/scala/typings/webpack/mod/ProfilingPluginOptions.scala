package typings.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfilingPluginOptions extends js.Object {
  
  /**
  	 * Path to the output file e.g. `profiling/events.json`. Defaults to `events.json`.
  	 */
  var outputPath: js.UndefOr[String] = js.native
}
object ProfilingPluginOptions {
  
  @scala.inline
  def apply(): ProfilingPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfilingPluginOptions]
  }
  
  @scala.inline
  implicit class ProfilingPluginOptionsOps[Self <: ProfilingPluginOptions] (val x: Self) extends AnyVal {
    
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
    def setOutputPath(value: String): Self = this.set("outputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputPath: Self = this.set("outputPath", js.undefined)
  }
}
