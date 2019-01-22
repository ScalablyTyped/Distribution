package typings
package tstlLib.baseDisposableIListAlgorithmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _IListAlgorithm[T, Source] extends js.Object {
  /**
    * Merge two *sorted* containers.
    *
    * @param source Source container to transfer.
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Default is {@link less}.
    */
  def merge(from: Source): scala.Unit = js.native
  def merge(from: Source, comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): scala.Unit = js.native
  /**
    * Remove elements with specific value.
    *
    * @param val The value to remove.
    */
  def remove(`val`: T): scala.Unit = js.native
  /**
    * Remove elements with specific function.
    *
    * @param pred A unary function determines whether remove or not.
    */
  def remove_if(pred: js.Function1[/* val */ T, scala.Boolean]): scala.Unit = js.native
  /**
    * Reverse elements.
    */
  def reverse(): scala.Unit = js.native
  /**
    * Sort elements.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Default is {@link less}.
    */
  def sort(): scala.Unit = js.native
  def sort(comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): scala.Unit = js.native
  /**
    * Swap elements.
    *
    * @param obj Target container to swap.
    */
  def swap(obj: Source): scala.Unit = js.native
  /**
    * Remove duplicated elements.
    *
    * @param binary_pred A binary function predicates two arguments are equal. Default is {@link equal_to}.
    */
  def unique(): scala.Unit = js.native
  def unique(binary_pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): scala.Unit = js.native
}

