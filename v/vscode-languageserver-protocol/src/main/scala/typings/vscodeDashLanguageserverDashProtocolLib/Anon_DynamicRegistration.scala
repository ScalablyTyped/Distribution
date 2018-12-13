package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_DynamicRegistration extends js.Object {
  /**
               * Whether declaration supports dynamic registration. If this is set to `true`
               * the client supports the new `(TextDocumentRegistrationOptions & StaticRegistrationOptions)`
               * return value for the corresponding server capability as well.
               */
  var dynamicRegistration: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * The client supports additional metadata in the form of declaration links.
               */
  var linkSupport: js.UndefOr[scala.Boolean] = js.undefined
}

