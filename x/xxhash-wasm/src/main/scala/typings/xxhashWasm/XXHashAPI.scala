package typings.xxhashWasm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XXHashAPI extends StObject {
  
  def create32(): XXHash[Double] = js.native
  def create32(seed: Double): XXHash[Double] = js.native
  
  def create64(): XXHash[js.BigInt] = js.native
  def create64(seed: js.BigInt): XXHash[js.BigInt] = js.native
  
  def h32(input: String): Double = js.native
  def h32(input: String, seed: Double): Double = js.native
  
  def h32Raw(inputBuffer: js.typedarray.Uint8Array): Double = js.native
  def h32Raw(inputBuffer: js.typedarray.Uint8Array, seed: Double): Double = js.native
  
  def h32ToString(input: String): String = js.native
  def h32ToString(input: String, seed: Double): String = js.native
  
  def h64(input: String): js.BigInt = js.native
  def h64(input: String, seed: js.BigInt): js.BigInt = js.native
  
  def h64Raw(inputBuffer: js.typedarray.Uint8Array): js.BigInt = js.native
  def h64Raw(inputBuffer: js.typedarray.Uint8Array, seed: js.BigInt): js.BigInt = js.native
  
  def h64ToString(input: String): String = js.native
  def h64ToString(input: String, seed: js.BigInt): String = js.native
}
