package typings.wxJsSdkDt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  /**
    * iOS微信6.5.3及其之后的版本 window.__wxjs_is_wkwebview 为true时是使用WKWebview，为 false或者 “undefine”时是 UIWebview
    */
  var __wxjs_is_wkwebview: js.UndefOr[Boolean] = js.undefined
}

object Window {
  @scala.inline
  def apply(__wxjs_is_wkwebview: js.UndefOr[Boolean] = js.undefined): Window = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(__wxjs_is_wkwebview)) __obj.updateDynamic("__wxjs_is_wkwebview")(__wxjs_is_wkwebview.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

