package typings.typescriptDashLogic

import typings.typescriptDashLogic.typescriptDashLogicNumbers.`false`
import typings.typescriptDashLogic.typescriptDashLogicNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typescriptDashLogicMod {
  type And[A /* <: Boolean */, B /* <: Boolean */] = LogicalTable[A, B, `true`, `false`, `false`, `false`]
  type If[Boolean /* <: Boolean */, WhenTrue, WhenFalse] = WhenFalse | WhenTrue
  type LogicalTable[A /* <: Boolean */, B /* <: Boolean */, AB, AnB, nAB, nAnB] = nAnB | nAB | AnB | AB
  type Or[A /* <: Boolean */, B /* <: Boolean */] = LogicalTable[A, B, `true`, `true`, `true`, `false`]
  type Xor[A /* <: Boolean */, B /* <: Boolean */] = LogicalTable[A, B, `false`, `true`, `true`, `false`]
}
