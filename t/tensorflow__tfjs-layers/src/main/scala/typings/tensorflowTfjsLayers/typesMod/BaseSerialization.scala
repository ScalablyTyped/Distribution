package typings.tensorflowTfjsLayers.typesMod

import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseSerialization[N /* <: String */, T /* <: PyJson[Extract[/* keyof T */ String, String]] */] extends PyJsonDict {
  var class_name: N = js.native
  var config: T = js.native
}

object BaseSerialization {
  @scala.inline
  def apply[/* <: java.lang.String */ N, /* <: typings.tensorflowTfjsLayers.typesMod.PyJson[typings.std.Extract[/ * keyof T * / java.lang.String, java.lang.String]] */ T](class_name: N, config: T): BaseSerialization[N, T] = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseSerialization[N, T]]
  }
  @scala.inline
  implicit class BaseSerializationOps[Self <: BaseSerialization[_, _], /* <: java.lang.String */ N, /* <: typings.tensorflowTfjsLayers.typesMod.PyJson[typings.std.Extract[/ * keyof T * / java.lang.String, java.lang.String]] */ T] (val x: Self with (BaseSerialization[N, T])) extends AnyVal {
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
    def setClass_name(value: N): Self = this.set("class_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: T): Self = this.set("config", value.asInstanceOf[js.Any])
  }
  
}

