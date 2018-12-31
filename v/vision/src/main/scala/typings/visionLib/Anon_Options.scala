package typings
package visionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  /** optional object used by the template to render context-specific result. Defaults to no context {}. */
  var context: js.UndefOr[js.Object] = js.undefined
  /**
    * optional object used to override the server's views manager configuration for this response.
    * Cannot override isCached, partialsPath, or helpersPath which are only loaded at initialization.
    * TODO check if it can have `defaultExtension`.
    */
  var options: js.UndefOr[visionLib.visionMod.visionNs.ViewHandlerOrReplyOptions] = js.undefined
  /** the template filename and path, relative to the templates path configured via the server views manager. */
  var template: java.lang.String
}

