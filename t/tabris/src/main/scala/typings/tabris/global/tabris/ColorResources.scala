package typings.tabris.global.tabris

import typings.tabris.mod.ColorValue
import typings.tabris.mod.NamedResources
import typings.tabris.mod.ResourceDataWithConfig
import typings.tabris.mod.ResourcesConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.ColorResources")
@js.native
class ColorResources protected ()
  extends typings.tabris.mod.ColorResources {
  /* protected */ def this(options: ResourcesConstructorOptions[typings.tabris.mod.Color, ColorValue]) = this()
}
/* static members */
object ColorResources {
  
  @JSGlobal("tabris.ColorResources")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a colors dictionary from the given raw "data" object. The format must match the [Tabris.js
    * colors JSON
    * schema](https://github.com/eclipsesource/tabris-js/blob/v${moduleversion}/schema/colors.json).
    * Entries in the "data" object starting with "$" are considered configuration options and will not
    * become entries in the final colors dictionary.
    * @param data The raw data (plain object) to create the dictionary from. The format must match the [Tabris.js colors JSON schema](https://github.com/eclipsesource/tabris-js/blob/v${moduleversion}/schema/colors.json).
    */
  inline def from[Data /* <: ResourceDataWithConfig[ColorValue] */](data: Data): NamedResources[typings.tabris.mod.Color, /* keyof Data */ String] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[NamedResources[typings.tabris.mod.Color, /* keyof Data */ String]]
  /**
    * Creates a colors dictionary from the given raw "data" object. All colors from the given "base"
    * dictionary are inherited unless overwritten.
    * Entries in the "data" object starting with "$" are considered configuration options and will not
    * become entries in the final colors dictionary.
    * @param base A plain object or another `ColorResources` instance containing values to inherit by the new `ColorResources` dictionary.
    * @param data The raw data (plain object) to create the dictionary from. The format must match the [Tabris.js colors JSON schema](https://github.com/eclipsesource/tabris-js/blob/v${moduleversion}/schema/colors.json).
    */
  inline def from[Base /* <: NamedResources[typings.tabris.mod.Color, /* keyof Base */ String] */, Data /* <: ResourceDataWithConfig[ColorValue] */](base: Base, data: Data): NamedResources[typings.tabris.mod.Color, /* keyof Base & Data */ String] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(base.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[NamedResources[typings.tabris.mod.Color, /* keyof Base & Data */ String]]
}
