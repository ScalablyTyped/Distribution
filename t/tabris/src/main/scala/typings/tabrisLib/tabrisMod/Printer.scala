package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows to print PDF documents or images from the device. A printer object is always available from
  * tabris.printer.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._PrinterProperties because Already inherited */ @JSImport("tabris", "Printer")
@js.native
class Printer protected () extends NativeObject {
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_Printer: tabrisLib.PrinterProperties = js.native
  /**
    * Prints a PDF document using the native printing capabilities of the device. The data has to be
    * provided as an `ArrayBuffer` or typed array. The method returns a promise which resolves to an event
    * object with the property `result`. The `result` can either be `completed` or `canceled`. When
    * printing fails the promise is rejected with an `Error` parameter containing additional information
    * about the error. Supported on iOS and Android 4.4+.
    * @param data The bytes of the document to print. The value can either be an ArrayBuffer or a typed array containing the bytes of a PDF document or image.
    * @param options An optional set of configuration parameters. Setting the `jobName` allows to provide the document name shown the user. The `contentType` is required when printing a specific document format. By default `application/pdf` is used but it needs to be changed to `image/ *` when printing an image
    */
  def print(data: js.Any): js.Promise[_] = js.native
  def print(data: js.Any, options: tabrisLib.Anon_ContentType): js.Promise[_] = js.native
}

