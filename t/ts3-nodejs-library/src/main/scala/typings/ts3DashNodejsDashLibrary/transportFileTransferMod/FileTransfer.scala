package typings.ts3DashNodejsDashLibrary.transportFileTransferMod

import typings.node.Buffer
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
  def download(ftkey: String, size: Double): js.Promise[Buffer] = js.native
  /**
    * Starts the upload of a File
    * @param - the Filetransfer Key
    * @param - the data to send
    */
  def upload(ftkey: String, data: String): js.Promise[Unit] = js.native
  def upload(ftkey: String, data: Buffer): js.Promise[Unit] = js.native
}

