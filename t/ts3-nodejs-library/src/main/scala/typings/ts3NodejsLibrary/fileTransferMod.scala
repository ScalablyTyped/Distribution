package typings.ts3NodejsLibrary

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileTransferMod {
  
  @JSImport("ts3-nodejs-library/lib/transport/FileTransfer", "FileTransfer")
  @js.native
  open class FileTransfer protected () extends StObject {
    /**
      * Initializes a File Transfer
      * @param host TeamSpeak's File transfer Host
      * @param port TeamSpeak's File transfer Port
      * @param timeout Timeout for File Transfer
      */
    def this(host: String) = this()
    def this(host: String, port: Double) = this()
    def this(host: String, port: Double, timeout: Double) = this()
    def this(host: String, port: Unit, timeout: Double) = this()
    
    /* private */ var buffer: Any = js.native
    
    /* private */ var bytesreceived: Any = js.native
    
    /**
      * Starts the download of a File
      * @param ftkey the Filetransfer Key
      * @param size the Data Length
      */
    def download(ftkey: String, size: Double): js.Promise[Buffer] = js.native
    
    /* private */ var host: Any = js.native
    
    /**
      * connects to the File Transfer Server
      * @param ftkey the Filetransfer Key
      * @returns returns a Promise Object with the socket
      */
    /* private */ var init: Any = js.native
    
    /* private */ var port: Any = js.native
    
    /* private */ var timeout: Any = js.native
    
    /**
      * starts the upload of a File
      * @param ftkey the Filetransfer Key
      * @param data the data to send
      */
    def upload(ftkey: String, data: String): js.Promise[Unit] = js.native
    def upload(ftkey: String, data: Buffer): js.Promise[Unit] = js.native
  }
}
