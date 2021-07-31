package typings.tsXor

import typings.tsXor.withoutTypeMod.Without
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xorTypeMod {
  
  type XOR[T, U] = T | U | ((Without[T, U]) & U) | ((Without[U, T]) & T)
}
