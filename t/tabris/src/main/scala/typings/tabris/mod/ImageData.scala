package typings.tabris.mod

import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents pixel data of a `Canvas` widget.
  */
/* was `typeof ImageData` */
@JSImport("tabris", "ImageData")
@js.native
class ImageData protected ()
  extends StObject
     with typings.tabris.ImageData {
  def this(data: Uint8ClampedArray, width: Double) = this()
  def this(width: Double, height: Double) = this()
  def this(data: Uint8ClampedArray, width: Double, height: Double) = this()
  
  /**
    * A one-dimensional array containing the data in RGBA order, with integer values between 0 and 255 (inclusive).
    */
  /* CompleteClass */
  override val data: Uint8ClampedArray = js.native
  
  /**
    * The actual height of the ImageData, in pixels.
    */
  /* CompleteClass */
  override val height: Double = js.native
  
  /**
    * The actual height of the ImageData, in pixels.
    */
  /* CompleteClass */
  override val width: Double = js.native
}
