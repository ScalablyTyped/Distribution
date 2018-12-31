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

