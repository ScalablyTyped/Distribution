package typings.three

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTexturesSourceMod {
  
  @JSImport("three/src/textures/Source", "Source")
  @js.native
  open class Source protected () extends StObject {
    /**
      * Create a new instance of {@link Source}
      * @param data The data definition of a texture. Default `null`
      */
    def this(data: Any) = this()
    
    /**
      * The actual data of a texture.
      * @remarks The type of this property depends on the texture that uses this instance.
      */
    var data: Any = js.native
    
    /**
      * Flag to check if a given object is of type {@link Source}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isSource: `true` = js.native
    
    /**
      * Set this to `true` to trigger a data upload to the GPU next time the {@link Source} is used.
      */
    def needsUpdate_=(value: Boolean): Unit = js.native
    
    /**
      * Convert the data {@link Source} to three.js {@link https://github.com/mrdoob/three.js/wiki/JSON-Object-Scene-format-4 | JSON Object/Scene format}.
      * @param meta Optional object containing metadata.
      */
    def toJSON(): js.Object = js.native
    def toJSON(meta: String): js.Object = js.native
    def toJSON(meta: js.Object): js.Object = js.native
    
    /**
      * {@link http://en.wikipedia.org/wiki/Universally_unique_identifier | UUID} of this object instance.
      * @remarks This gets automatically assigned and shouldn't be edited.
      */
    var uuid: String = js.native
    
    /**
      * This starts at `0` and counts how many times {@link needsUpdate | .needsUpdate} is set to `true`.
      * @remarks Expects a `Integer`
      * @defaultValue `0`
      */
    var version: Double = js.native
  }
}
