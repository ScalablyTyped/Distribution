package typings
package atTensorflowTfjsDashDataLib.distIteratorsLazyUnderscoreIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ZipMismatchMode extends js.Object

@JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", "ZipMismatchMode")
@js.native
object ZipMismatchMode extends js.Object {
  @js.native
  sealed trait FAIL
    extends atTensorflowTfjsDashDataLib.distIteratorsLazyUnderscoreIteratorMod.ZipMismatchMode
  
  @js.native
  sealed trait LONGEST
    extends atTensorflowTfjsDashDataLib.distIteratorsLazyUnderscoreIteratorMod.ZipMismatchMode
  
  @js.native
  sealed trait SHORTEST
    extends atTensorflowTfjsDashDataLib.distIteratorsLazyUnderscoreIteratorMod.ZipMismatchMode
  
  /* 0 */ val FAIL: FAIL with scala.Double = js.native
  /* 2 */ val LONGEST: LONGEST with scala.Double = js.native
  /* 1 */ val SHORTEST: SHORTEST with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atTensorflowTfjsDashDataLib.distIteratorsLazyUnderscoreIteratorMod.ZipMismatchMode with scala.Double
  ] = js.native
}

