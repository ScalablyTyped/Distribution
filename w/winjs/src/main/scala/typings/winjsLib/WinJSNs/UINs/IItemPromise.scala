package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a mechanism for retrieving IItem objects asynchronously.
  **/
@js.native
trait IItemPromise[T]
  extends winjsLib.WinJSNs.IPromise[T] {
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the temporary ID of the IItem that fulfills this promise.
    **/
  var handle: java.lang.String = js.native
  /**
    * Gets or sets the index of the IItem contained by this IItemPromise.
    **/
  var index: scala.Double = js.native
  //#region Methods
  /**
    * Stops change notification tracking for the IItem that fulfills this IItemPromise.
    **/
  def release(): scala.Unit = js.native
  /**
    * Begins change notification tracking for the IItem that fulfills this IItemPromise.
    **/
  def retain(): IItemPromise[T] = js.native
}

