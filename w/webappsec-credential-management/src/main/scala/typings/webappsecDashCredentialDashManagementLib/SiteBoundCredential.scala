package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the specific attributes shared by any Credential persisted in user
  * agent’s credential
  * store.
  */
@JSGlobal("SiteBoundCredential")
@js.native
abstract class SiteBoundCredential () extends CredentialBase {
  /**
    * A URL pointing to an image for the credential. This URL MUST be an
    * {@link
    * https://w3c.github.io/webappsec-mixed-content/#a-priori-authenticated-url|
    * a priori authenticated URL}.
    */
  val iconURL: java.lang.String | scala.Null = js.native
  /**
    * A name associated with the credential, intended as a human-understandable
    * public name.
    */
  val name: java.lang.String | scala.Null = js.native
}

