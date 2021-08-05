package typings.tabris.mod

import typings.tabris.anon.ContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Printer")
@js.native
/* private */ class Printer_ () extends NativeObject {
  
  /**
    * Prints a PDF document using the native printing capabilities of the device. The data has to be
    * provided as an `ArrayBuffer` or typed array. The method returns a promise which resolves to an event
    * object with the property `result`. The `result` can either be `completed` or `canceled`. When
    * printing fails the promise is rejected with an `Error` parameter containing additional information
    * about the error. Supported on iOS and Android 4.4+.
    * @param data The bytes of the document to print. The value can either be an ArrayBuffer or a typed array containing the bytes of a PDF document or image.
    * @param options An optional set of configuration parameters.
    */
  def print(data: js.Any): js.Promise[Unit] = js.native
  def print(data: js.Any, options: ContentType): js.Promise[Unit] = js.native
}
