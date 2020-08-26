package typings.urql.mutationMod

import typings.urql.anon.PartialOperationContext
import typings.urql.useMutationMod.UseMutationState
import typings.urqlCore.typesMod.OperationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationState[T, V] extends UseMutationState[T] {
  def executeMutation(): js.Promise[OperationResult[T]] = js.native
  def executeMutation(variables: V): js.Promise[OperationResult[T]] = js.native
  def executeMutation(variables: V, context: PartialOperationContext): js.Promise[OperationResult[T]] = js.native
  def executeMutation(variables: js.UndefOr[scala.Nothing], context: PartialOperationContext): js.Promise[OperationResult[T]] = js.native
}

