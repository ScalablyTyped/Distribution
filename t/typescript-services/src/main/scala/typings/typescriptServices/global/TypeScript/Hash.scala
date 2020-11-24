package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Hash")
@js.native
class Hash ()
  extends typings.typescriptServices.TypeScript.Hash
/* static members */
@JSGlobal("TypeScript.Hash")
@js.native
object Hash extends js.Object {
  
  var FNV_BASE: js.Any = js.native
  
  var FNV_PRIME: js.Any = js.native
  
  def combine(value: Double, currentHash: Double): Double = js.native
  
  /* private */ def computeFnv1aCharArrayHashCode(text: js.Any, start: js.Any, len: js.Any): js.Any = js.native
  
  def computeMurmur2StringHashCode(key: String, seed: Double): Double = js.native
  
  def computeSimple31BitCharArrayHashCode(key: js.Array[Double], start: Double, len: Double): Double = js.native
  
  def computeSimple31BitStringHashCode(key: String): Double = js.native
  
  def expandPrime(oldSize: Double): Double = js.native
  
  def getPrime(min: Double): Double = js.native
  
  var primes: js.Any = js.native
}
