package typings.superstruct.indexEsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `StructError` objects are thrown (or returned) by Superstruct when its
  * validation fails. The error represents the first error encountered during
  * validation. But they also have an `error.failures` property that holds
  * information for all of the failures encountered.
  */
@JSImport("superstruct/lib/index.es", "StructError")
@js.native
class StructError protected ()
  extends Error
     with /* key */ StringDictionary[js.Any] {
  def this(failure: StructFailure, moreFailures: IterableIterator[StructFailure]) = this()
  
  var branch: js.Array[_] = js.native
  
  def failures(): js.Array[StructFailure] = js.native
  
  var path: js.Array[Double | String] = js.native
  
  var `type`: String = js.native
  
  var value: js.Any = js.native
}
