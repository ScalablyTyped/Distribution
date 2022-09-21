package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SolutionBuilder[T /* <: BuilderProgram */] extends StObject {
  
  def build(): ExitStatus = js.native
  def build(project: java.lang.String): ExitStatus = js.native
  def build(
    project: java.lang.String,
    cancellationToken: Unit,
    writeFile: Unit,
    getCustomTransformers: js.Function1[/* project */ java.lang.String, CustomTransformers]
  ): ExitStatus = js.native
  def build(project: java.lang.String, cancellationToken: Unit, writeFile: WriteFileCallback): ExitStatus = js.native
  def build(
    project: java.lang.String,
    cancellationToken: Unit,
    writeFile: WriteFileCallback,
    getCustomTransformers: js.Function1[/* project */ java.lang.String, CustomTransformers]
  ): ExitStatus = js.native
  def build(project: java.lang.String, cancellationToken: CancellationToken): ExitStatus = js.native
  def build(
    project: java.lang.String,
    cancellationToken: CancellationToken,
    writeFile: Unit,
    getCustomTransformers: js.Function1[/* project */ java.lang.String, CustomTransformers]
  ): ExitStatus = js.native
  def build(project: java.lang.String, cancellationToken: CancellationToken, writeFile: WriteFileCallback): ExitStatus = js.native
  def build(
    project: java.lang.String,
    cancellationToken: CancellationToken,
    writeFile: WriteFileCallback,
    getCustomTransformers: js.Function1[/* project */ java.lang.String, CustomTransformers]
  ): ExitStatus = js.native
  def build(
    project: Unit,
    cancellationToken: Unit,
    writeFile: Unit,
    getCustomTransformers: js.Function1[/* project */ java.lang.String, CustomTransformers]
  ): ExitStatus = js.native
  def build(project: Unit, cancellationToken: Unit, writeFile: WriteFileCallback): ExitStatus = js.native
  def build(
    project: Unit,
    cancellationToken: Unit,
    writeFile: WriteFileCallback,
    getCustomTransformers: js.Function1[/* project */ java.lang.String, CustomTransformers]
  ): ExitStatus = js.native
  def build(project: Unit, cancellationToken: CancellationToken): ExitStatus = js.native
  def build(
    project: Unit,
    cancellationToken: CancellationToken,
    writeFile: Unit,
    getCustomTransformers: js.Function1[/* project */ java.lang.String, CustomTransformers]
  ): ExitStatus = js.native
  def build(project: Unit, cancellationToken: CancellationToken, writeFile: WriteFileCallback): ExitStatus = js.native
  def build(
    project: Unit,
    cancellationToken: CancellationToken,
    writeFile: WriteFileCallback,
    getCustomTransformers: js.Function1[/* project */ java.lang.String, CustomTransformers]
  ): ExitStatus = js.native
  
  def buildReferences(project: java.lang.String): ExitStatus = js.native
  def buildReferences(
    project: java.lang.String,
    cancellationToken: Unit,
    writeFile: Unit,
    getCustomTransformers: js.Function1[/* project */ java.lang.String, CustomTransformers]
  ): ExitStatus = js.native
  def buildReferences(project: java.lang.String, cancellationToken: Unit, writeFile: WriteFileCallback): ExitStatus = js.native
  def buildReferences(
    project: java.lang.String,
    cancellationToken: Unit,
    writeFile: WriteFileCallback,
    getCustomTransformers: js.Function1[/* project */ java.lang.String, CustomTransformers]
  ): ExitStatus = js.native
  def buildReferences(project: java.lang.String, cancellationToken: CancellationToken): ExitStatus = js.native
  def buildReferences(
    project: java.lang.String,
    cancellationToken: CancellationToken,
    writeFile: Unit,
    getCustomTransformers: js.Function1[/* project */ java.lang.String, CustomTransformers]
  ): ExitStatus = js.native
  def buildReferences(project: java.lang.String, cancellationToken: CancellationToken, writeFile: WriteFileCallback): ExitStatus = js.native
  def buildReferences(
    project: java.lang.String,
    cancellationToken: CancellationToken,
    writeFile: WriteFileCallback,
    getCustomTransformers: js.Function1[/* project */ java.lang.String, CustomTransformers]
  ): ExitStatus = js.native
  
  def clean(): ExitStatus = js.native
  def clean(project: java.lang.String): ExitStatus = js.native
  
  def cleanReferences(): ExitStatus = js.native
  def cleanReferences(project: java.lang.String): ExitStatus = js.native
  
  def getNextInvalidatedProject(): js.UndefOr[InvalidatedProject[T]] = js.native
  def getNextInvalidatedProject(cancellationToken: CancellationToken): js.UndefOr[InvalidatedProject[T]] = js.native
}
