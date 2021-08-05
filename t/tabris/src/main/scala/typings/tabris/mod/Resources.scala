package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Resources")
@js.native
class Resources[ResourceType, RawType] protected () extends StObject {
  /* protected */ def this(options: ResourcesConstructorOptions[ResourceType, RawType]) = this()
}
/* static members */
object Resources {
  
  @JSImport("tabris", "Resources")
  @js.native
  val ^ : js.Any = js.native
  
  inline def build[ResourceType](options: ResourceBuildOptions[ResourceType]): ResourceBuilder[ResourceType, ResourceType] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(options.asInstanceOf[js.Any]).asInstanceOf[ResourceBuilder[ResourceType, ResourceType]]
  /**
    * Generates a `ResourceBuilder`, which is a factory for resource dictionaries. The options given here
    * determine the type of the resource, as well as the "raw" type from which to create the resource
    * values from.
    * * The validator function receives a "raw" resource value (unconverted, as provided in the input data
    * object) and must return a boolean indicating whether it is accepted. This means it either is a value
    * that will be accepted by the converter, or if no converter is present it must be the final format of
    * the resource value.
    * * The converter if a function that receives the raw input value and returns the value as it will be
    * present on the final resource dictionary. If no converter is given this is the same type as the
    * resource type.
    * * The "type" may be a constructor of the type of the final resource value as returned by the
    * converter. For primitives this option must not be given.
    * @param options The configuration of the new `ResourceBuilder`. Requires either a validator or a converter function, or both.
    */
  inline def build[ResourceType, RawType](options: ResourceBuildConvertOptions[ResourceType, RawType]): ResourceBuilder[ResourceType, RawType] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(options.asInstanceOf[js.Any]).asInstanceOf[ResourceBuilder[ResourceType, RawType]]
}
