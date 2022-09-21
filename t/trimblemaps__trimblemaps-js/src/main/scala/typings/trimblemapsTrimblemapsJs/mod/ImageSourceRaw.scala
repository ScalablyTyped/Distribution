package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.image_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageSourceRaw
  extends StObject
     with Source
     with ImageSourceOptions
     with AnySourceData {
  
  @JSName("type")
  var type_ImageSourceRaw: image_
}
object ImageSourceRaw {
  
  inline def apply(): ImageSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[ImageSourceRaw]
  }
  
  extension [Self <: ImageSourceRaw](x: Self) {
    
    inline def setType(value: image_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
