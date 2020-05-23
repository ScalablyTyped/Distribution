package typings.typescriptServices.TypeScript.PullInstantiationHelpers

import typings.typescriptServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutableTypeArgumentMap extends js.Object {
  var createdDuplicateTypeArgumentMap: Boolean
  var typeParameterArgumentMap: TypeArgumentMap
  def ensureTypeArgumentCopy(): Unit
}

object MutableTypeArgumentMap {
  @scala.inline
  def apply(
    createdDuplicateTypeArgumentMap: Boolean,
    ensureTypeArgumentCopy: () => Unit,
    typeParameterArgumentMap: TypeArgumentMap
  ): MutableTypeArgumentMap = {
    val __obj = js.Dynamic.literal(createdDuplicateTypeArgumentMap = createdDuplicateTypeArgumentMap.asInstanceOf[js.Any], ensureTypeArgumentCopy = js.Any.fromFunction0(ensureTypeArgumentCopy), typeParameterArgumentMap = typeParameterArgumentMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutableTypeArgumentMap]
  }
}

