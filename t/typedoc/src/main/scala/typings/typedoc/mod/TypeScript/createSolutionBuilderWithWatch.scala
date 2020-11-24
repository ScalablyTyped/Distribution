package typings.typedoc.mod.TypeScript

import typings.typescript.mod.BuildOptions
import typings.typescript.mod.BuilderProgram
import typings.typescript.mod.SolutionBuilder
import typings.typescript.mod.SolutionBuilderWithWatchHost
import typings.typescript.mod.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createSolutionBuilderWithWatch")
@js.native
object createSolutionBuilderWithWatch extends js.Object {
  
  def apply[T /* <: BuilderProgram */](host: SolutionBuilderWithWatchHost[T], rootNames: js.Array[String], defaultOptions: BuildOptions): SolutionBuilder[T] = js.native
  def apply[T /* <: BuilderProgram */](
    host: SolutionBuilderWithWatchHost[T],
    rootNames: js.Array[String],
    defaultOptions: BuildOptions,
    baseWatchOptions: WatchOptions
  ): SolutionBuilder[T] = js.native
}
