package typings.twineSugarcube.uiMod

import typings.jquery.JQuery.Node
import typings.jquery.JQuery.TypeOrArray
import typings.jquery.JQuery.htmlString
import typings.std.HTMLElement
import typings.twineSugarcube.extensionsMod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogAPI extends js.Object {
  
  def addClickHandler(targets: String): Unit = js.native
  def addClickHandler(
    targets: String,
    options: js.UndefOr[scala.Nothing],
    tartFn: js.UndefOr[scala.Nothing],
    doneFn: js.UndefOr[scala.Nothing],
    closeFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(
    targets: String,
    options: js.UndefOr[scala.Nothing],
    tartFn: js.UndefOr[scala.Nothing],
    doneFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(
    targets: String,
    options: js.UndefOr[scala.Nothing],
    tartFn: js.UndefOr[scala.Nothing],
    doneFn: js.Function0[Unit],
    closeFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(targets: String, options: js.UndefOr[scala.Nothing], tartFn: js.Function0[Unit]): Unit = js.native
  def addClickHandler(
    targets: String,
    options: js.UndefOr[scala.Nothing],
    tartFn: js.Function0[Unit],
    doneFn: js.UndefOr[scala.Nothing],
    closeFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(
    targets: String,
    options: js.UndefOr[scala.Nothing],
    tartFn: js.Function0[Unit],
    doneFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(
    targets: String,
    options: js.UndefOr[scala.Nothing],
    tartFn: js.Function0[Unit],
    doneFn: js.Function0[Unit],
    closeFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(targets: String, options: DialogOptions): Unit = js.native
  def addClickHandler(
    targets: String,
    options: DialogOptions,
    tartFn: js.UndefOr[scala.Nothing],
    doneFn: js.UndefOr[scala.Nothing],
    closeFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(
    targets: String,
    options: DialogOptions,
    tartFn: js.UndefOr[scala.Nothing],
    doneFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(
    targets: String,
    options: DialogOptions,
    tartFn: js.UndefOr[scala.Nothing],
    doneFn: js.Function0[Unit],
    closeFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(targets: String, options: DialogOptions, tartFn: js.Function0[Unit]): Unit = js.native
  def addClickHandler(
    targets: String,
    options: DialogOptions,
    tartFn: js.Function0[Unit],
    doneFn: js.UndefOr[scala.Nothing],
    closeFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(targets: String, options: DialogOptions, tartFn: js.Function0[Unit], doneFn: js.Function0[Unit]): Unit = js.native
  def addClickHandler(
    targets: String,
    options: DialogOptions,
    tartFn: js.Function0[Unit],
    doneFn: js.Function0[Unit],
    closeFn: js.Function0[Unit]
  ): Unit = js.native
  /**
    * @deprecated
    * This method has been deprecated and should no longer be used. The core of what it does is simply to wrap
    * a call to Dialog.open() within a call to jQuery.ariaClick(), which can be done directly and with
    * greater flexibility.
    *
    * Adds WAI-ARIA-compatible mouse/keyboard event handlers to the target element(s) which open the dialog when
    * activated.
    * @param targets The DOM element(s) to attach the handler to—may be either an HTMLElement object, a jQuery object,
    * or a jQuery-style selector set.
    * @param options he options object; the currently understood properties are:
    *    top: Top y-coordinate of the dialog (default: 50; in pixels, but without the unit).
    *    opacity: Opacity of the overlay (default: 0.8).
    * @param tartFn The function to execute at the start of Dialog.addClickHandler(). This is commonly used to setup
    * the dialog.
    * @param doneFn The function to execute at the end of Dialog.addClickHandler().
    * @param closeFn The function to execute whenever the associated dialog is closed.
    * @since 2.0.0
    * @example
    * // Commonly used something like the following.
    * Dialog.addClickHandler("#some-element", undefined, function () {
    *     Dialog.setup("My Dialog Title", "my-dialog-class");
    *     Dialog.wiki(Story.get("MyDialogContents").processText());
    * });
    */
  def addClickHandler(targets: HTMLElement): Unit = js.native
  def addClickHandler(
    targets: HTMLElement,
    options: js.UndefOr[scala.Nothing],
    tartFn: js.UndefOr[scala.Nothing],
    doneFn: js.UndefOr[scala.Nothing],
    closeFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(
    targets: HTMLElement,
    options: js.UndefOr[scala.Nothing],
    tartFn: js.UndefOr[scala.Nothing],
    doneFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(
    targets: HTMLElement,
    options: js.UndefOr[scala.Nothing],
    tartFn: js.UndefOr[scala.Nothing],
    doneFn: js.Function0[Unit],
    closeFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(targets: HTMLElement, options: js.UndefOr[scala.Nothing], tartFn: js.Function0[Unit]): Unit = js.native
  def addClickHandler(
    targets: HTMLElement,
    options: js.UndefOr[scala.Nothing],
    tartFn: js.Function0[Unit],
    doneFn: js.UndefOr[scala.Nothing],
    closeFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(
    targets: HTMLElement,
    options: js.UndefOr[scala.Nothing],
    tartFn: js.Function0[Unit],
    doneFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(
    targets: HTMLElement,
    options: js.UndefOr[scala.Nothing],
    tartFn: js.Function0[Unit],
    doneFn: js.Function0[Unit],
    closeFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(targets: HTMLElement, options: DialogOptions): Unit = js.native
  def addClickHandler(
    targets: HTMLElement,
    options: DialogOptions,
    tartFn: js.UndefOr[scala.Nothing],
    doneFn: js.UndefOr[scala.Nothing],
    closeFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(
    targets: HTMLElement,
    options: DialogOptions,
    tartFn: js.UndefOr[scala.Nothing],
    doneFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(
    targets: HTMLElement,
    options: DialogOptions,
    tartFn: js.UndefOr[scala.Nothing],
    doneFn: js.Function0[Unit],
    closeFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(targets: HTMLElement, options: DialogOptions, tartFn: js.Function0[Unit]): Unit = js.native
  def addClickHandler(
    targets: HTMLElement,
    options: DialogOptions,
    tartFn: js.Function0[Unit],
    doneFn: js.UndefOr[scala.Nothing],
    closeFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(
    targets: HTMLElement,
    options: DialogOptions,
    tartFn: js.Function0[Unit],
    doneFn: js.Function0[Unit]
  ): Unit = js.native
  def addClickHandler(
    targets: HTMLElement,
    options: DialogOptions,
    tartFn: js.Function0[Unit],
    doneFn: js.Function0[Unit],
    closeFn: js.Function0[Unit]
  ): Unit = js.native
  
  /**
    * Appends the given content to the dialog's content area. Returns a reference to the Dialog object for chaining.
    *
    * NOTE: If your content contains any SugarCube markup, you'll need to use the Dialog.wiki() method instead.
    * @param content The content to append. As this method is essentially a shortcut for jQuery(Dialog.body()).append
    * (…), see jQuery's append() method for the range of valid content types.
    * @since 2.9.0
    * @example
    * Dialog.append("Cry 'Havoc!', and let slip the <em>ponies</em> of <strong>friendship</strong>.");
    * Dialog.append( <some DOM nodes> );
    */
  def append(content: (htmlString | (TypeOrArray[Node | JQuery]))*): this.type = js.native
  
  /**
    * Returns a reference to the dialog's content area
    * @since 2.0.0
    * @example
    * jQuery(Dialog.body()).append("Cry 'Havoc!', and let slip the <em>ponies</em> of <strong>friendship</strong>.");
    * jQuery(Dialog.body()).wiki("Cry 'Havoc!', and let slip the //ponies// of ''friendship''.");
    */
  def body(): HTMLElement = js.native
  
  /**
    * Closes the dialog. Returns a reference to the Dialog object for chaining.
    * @since 2.0.0
    */
  def close(): this.type = js.native
  
  /**
    * Returns whether the dialog is currently open.
    * @param classNames the space-separated-list of classes to check for when determining the state of the dialog.
    * Each of built-in dialogs contains a name-themed class which can be tested for in this manner—e.g. the Saves
    * dialog contains the class saves.
    * @since 2.0.0
    * @example
    * if (Dialog.isOpen()) {
    *        // code to execute if the dialog is open...
    * }
    * @example
    * if (Dialog.isOpen("saves")) {
    *        // code to execute if the Saves dialog is open
    * }
    */
  def isOpen(): Boolean = js.native
  def isOpen(classNames: String): Boolean = js.native
  
  /**
    * Opens the dialog. Returns a reference to the Dialog object for chaining.
    *
    * NOTE: Call this only after populating the dialog with content.
    * @param options The options to be used when opening the dialog.
    * @param closeFn The function to execute whenever the dialog is closed.
    * @since 2.0.0
    */
  def open(): this.type = js.native
  def open(options: js.UndefOr[scala.Nothing], closeFn: js.Function0[Unit]): this.type = js.native
  def open(options: DialogOptions): this.type = js.native
  def open(options: DialogOptions, closeFn: js.Function0[Unit]): this.type = js.native
  
  /**
    * Prepares the dialog for use and returns a reference to its content area.
    * @param title The title of the dialog.
    * @param classNames The space-separated-list of classes to add to the dialog.
    * @since 2.0.0
    * @example
    * // Basic example.
    * Dialog.setup();
    * Dialog.wiki("Blah //blah// ''blah''.");
    * Dialog.open();
    *
    * @example
    * // Adding a title to the dialog.
    * Dialog.setup("Character Sheet");
    * Dialog.wiki(Story.get("PC Sheet").processText());
    * Dialog.open();
    *
    * @example
    * // Adding a title and class to the dialog.
    * Dialog.setup("Character Sheet", "charsheet");
    * Dialog.wiki(Story.get("PC Sheet").processText());
    * Dialog.open();
    */
  def setup(): HTMLElement = js.native
  def setup(title: js.UndefOr[scala.Nothing], classNames: String): HTMLElement = js.native
  def setup(title: String): HTMLElement = js.native
  def setup(title: String, classNames: String): HTMLElement = js.native
  
  /**
    * Renders the given markup and appends it to the dialog's content area. Returns a reference to the Dialog object
    * for chaining.
    *
    * NOTE: If your content consists of DOM nodes, you'll need to use the @see Dialog.append() method instead.
    * @param wikiMarkup The markup to render.
    * @since 2.9.0
    * @example
    * Dialog.wiki("Cry 'Havoc!', and let slip the //ponies// of ''friendship''.");
    */
  def wiki(wikiMarkup: String): this.type = js.native
}
