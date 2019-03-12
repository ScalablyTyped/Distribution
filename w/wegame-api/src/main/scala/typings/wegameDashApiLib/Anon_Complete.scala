package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Complete extends js.Object {
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

object Anon_Complete {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    name: java.lang.String,
    url: java.lang.String,
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    formData: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    header: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    success: /* res */ Anon_DataStatusCode => scala.Unit = null
  ): Anon_Complete = {
    val __obj = js.Dynamic.literal(filePath = filePath, name = name, url = url)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (formData != null) __obj.updateDynamic("formData")(formData)
    if (header != null) __obj.updateDynamic("header")(header)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[Anon_Complete]
  }
}

