package typings.trimblemapsTrimblemapsJs.mod

import typings.std.HTMLVideoElement
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

@JSImport("@trimblemaps/trimblemaps-js", "VideoSource")
@js.native
open class VideoSource ()
  extends StObject
     with VideoSourceRaw
     with AnySourceImpl {
  def this(options: VideoSourceOptions) = this()
  
  def getVideo(): HTMLVideoElement = js.native
  
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): this.type = js.native
  
  /* CompleteClass */
  var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas = js.native
  /* CompleteClass */
  @JSName("type")
  var type_VideoSourceRaw: video = js.native
}
