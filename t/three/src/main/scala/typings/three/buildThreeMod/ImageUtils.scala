package typings.three.buildThreeMod

import typings.std.CanvasImageSource
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import typings.std.ImageData
import typings.three.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImageUtils {
  
  @JSImport("three/build/three", "ImageUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDataURL(image: CanvasImageSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDataURL")(image.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getDataURL(image: HTMLCanvasElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDataURL")(image.asInstanceOf[js.Any]).asInstanceOf[String]
  /**
    * Returns a data URI containing a representation of the given image.
    * @param image The image object.
    */
  inline def getDataURL(image: HTMLImageElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDataURL")(image.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getDataURL(image: ImageBitmap): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDataURL")(image.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getDataURL(image: ImageData): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDataURL")(image.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sRGBToLinear(image: HTMLCanvasElement): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("sRGBToLinear")(image.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
  /**
    * Converts the given sRGB image data to linear color space.
    * @param image
    */
  inline def sRGBToLinear(image: HTMLImageElement): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("sRGBToLinear")(image.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
  inline def sRGBToLinear(image: ImageBitmap): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("sRGBToLinear")(image.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
  /**
    * Converts the given sRGB image data to linear color space.
    * @param image
    */
  inline def sRGBToLinear(image: ImageData): Data = ^.asInstanceOf[js.Dynamic].applyDynamic("sRGBToLinear")(image.asInstanceOf[js.Any]).asInstanceOf[Data]
}
