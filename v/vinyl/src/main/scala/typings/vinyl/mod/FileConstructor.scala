package typings.vinyl.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.vinyl.AnonContents
import typings.vinyl.AnonContentsBuffer
import typings.vinyl.AnonContentsReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileConstructor
  extends Instantiable0[typings.std.File]
     with Instantiable1[
      (/* options */ ConstructorOptions with AnonContents) | (/* options */ ConstructorOptions with AnonContentsBuffer) | (/* options */ ConstructorOptions with AnonContentsReadableStream) | (/* options */ ConstructorOptions), 
      BufferFile | typings.std.File | NullFile | StreamFile
    ] {
  /**
    * Checks if a property is not managed internally.
    */
  def isCustomProp(name: String): Boolean = js.native
  /**
    * Checks if a given object is a vinyl file.
    */
  def isVinyl(obj: js.Any): /* is std.File */ Boolean = js.native
}

