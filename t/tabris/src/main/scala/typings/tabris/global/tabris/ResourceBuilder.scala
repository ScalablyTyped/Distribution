package typings.tabris.global.tabris

import typings.tabris.mod.ResourceBuilderConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.ResourceBuilder")
@js.native
open class ResourceBuilder[ResourceType, RawType] protected ()
  extends typings.tabris.mod.ResourceBuilder[ResourceType, RawType] {
  /**
    * A factory for generic resource dictionaries. Instances can be obtained from `Resource.build()` or by
    * invoking the constructor.
    * Do not use for resource dictionaries of the types `Color`, `Font` and `string`. Instead use the
    * respective factories `ColorResources.from()`, `FontResources.from()` and `TextResources.from()`.
    */
  def this(options: ResourceBuilderConstructorOptions[ResourceType, RawType]) = this()
}
