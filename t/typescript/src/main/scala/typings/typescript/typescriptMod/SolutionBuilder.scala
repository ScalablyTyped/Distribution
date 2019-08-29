package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SolutionBuilder[T /* <: BuilderProgram */] extends js.Object {
  def build(): ExitStatus = js.native
  def build(project: String): ExitStatus = js.native
  def build(project: String, cancellationToken: CancellationToken): ExitStatus = js.native
  def buildReferences(project: String): ExitStatus = js.native
  def buildReferences(project: String, cancellationToken: CancellationToken): ExitStatus = js.native
  def clean(): ExitStatus = js.native
  def clean(project: String): ExitStatus = js.native
  def cleanReferences(): ExitStatus = js.native
  def cleanReferences(project: String): ExitStatus = js.native
  def getNextInvalidatedProject(): js.UndefOr[InvalidatedProject[T]] = js.native
  def getNextInvalidatedProject(cancellationToken: CancellationToken): js.UndefOr[InvalidatedProject[T]] = js.native
}

