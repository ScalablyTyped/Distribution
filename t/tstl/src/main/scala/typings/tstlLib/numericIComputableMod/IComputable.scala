package typings
package tstlLib.numericIComputableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComputable[Param, Ret]
  extends tstlLib.numericINegatableMod.INegatable[Ret] {
  def divides(`val`: Param): Ret
  def minus(`val`: Param): Ret
  def modules(`val`: Param): Ret
  def multiplies(`val`: Param): Ret
  def plus(`val`: Param): Ret
}

