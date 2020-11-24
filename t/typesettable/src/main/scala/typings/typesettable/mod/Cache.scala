package typings.typesettable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typesettable", "Cache")
@js.native
class Cache[T] protected ()
  extends typings.typesettable.utilsMod.Cache[T] {
  /**
    * @constructor
    *
    * @param {string} compute The function whose results will be cached.
    */
  def this(compute: js.Function1[/* k */ String, T]) = this()
}
