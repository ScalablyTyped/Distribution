package typings.urqlCore

import typings.std.Error
import typings.urqlCore.typesMod.Operation
import typings.urqlCore.typesMod.OperationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@urql/core/dist/types/utils/result", JSImport.Namespace)
@js.native
object resultMod extends js.Object {
  def makeErrorResult(operation: Operation, error: Error): OperationResult[_] = js.native
  def makeErrorResult(operation: Operation, error: Error, response: js.Any): OperationResult[_] = js.native
  def makeResult(operation: Operation, result: js.Any): OperationResult[_] = js.native
  def makeResult(operation: Operation, result: js.Any, response: js.Any): OperationResult[_] = js.native
}

