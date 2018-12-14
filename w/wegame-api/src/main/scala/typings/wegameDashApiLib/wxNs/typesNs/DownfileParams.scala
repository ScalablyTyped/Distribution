package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DownfileParams extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ wegameDashApiLib.Anon_ErrMsgString, scala.Unit]] = js.undefined
  /**
               * 在指定filePath之后success回调中将不会有res.tempFilePath路径值，下载的文件会直接写入filePath指定的路径（有写入权限的情况下，根目录请使用wx.env.USER_DATA_PATH，路径文件夹必须存在，否则写入失败）
               */
  var filePath: js.UndefOr[java.lang.String] = js.undefined
  /**
               * 	HTTP 请求的 Header，Header 中不能设置 Referer
               */
  var header: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
               * res.tempFilePath 临时文件路径。如果没传入 filePath 指定文件存储路径，则下载后的文件会存储到一个临时文件
               * res.statusCode 开发者服务器返回的 HTTP 状态码
               */
  var success: js.UndefOr[js.Function1[/* res */ wegameDashApiLib.Anon_TempFilePathStatusCode, scala.Unit]] = js.undefined
  var url: java.lang.String
}

