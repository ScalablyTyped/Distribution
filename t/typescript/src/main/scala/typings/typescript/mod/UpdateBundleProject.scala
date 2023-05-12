package typings.typescript.mod

import typings.typescript.mod.InvalidatedProjectKind.UpdateBundle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated */
@js.native
trait UpdateBundleProject[T /* <: BuilderProgram */]
  extends StObject
     with InvalidatedProjectBase
     with InvalidatedProject[T] {
  
  def emit(): js.UndefOr[EmitResult | BuildInvalidedProject[T]] = js.native
  def emit(writeFile: Unit, customTransformers: CustomTransformers): js.UndefOr[EmitResult | BuildInvalidedProject[T]] = js.native
  def emit(writeFile: WriteFileCallback): js.UndefOr[EmitResult | BuildInvalidedProject[T]] = js.native
  def emit(writeFile: WriteFileCallback, customTransformers: CustomTransformers): js.UndefOr[EmitResult | BuildInvalidedProject[T]] = js.native
  
  @JSName("kind")
  val kind_UpdateBundleProject: UpdateBundle = js.native
}
