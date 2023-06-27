package typings.twineSugarcube

import typings.jquery.JQuery.Event
import typings.jquery.JQuery.Node
import typings.jquery.JQuery.TypeOrArray
import typings.jquery.JQuery.htmlString
import typings.std.HTMLElement
import typings.twineSugarcube.extensionsMod.global.JQuery
import typings.twineSugarcube.twineSugarcubeStrings.auto
import typings.twineSugarcube.twineSugarcubeStrings.hide
import typings.twineSugarcube.twineSugarcubeStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uiMod {
  
  @js.native
  trait DialogAPI extends StObject {
    
    def addClickHandler(targets: String): Unit = js.native
    def addClickHandler(targets: String, options: Unit, tartFn: js.Function0[Unit]): Unit = js.native
    def addClickHandler(targets: String, options: Unit, tartFn: js.Function0[Unit], doneFn: js.Function0[Unit]): Unit = js.native
    def addClickHandler(
      targets: String,
      options: Unit,
      tartFn: js.Function0[Unit],
      doneFn: js.Function0[Unit],
      closeFn: js.Function0[Unit]
    ): Unit = js.native
    def addClickHandler(
      targets: String,
      options: Unit,
      tartFn: js.Function0[Unit],
      doneFn: Unit,
      closeFn: js.Function0[Unit]
    ): Unit = js.native
    def addClickHandler(targets: String, options: Unit, tartFn: Unit, doneFn: js.Function0[Unit]): Unit = js.native
    def addClickHandler(
      targets: String,
      options: Unit,
      tartFn: Unit,
      doneFn: js.Function0[Unit],
      closeFn: js.Function0[Unit]
    ): Unit = js.native
    def addClickHandler(targets: String, options: Unit, tartFn: Unit, doneFn: Unit, closeFn: js.Function0[Unit]): Unit = js.native
    def addClickHandler(targets: String, options: DialogOptions): Unit = js.native
    def addClickHandler(targets: String, options: DialogOptions, tartFn: js.Function0[Unit]): Unit = js.native
    def addClickHandler(targets: String, options: DialogOptions, tartFn: js.Function0[Unit], doneFn: js.Function0[Unit]): Unit = js.native
    def addClickHandler(
      targets: String,
      options: DialogOptions,
      tartFn: js.Function0[Unit],
      doneFn: js.Function0[Unit],
      closeFn: js.Function0[Unit]
    ): Unit = js.native
    def addClickHandler(
      targets: String,
      options: DialogOptions,
      tartFn: js.Function0[Unit],
      doneFn: Unit,
      closeFn: js.Function0[Unit]
    ): Unit = js.native
    def addClickHandler(targets: String, options: DialogOptions, tartFn: Unit, doneFn: js.Function0[Unit]): Unit = js.native
    def addClickHandler(
      targets: String,
      options: DialogOptions,
      tartFn: Unit,
      doneFn: js.Function0[Unit],
      closeFn: js.Function0[Unit]
    ): Unit = js.native
    def addClickHandler(targets: String, options: DialogOptions, tartFn: Unit, doneFn: Unit, closeFn: js.Function0[Unit]): Unit = js.native
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
    def addClickHandler(targets: HTMLElement, options: Unit, tartFn: js.Function0[Unit]): Unit = js.native
    def addClickHandler(targets: HTMLElement, options: Unit, tartFn: js.Function0[Unit], doneFn: js.Function0[Unit]): Unit = js.native
    def addClickHandler(
      targets: HTMLElement,
      options: Unit,
      tartFn: js.Function0[Unit],
      doneFn: js.Function0[Unit],
      closeFn: js.Function0[Unit]
    ): Unit = js.native
    def addClickHandler(
      targets: HTMLElement,
      options: Unit,
      tartFn: js.Function0[Unit],
      doneFn: Unit,
      closeFn: js.Function0[Unit]
    ): Unit = js.native
    def addClickHandler(targets: HTMLElement, options: Unit, tartFn: Unit, doneFn: js.Function0[Unit]): Unit = js.native
    def addClickHandler(
      targets: HTMLElement,
      options: Unit,
      tartFn: Unit,
      doneFn: js.Function0[Unit],
      closeFn: js.Function0[Unit]
    ): Unit = js.native
    def addClickHandler(targets: HTMLElement, options: Unit, tartFn: Unit, doneFn: Unit, closeFn: js.Function0[Unit]): Unit = js.native
    def addClickHandler(targets: HTMLElement, options: DialogOptions): Unit = js.native
    def addClickHandler(targets: HTMLElement, options: DialogOptions, tartFn: js.Function0[Unit]): Unit = js.native
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
    def addClickHandler(
      targets: HTMLElement,
      options: DialogOptions,
      tartFn: js.Function0[Unit],
      doneFn: Unit,
      closeFn: js.Function0[Unit]
    ): Unit = js.native
    def addClickHandler(targets: HTMLElement, options: DialogOptions, tartFn: Unit, doneFn: js.Function0[Unit]): Unit = js.native
    def addClickHandler(
      targets: HTMLElement,
      options: DialogOptions,
      tartFn: Unit,
      doneFn: js.Function0[Unit],
      closeFn: js.Function0[Unit]
    ): Unit = js.native
    def addClickHandler(
      targets: HTMLElement,
      options: DialogOptions,
      tartFn: Unit,
      doneFn: Unit,
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
    def open(options: Unit, closeFn: js.Function0[Unit]): this.type = js.native
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
    def setup(title: String): HTMLElement = js.native
    def setup(title: String, classNames: String): HTMLElement = js.native
    def setup(title: Unit, classNames: String): HTMLElement = js.native
    
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
  
  trait DialogOptions extends StObject {
    
    /** Opacity of the overlay (default: 0.8). */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Top y-coordinate of the dialog (default: 50; in pixels, but without the unit). */
    var top: js.UndefOr[Double] = js.undefined
  }
  object DialogOptions {
    
    inline def apply(): DialogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogOptions] (val x: Self) extends AnyVal {
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait FullscreenAPI extends StObject {
    
    /**
      * Current fullscreen element or, if fullscreen mode is not active, null.
      * @since 2.31.0
      */
    val element: HTMLElement = js.native
    
    /**
      * Request that the browser exit fullscreen mode.
      * @since 2.31.0
      */
    def exit(): js.Promise[Unit] = js.native
    
    /**
      * Returns whether fullscreen is both supported and enabled.
      * @since 2.31.0
      */
    def isEnabled(): Boolean = js.native
    
    /**
      * Returns whether fullscreen mode is currently active.
      * @since 2.31.0
      */
    def isFullscreen(): Boolean = js.native
    
    /**
      * Removes fullscreen change event handlers.
      * @param handlerFn The function to remove. If omitted, will remove all handler functions.
      * @param requestedEl The element to remove the handler(s) from.
      * @since 2.31.0
      */
    def offChange(handlerFn: js.Function1[/* ev */ Event, Unit]): Unit = js.native
    def offChange(handlerFn: js.Function1[/* ev */ Event, Unit], requestedEl: HTMLElement): Unit = js.native
    
    /**
      * Removes fullscreen error event handlers.
      * @param handlerFn The function to remove. If omitted, will remove all handler functions.
      * @param requestedEl The element to remove the handler(s) from.
      * @since 2.31.0
      */
    def offError(handlerFn: js.Function1[/* ev */ Event, Unit]): Unit = js.native
    def offError(handlerFn: js.Function1[/* ev */ Event, Unit], requestedEl: HTMLElement): Unit = js.native
    
    /**
      * Attaches fullscreen change event handlers.
      * @param handlerFn The function to invoke when fullscreen mode is changed.
      * @param requestedEl The element to attach the handler to.
      * @since 2.31.0
      */
    def onChange(handlerFn: js.Function1[/* ev */ Event, Unit]): Unit = js.native
    def onChange(handlerFn: js.Function1[/* ev */ Event, Unit], requestedEl: HTMLElement): Unit = js.native
    
    /**
      * Attaches fullscreen error event handlers.
      * @param handlerFn The function to invoke when fullscreen mode encounters an error.
      * @param requestedEl The element to attach the handler to.
      * @since 2.31.0
      */
    def onError(handlerFn: js.Function1[/* ev */ Event, Unit]): Unit = js.native
    def onError(handlerFn: js.Function1[/* ev */ Event, Unit], requestedEl: HTMLElement): Unit = js.native
    
    /**
      * Request that the browser enter fullscreen mode.
      * @param options The fullscreen options object.
      * @param requestedEl The element to enter fullscreen mode with. If omitted, defaults to the entire page.
      * @since 2.31.0
      */
    def request(): js.Promise[Unit] = js.native
    def request(options: Unit, requestedEl: HTMLElement): js.Promise[Unit] = js.native
    def request(options: FullscreenRequestOptions): js.Promise[Unit] = js.native
    def request(options: FullscreenRequestOptions, requestedEl: HTMLElement): js.Promise[Unit] = js.native
    
    /**
      * Request that the browser toggle fullscreen mode—i.e., enter or exit as appropriate.
      * @param options The fullscreen options object. See Fullscreen.request() for more information.
      * @param requestedEl The element to toggle fullscreen mode with. If omitted, defaults to the entire page.
      * @since 2.31.0
      */
    def toggle(): js.Promise[Unit] = js.native
    def toggle(options: Unit, requestedEl: HTMLElement): js.Promise[Unit] = js.native
    def toggle(options: FullscreenRequestOptions): js.Promise[Unit] = js.native
    def toggle(options: FullscreenRequestOptions, requestedEl: HTMLElement): js.Promise[Unit] = js.native
  }
  
  trait FullscreenRequestOptions extends StObject {
    
    /**
      * Determines the fullscreen navigation UI preference. Valid values are (default: "auto"):
      * * "auto": Indicates no preference.
      * * "hide": Request that the browser's navigation UI be hidden. The full dimensions of the screen will be used to
      *    display the element.
      * * "show": Request that the browser's navigation UI be shown. The screen dimensions allocated to the element will
      *    be clamped to leave room for the UI.
      */
    var navigationUI: auto | hide | show
  }
  object FullscreenRequestOptions {
    
    inline def apply(navigationUI: auto | hide | show): FullscreenRequestOptions = {
      val __obj = js.Dynamic.literal(navigationUI = navigationUI.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullscreenRequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FullscreenRequestOptions] (val x: Self) extends AnyVal {
      
      inline def setNavigationUI(value: auto | hide | show): Self = StObject.set(x, "navigationUI", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoadScreenAPI extends StObject {
    
    /**
      * Acquires a loading screen lock and returns its ID. Displays the loading screen, if necessary.
      * @since 2.15.0
      */
    def lock(): Double
    
    /**
      * Releases the loading screen lock with the given ID. Hides the loading screen, if no other locks exist.
      * @param lockId The loading screen lock ID.
      * @since 2.15.0
      * @example
      * var lockId = LoadScreen.lock();
      * // Do something whose timing is unpredictable that should be hidden by the loading screen
      * LoadScreen.unlock(lockId);
      */
    def unlock(lockId: Double): Unit
  }
  object LoadScreenAPI {
    
    inline def apply(lock: () => Double, unlock: Double => Unit): LoadScreenAPI = {
      val __obj = js.Dynamic.literal(lock = js.Any.fromFunction0(lock), unlock = js.Any.fromFunction1(unlock))
      __obj.asInstanceOf[LoadScreenAPI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadScreenAPI] (val x: Self) extends AnyVal {
      
      inline def setLock(value: () => Double): Self = StObject.set(x, "lock", js.Any.fromFunction0(value))
      
      inline def setUnlock(value: Double => Unit): Self = StObject.set(x, "unlock", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait UIAPI extends StObject {
    
    /**
      * Opens the built-in alert dialog, displaying the given message to the player.
      * @param message The message to display to the player.
      * @param options The options object. @see Dialog.addClickHandler() for more information.
      * @param closeFn The function to execute whenever the dialog is closed.
      * @since 2.0.0
      */
    def alert(message: String): Unit = js.native
    def alert(message: String, options: Unit, closeFn: js.Function0[Unit]): Unit = js.native
    def alert(message: String, options: DialogOptions): Unit = js.native
    def alert(message: String, options: DialogOptions, closeFn: js.Function0[Unit]): Unit = js.native
    
    /**
      * Opens the built-in jump to dialog, which is populated via the bookmark tag.
      * @param options The options object. @see Dialog.addClickHandler() for more information.
      * @param closeFn The function to execute whenever the dialog is closed.
      * @since 2.0.0
      */
    def jumpto(): Unit = js.native
    def jumpto(options: Unit, closeFn: js.Function0[Unit]): Unit = js.native
    def jumpto(options: DialogOptions): Unit = js.native
    def jumpto(options: DialogOptions, closeFn: js.Function0[Unit]): Unit = js.native
    
    /**
      * Opens the built-in restart dialog, prompting the player to restart the story.
      * @param options The options object. @see Dialog.addClickHandler() for more information.
      * @since 2.0.0
      */
    def restart(): Unit = js.native
    def restart(options: DialogOptions): Unit = js.native
    
    /**
      * Opens the built-in saves dialog.
      * @param options The options object. See Dialog.addClickHandler() for more information.
      * @param closeFn The function to execute whenever the dialog is closed.
      * @since 2.0.0
      */
    def saves(): Unit = js.native
    def saves(options: Unit, closeFn: js.Function0[Unit]): Unit = js.native
    def saves(options: DialogOptions): Unit = js.native
    def saves(options: DialogOptions, closeFn: js.Function0[Unit]): Unit = js.native
    
    /**
      * Opens the built-in settings dialog, which is populated from the Setting API.
      * @param options The options object. See Dialog.addClickHandler() for more information.
      * @param closeFn The function to execute whenever the dialog is closed.
      * @since 2.0.0
      *
      */
    def settings(): Unit = js.native
    def settings(options: Unit, closeFn: js.Function0[Unit]): Unit = js.native
    def settings(options: DialogOptions): Unit = js.native
    def settings(options: DialogOptions, closeFn: js.Function0[Unit]): Unit = js.native
    
    /**
      * Opens the built-in share dialog, which is populated from the StoryShare passage.
      * @param options The options object. See Dialog.addClickHandler() for more information.
      * @param closeFn The function to execute whenever the dialog is closed.
      * @since 2.0.0
      */
    def share(): Unit = js.native
    def share(options: Unit, closeFn: js.Function0[Unit]): Unit = js.native
    def share(options: DialogOptions): Unit = js.native
    def share(options: DialogOptions, closeFn: js.Function0[Unit]): Unit = js.native
  }
  
  @js.native
  trait UIBarAPI extends StObject {
    
    /**
      * Completely removes the UI bar and all of its associated styles and event handlers.
      * @since 2.17.0
      */
    def destroy(): Unit = js.native
    
    /**
      * Hides the UI bar. Returns a reference to the UIBar object for chaining.
      *
      * NOTE: This does not reclaim the space reserved for the UI bar. Thus, a call to UIBar.stow() may also be necessary.
      * Alternatively, if you simply want the UI bar gone completely and permanently, either using UIBar.destroy() or the
      * StoryInterface special passage may be a better choice.
      * @since 2.29.0
      */
    def hide(): this.type = js.native
    
    /**
      * Returns whether the UI bar is currently hidden.
      * @since 2.29.0
      */
    def isHidden(): Boolean = js.native
    
    /**
      * Returns whether the UI bar is currently stowed.
      * @since 2.29.0
      */
    def isStowed(): Boolean = js.native
    
    /**
      * Shows the UI bar. Returns a reference to the UIBar object for chaining.
      * @since 2.29.0
      */
    def show(): this.type = js.native
    
    /**
      * Stows the UI bar, so that it takes up less space.
      * @param noAnimation Whether to skip the default animation.
      * @since 2.17.0
      * @since 2.29.0: Added returned UIBar chaining reference.
      */
    def stow(): this.type = js.native
    def stow(noAnimation: Boolean): this.type = js.native
    
    /**
      * Unstows UI bar, so that it is fully accessible again.
      * @param noAnimation Whether to skip the default animation.
      * @since 2.17.0
      * @since 2.29.0: Added returned UIBar chaining reference.
      */
    def unstow(): this.type = js.native
    def unstow(noAnimation: Boolean): this.type = js.native
    
    /**
      * Updates all sections of the UI bar that are populated by special passages — e.g., StoryBanner,
      * StoryCaption, StoryMenu, etc.
      * WARNING: As all special passage populated sections are updated it is recommended that
      * UIBar.update() be used sparingly. Ideally, if you need to update UI bar content outside of
      * the normal passage navigation update, then you should update only the specific areas you
      * need to rather than the entire UI bar.
      *
      * @since 2.29.0 Introduced
      */
    def update(): Unit = js.native
  }
}
