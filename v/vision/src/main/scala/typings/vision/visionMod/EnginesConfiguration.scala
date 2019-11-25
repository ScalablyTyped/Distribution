package typings.vision.visionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnginesConfiguration extends js.Object {
  /** defines the default filename extension to append to template names when multiple engines are configured and no explicit extension is provided for a given template. No default value. */
  var defaultExtension: js.UndefOr[String] = js.undefined
  /**
    * Required object where each key is a file extension (e.g. 'html', 'hbr'), mapped to the npm module used for rendering the templates.
    * Alternatively, the extension can be mapped to an object
    */
  var engines: StringDictionary[NpmModule] | ServerViewsEnginesOptions
}

object EnginesConfiguration {
  @scala.inline
  def apply(engines: StringDictionary[NpmModule] | ServerViewsEnginesOptions, defaultExtension: String = null): EnginesConfiguration = {
    val __obj = js.Dynamic.literal(engines = engines.asInstanceOf[js.Any])
    if (defaultExtension != null) __obj.updateDynamic("defaultExtension")(defaultExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnginesConfiguration]
  }
}

