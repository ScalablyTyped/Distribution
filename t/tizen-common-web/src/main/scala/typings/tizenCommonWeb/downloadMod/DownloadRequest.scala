package typings.tizenCommonWeb.downloadMod

import typings.tizenCommonWeb.tizenCommonWebStrings.ALL
import typings.tizenCommonWeb.tizenCommonWebStrings.CELLULAR
import typings.tizenCommonWeb.tizenCommonWebStrings.WIFI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web/download", "DownloadRequest")
@js.native
class DownloadRequest protected () extends js.Object {
  /**
    * @param url An attribute to store the URL of the object to download.
    * @param destination? An attribute to store the folder path of the destination folder to which a requested file object will be downloaded.
    * If the destination is not specified or is an empty string, the file will be downloaded to the default storage: "Downloads". For more information, see Filesystem API
    * The default value is an empty string.
    * @param fileName? An attribute to store the file name for the specified URL.
    * If the file name is not given or is an empty string, the original file name from the URL is used.
    * The default value is an empty string.
    * @param networkType? An attribute to store the allowed network type.
    * If the network type is not given, all network types are allowed.
    * The default value is ***ALL***
    * @since 2.1
    * @param httpHeader? An attribute to store extra HTTP header fields.
    * @since 2.1
    * For more information about HTTP header fields, see [RFC-2616](http://www.w3.org/Protocols/rfc2616/rfc2616-sec4.html#sec4.2)
    * The default value is an empty object.
    */
  def this(url: String) = this()
  def this(url: String, destination: String) = this()
  def this(url: String, destination: js.UndefOr[scala.Nothing], fileName: String) = this()
  def this(url: String, destination: String, fileName: String) = this()
  def this(
    url: String,
    destination: js.UndefOr[scala.Nothing],
    fileName: js.UndefOr[scala.Nothing],
    networkType: DownloadNetworkType
  ) = this()
  def this(
    url: String,
    destination: js.UndefOr[scala.Nothing],
    fileName: js.UndefOr[scala.Nothing],
    networkType: ALL
  ) = this()
  def this(
    url: String,
    destination: js.UndefOr[scala.Nothing],
    fileName: js.UndefOr[scala.Nothing],
    networkType: CELLULAR
  ) = this()
  def this(
    url: String,
    destination: js.UndefOr[scala.Nothing],
    fileName: js.UndefOr[scala.Nothing],
    networkType: WIFI
  ) = this()
  def this(
    url: String,
    destination: js.UndefOr[scala.Nothing],
    fileName: String,
    networkType: DownloadNetworkType
  ) = this()
  def this(url: String, destination: js.UndefOr[scala.Nothing], fileName: String, networkType: ALL) = this()
  def this(url: String, destination: js.UndefOr[scala.Nothing], fileName: String, networkType: CELLULAR) = this()
  def this(url: String, destination: js.UndefOr[scala.Nothing], fileName: String, networkType: WIFI) = this()
  def this(
    url: String,
    destination: String,
    fileName: js.UndefOr[scala.Nothing],
    networkType: DownloadNetworkType
  ) = this()
  def this(url: String, destination: String, fileName: js.UndefOr[scala.Nothing], networkType: ALL) = this()
  def this(url: String, destination: String, fileName: js.UndefOr[scala.Nothing], networkType: CELLULAR) = this()
  def this(url: String, destination: String, fileName: js.UndefOr[scala.Nothing], networkType: WIFI) = this()
  def this(url: String, destination: String, fileName: String, networkType: DownloadNetworkType) = this()
  def this(url: String, destination: String, fileName: String, networkType: ALL) = this()
  def this(url: String, destination: String, fileName: String, networkType: CELLULAR) = this()
  def this(url: String, destination: String, fileName: String, networkType: WIFI) = this()
  def this(
    url: String,
    destination: js.UndefOr[scala.Nothing],
    fileName: js.UndefOr[scala.Nothing],
    networkType: js.UndefOr[scala.Nothing],
    httpHeader: DownloadHTTPHeaderFields
  ) = this()
  def this(
    url: String,
    destination: js.UndefOr[scala.Nothing],
    fileName: js.UndefOr[scala.Nothing],
    networkType: DownloadNetworkType,
    httpHeader: DownloadHTTPHeaderFields
  ) = this()
  def this(
    url: String,
    destination: js.UndefOr[scala.Nothing],
    fileName: js.UndefOr[scala.Nothing],
    networkType: ALL,
    httpHeader: DownloadHTTPHeaderFields
  ) = this()
  def this(
    url: String,
    destination: js.UndefOr[scala.Nothing],
    fileName: js.UndefOr[scala.Nothing],
    networkType: CELLULAR,
    httpHeader: DownloadHTTPHeaderFields
  ) = this()
  def this(
    url: String,
    destination: js.UndefOr[scala.Nothing],
    fileName: js.UndefOr[scala.Nothing],
    networkType: WIFI,
    httpHeader: DownloadHTTPHeaderFields
  ) = this()
  def this(
    url: String,
    destination: js.UndefOr[scala.Nothing],
    fileName: String,
    networkType: js.UndefOr[scala.Nothing],
    httpHeader: DownloadHTTPHeaderFields
  ) = this()
  def this(
    url: String,
    destination: js.UndefOr[scala.Nothing],
    fileName: String,
    networkType: DownloadNetworkType,
    httpHeader: DownloadHTTPHeaderFields
  ) = this()
  def this(
    url: String,
    destination: js.UndefOr[scala.Nothing],
    fileName: String,
    networkType: ALL,
    httpHeader: DownloadHTTPHeaderFields
  ) = this()
  def this(
    url: String,
    destination: js.UndefOr[scala.Nothing],
    fileName: String,
    networkType: CELLULAR,
    httpHeader: DownloadHTTPHeaderFields
  ) = this()
  def this(
    url: String,
    destination: js.UndefOr[scala.Nothing],
    fileName: String,
    networkType: WIFI,
    httpHeader: DownloadHTTPHeaderFields
  ) = this()
  def this(
    url: String,
    destination: String,
    fileName: js.UndefOr[scala.Nothing],
    networkType: js.UndefOr[scala.Nothing],
    httpHeader: DownloadHTTPHeaderFields
  ) = this()
  def this(
    url: String,
    destination: String,
    fileName: js.UndefOr[scala.Nothing],
    networkType: DownloadNetworkType,
    httpHeader: DownloadHTTPHeaderFields
  ) = this()
  def this(
    url: String,
    destination: String,
    fileName: js.UndefOr[scala.Nothing],
    networkType: ALL,
    httpHeader: DownloadHTTPHeaderFields
  ) = this()
  def this(
    url: String,
    destination: String,
    fileName: js.UndefOr[scala.Nothing],
    networkType: CELLULAR,
    httpHeader: DownloadHTTPHeaderFields
  ) = this()
  def this(
    url: String,
    destination: String,
    fileName: js.UndefOr[scala.Nothing],
    networkType: WIFI,
    httpHeader: DownloadHTTPHeaderFields
  ) = this()
  def this(
    url: String,
    destination: String,
    fileName: String,
    networkType: js.UndefOr[scala.Nothing],
    httpHeader: DownloadHTTPHeaderFields
  ) = this()
  def this(
    url: String,
    destination: String,
    fileName: String,
    networkType: DownloadNetworkType,
    httpHeader: DownloadHTTPHeaderFields
  ) = this()
  def this(
    url: String,
    destination: String,
    fileName: String,
    networkType: ALL,
    httpHeader: DownloadHTTPHeaderFields
  ) = this()
  def this(
    url: String,
    destination: String,
    fileName: String,
    networkType: CELLULAR,
    httpHeader: DownloadHTTPHeaderFields
  ) = this()
  def this(
    url: String,
    destination: String,
    fileName: String,
    networkType: WIFI,
    httpHeader: DownloadHTTPHeaderFields
  ) = this()
  
  var destnation: js.UndefOr[String] = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var httpHeader: js.UndefOr[DownloadHTTPHeaderFields] = js.native
  
  var networkType: js.UndefOr[DownloadNetworkType | CELLULAR | WIFI | ALL] = js.native
  
  var url: String = js.native
}
