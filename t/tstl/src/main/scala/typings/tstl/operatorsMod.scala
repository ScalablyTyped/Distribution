package typings.tstl

import org.scalablytyped.runtime.TopLevel
import typings.std.Pick
import typings.tstl.icomputableMod.IComputable
import typings.tstl.inegatableMod.INegatable
import typings.tstl.tstlStrings.divides
import typings.tstl.tstlStrings.minus
import typings.tstl.tstlStrings.modules
import typings.tstl.tstlStrings.multiplies
import typings.tstl.tstlStrings.negate
import typings.tstl.tstlStrings.plus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/numeric/operators", JSImport.Namespace)
@js.native
object operatorsMod extends js.Object {
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
    */ typings.tstl.tstlStrings.plus with (TopLevel[IComputable[Y, Ret]]) */, Y, Ret](x: X, y: Y): Ret = js.native
  type Param[Y, Ret, Key /* <: /* keyof tstl.tstl/numeric/IComputable.IComputable<Y, Ret> */ plus | minus | multiplies | divides | modules | negate */] = Double | (Pick[IComputable[Y, Ret], Key])
  type PlusParam[Y, Ret] = Double | String | (Pick[IComputable[Y, Ret], plus])
}

