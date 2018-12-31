package typings
package visionLib.visionMod.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var helpersPath: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** if set to false, templates will not be cached (thus will be read from file on every use). Defaults to true. */
  var isCached: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The root file path, or array of file paths, where partials are located.
    * Partials are small segments of template code that can be nested and reused throughout other templates.
    * Defaults to no partials support (empty path).
    */
  var partialsPath: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

