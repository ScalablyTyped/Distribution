package typings.tstl

import typings.std.Pick
import typings.tstl.numericIComputableMod.IComputable
import typings.tstl.numericINegatableMod.INegatable
import typings.tstl.numericOperatorsMod.Param
import typings.tstl.tstlStrings.plus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/numeric/operators", JSImport.Namespace)
@js.native
object numericOperatorsMod extends js.Object {
  def divides[X /* <: Param[Y, Ret, typings.tstl.tstlStrings.divides] */, Y, Ret](x: X, y: Y): Ret = js.native
  def minus[X /* <: Param[Y, Ret, typings.tstl.tstlStrings.minus] */, Y, Ret](x: X, y: Y): Ret = js.native
  def modules[X /* <: Param[Y, Ret, typings.tstl.tstlStrings.modules] */, Y, Ret](x: X, y: Y): Ret = js.native
  def multiplies[X /* <: Param[Y, Ret, typings.tstl.tstlStrings.multiplies] */, Y, Ret](x: X, y: Y): Ret = js.native
  def negate[Ret](x: Double): Ret = js.native
  def negate[Ret](x: INegatable[Ret]): Ret = js.native
  def plus[Y, Ret](x: String, y: Y): Ret = js.native
  def plus[Y, Ret](x: Double, y: Y): Ret = js.native
  def plus[X /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in 'plus' ]: tstl.tstl/numeric/IComputable.IComputable<Y, Ret>[P]}
    */ typings.tstl.tstlStrings.plus with (IComputable[Y, Ret]) */, Y, Ret](x: X, y: Y): Ret = js.native
  /**
    * @hidden
    */
  type Param[Y, Ret, Key /* <: String */] = Double | (Pick[IComputable[Y, Ret], Key])
  /**
    * @hidden
    */
  type PlusParam[Y, Ret] = Double | String | (Pick[IComputable[Y, Ret], plus])
}

