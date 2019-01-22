package typings
package tstlLib.baseContainerAdaptorContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/AdaptorContainer", "AdaptorContainer")
@js.native
abstract class AdaptorContainer[T, Source /* <: tstlLib.baseDisposableIPartialContainersMod._IEmpty with tstlLib.baseDisposableIPartialContainersMod._ISize with tstlLib.baseDisposableIPartialContainersMod._IPush[T] */, This /* <: AdaptorContainer[T, Source, This] */] ()
  extends tstlLib.baseDisposableIPartialContainersMod._IEmpty
     with tstlLib.baseDisposableIPartialContainersMod._ISize
     with tstlLib.baseDisposableIPartialContainersMod._IPush[T] {
  /**
    * @hidden
    */
  var `source_`: Source = js.native
  /**
    * Test whether container is empty.
    */
  /* CompleteClass */
  override def empty(): scala.Boolean = js.native
  /**
    * Remove element.
    */
  def pop(): scala.Unit = js.native
  /**
    * Insert items at the end.
    *
    * @param items Items to insert.
    * @return Number of elements in the container after insertion.
    */
  /* CompleteClass */
  override def push(items: T*): scala.Double = js.native
  /**
    * Number of elements in the container.
    */
  /* CompleteClass */
  override def size(): scala.Double = js.native
  /**
    * Swap elements.
    *
    * @param obj Target container to swap.
    */
  def swap(obj: This): scala.Unit = js.native
}

