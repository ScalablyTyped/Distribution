package typings.vision.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Includes `module` and any of the views options listed below (@see ServerViewsAdditionalOptions) (except defaultExtension) to override the defaults for a specific engine.
  */
@js.native
trait ServerViewsEnginesOptions extends ServerViewsConfiguration {
  
  /**
    * The npm module used for rendering the templates. The module object must contain the compile() function
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#serverviewsoptions} > options > engines > module
    */
  var module: NpmModule = js.native
}
object ServerViewsEnginesOptions {
  
  @scala.inline
  def apply(engines: StringDictionary[NpmModule] | ServerViewsEnginesOptions, module: NpmModule): ServerViewsEnginesOptions = {
    val __obj = js.Dynamic.literal(engines = engines.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerViewsEnginesOptions]
  }
  
  @scala.inline
  implicit class ServerViewsEnginesOptionsOps[Self <: ServerViewsEnginesOptions] (val x: Self) extends AnyVal {
    
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
    def setModule(value: NpmModule): Self = this.set("module", value.asInstanceOf[js.Any])
  }
}
