package typings.typedoc.anon

import typings.typedoc.optionsDeclarationMod.ParameterScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<typedoc.typedoc/dist/lib/utils/options/declaration.BooleanDeclarationOption> */
@js.native
trait ReadonlyBooleanDeclaratio extends js.Object {
  val defaultValue: js.UndefOr[Boolean] = js.native
  val help: String = js.native
  val name: String = js.native
  val scope: js.UndefOr[ParameterScope] = js.native
  val short: js.UndefOr[String] = js.native
  val `type`: typings.typedoc.optionsDeclarationMod.ParameterType.Boolean = js.native
}

object ReadonlyBooleanDeclaratio {
  @scala.inline
  def apply(help: String, name: String, `type`: typings.typedoc.optionsDeclarationMod.ParameterType.Boolean): ReadonlyBooleanDeclaratio = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyBooleanDeclaratio]
  }
  @scala.inline
  implicit class ReadonlyBooleanDeclaratioOps[Self <: ReadonlyBooleanDeclaratio] (val x: Self) extends AnyVal {
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
    def setHelp(value: String): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.typedoc.optionsDeclarationMod.ParameterType.Boolean): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: Boolean): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setScope(value: ParameterScope): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setShort(value: String): Self = this.set("short", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShort: Self = this.set("short", js.undefined)
  }
  
}

