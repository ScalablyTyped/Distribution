package typings.wixStyleReact.loaderMod

import typings.react.mod.ReactNode
import typings.wixStyleReact.baseComponentsMod.WixComponentProps
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
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dataHook != null) __obj.updateDynamic("dataHook")(dataHook.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldLoadAsync)) __obj.updateDynamic("shouldLoadAsync")(shouldLoadAsync.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderProps]
  }
}

