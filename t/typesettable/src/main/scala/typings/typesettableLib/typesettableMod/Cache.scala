package typings
package typesettableLib.typesettableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "Cache")
@js.native
class Cache[T] protected ()
  extends typesettableLib.buildSrcUtilsMod.Cache[T] {
  /**
       * @constructor
       *
       * @param {string} compute The function whose results will be cached.
       */
  def this(compute: js.Function1[/* k */ java.lang.String, T]) = this()
}

