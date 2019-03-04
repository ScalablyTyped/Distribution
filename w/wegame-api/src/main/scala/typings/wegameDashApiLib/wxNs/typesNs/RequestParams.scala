package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParams extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 请求的参数
    */
  var data: js.UndefOr[java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * 返回的数据格式
    */
  var dataType: js.UndefOr[
    wegameDashApiLib.wegameDashApiLibStrings.json | wegameDashApiLib.wegameDashApiLibStrings.arraybuffer
  ] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 设置请求的 header，header 中不能设置 Referer
    */
  var header: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * HTTP 请求方法
    */
  var method: js.UndefOr[RequestMethod] = js.undefined
  /**
    * res.data usually can be string or ArrayBuffer
    */
  var success: js.UndefOr[js.Function1[/* res */ wegameDashApiLib.Anon_DataHeader, scala.Unit]] = js.undefined
  /**
    * 开发者服务器接口地址
    */
  var url: java.lang.String
}

object RequestParams {
  @scala.inline
  def apply(
    url: java.lang.String,
    complete: js.Function0[scala.Unit] = null,
    data: java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    dataType: wegameDashApiLib.wegameDashApiLibStrings.json | wegameDashApiLib.wegameDashApiLibStrings.arraybuffer = null,
    fail: js.Function0[scala.Unit] = null,
    header: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    method: RequestMethod = null,
    success: js.Function1[/* res */ wegameDashApiLib.Anon_DataHeader, scala.Unit] = null
  ): RequestParams = {
    val __obj = js.Dynamic.literal(url = url)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (header != null) __obj.updateDynamic("header")(header)
    if (method != null) __obj.updateDynamic("method")(method)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[RequestParams]
  }
}

