package typings.xxhashWasm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XXHash[T] extends StObject {
  
  def digest(): T = js.native
  
  def update(input: String): XXHash[T] = js.native
  def update(input: js.typedarray.Uint8Array): XXHash[T] = js.native
}
