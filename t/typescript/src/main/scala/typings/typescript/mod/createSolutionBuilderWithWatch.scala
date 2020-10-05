package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createSolutionBuilderWithWatch")
@js.native
object createSolutionBuilderWithWatch extends js.Object {
  def apply[T /* <: BuilderProgram */](
    host: SolutionBuilderWithWatchHost[T],
    rootNames: js.Array[java.lang.String],
    defaultOptions: BuildOptions
  ): SolutionBuilder[T] = js.native
  def apply[T /* <: BuilderProgram */](
    host: SolutionBuilderWithWatchHost[T],
    rootNames: js.Array[java.lang.String],
    defaultOptions: BuildOptions,
    baseWatchOptions: WatchOptions
  ): SolutionBuilder[T] = js.native
}

