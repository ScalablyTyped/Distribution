package typings.tsToolbelt

import typings.tsToolbelt.isPositiveMod._IsPositive
import typings.tsToolbelt.iterationMod.Iteration
import typings.tsToolbelt.iterationOfMod.IterationOf
import typings.tsToolbelt.subMod._Sub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object greaterMod {
  
  type Greater[N1 /* <: Double */, N2 /* <: Double */] = _Greater[IterationOf[N1], IterationOf[N2]]
  
  type _Greater[N1 /* <: Iteration */, N2 /* <: Iteration */] = _IsPositive[_Sub[N1, N2]]
}
