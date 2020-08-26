package typings.vision.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnginesConfiguration extends js.Object {
  /** defines the default filename extension to append to template names when multiple engines are configured and no explicit extension is provided for a given template. No default value. */
  var defaultExtension: js.UndefOr[String] = js.native
  /**
    * Required object where each key is a file extension (e.g. 'html', 'hbr'), mapped to the npm module used for rendering the templates.
    * Alternatively, the extension can be mapped to an object
    */
  var engines: StringDictionary[NpmModule] | ServerViewsEnginesOptions = js.native
}

object EnginesConfiguration {
  @scala.inline
  def apply(engines: StringDictionary[NpmModule] | ServerViewsEnginesOptions): EnginesConfiguration = {
    val __obj = js.Dynamic.literal(engines = engines.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnginesConfiguration]
  }
  @scala.inline
  implicit class EnginesConfigurationOps[Self <: EnginesConfiguration] (val x: Self) extends AnyVal {
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
    def setEngines(value: StringDictionary[NpmModule] | ServerViewsEnginesOptions): Self = this.set("engines", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultExtension(value: String): Self = this.set("defaultExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultExtension: Self = this.set("defaultExtension", js.undefined)
  }
  
}

