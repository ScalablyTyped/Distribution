package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "FontResources")
@js.native
class FontResources protected () extends Resources[Font, FontValue] {
  /* protected */ def this(options: ResourcesConstructorOptions[Font, FontValue]) = this()
}
/* static members */
object FontResources {
  
  @JSImport("tabris", "FontResources")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a fonts dictionary from the given raw "data" object. The format must match the [Tabris.js
    * fonts JSON
    * schema](https://github.com/eclipsesource/tabris-js/blob/v${moduleversion}/schema/fonts.json). Entries
    * in the "data" object starting with "$" are considered configuration options and will not become
    * entries in the final fonts dictionary.
    * @param data The raw data (plain object) to create the dictionary from. The format must match the [Tabris.js fonts JSON schema](https://github.com/eclipsesource/tabris-js/blob/v${moduleversion}/schema/fonts.json).
    */
  inline def from[Data /* <: ResourceDataWithConfig[FontResourceValue] */](data: Data): NamedResources[Font, /* keyof Data */ String] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[NamedResources[Font, /* keyof Data */ String]]
  /**
    * Creates a fonts dictionary from the given raw "data" object. All fonts from the given "base"
    * dictionary are inherited unless overwritten.
    * Entries in the "data" object starting with "$" are considered configuration options and will not
    * become entries in the final fonts dictionary.
    * @param base A plain object or another `FontResources` instance containing values to inherit by the new `FontResources` dictionary.
    * @param data The raw data (plain object) to create the dictionary from. The format must match the [Tabris.js fonts JSON schema](https://github.com/eclipsesource/tabris-js/blob/v${moduleversion}/schema/fonts.json).
    */
  inline def from[Base /* <: NamedResources[Font, /* keyof Base */ String] */, Data /* <: ResourceDataWithConfig[FontResourceValue] */](base: Base, data: Data): NamedResources[Font, /* keyof Base & Data */ String] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(base.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[NamedResources[Font, /* keyof Base & Data */ String]]
}
