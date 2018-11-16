package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CollectionNs {
  /**
           * Called for each item in an array
           * @param item The item.
           * @param index Zero-based index of the item array.
           */
  type IterativeDelegate[T] = js.Function2[/* item */ T, /* index */ js.UndefOr[scala.Double], scala.Unit]
  /**
           * Called for each item in an array
           * @param item The item.
           * @param index Zero-based index of the item array.
           * @returns true if the item matches, false if it does not.
           */
  type MatchingDelegate[T] = js.Function2[/* item */ T, /* index */ js.UndefOr[scala.Double], scala.Boolean]
  /**
           * Defines item collections that are index-able by string
           * @param Generic type parameter.
           */
  type StringIndexableItemCollection[T] = Dictionary[T] with ItemCollection[T]
}
