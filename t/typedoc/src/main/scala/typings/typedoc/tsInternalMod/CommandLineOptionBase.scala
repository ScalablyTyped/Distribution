package typings.typedoc.tsInternalMod

import typings.std.Map
import typings.typedoc.typedocStrings.`object`
import typings.typedoc.typedocStrings.boolean
import typings.typedoc.typedocStrings.list
import typings.typedoc.typedocStrings.number
import typings.typedoc.typedocStrings.string
import typings.typescript.mod.DiagnosticMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandLineOptionBase extends js.Object {
  var description: js.UndefOr[DiagnosticMessage] = js.native
  var experimental: js.UndefOr[Boolean] = js.native
  var isFilePath: js.UndefOr[Boolean] = js.native
  var isTSConfigOnly: js.UndefOr[Boolean] = js.native
  var name: String = js.native
  var paramType: js.UndefOr[DiagnosticMessage] = js.native
  var shortName: js.UndefOr[String] = js.native
  var `type`: string | number | boolean | `object` | list | (Map[Double | String, _]) = js.native
}

object CommandLineOptionBase {
  @scala.inline
  def apply(name: String, `type`: string | number | boolean | `object` | list | (Map[Double | String, _])): CommandLineOptionBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOptionBase]
  }
  @scala.inline
  implicit class CommandLineOptionBaseOps[Self <: CommandLineOptionBase] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: string | number | boolean | `object` | list | (Map[Double | String, _])): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: DiagnosticMessage): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExperimental(value: Boolean): Self = this.set("experimental", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
    @scala.inline
    def setIsFilePath(value: Boolean): Self = this.set("isFilePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFilePath: Self = this.set("isFilePath", js.undefined)
    @scala.inline
    def setIsTSConfigOnly(value: Boolean): Self = this.set("isTSConfigOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTSConfigOnly: Self = this.set("isTSConfigOnly", js.undefined)
    @scala.inline
    def setParamType(value: DiagnosticMessage): Self = this.set("paramType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParamType: Self = this.set("paramType", js.undefined)
    @scala.inline
    def setShortName(value: String): Self = this.set("shortName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortName: Self = this.set("shortName", js.undefined)
  }
  
}

