package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Hash")
@js.native
class Hash ()
  extends typescriptDashServicesLib.TypeScriptNs.Hash

/* static members */
@JSImport("typescript-services", "Hash")
@js.native
object Hash extends js.Object {
  var FNV_BASE: js.Any = js.native
  var FNV_PRIME: js.Any = js.native
  var primes: js.Any = js.native
  def combine(value: scala.Double, currentHash: scala.Double): scala.Double = js.native
  /* private */ def computeFnv1aCharArrayHashCode(text: js.Any, start: js.Any, len: js.Any): js.Any = js.native
  def computeMurmur2StringHashCode(key: java.lang.String, seed: scala.Double): scala.Double = js.native
  def computeSimple31BitCharArrayHashCode(key: js.Array[scala.Double], start: scala.Double, len: scala.Double): scala.Double = js.native
  def computeSimple31BitStringHashCode(key: java.lang.String): scala.Double = js.native
  def expandPrime(oldSize: scala.Double): scala.Double = js.native
  def getPrime(min: scala.Double): scala.Double = js.native
}

