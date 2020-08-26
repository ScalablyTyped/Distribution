package typings.typedoc.anon

import typings.std.Map
import typings.std.Record
import typings.typedoc.optionsDeclarationMod.ParameterScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<typedoc.typedoc/dist/lib/utils/options/declaration.MapDeclarationOption<unknown>> */
@js.native
trait ReadonlyMapDeclarationOpt extends js.Object {
  val defaultValue: js.Any = js.native
  val help: String = js.native
  val map: (Map[String, _]) | (Record[String | Double, _]) = js.native
  val mapError: js.UndefOr[String] = js.native
  val name: String = js.native
  val scope: js.UndefOr[ParameterScope] = js.native
  val short: js.UndefOr[String] = js.native
  val `type`: typings.typedoc.optionsDeclarationMod.ParameterType.Map = js.native
}

object ReadonlyMapDeclarationOpt {
  @scala.inline
  def apply(
    defaultValue: js.Any,
    help: String,
    map: (Map[String, _]) | (Record[String | Double, _]),
    name: String,
    `type`: typings.typedoc.optionsDeclarationMod.ParameterType.Map
  ): ReadonlyMapDeclarationOpt = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyMapDeclarationOpt]
  }
  @scala.inline
  implicit class ReadonlyMapDeclarationOptOps[Self <: ReadonlyMapDeclarationOpt] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelp(value: String): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: (Map[String, _]) | (Record[String | Double, _])): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.typedoc.optionsDeclarationMod.ParameterType.Map): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapError(value: String): Self = this.set("mapError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapError: Self = this.set("mapError", js.undefined)
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

