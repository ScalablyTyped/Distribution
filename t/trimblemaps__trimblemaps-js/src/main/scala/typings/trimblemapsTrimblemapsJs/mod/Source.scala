package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.`raster-dem`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.canvas
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.geojson
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.image_
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.raster
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.vector
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas
}
object Source {
  
  inline def apply(`type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas): Source = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    inline def setType(value: vector | raster | `raster-dem` | geojson | image_ | video | canvas): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
