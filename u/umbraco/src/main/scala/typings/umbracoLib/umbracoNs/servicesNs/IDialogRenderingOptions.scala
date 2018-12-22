package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Rendering options
    */

trait IDialogRenderingOptions extends js.Object {
  /*animation css class, by default set to "fade"*/
  var animation: js.UndefOr[java.lang.String] = js.undefined
  /*function called when the modal is submitted*/
  var callback: angularLib.angularMod.Global.Function
  /*the DOM element to inject the modal into, by default set to body*/
  var container: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** 
           * It will set this value as a property on the dialog controller's scope as $scope.dialogData
           */
  var dialogData: js.UndefOr[js.Any] = js.undefined
  /*load template in an iframe, only needed for serverside templates*/
  var iframe: scala.Boolean
  /*strips the modal from any animation and wrappers, used when you want to inject a dialog into an existing container*/
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  /*modal css class, by default "umb-modal"*/
  var modalClass: js.UndefOr[java.lang.String] = js.undefined
  /*show the modal instantly*/
  var show: js.UndefOr[scala.Boolean] = js.undefined
  /*the url of the template*/
  var template: java.lang.String
  /*set a width on the modal, only needed for iframes*/
  var width: js.UndefOr[scala.Double] = js.undefined
}

