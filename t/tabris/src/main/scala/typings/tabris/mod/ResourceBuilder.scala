package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "ResourceBuilder")
@js.native
open class ResourceBuilder[ResourceType, RawType] protected () extends StObject {
  /**
    * A factory for generic resource dictionaries. Instances can be obtained from `Resource.build()` or by
    * invoking the constructor.
    * Do not use for resource dictionaries of the types `Color`, `Font` and `string`. Instead use the
    * respective factories `ColorResources.from()`, `FontResources.from()` and `TextResources.from()`.
    */
  def this(options: ResourceBuilderConstructorOptions[ResourceType, RawType]) = this()
  
  def from[Data /* <: ResourceDataWithConfig[RawType] */](data: Data): NamedResources[ResourceType, /* keyof Data */ String] = js.native
  /**
    * Creates a resource dictionary from the given raw "data" object. All values from the given "base"
    * dictionary are inherited unless overwritten.
    * Entries in the "data" object starting with "$" are considered configuration options and will not
    * become part of the final resource dictionary.
    * @param base
    * @param data
    */
  def from[Base /* <: NamedResources[ResourceType, /* keyof Base */ String] */, Data /* <: ResourceDataWithConfig[RawType] */](base: Base, data: Data): NamedResources[ResourceType, /* keyof Base & Data */ String] = js.native
}
