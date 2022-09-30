package typings.typeFest

import typings.typeFest.typeFestInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numericMod {
  
  type Finite[T /* <: Double */] = T
  
  type Float[T /* <: Double */] = T
  
  type Integer[T /* <: Double */] = T
  
  type Negative[T /* <: Numeric */] = T
  
  type NegativeFloat[T /* <: Double */] = Negative[Float[T]]
  
  type NegativeInfinity = /* -1e999 */ Double
  
  type NegativeInteger[T /* <: Double */] = Negative[Integer[T]]
  
  type NonNegative[T /* <: Numeric */] = T
  
  type NonNegativeInteger[T /* <: Double */] = NonNegative[Integer[T]]
  
  type Numeric = Double | js.BigInt
  
  type PositiveInfinity = /* 1e999 */ Double
  
  type Zero = `0`
}
