package typings.wixDashStyleDashReact.loaderMod

import typings.react.reactMod.ReactNode
import typings.wixDashStyleDashReact.baseComponentsMod.WixComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderProps extends WixComponentProps {
  var color: js.UndefOr[LoaderColor] = js.undefined
  var shouldLoadAsync: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[LoaderSize] = js.undefined
  var status: js.UndefOr[LoaderStatus] = js.undefined
  var statusMessage: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[ReactNode] = js.undefined
}

object LoaderProps {
  @scala.inline
  def apply(
    color: LoaderColor = null,
    dataHook: String = null,
    shouldLoadAsync: js.UndefOr[Boolean] = js.undefined,
    size: LoaderSize = null,
    status: LoaderStatus = null,
    statusMessage: String = null,
    styles: String = null,
    text: ReactNode = null
  ): LoaderProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dataHook != null) __obj.updateDynamic("dataHook")(dataHook)
    if (!js.isUndefined(shouldLoadAsync)) __obj.updateDynamic("shouldLoadAsync")(shouldLoadAsync)
    if (size != null) __obj.updateDynamic("size")(size)
    if (status != null) __obj.updateDynamic("status")(status)
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderProps]
  }
}

