package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SolutionBuilder[T /* <: BuilderProgram */] extends js.Object {
  
  def build(): ExitStatus = js.native
  def build(project: js.UndefOr[scala.Nothing], cancellationToken: CancellationToken): ExitStatus = js.native
  def build(project: java.lang.String): ExitStatus = js.native
  def build(project: java.lang.String, cancellationToken: CancellationToken): ExitStatus = js.native
  
  def buildReferences(project: java.lang.String): ExitStatus = js.native
  def buildReferences(project: java.lang.String, cancellationToken: CancellationToken): ExitStatus = js.native
  
  def clean(): ExitStatus = js.native
  def clean(project: java.lang.String): ExitStatus = js.native
  
  def cleanReferences(): ExitStatus = js.native
  def cleanReferences(project: java.lang.String): ExitStatus = js.native
  
  def getNextInvalidatedProject(): js.UndefOr[InvalidatedProject[T]] = js.native
  def getNextInvalidatedProject(cancellationToken: CancellationToken): js.UndefOr[InvalidatedProject[T]] = js.native
}
