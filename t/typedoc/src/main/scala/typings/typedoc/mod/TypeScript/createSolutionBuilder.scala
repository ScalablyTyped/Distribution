package typings.typedoc.mod.TypeScript

import typings.typescript.mod.BuildOptions
import typings.typescript.mod.BuilderProgram
import typings.typescript.mod.SolutionBuilder
import typings.typescript.mod.SolutionBuilderHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createSolutionBuilder")
@js.native
object createSolutionBuilder extends js.Object {
  
  def apply[T /* <: BuilderProgram */](host: SolutionBuilderHost[T], rootNames: js.Array[String], defaultOptions: BuildOptions): SolutionBuilder[T] = js.native
}
