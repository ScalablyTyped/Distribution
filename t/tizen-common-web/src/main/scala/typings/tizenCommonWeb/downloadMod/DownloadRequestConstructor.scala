package typings.tizenCommonWeb.downloadMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import typings.tizenCommonWeb.tizenCommonWebStrings.ALL
import typings.tizenCommonWeb.tizenCommonWebStrings.CELLULAR
import typings.tizenCommonWeb.tizenCommonWebStrings.WIFI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadRequestConstructor
  extends /**
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
Instantiable1[/* url */ String, DownloadRequest]
     with Instantiable2[/* url */ String, /* destination */ String, DownloadRequest]
     with Instantiable3[
      /* url */ String, 
      js.UndefOr[/* destination */ String], 
      /* fileName */ String, 
      DownloadRequest
    ]
     with Instantiable4[
      /* url */ String, 
      js.UndefOr[/* destination */ String], 
      js.UndefOr[/* fileName */ String], 
      ALL | CELLULAR | WIFI | (/* networkType */ DownloadNetworkType), 
      DownloadRequest
    ]
     with Instantiable5[
      /* url */ String, 
      js.UndefOr[/* destination */ String], 
      js.UndefOr[/* fileName */ String], 
      js.UndefOr[ALL | CELLULAR | WIFI | (/* networkType */ DownloadNetworkType)], 
      /* httpHeader */ DownloadHTTPHeaderFields, 
      DownloadRequest
    ]

