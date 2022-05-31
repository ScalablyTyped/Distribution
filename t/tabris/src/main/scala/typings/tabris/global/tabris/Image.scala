package typings.tabris.global.tabris

import typings.tabris.mod.ImageLikeObject
import typings.tabris.mod.ImageValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.Image")
@js.native
class Image protected ()
  extends typings.tabris.mod.Image {
  def this(imageLike: ImageLikeObject) = this()
}
/* static members */
object Image {
  
  @JSGlobal("tabris.Image")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new instance of Image using any valid Image expression. For any other value, including
    * `null`, the method throws.
    * @param imageValue The value to create an Image instance from. See [ImageValue](../types.html#imagevalue)
    */
  inline def from(imageValue: ImageValue): typings.tabris.mod.Image = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(imageValue.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.mod.Image]
  
  /**
    * Returns true if value is an ImageValue. This includes `null`. Use this to check if a value will be
    * accepted by an image property. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  inline def isImageValue(value: js.Any): /* is tabris.tabris.ImageValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImageValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is tabris.tabris.ImageValue */ Boolean]
  
  /**
    * Returns true if value is a valid ImageValue. This excludes `null`. Use this to check if a value will
    * be accepted by Image.from. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  inline def isValidImageValue(value: js.Any): /* is tabris.tabris.ImageValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidImageValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is tabris.tabris.ImageValue */ Boolean]
}
