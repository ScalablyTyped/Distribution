package typings.tensorflowTfjsCore.jasmineUtilMod

import typings.tensorflowTfjsCore.environmentMod.Flags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestEnv extends js.Object {
  var backendName: String = js.native
  var flags: js.UndefOr[Flags] = js.native
  var isDataSync: js.UndefOr[Boolean] = js.native
  var name: String = js.native
}

object TestEnv {
  @scala.inline
  def apply(backendName: String, name: String): TestEnv = {
    val __obj = js.Dynamic.literal(backendName = backendName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestEnv]
  }
  @scala.inline
  implicit class TestEnvOps[Self <: TestEnv] (val x: Self) extends AnyVal {
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
    def setBackendName(value: String): Self = this.set("backendName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: Flags): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    @scala.inline
    def setIsDataSync(value: Boolean): Self = this.set("isDataSync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDataSync: Self = this.set("isDataSync", js.undefined)
  }
  
}

