package typings.tstl

import typings.tstl.binaryPredicatorMod.BinaryPredicator
import typings.tstl.comparatorMod.Comparator
import typings.tstl.unaryPredicatorMod.UnaryPredicator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/linear/IListAlgorithm", JSImport.Namespace)
@js.native
object ilistalgorithmMod extends js.Object {
  @js.native
  trait IListAlgorithm[T, Source] extends js.Object {
    /**
      * Merge two *sorted* containers.
      *
      * @param source Source container to transfer.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Default is {@link less}.
      */
    def merge(from: Source): Unit = js.native
    def merge(from: Source, comp: Comparator[T, T]): Unit = js.native
    /**
      * Remove elements with specific value.
      *
      * @param val The value to remove.
      */
    def remove(`val`: T): Unit = js.native
    /**
      * Remove elements with specific function.
      *
      * @param pred A unary function determines whether remove or not.
      */
    def remove_if(pred: UnaryPredicator[T]): Unit = js.native
    /**
      * Reverse elements.
      */
    def reverse(): Unit = js.native
    /**
      * Sort elements.
      *
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Default is {@link less}.
      */
    def sort(): Unit = js.native
    def sort(comp: Comparator[T, T]): Unit = js.native
    /**
      * Swap elements.
      *
      * @param obj Target container to swap.
      */
    def swap(obj: Source): Unit = js.native
    /**
      * Remove duplicated elements.
      *
      * @param binary_pred A binary function predicates two arguments are equal. Default is {@link equal_to}.
      */
    def unique(): Unit = js.native
    def unique(binary_pred: BinaryPredicator[T, T]): Unit = js.native
  }
  
}

