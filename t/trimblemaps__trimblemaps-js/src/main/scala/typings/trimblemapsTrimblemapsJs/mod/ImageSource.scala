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

@JSImport("@trimblemaps/trimblemaps-js", "ImageSource")
@js.native
open class ImageSource ()
  extends StObject
     with ImageSourceRaw
     with AnySourceImpl {
  def this(options: ImageSourceOptions) = this()
  
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): this.type = js.native
  
  /* CompleteClass */
  var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas = js.native
  /* CompleteClass */
  @JSName("type")
  var type_ImageSourceRaw: image_ = js.native
  
  def updateImage(options: ImageSourceOptions): this.type = js.native
}
