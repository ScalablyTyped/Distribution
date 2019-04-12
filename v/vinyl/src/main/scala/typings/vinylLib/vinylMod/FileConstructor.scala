package typings
package vinylLib.vinylMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileConstructor
  extends org.scalablytyped.runtime.Instantiable0[File]
     with org.scalablytyped.runtime.Instantiable1[
      (/* options */ ConstructorOptions with vinylLib.Anon_Contents) | (/* options */ ConstructorOptions with vinylLib.Anon_ContentsBuffer) | (/* options */ ConstructorOptions with vinylLib.Anon_ContentsReadableStream) | (/* options */ ConstructorOptions), 
      vinylLib.vinylMod.FileNs.BufferFile | File | vinylLib.vinylMod.FileNs.NullFile | vinylLib.vinylMod.FileNs.StreamFile
    ] {
  /**
    * Checks if a property is not managed internally.
    */
  def isCustomProp(name: java.lang.String): scala.Boolean = js.native
  /**
    * Checks if a given object is a vinyl file.
    */
  def isVinyl(obj: js.Any): /* is vinyl.vinyl.File */ scala.Boolean = js.native
}

