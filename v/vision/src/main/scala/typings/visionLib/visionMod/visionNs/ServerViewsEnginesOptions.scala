package typings
package visionLib.visionMod.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Includes `module` and any of the views options listed below (@see ServerViewsAdditionalOptions) (except defaultExtension) to override the defaults for a specific engine.
  */
trait ServerViewsEnginesOptions extends ServerViewsConfiguration {
  /**
    * The npm module used for rendering the templates. The module object must contain the compile() function
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#serverviewsoptions} > options > engines > module
    */
  var module: NpmModule
}

