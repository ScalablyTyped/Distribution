package typings.typedoc.optionsDeclarationMod

import typings.std.Map
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapDeclarationOption[T] extends DeclarationOptionBase {
  var defaultValue: T = js.native
  var map: (Map[String, T]) | (Record[String | Double, T]) = js.native
  var mapError: js.UndefOr[String] = js.native
  @JSName("type")
  var type_MapDeclarationOption: typings.typedoc.optionsDeclarationMod.ParameterType.Map = js.native
}

object MapDeclarationOption {
  @scala.inline
  def apply[T](
    defaultValue: T,
    help: String,
    map: (Map[String, T]) | (Record[String | Double, T]),
    name: String,
    `type`: typings.typedoc.optionsDeclarationMod.ParameterType.Map
  ): MapDeclarationOption[T] = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDeclarationOption[T]]
  }
  @scala.inline
  implicit class MapDeclarationOptionOps[Self <: MapDeclarationOption[_], T] (val x: Self with MapDeclarationOption[T]) extends AnyVal {
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
    def setDefaultValue(value: T): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: (Map[String, T]) | (Record[String | Double, T])): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.typedoc.optionsDeclarationMod.ParameterType.Map): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapError(value: String): Self = this.set("mapError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapError: Self = this.set("mapError", js.undefined)
  }
  
}

