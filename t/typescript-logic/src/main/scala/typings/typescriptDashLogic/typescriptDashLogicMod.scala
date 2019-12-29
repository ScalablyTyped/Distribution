package typings.typescriptDashLogic

import typings.typescriptDashLogic.typescriptDashLogicBooleans.`false`
import typings.typescriptDashLogic.typescriptDashLogicBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-logic", JSImport.Namespace)
@js.native
object typescriptDashLogicMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.typescriptDashLogic.typescriptDashLogicBooleans.`true`
    - typings.typescriptDashLogic.typescriptDashLogicBooleans.`false`
  */
  trait Not[X /* <: Boolean */] extends js.Object
  
  type And[A /* <: Boolean */, B /* <: Boolean */] = LogicalTable[A, B, `true`, `false`, `false`, `false`]
  type If[Boolean /* <: Boolean */, WhenTrue, WhenFalse] = WhenFalse | WhenTrue
  type LogicalTable[A /* <: Boolean */, B /* <: Boolean */, AB, AnB, nAB, nAnB] = nAnB | nAB | AnB | AB
  type Or[A /* <: Boolean */, B /* <: Boolean */] = LogicalTable[A, B, `true`, `true`, `true`, `false`]
  type Xor[A /* <: Boolean */, B /* <: Boolean */] = LogicalTable[A, B, `false`, `true`, `true`, `false`]
}

