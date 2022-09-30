package typings.tsToolbelt

import typings.tsToolbelt.equalsMod.Equals
import typings.tsToolbelt.greaterMod._Greater
import typings.tsToolbelt.iterationMod.Iteration
import typings.tsToolbelt.iterationOfMod.IterationOf
import typings.tsToolbelt.orMod.Or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object greaterEqMod {
  
  type GreaterEq[N1 /* <: Double */, N2 /* <: Double */] = _GreaterEq[IterationOf[N1], IterationOf[N2]]
  
  type _GreaterEq[N1 /* <: Iteration */, N2 /* <: Iteration */] = Or[Equals[N1, N2], _Greater[N1, N2]]
}
