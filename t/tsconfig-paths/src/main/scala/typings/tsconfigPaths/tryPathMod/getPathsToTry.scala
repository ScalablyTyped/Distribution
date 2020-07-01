package typings.tsconfigPaths.tryPathMod

import typings.tsconfigPaths.mappingEntryMod.MappingEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsconfig-paths/lib/try-path", "getPathsToTry")
@js.native
object getPathsToTry extends js.Object {
  def apply(
    extensions: js.Array[String],
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String
  ): js.UndefOr[js.Array[TryPath]] = js.native
}

