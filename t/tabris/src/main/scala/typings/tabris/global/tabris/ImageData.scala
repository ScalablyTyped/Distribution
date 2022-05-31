package typings.tabris.global.tabris

import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents pixel data of a `Canvas` widget.
  */
/* was `typeof ImageData` */
@JSGlobal("tabris.ImageData")
@js.native
class ImageData protected ()
  extends typings.tabris.mod.ImageData {
  def this(data: Uint8ClampedArray, width: Double) = this()
  def this(width: Double, height: Double) = this()
  def this(data: Uint8ClampedArray, width: Double, height: Double) = this()
}
