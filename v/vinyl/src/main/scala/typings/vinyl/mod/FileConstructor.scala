package typings.vinyl.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.vinyl.anon.ConstructorOptionscontent
import typings.vinyl.anon.ConstructorOptionscontentBase
import typings.vinyl.anon.ConstructorOptionscontentDictcustomOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileConstructor
  extends Instantiable0[typings.std.File]
     with Instantiable1[
      (/* options */ ConstructorOptions) | (/* options */ ConstructorOptionscontent) | (/* options */ ConstructorOptionscontentBase) | (/* options */ ConstructorOptionscontentDictcustomOption), 
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

