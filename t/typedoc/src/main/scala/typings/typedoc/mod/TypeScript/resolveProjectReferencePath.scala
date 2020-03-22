package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ProjectReference
import typings.typescript.mod.ResolveProjectReferencePathHost
import typings.typescript.mod.ResolvedConfigFileName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.resolveProjectReferencePath")
@js.native
object resolveProjectReferencePath extends js.Object {
  def apply(host: ResolveProjectReferencePathHost, ref: ProjectReference): ResolvedConfigFileName = js.native
  def apply(ref: ProjectReference): ResolvedConfigFileName = js.native
}

