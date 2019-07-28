package typings.typesettable.typesettableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "Cache")
@js.native
class Cache[T] protected ()
  extends typings.typesettable.buildSrcUtilsMod.Cache[T] {
  /**
    * @constructor
    *
    * @param {string} compute The function whose results will be cached.
    */
  def this(compute: js.Function1[/* k */ String, T]) = this()
}

