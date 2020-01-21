package typings.typescriptLogic

import typings.typescriptLogic.typescriptLogicBooleans.`false`
import typings.typescriptLogic.typescriptLogicBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-logic", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.typescriptLogic.typescriptLogicBooleans.`true`
    - typings.typescriptLogic.typescriptLogicBooleans.`false`
  */
  trait Not[X /* <: Boolean */] extends js.Object
  
  type And[A /* <: Boolean */, B /* <: Boolean */] = LogicalTable[A, B, `true`, `false`, `false`, `false`]
  type If[Boolean /* <: Boolean */, WhenTrue, WhenFalse] = WhenFalse | WhenTrue
  type LogicalTable[A /* <: Boolean */, B /* <: Boolean */, AB, AnB, nAB, nAnB] = nAnB | nAB | AnB | AB
  type Or[A /* <: Boolean */, B /* <: Boolean */] = LogicalTable[A, B, `true`, `true`, `true`, `false`]
  type Xor[A /* <: Boolean */, B /* <: Boolean */] = LogicalTable[A, B, `false`, `true`, `true`, `false`]
}

