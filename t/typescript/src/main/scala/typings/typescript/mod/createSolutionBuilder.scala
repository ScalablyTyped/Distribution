package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createSolutionBuilder")
@js.native
object createSolutionBuilder extends js.Object {
  def apply[T /* <: BuilderProgram */](host: SolutionBuilderHost[T], rootNames: js.Array[java.lang.String], defaultOptions: BuildOptions): SolutionBuilder[T] = js.native
}

