package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create modal dialogs with different styles and transitions
  * Documentation: {@link http://getuikit.org/docs/modal.html}
  *
  * <h2>Events</h2>
  *
  * <table>
  * <tr>
  * <th>Name</th>
  * <th>Parameter</th>
  * <th>Description</th>
  * </tr>
  *
  * <tr>
  * <td><code>show.uk.modal</code></td>
  * <td>event</td>
  * <td>On modal show</td>
  * </tr>
  * <tr>
  * <td><code>hide.uk.modal</code></td>
  * <td>event</td>
  * <td>On modal hide</td>
  * </tr>
  * </table>
  * @example
  * <pre><code>
  * $('.modalSelector').on({
  *     'show.uk.modal': function(){
  *         console.log("Modal is visible.");
  *     },
  *
  *     'hide.uk.modal': function(){
  *         console.log("Element is not visible.");
  *     }
  * });
  * </code></pre>
  */
@js.native
trait Modal extends js.Object {
  /**
    * Select a modal element on page and return it.
    * @example
    * <pre><code>
    * var modal = UIkit.modal(".modalSelector");
    *
    * if ( modal.isActive() ) {
    *   modal.hide();
    *   } else {
    *   modal.show();
    * }
    * </code></pre>
    */
  def apply(selector: java.lang.String): ModalElement = js.native
  def apply(selector: java.lang.String, options: ModalOptions): ModalElement = js.native
  def apply(selector: jqueryLib.JQuery[stdLib.HTMLElement]): ModalElement = js.native
  def apply(selector: jqueryLib.JQuery[stdLib.HTMLElement], options: ModalOptions): ModalElement = js.native
  /**
    * Create a alert dialog
    * @param  message The message to display. Can be Html
    */
  def alert(message: java.lang.String): scala.Unit = js.native
  /**
    * Create a modal that blocks the entire page
    * @param content A content to display. Can be Html
    * @param  [options={bgclose: true, keyboard: false, modal: false}] The modal options
    */
  def blockUI(content: java.lang.String): ModalElement = js.native
  def blockUI(content: java.lang.String, options: ModalOptions): ModalElement = js.native
  /**
    * Create a confirm dialog
    * @param  message The message to display. Can be Html
    * @param  [options={bgclose: true, keyboard: false, modal: false}] The modal options
    */
  def confirm(message: java.lang.String): scala.Unit = js.native
  /**
    * Create a confirm dialog and execute onconfirm on confirmation
    * @param  message The message to display. Can be Html
    * @param  onconfirm A function to execute on confirmation
    * @param  [options={bgclose: true, keyboard: false, modal: false}] The modal options
    */
  def confirm(message: java.lang.String, onconfirm: js.Function0[_]): scala.Unit = js.native
  def confirm(message: java.lang.String, onconfirm: js.Function0[_], oncancel: js.Function0[_]): scala.Unit = js.native
  def confirm(
    message: java.lang.String,
    onconfirm: js.Function0[_],
    oncancel: js.Function0[_],
    options: ModalOptions
  ): scala.Unit = js.native
  def confirm(message: java.lang.String, onconfirm: js.Function0[_], options: ModalOptions): scala.Unit = js.native
  def confirm(message: java.lang.String, options: ModalOptions): scala.Unit = js.native
  /**
    * Create a prompt dialog, where the user enter information
    * @param  message The message to display. Can be Html
    * @param  value   A value to init the input
    * @param  fn  A function to execute on submission. The function receive the new value as a parameter
    * @param  [options={bgclose: true, keyboard: false, modal: false}] The modal options
    */
  def prompt(message: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def prompt(
    message: java.lang.String,
    value: java.lang.String,
    onsubmit: js.Function1[/* newValue */ java.lang.String, _]
  ): scala.Unit = js.native
  def prompt(
    message: java.lang.String,
    value: java.lang.String,
    onsubmit: js.Function1[/* newValue */ java.lang.String, _],
    options: ModalOptions
  ): scala.Unit = js.native
}

