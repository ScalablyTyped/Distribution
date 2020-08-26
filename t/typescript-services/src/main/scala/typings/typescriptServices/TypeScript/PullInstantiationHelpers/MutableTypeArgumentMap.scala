package typings.typescriptServices.TypeScript.PullInstantiationHelpers

import typings.typescriptServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutableTypeArgumentMap extends js.Object {
  var createdDuplicateTypeArgumentMap: Boolean = js.native
  var typeParameterArgumentMap: TypeArgumentMap = js.native
  def ensureTypeArgumentCopy(): Unit = js.native
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
  @scala.inline
  implicit class MutableTypeArgumentMapOps[Self <: MutableTypeArgumentMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreatedDuplicateTypeArgumentMap(value: Boolean): Self = this.set("createdDuplicateTypeArgumentMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnsureTypeArgumentCopy(value: () => Unit): Self = this.set("ensureTypeArgumentCopy", js.Any.fromFunction0(value))
    @scala.inline
    def setTypeParameterArgumentMap(value: TypeArgumentMap): Self = this.set("typeParameterArgumentMap", value.asInstanceOf[js.Any])
  }
  
}

