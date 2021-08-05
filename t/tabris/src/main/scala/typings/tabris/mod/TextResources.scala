package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "TextResources")
@js.native
class TextResources protected () extends Resources[String, String] {
  /* protected */ def this(options: ResourcesConstructorOptions[String, String]) = this()
}
/* static members */
object TextResources {
  
  @JSImport("tabris", "TextResources")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a texts dictionary from the given raw "data" object. The format must match the [Tabris.js
    * texts JSON
    * schema](https://github.com/eclipsesource/tabris-js/blob/v${moduleversion}/schema/texts.json). Entries
    * in the "data" object starting with "$" are considered configuration options and will not become
    * entries in the final texts dictionary.
    * @param data The raw data (plain object) to create the dictionary from. The format must match the [Tabris.js texts JSON schema](https://github.com/eclipsesource/tabris-js/blob/v${moduleversion}/schema/texts.json).
    */
  inline def from[Data /* <: ResourceDataWithConfig[String] */](data: Data): NamedResources[String, /* keyof Data */ String] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[NamedResources[String, /* keyof Data */ String]]
  /**
    * Creates a texts dictionary from the given raw "data" object. All texts from the given "base"
    * dictionary are inherited unless overwritten.
    * Entries in the "data" object starting with "$" are considered configuration options and will not
    * become entries in the final texts dictionary.
    * @param base A plain object or another `TextResources` instance containing values to inherit by the new `TextResources` dictionary.
    * @param data The raw data (plain object) to create the dictionary from. The format must match the [Tabris.js texts JSON schema](https://github.com/eclipsesource/tabris-js/blob/v${moduleversion}/schema/texts.json).
    */
  inline def from[Base /* <: NamedResources[String, /* keyof Base */ String] */, Data /* <: ResourceDataWithConfig[String] */](base: Base, data: Data): NamedResources[String, /* keyof Base & Data */ String] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(base.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[NamedResources[String, /* keyof Base & Data */ String]]
}
