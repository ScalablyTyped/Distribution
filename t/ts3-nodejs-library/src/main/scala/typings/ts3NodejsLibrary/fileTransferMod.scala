package typings.ts3NodejsLibrary

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts3-nodejs-library/lib/transport/FileTransfer", JSImport.Namespace)
@js.native
object fileTransferMod extends js.Object {
  
  @js.native
  class FileTransfer protected () extends js.Object {
    /**
      * Initializes a File Transfer
      * @param host TeamSpeak's File transfer Host
      * @param port TeamSpeak's File transfer Port
      * @param timeout Timeout for File Transfer
      */
    def this(host: String) = this()
    def this(host: String, port: Double) = this()
    def this(host: String, port: js.UndefOr[scala.Nothing], timeout: Double) = this()
    def this(host: String, port: Double, timeout: Double) = this()
    
    var buffer: js.Any = js.native
    
    var bytesreceived: js.Any = js.native
    
    /**
      * Starts the download of a File
      * @param ftkey the Filetransfer Key
      * @param size the Data Length
      */
    def download(ftkey: String, size: Double): js.Promise[Buffer] = js.native
    
    var host: js.Any = js.native
    
    /**
      * connects to the File Transfer Server
      * @param ftkey the Filetransfer Key
      * @returns returns a Promise Object with the socket
      */
    var init: js.Any = js.native
    
    var port: js.Any = js.native
    
    var timeout: js.Any = js.native
    
    /**
      * starts the upload of a File
      * @param ftkey the Filetransfer Key
      * @param data the data to send
      */
    def upload(ftkey: String, data: String): js.Promise[Unit] = js.native
    def upload(ftkey: String, data: Buffer): js.Promise[Unit] = js.native
  }
}
