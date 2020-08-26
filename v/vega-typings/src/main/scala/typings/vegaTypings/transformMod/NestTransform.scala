package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.nest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NestTransform extends _Transforms {
  var generate: js.UndefOr[Boolean | SignalRef] = js.native
  var keys: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.native
  var `type`: nest = js.native
}

object NestTransform {
  @scala.inline
  def apply(`type`: nest): NestTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestTransform]
  }
  @scala.inline
  implicit class NestTransformOps[Self <: NestTransform] (val x: Self) extends AnyVal {
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
    def setType(value: nest): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenerate(value: Boolean | SignalRef): Self = this.set("generate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerate: Self = this.set("generate", js.undefined)
    @scala.inline
    def setKeysVarargs(value: FieldRef*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[FieldRef] | SignalRef): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
  }
  
}

