package typings.vinyl.vinylMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.vinyl.Anon_Contents
import typings.vinyl.Anon_ContentsBuffer
import typings.vinyl.Anon_ContentsReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileConstructor
  extends Instantiable0[typings.std.File]
     with Instantiable1[
      (/* options */ ConstructorOptions with Anon_Contents) | (/* options */ ConstructorOptions with Anon_ContentsBuffer) | (/* options */ ConstructorOptions with Anon_ContentsReadableStream) | (/* options */ ConstructorOptions), 
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

