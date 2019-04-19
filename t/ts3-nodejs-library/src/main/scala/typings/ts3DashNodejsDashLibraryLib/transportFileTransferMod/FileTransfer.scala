package typings
package ts3DashNodejsDashLibraryLib.transportFileTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTransfer extends js.Object {
  /**
    * Starts the download of a File
    * @param - The Filetransfer Key
    * @param- The Data Length
    * @returns a buffer with the binary data
    */
  def download(ftkey: java.lang.String, size: scala.Double): js.Promise[nodeLib.Buffer] = js.native
  /**
    * Starts the upload of a File
    * @param - the Filetransfer Key
    * @param - the data to send
    */
  def upload(ftkey: java.lang.String, data: java.lang.String): js.Promise[scala.Unit] = js.native
  def upload(ftkey: java.lang.String, data: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
}

