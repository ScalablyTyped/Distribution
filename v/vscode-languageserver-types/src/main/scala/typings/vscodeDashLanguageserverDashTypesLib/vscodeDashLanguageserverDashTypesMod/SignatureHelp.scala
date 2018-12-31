package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelp extends js.Object {
  /**
    * The active parameter of the active signature. Set to `null`
    * if the active signature has no parameters.
    */
  var activeParameter: scala.Double | scala.Null
  /**
    * The active signature. Set to `null` if no
    * signatures exist.
    */
  var activeSignature: scala.Double | scala.Null
  /**
    * One or more signatures.
    */
  var signatures: js.Array[SignatureInformation]
}

