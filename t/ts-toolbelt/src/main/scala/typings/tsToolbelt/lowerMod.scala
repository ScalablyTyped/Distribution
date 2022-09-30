package typings.tsToolbelt

import typings.tsToolbelt.greaterMod._Greater
import typings.tsToolbelt.iterationMod.Iteration
import typings.tsToolbelt.iterationOfMod.IterationOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lowerMod {
  
  type Lower[N1 /* <: Double */, N2 /* <: Double */] = _Lower[IterationOf[N1], IterationOf[N2]]
  
  type _Lower[N1 /* <: Iteration */, N2 /* <: Iteration */] = _Greater[N2, N1]
}
