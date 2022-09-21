package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "DownloadRequest")
@js.native
open class DownloadRequest protected () extends StObject {
  def this(
    url: String,
    destination: js.UndefOr[String | Null],
    fileName: js.UndefOr[String | Null],
    networkType: js.UndefOr[DownloadNetworkType | Null],
    httpHeader: js.UndefOr[DownloadHTTPHeaderFields | Null]
  ) = this()
  
  /**
    * An attribute to store the folder path of the destination folder to which a requested file object will be downloaded.
    *
    * If the destination is not specified or is an empty string, the file will be downloaded to the default storage: "Downloads". For more information, see [Filesystem API](filesystem.html).
    *
    * The default value is an empty string.
    */
  var destination: String | Null = js.native
  
  /**
    * An attribute to store the file name for the specified URL.
    *
    * If the file name is not given or is an empty string, the original file name from the URL is used.
    *
    * The default value is an empty string.
    */
  var fileName: String | Null = js.native
  
  /**
    * An attribute to store extra HTTP header fields.
    *
    * @since 2.1
    *
    * For more information about HTTP header fields, see [RFC-2616](http://www.w3.org/Protocols/rfc2616/rfc2616-sec4.html#sec4.2)
    *
    * The default value is an empty object.
    */
  var httpHeader: DownloadHTTPHeaderFields | Null = js.native
  
  /**
    * An attribute to store the allowed network type.
    *
    * If the network type is not given, all network types are allowed.
    *
    * The default value is ALL.
    *
    * @since 2.1
    */
  var networkType: DownloadNetworkType | Null = js.native
  
  /**
    * An attribute to store the URL of the object to download.
    */
  var url: String = js.native
}
