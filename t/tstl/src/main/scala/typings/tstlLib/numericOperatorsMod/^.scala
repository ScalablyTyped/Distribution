package typings
package tstlLib.numericOperatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/numeric/operators", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def divides[X /* <: Param[Y, Ret, tstlLib.tstlLibStrings.divides] */, Y, Ret](x: X, y: Y): Ret = js.native
  def minus[X /* <: Param[Y, Ret, tstlLib.tstlLibStrings.minus] */, Y, Ret](x: X, y: Y): Ret = js.native
  def modules[X /* <: Param[Y, Ret, tstlLib.tstlLibStrings.modules] */, Y, Ret](x: X, y: Y): Ret = js.native
  def multiplies[X /* <: Param[Y, Ret, tstlLib.tstlLibStrings.multiplies] */, Y, Ret](x: X, y: Y): Ret = js.native
  def negate[Ret](x: scala.Double): Ret = js.native
  def negate[Ret](x: tstlLib.numericINegatableMod.INegatable[Ret]): Ret = js.native
  def plus[Y, Ret](x: java.lang.String, y: Y): Ret = js.native
  def plus[Y, Ret](x: scala.Double, y: Y): Ret = js.native
  def plus[X /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in 'plus' ]: tstl.tstl/numeric/IComputable.IComputable<Y, Ret>[P]}
    */ tstlLib.tstlLibStrings.plus with (tstlLib.numericIComputableMod.IComputable[Y, Ret]) */, Y, Ret](x: X, y: Y): Ret = js.native
}

