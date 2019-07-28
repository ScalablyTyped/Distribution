package typings.atTensorflowTfjsDashData.distIteratorsLazyUnderscoreIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ZipMismatchMode extends js.Object

@JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", "ZipMismatchMode")
@js.native
object ZipMismatchMode extends js.Object {
  @js.native
  sealed trait FAIL extends ZipMismatchMode
  
  @js.native
  sealed trait LONGEST extends ZipMismatchMode
  
  @js.native
  sealed trait SHORTEST extends ZipMismatchMode
  
  /* 0 */ val FAIL: typings.atTensorflowTfjsDashData.distIteratorsLazyUnderscoreIteratorMod.ZipMismatchMode.FAIL with Double = js.native
  /* 2 */ val LONGEST: typings.atTensorflowTfjsDashData.distIteratorsLazyUnderscoreIteratorMod.ZipMismatchMode.LONGEST with Double = js.native
  /* 1 */ val SHORTEST: typings.atTensorflowTfjsDashData.distIteratorsLazyUnderscoreIteratorMod.ZipMismatchMode.SHORTEST with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ZipMismatchMode with Double] = js.native
}

