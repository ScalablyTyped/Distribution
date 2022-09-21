package typings.tabris.global.tabris

import typings.tabris.mod.ImageLikeObject
import typings.tabris.mod.ImageValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.Image")
@js.native
open class Image protected ()
  extends typings.tabris.mod.Image {
  /**
    * This class represents an image source and optionally that image's dimension or the scale it should be
    * displayed at. **For convenience there are [various expressions](#imagevalue) that may be used in
    * place of an `Image` instance.** All API that accept these expressions will convert them to a `Image`
    * object.
    */
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
    * @param imageValue The value to create an Image instance from. See ${doc:ImageValue}
    */
  inline def from(imageValue: ImageValue): typings.tabris.mod.Image = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(imageValue.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.mod.Image]
  
  /**
    * Returns true if value is an ImageValue. This includes `null`. Use this to check if a value will be
    * accepted by an image property. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  inline def isImageValue(value: Any): /* is tabris.tabris.ImageValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImageValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is tabris.tabris.ImageValue */ Boolean]
  
  /**
    * Returns true if value is a valid ImageValue. This excludes `null`. Use this to check if a value will
    * be accepted by Image.from. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  inline def isValidImageValue(value: Any): /* is tabris.tabris.ImageValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidImageValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is tabris.tabris.ImageValue */ Boolean]
}
