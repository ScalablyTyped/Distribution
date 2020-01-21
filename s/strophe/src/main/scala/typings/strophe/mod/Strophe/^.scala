package typings.strophe.mod.Strophe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strophe", "Strophe")
@js.native
object ^ extends js.Object {
  /** Constants: SASL mechanisms
    *  Available authentication mechanisms
    *
    *  Strophe.SASLAnonymous - SASL Anonymous authentication.
    *  Strophe.SASLPlain - SASL Plain authentication.
    *  Strophe.SASLMD5 - SASL Digest-MD5 authentication
    *  Strophe.SASLSHA1 - SASL SCRAM-SHA1 authentication
    */
  var SASLAnonymous: SASLMechanism = js.native
  var SASLMD5: SASLMechanism = js.native
  var SASLPlain: SASLMechanism = js.native
  var SASLSHA1: SASLMechanism = js.native
  /** Constant: VERSION
    *  The version of the Strophe library. Unreleased builds will have
    *  a version of head-HASH where HASH is a partial revision.
    */
  var VERSION: String = js.native
}

