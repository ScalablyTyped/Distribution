package typings.vision.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerViewsConfiguration
  extends ViewHandlerOrReplyOptions
     with EnginesConfiguration {
  
  /**
    * The directory path, or array of directory paths, where helpers are located.
    * Helpers are functions used within templates to perform transformations and other data manipulations using the template context or other inputs.
    * Each '.js' file in the helpers directory is loaded and the file name is used as the helper name.
    * The files must export a single method with the signature function(context) and return a string.
    * Sub-folders are not supported and are ignored. Defaults to no helpers support (empty path).
    * Note that jade does not support loading helpers this way.
    */
  var helpersPath: js.UndefOr[String | js.Array[String]] = js.native
  
  /** if set to false, templates will not be cached (thus will be read from file on every use). Defaults to true. */
  var isCached: js.UndefOr[Boolean] = js.native
  
  /**
    * The root file path, or array of file paths, where partials are located.
    * Partials are small segments of template code that can be nested and reused throughout other templates.
    * Defaults to no partials support (empty path).
    */
  var partialsPath: js.UndefOr[String | js.Array[String]] = js.native
}
object ServerViewsConfiguration {
  
  @scala.inline
  def apply(engines: StringDictionary[NpmModule] | ServerViewsEnginesOptions): ServerViewsConfiguration = {
    val __obj = js.Dynamic.literal(engines = engines.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerViewsConfiguration]
  }
  
  @scala.inline
  implicit class ServerViewsConfigurationOps[Self <: ServerViewsConfiguration] (val x: Self) extends AnyVal {
    
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
    def setHelpersPathVarargs(value: String*): Self = this.set("helpersPath", js.Array(value :_*))
    
    @scala.inline
    def setHelpersPath(value: String | js.Array[String]): Self = this.set("helpersPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpersPath: Self = this.set("helpersPath", js.undefined)
    
    @scala.inline
    def setIsCached(value: Boolean): Self = this.set("isCached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCached: Self = this.set("isCached", js.undefined)
    
    @scala.inline
    def setPartialsPathVarargs(value: String*): Self = this.set("partialsPath", js.Array(value :_*))
    
    @scala.inline
    def setPartialsPath(value: String | js.Array[String]): Self = this.set("partialsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartialsPath: Self = this.set("partialsPath", js.undefined)
  }
}
