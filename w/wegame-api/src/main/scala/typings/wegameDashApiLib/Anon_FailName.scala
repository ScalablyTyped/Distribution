package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_FailName extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
           * 要上传文件资源的路径
           */
  var filePath: java.lang.String
  /**
           * HTTP 请求中其他额外的 form data
           */
  var formData: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
           * HTTP 请求 Header，Header 中不能设置 Referer
           */
  var header: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
           * 文件对应的 key，开发者在服务端可以通过这个 key 获取文件的二进制内容
           */
  var name: java.lang.String
  var success: js.UndefOr[js.Function1[/* res */ Anon_DataStatusCode, scala.Unit]] = js.undefined
  /**
           * 开发者服务器地址
           */
  var url: java.lang.String
}

