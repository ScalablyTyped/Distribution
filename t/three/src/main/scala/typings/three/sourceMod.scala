package typings.three

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMod {
  
  @JSImport("three/src/textures/Source", "Source")
  @js.native
  open class Source protected () extends StObject {
    /**
      * @param [data] The data definition of a texture. default is **null**.
      */
    def this(data: Any) = this()
    
    /**
      * The actual data of a texture. The type of this property depends on the texture that uses this instance.
      */
    var data: Any = js.native
    
    val isTexture: `true` = js.native
    
    /**
      * Set this to **true** to trigger a data upload to the GPU next time the source is used.
      */
    def needsUpdate_=(value: Boolean): Unit = js.native
    
    /**
      * Convert the data source to three.js [JSON Object/Scene format](https://github.com/mrdoob/three.js/wiki/JSON-Object-Scene-format-4).
      *
      * @param [meta] optional object containing metadata.
      */
    def toJSON(meta: Any): Any = js.native
    
    /**
      * [UUID](http://en.wikipedia.org/wiki/Universally_unique_identifier) of this object instance.
      * This gets automatically assigned, so this shouldn't be edited.
      */
    var uuid: String = js.native
    
    /**
      * This starts at **0** and counts how many times [property:Boolean needsUpdate] is set to **true**.
      */
    var version: Double = js.native
  }
}
