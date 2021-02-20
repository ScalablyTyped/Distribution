package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Hash")
@js.native
class Hash ()
  extends typings.typescriptServices.TypeScript.Hash
object Hash {
  
  @JSImport("typescript-services", "Hash")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "Hash.FNV_BASE")
  @js.native
  def FNV_BASE: js.Any = js.native
  @scala.inline
  def FNV_BASE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FNV_BASE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("typescript-services", "Hash.FNV_PRIME")
  @js.native
  def FNV_PRIME: js.Any = js.native
  @scala.inline
  def FNV_PRIME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FNV_PRIME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("typescript-services", "Hash.combine")
  @js.native
  def combine(value: Double, currentHash: Double): Double = js.native
  
  /* static member */
  @JSImport("typescript-services", "Hash.computeFnv1aCharArrayHashCode")
  @js.native
  def computeFnv1aCharArrayHashCode(text: js.Any, start: js.Any, len: js.Any): js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "Hash.computeMurmur2StringHashCode")
  @js.native
  def computeMurmur2StringHashCode(key: String, seed: Double): Double = js.native
  
  /* static member */
  @JSImport("typescript-services", "Hash.computeSimple31BitCharArrayHashCode")
  @js.native
  def computeSimple31BitCharArrayHashCode(key: js.Array[Double], start: Double, len: Double): Double = js.native
  
  /* static member */
  @JSImport("typescript-services", "Hash.computeSimple31BitStringHashCode")
  @js.native
  def computeSimple31BitStringHashCode(key: String): Double = js.native
  
  /* static member */
  @JSImport("typescript-services", "Hash.expandPrime")
  @js.native
  def expandPrime(oldSize: Double): Double = js.native
  
  /* static member */
  @JSImport("typescript-services", "Hash.getPrime")
  @js.native
  def getPrime(min: Double): Double = js.native
  
  /* static member */
  @JSImport("typescript-services", "Hash.primes")
  @js.native
  def primes: js.Any = js.native
  @scala.inline
  def primes_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primes")(x.asInstanceOf[js.Any])
}
