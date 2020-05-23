package typings.umbraco.umbraco.services

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rendering options
  */
trait IDialogRenderingOptions extends js.Object {
  /*animation css class, by default set to "fade"*/
  var animation: js.UndefOr[String] = js.undefined
  /*function called when the modal is submitted*/
  var callback: js.Function
  /*the DOM element to inject the modal into, by default set to body*/
  var container: js.UndefOr[HTMLElement] = js.undefined
  /** 
    * It will set this value as a property on the dialog controller's scope as $scope.dialogData
    */
  var dialogData: js.UndefOr[js.Any] = js.undefined
  /*load template in an iframe, only needed for serverside templates*/
  var iframe: Boolean
  /*strips the modal from any animation and wrappers, used when you want to inject a dialog into an existing container*/
  var `inline`: js.UndefOr[Boolean] = js.undefined
  /*modal css class, by default "umb-modal"*/
  var modalClass: js.UndefOr[String] = js.undefined
  /*show the modal instantly*/
  var show: js.UndefOr[Boolean] = js.undefined
  /*the url of the template*/
  var template: String
  /*set a width on the modal, only needed for iframes*/
  var width: js.UndefOr[Double] = js.undefined
}

object IDialogRenderingOptions {
  @scala.inline
  def apply(
    callback: js.Function,
    iframe: Boolean,
    template: String,
    animation: String = null,
    container: HTMLElement = null,
    dialogData: js.Any = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    modalClass: String = null,
    show: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): IDialogRenderingOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (dialogData != null) __obj.updateDynamic("dialogData")(dialogData.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (modalClass != null) __obj.updateDynamic("modalClass")(modalClass.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogRenderingOptions]
  }
}

