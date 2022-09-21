package typings.trimblemapsTrimblemapsJs.mod

import typings.std.HTMLCanvasElement
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

@JSImport("@trimblemaps/trimblemaps-js", "CanvasSource")
@js.native
open class CanvasSource ()
  extends StObject
     with CanvasSourceRaw
     with AnySourceImpl {
  
  /* CompleteClass */
  var canvas: String | HTMLCanvasElement = js.native
  
  /* CompleteClass */
  var coordinates: js.Array[js.Array[Double]] = js.native
  
  def getCanvas(): HTMLCanvasElement = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): this.type = js.native
  
  /* CompleteClass */
  var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas = js.native
  /* CompleteClass */
  @JSName("type")
  var type_CanvasSourceRaw: canvas = js.native
}
