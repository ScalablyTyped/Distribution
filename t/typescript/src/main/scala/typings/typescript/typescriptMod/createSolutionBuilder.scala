package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createSolutionBuilder")
@js.native
object createSolutionBuilder extends js.Object {
  def apply[T /* <: BuilderProgram */](host: SolutionBuilderHost[T], rootNames: js.Array[String], defaultOptions: BuildOptions): SolutionBuilder[T] = js.native
}

