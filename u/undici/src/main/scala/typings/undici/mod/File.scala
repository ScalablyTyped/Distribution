package typings.undici.mod

import typings.node.NodeJS.ArrayBufferView
import typings.std.Blob
import typings.undici.typesFileMod.FilePropertyBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("undici", "File")
@js.native
open class File protected ()
  extends typings.undici.typesFileMod.File {
  /**
    * Creates a new File instance.
    *
    * @param fileBits An `Array` strings, or [`ArrayBuffer`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer), [`ArrayBufferView`](https://developer.mozilla.org/en-US/docs/Web/API/ArrayBufferView), [`Blob`](https://developer.mozilla.org/en-US/docs/Web/API/Blob) objects, or a mix of any of such objects, that will be put inside the [`File`](https://developer.mozilla.org/en-US/docs/Web/API/File).
    * @param fileName The name of the file.
    * @param options An options object containing optional attributes for the file.
    */
  def this(fileBits: js.Array[String | ArrayBufferView | Blob], fileName: String) = this()
  def this(fileBits: js.Array[String | ArrayBufferView | Blob], fileName: String, options: FilePropertyBag) = this()
}
