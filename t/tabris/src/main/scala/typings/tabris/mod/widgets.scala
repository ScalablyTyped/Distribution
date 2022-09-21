package typings.tabris.mod

import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import typings.tabris.Blob
import typings.tabris.anon.Animate
import typings.tabris.anon.Children
import typings.tabris.anon.InstantiableU
import typings.tabris.anon.ModeTrigger
import typings.tabris.anon.OmitActionset
import typings.tabris.anon.OmitActivityIndicatorset
import typings.tabris.anon.OmitButtonset
import typings.tabris.anon.OmitCameraViewset
import typings.tabris.anon.OmitCanvasset
import typings.tabris.anon.OmitCheckBoxset
import typings.tabris.anon.OmitCompositeWidgetanyset
import typings.tabris.anon.OmitImageViewset
import typings.tabris.anon.OmitNavigationViewPageAct
import typings.tabris.anon.OmitOmitVideospeedpositioAbsoluteBounds
import typings.tabris.anon.OmitOmitWebViewcanGoBackcAbsoluteBounds
import typings.tabris.anon.OmitPageset
import typings.tabris.anon.OmitPdfViewset
import typings.tabris.anon.OmitPickerset
import typings.tabris.anon.OmitProgressBarset
import typings.tabris.anon.OmitRadioButtonset
import typings.tabris.anon.OmitRefreshCompositeset
import typings.tabris.anon.OmitRowset
import typings.tabris.anon.OmitScrollViewset
import typings.tabris.anon.OmitSearchActionset
import typings.tabris.anon.OmitSliderset
import typings.tabris.anon.OmitStackset
import typings.tabris.anon.OmitSwitchset
import typings.tabris.anon.OmitTabFolderTabset
import typings.tabris.anon.OmitTabset
import typings.tabris.anon.OmitTextInputset
import typings.tabris.anon.OmitTextViewset
import typings.tabris.anon.OmitToggleButtonset
import typings.tabris.anon.OmitVideospeedpositiondur
import typings.tabris.anon.OmitWebViewcanGoBackcanGo
import typings.tabris.anon.PartialPickPickeritemText
import typings.tabris.anon.PartialPickthiscellHeightCellHeight
import typings.tabris.anon.`1`
import typings.tabris.anon.`4`
import typings.tabris.anon.`7`
import typings.tabris.tabrisBooleans.`false`
import typings.tabris.tabrisBooleans.`true`
import typings.tabris.tabrisStrings.Asterisk
import typings.tabris.tabrisStrings.actionColor
import typings.tabris.tabrisStrings.actionTextColor
import typings.tabris.tabrisStrings.alignment
import typings.tabris.tabrisStrings.all
import typings.tabris.tabrisStrings.ascii
import typings.tabris.tabrisStrings.auto
import typings.tabris.tabrisStrings.autoCapitalize
import typings.tabris.tabrisStrings.autoCorrect
import typings.tabris.tabrisStrings.autoDispose
import typings.tabris.tabrisStrings.autoPlay
import typings.tabris.tabrisStrings.badge
import typings.tabris.tabrisStrings.badgeColor
import typings.tabris.tabrisStrings.baseline
import typings.tabris.tabrisStrings.borderColor
import typings.tabris.tabrisStrings.bottom
import typings.tabris.tabrisStrings.camera
import typings.tabris.tabrisStrings.cellHeight
import typings.tabris.tabrisStrings.cellType
import typings.tabris.tabrisStrings.centerX
import typings.tabris.tabrisStrings.centerY
import typings.tabris.tabrisStrings.checked
import typings.tabris.tabrisStrings.checkedTintColor
import typings.tabris.tabrisStrings.columnCount
import typings.tabris.tabrisStrings.controlsVisible
import typings.tabris.tabrisStrings.createCell
import typings.tabris.tabrisStrings.cursorColor
import typings.tabris.tabrisStrings.decimal
import typings.tabris.tabrisStrings.default
import typings.tabris.tabrisStrings.done
import typings.tabris.tabrisStrings.drag
import typings.tabris.tabrisStrings.drawerActionVisible
import typings.tabris.tabrisStrings.editable
import typings.tabris.tabrisStrings.elevate
import typings.tabris.tabrisStrings.email
import typings.tabris.tabrisStrings.empty
import typings.tabris.tabrisStrings.enterKeyType
import typings.tabris.tabrisStrings.error
import typings.tabris.tabrisStrings.fail
import typings.tabris.tabrisStrings.fastScroll
import typings.tabris.tabrisStrings.fill
import typings.tabris.tabrisStrings.finish
import typings.tabris.tabrisStrings.fit
import typings.tabris.tabrisStrings.fixed
import typings.tabris.tabrisStrings.flat
import typings.tabris.tabrisStrings.floatMessage
import typings.tabris.tabrisStrings.focused
import typings.tabris.tabrisStrings.font
import typings.tabris.tabrisStrings.go
import typings.tabris.tabrisStrings.hidden
import typings.tabris.tabrisStrings.horizontal
import typings.tabris.tabrisStrings.html
import typings.tabris.tabrisStrings.image
import typings.tabris.tabrisStrings.imageSlashjpeg
import typings.tabris.tabrisStrings.imageSlashpng
import typings.tabris.tabrisStrings.imageSlashwebp
import typings.tabris.tabrisStrings.imageTintColor
import typings.tabris.tabrisStrings.itemCount
import typings.tabris.tabrisStrings.itemText
import typings.tabris.tabrisStrings.keepFocus
import typings.tabris.tabrisStrings.keyboard
import typings.tabris.tabrisStrings.keyboardAppearanceMode
import typings.tabris.tabrisStrings.left
import typings.tabris.tabrisStrings.lineSpacing
import typings.tabris.tabrisStrings.markupEnabled
import typings.tabris.tabrisStrings.maxChars
import typings.tabris.tabrisStrings.maxLines
import typings.tabris.tabrisStrings.maxZoomLevel
import typings.tabris.tabrisStrings.maximum
import typings.tabris.tabrisStrings.message
import typings.tabris.tabrisStrings.messageColor
import typings.tabris.tabrisStrings.minZoomLevel
import typings.tabris.tabrisStrings.minimum
import typings.tabris.tabrisStrings.multiline
import typings.tabris.tabrisStrings.navigation
import typings.tabris.tabrisStrings.never
import typings.tabris.tabrisStrings.next
import typings.tabris.tabrisStrings.none
import typings.tabris.tabrisStrings.normal
import typings.tabris.tabrisStrings.number
import typings.tabris.tabrisStrings.numbersAndPunctuation
import typings.tabris.tabrisStrings.onfocus
import typings.tabris.tabrisStrings.ontouch
import typings.tabris.tabrisStrings.open
import typings.tabris.tabrisStrings.outline
import typings.tabris.tabrisStrings.overflow
import typings.tabris.tabrisStrings.pageAnimation
import typings.tabris.tabrisStrings.pageBackground
import typings.tabris.tabrisStrings.pageElevation
import typings.tabris.tabrisStrings.paging
import typings.tabris.tabrisStrings.password
import typings.tabris.tabrisStrings.pause
import typings.tabris.tabrisStrings.paused
import typings.tabris.tabrisStrings.phone
import typings.tabris.tabrisStrings.placement
import typings.tabris.tabrisStrings.play
import typings.tabris.tabrisStrings.proposals
import typings.tabris.tabrisStrings.ready
import typings.tabris.tabrisStrings.refreshEnabled
import typings.tabris.tabrisStrings.refreshIndicator
import typings.tabris.tabrisStrings.refreshMessage
import typings.tabris.tabrisStrings.rest
import typings.tabris.tabrisStrings.revealPassword
import typings.tabris.tabrisStrings.right
import typings.tabris.tabrisStrings.scaleMode
import typings.tabris.tabrisStrings.scroll
import typings.tabris.tabrisStrings.scrollable
import typings.tabris.tabrisStrings.scrollbarVisible
import typings.tabris.tabrisStrings.search
import typings.tabris.tabrisStrings.selectable
import typings.tabris.tabrisStrings.selectedImage
import typings.tabris.tabrisStrings.selectedTabIndicatorTintColor
import typings.tabris.tabrisStrings.selectedTabTintColor
import typings.tabris.tabrisStrings.selection
import typings.tabris.tabrisStrings.selectionIndex
import typings.tabris.tabrisStrings.send
import typings.tabris.tabrisStrings.sentence
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.spacing
import typings.tabris.tabrisStrings.src
import typings.tabris.tabrisStrings.stale
import typings.tabris.tabrisStrings.state
import typings.tabris.tabrisStrings.stretch
import typings.tabris.tabrisStrings.stretchX
import typings.tabris.tabrisStrings.stretchY
import typings.tabris.tabrisStrings.strict
import typings.tabris.tabrisStrings.strokeColor
import typings.tabris.tabrisStrings.strokeWidth
import typings.tabris.tabrisStrings.tabBarBackground
import typings.tabris.tabrisStrings.tabBarElevation
import typings.tabris.tabrisStrings.tabTintColor
import typings.tabris.tabrisStrings.text
import typings.tabris.tabrisStrings.textColor
import typings.tabris.tabrisStrings.thumbOffColor
import typings.tabris.tabrisStrings.thumbOnColor
import typings.tabris.tabrisStrings.tintColor
import typings.tabris.tabrisStrings.title
import typings.tabris.tabrisStrings.titleTextColor
import typings.tabris.tabrisStrings.toolbarColor
import typings.tabris.tabrisStrings.toolbarHeight
import typings.tabris.tabrisStrings.toolbarVisible
import typings.tabris.tabrisStrings.top
import typings.tabris.tabrisStrings.trackOffColor
import typings.tabris.tabrisStrings.trackOnColor
import typings.tabris.tabrisStrings.underline
import typings.tabris.tabrisStrings.update
import typings.tabris.tabrisStrings.updateCell
import typings.tabris.tabrisStrings.url
import typings.tabris.tabrisStrings.vertical
import typings.tabris.tabrisStrings.word
import typings.tabris.tabrisStrings.zoomEnabled
import typings.tabris.tabrisStrings.zoomLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgets {
  
  @JSImport("tabris", "widgets.Action")
  @js.native
  /**
    * An executable item that is integrated in the application's navigation menu. Add a *select* listener
    * to react to action taps.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Action () extends Widget[Any] {
    def this(properties: Properties[typings.tabris.mod.widgets.Action, OmitActionset]) = this()
    
    /**
      * Appends this widget to the given `NavigationView` instance.
      * @param parent
      */
    def appendTo(parent: typings.tabris.mod.NavigationView[typings.tabris.mod.Page, typings.tabris.mod.Action]): this.type = js.native
    
    /**
      * Icon image for the action.
      * On iOS the `image` is tinted with the apps default accent color whereas on Android the `image` is
      * shown as is. When an action is placed into a `NavigationView`, the `NavigationView` property
      * `actionColor` can be used to adjust the action tint color.
      */
    var image: ImageValue = js.native
    
    /**
      * Inserts this widget directly after the given Action.
      * @param widget
      */
    def insertAfter(widget: typings.tabris.mod.widgets.Action): this.type = js.native
    
    /**
      * Inserts this widget directly before the given Action.
      * @param widget
      */
    def insertBefore(widget: typings.tabris.mod.widgets.Action): this.type = js.native
    
    /**
      * @constant
      */
    @JSName("jsxAttributes")
    val jsxAttributes_Action: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & Children = js.native
    
    /**
      * Fired when the [*image*](#image) property has changed.
      */
    var onImageChanged: ChangeListeners[this.type, image] = js.native
    
    /**
      * Fired when the [*placement*](#placement) property has changed.
      */
    var onPlacementChanged: ChangeListeners[this.type, placement] = js.native
    
    /**
      * Fired when the action is invoked.
      */
    var onSelect: Listeners[EventObject[this.type]] = js.native
    
    /**
      * Fired when the [*title*](#title) property has changed.
      */
    var onTitleChanged: ChangeListeners[this.type, title] = js.native
    
    /**
      * Actions with 'default' placement will be visible in the toolbar if enough space is available,
      * otherwise moved to the overflow section. Setting the property to 'overflow' makes the action appear
      * there exclusively. Lastly, 'navigation' puts the action in the position normally occupied by the
      * drawer/back button. When 'navigation' is used, only the `Action` image will be shown. If multiple
      * actions have this value only the first one is displayed.
      */
    var placement: default | navigation | overflow = js.native
    
    /**
      * The text to be displayed for the action.
      * When an action is placed into a `NavigationView`, the `NavigationView` property `actionTextColor` can
      * be used to adjust the action title color on Android.
      */
    var title: String = js.native
  }
  
  @JSImport("tabris", "widgets.ActivityIndicator")
  @js.native
  /**
    * A widget representing a spinning indicator for indeterminate loading / processing time.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class ActivityIndicator () extends Widget[Any] {
    def this(properties: Properties[typings.tabris.mod.widgets.ActivityIndicator, OmitActivityIndicatorset]) = this()
    
    /**
      * @constant
      */
    @JSName("jsxAttributes")
    val jsxAttributes_ActivityIndicator: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & Children = js.native
    
    /**
      * Fired when the [*tintColor*](#tintColor) property has changed.
      */
    var onTintColorChanged: ChangeListeners[this.type, tintColor] = js.native
    
    /**
      * The color of the indicator.
      */
    var tintColor: ColorValue = js.native
  }
  
  @JSImport("tabris", "widgets.Button")
  @js.native
  /**
    * A push button. Can contain a text or an image.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Button () extends Widget[Any] {
    def this(properties: Properties[typings.tabris.mod.widgets.Button, OmitButtonset]) = this()
    
    /**
      * The horizontal alignment of the button text.
      */
    var alignment: centerX | left | right = js.native
    
    /**
      * Control how the button text is capitalized.
      * * `'default'` - The platform decides on the capitalization
      * * `'none'` - The text is displayed unaltered
      * * `'all'` - Every letter is capitalized
      */
    var autoCapitalize: default | none | all = js.native
    
    /**
      * The font used for the button text.
      */
    var font: FontValue = js.native
    
    /**
      * An image to be displayed on the button.
      */
    var image: ImageValue = js.native
    
    /**
      * A color to change the `image` appearance. All opaque parts of the image will be tinted with the given
      * color. Set to `initial` to remove the effect.
      */
    var imageTintColor: ColorValue = js.native
    
    /**
      * @constant
      */
    @JSName("jsxAttributes")
    val jsxAttributes_Button: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & `1` = js.native
    
    /**
      * Fired when the [*alignment*](#alignment) property has changed.
      */
    var onAlignmentChanged: ChangeListeners[this.type, alignment] = js.native
    
    /**
      * Fired when the [*autoCapitalize*](#autoCapitalize) property has changed.
      */
    var onAutoCapitalizeChanged: ChangeListeners[this.type, autoCapitalize] = js.native
    
    /**
      * Fired when the [*font*](#font) property has changed.
      */
    var onFontChanged: ChangeListeners[this.type, font] = js.native
    
    /**
      * Fired when the [*image*](#image) property has changed.
      */
    var onImageChanged: ChangeListeners[this.type, image] = js.native
    
    /**
      * Fired when the [*imageTintColor*](#imageTintColor) property has changed.
      */
    var onImageTintColorChanged: ChangeListeners[this.type, imageTintColor] = js.native
    
    /**
      * Fired when the button is pressed.
      */
    var onSelect: Listeners[EventObject[this.type]] = js.native
    
    /**
      * Fired when the [*strokeColor*](#strokeColor) property has changed.
      */
    var onStrokeColorChanged: ChangeListeners[this.type, strokeColor] = js.native
    
    /**
      * Fired when the [*strokeWidth*](#strokeWidth) property has changed.
      */
    var onStrokeWidthChanged: ChangeListeners[this.type, strokeWidth] = js.native
    
    /**
      * Fired when the [*text*](#text) property has changed.
      */
    var onTextChanged: ChangeListeners[this.type, text] = js.native
    
    /**
      * Fired when the [*textColor*](#textColor) property has changed.
      */
    var onTextColorChanged: ChangeListeners[this.type, textColor] = js.native
    
    /**
      * Controls the line width of a button with the `style` _outline_.
      */
    var strokeColor: ColorValue = js.native
    
    /**
      * Controls the line color of a button with the `style` _outline_. Uses a platform-specific default if
      * set to `null`.
      */
    var strokeWidth: Double | Null = js.native
    
    /**
      * The `style` controls the appearance of a `Button` and has to be provided in its constructor. The
      * `default` style creates a platform specific button, which is flat on iOS and has an elevation and
      * shadow on Android. In addition the following specific style values can be used:
      * - `elevate` A button with a platform specific background color, elevation and a surrounding drop
      * shadow. Only supported on Android
      * - `flat` A button with no elevation and a platform specific background color
      * - `outline` A button with a transparent background and an outline stroke which can be controlled via
      * the properties `strokeWidth` and `strokeColor`
      * - `text` A button with no background and only consisting of its text label.
      * @constant
      */
    var style: default | elevate | flat | outline | text = js.native
    
    /**
      * The button's label text.
      */
    var text: String = js.native
    
    /**
      * The color of the text.
      */
    var textColor: ColorValue = js.native
  }
  
  @JSImport("tabris", "widgets.CameraView")
  @js.native
  /**
    * A widget to preview a `Camera` feed.
    * In order to show a camera preview image the app has to hold the `'camera'` permission.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class CameraView () extends Widget[Any] {
    def this(properties: Properties[typings.tabris.mod.widgets.CameraView, OmitCameraViewset]) = this()
    
    /**
      * The source video feed to display. In order to show a preview the `Camera` has to be in an active
      * state. When the `Camera` is inactive or no `Camera` is assigned the `CameraView` shows a blank
      * screen. 
      * It is recommended to deactivate the `Camera` when not in use in order to preserve battery life.
      */
    var camera: Camera = js.native
    
    /**
      * @constant
      */
    @JSName("jsxAttributes")
    val jsxAttributes_CameraView: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & Children = js.native
    
    /**
      * Fired when the [*camera*](#camera) property has changed.
      */
    var onCameraChanged: ChangeListeners[this.type, camera] = js.native
    
    /**
      * Fired when the [*scaleMode*](#scaleMode) property has changed.
      */
    var onScaleModeChanged: ChangeListeners[this.type, scaleMode] = js.native
    
    /**
      * How to scale the camera preview image.
      * - `fit` will scale the image proportionally to fit into the view, possible leaving some empty space
      * at the edges. That is, the image will be displayed as large as possible while being fully contained
      * in the view.
      * - `fill` will scale the image proportionally to fill the entire view, possibly cutting off parts of
      * the image. That is, the image will be displayed as small as possible while covering the entire view.
      */
    var scaleMode: fit | fill = js.native
  }
  
  @JSImport("tabris", "widgets.Canvas")
  @js.native
  /**
    * Canvas is a widget that can be used to draw graphics using a [canvas context](./CanvasContext.md).
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Canvas ()
    extends typings.tabris.mod.widgets.Composite[Widget[Any]] {
    def this(properties: Properties[typings.tabris.mod.widgets.Canvas, OmitCanvasset]) = this()
    
    /**
      * Returns the drawing context with the given size.
      * @param contextType The context identifier. Only `"2d"` is supported.
      * @param width the width of the canvas context to create
      * @param height the height of the canvas context to create
      */
    def getContext(contextType: String, width: Double, height: Double): CanvasContext = js.native
    
    /**
      * Creates a Blob object representing the image contained in the canvas. This is a non-blocking
      * operation.
      * @param callback Callback that will be called with the resulting blob.
      * @param mimeType The expected image format. If `mimeType` is not specified or invalid, the image type is `image/png`. **On iOS the type `image/webp` is not supported. A png will be returned instead.**
      * @param quality A Number between 0 and 1 specifying the image quality. A lower number results in a smaller file size at the same resolution. If `quality` is not specified or invalid the value `0.92` is for `image/jpeg` and  `0.80` for `image/webp` respectively. The value has no effect for `image/png`.
      */
    def toBlob(callback: js.Function1[/* blob */ Blob, Unit]): Unit = js.native
    def toBlob(
      callback: js.Function1[/* blob */ Blob, Unit],
      mimeType: imageSlashpng | imageSlashjpeg | imageSlashwebp
    ): Unit = js.native
    def toBlob(
      callback: js.Function1[/* blob */ Blob, Unit],
      mimeType: imageSlashpng | imageSlashjpeg | imageSlashwebp,
      quality: Double
    ): Unit = js.native
    def toBlob(callback: js.Function1[/* blob */ Blob, Unit], mimeType: Unit, quality: Double): Unit = js.native
  }
  
  @JSImport("tabris", "widgets.CheckBox")
  @js.native
  /**
    * A check box widget.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class CheckBox () extends Widget[Any] {
    def this(properties: Properties[typings.tabris.mod.widgets.CheckBox, OmitCheckBoxset]) = this()
    
    /**
      * The checked state of the check box.
      */
    var checked: Boolean = js.native
    
    /**
      * The color of the selectable area in checked state. Will fall back to `tintColor` if not set.
      */
    var checkedTintColor: ColorValue = js.native
    
    /**
      * The font used for the text.
      */
    var font: FontValue = js.native
    
    /**
      * @constant
      */
    @JSName("jsxAttributes")
    val jsxAttributes_CheckBox: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & Children = js.native
    
    /**
      * Fired when the [*checked*](#checked) property has changed.
      */
    var onCheckedChanged: ChangeListeners[this.type, checked] = js.native
    
    /**
      * Fired when the [*checkedTintColor*](#checkedTintColor) property has changed.
      */
    var onCheckedTintColorChanged: ChangeListeners[this.type, checkedTintColor] = js.native
    
    /**
      * Fired when the [*font*](#font) property has changed.
      */
    var onFontChanged: ChangeListeners[this.type, font] = js.native
    
    /**
      * Fired when the check box is checked or unchecked by the user.
      */
    var onSelect: Listeners[CheckBoxSelectEvent[this.type]] = js.native
    
    /**
      * Fired when the [*text*](#text) property has changed.
      */
    var onTextChanged: ChangeListeners[this.type, text] = js.native
    
    /**
      * Fired when the [*textColor*](#textColor) property has changed.
      */
    var onTextColorChanged: ChangeListeners[this.type, textColor] = js.native
    
    /**
      * Fired when the [*tintColor*](#tintColor) property has changed.
      */
    var onTintColorChanged: ChangeListeners[this.type, tintColor] = js.native
    
    /**
      * The label text of the check box.
      */
    var text: String = js.native
    
    /**
      * The color of the text.
      */
    var textColor: ColorValue = js.native
    
    /**
      * The color of the selectable area.
      */
    var tintColor: ColorValue = js.native
  }
  
  @JSImport("tabris", "widgets.CollectionView")
  @js.native
  /**
    * A scrollable list that displays data items in cells, one per row. Cells are created on demand by the
    * *createCell* callback and reused on scrolling.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class CollectionView[CellWidgetType /* <: Widget[Any] */] ()
    extends typings.tabris.mod.widgets.Composite[CellWidgetType] {
    def this(properties: (Properties[
            Omit[
              typings.tabris.mod.widgets.CollectionView[CellWidgetType], 
              typings.tabris.tabrisStrings.firstVisibleIndex | typings.tabris.tabrisStrings.lastVisibleIndex
            ], 
            Omit[
              Omit[
                typings.tabris.mod.widgets.CollectionView[CellWidgetType], 
                typings.tabris.tabrisStrings.firstVisibleIndex | typings.tabris.tabrisStrings.lastVisibleIndex
              ], 
              set
            ]
          ]) & (Partial[
            Pick[
              typings.tabris.mod.widgets.CollectionView[CellWidgetType], 
              cellHeight | cellType | createCell | updateCell
            ]
          ])) = this()
    
    /**
      * Returns the cell currently associated with the given item index. Returns `null` if the item is not
      * currently displayed.
      * @param itemIndex The index of the item as given in `updateCell`.
      */
    def cellByItemIndex(itemIndex: Double): CellWidgetType | Null = js.native
    
    /**
      * The height of a collection cell. If set to `'auto'`, the cell height will be calculated individually
      * for each cell. If set to a function, this function will be called for every item, providing the item
      * index and the cell type as parameters, and must return the cell height for the given item.
      * Note: On iOS `"auto"` may cause significant performance downgrade as it requires additional layouting
      * passes to calculate cell height internally. If possible please use a combination of fixed
      * `itemHeight` and `cellType` properties to specify different height for different cells.
      */
    var cellHeight: Double | auto | (js.Function2[/* index */ Double, /* cellType */ String, Double | auto]) = js.native
    
    /**
      * The name of the cell type to use for the item at the given index. This name will be passed to the
      * `createCell` and `cellHeight` callbacks. Cells will be reused only for those items that map to the
      * same cell type. If set to a function, this function will be called for every item, providing the item
      * index as a parameter, and must return a unique name for the cell type to use for the given item.
      */
    var cellType: String | (js.Function1[/* index */ Double, String]) | Null = js.native
    
    /**
      * The number of columns to display in the collection view. If set to a value `n > 1`, each row will
      * contain `n` items. The available space will be equally distributed between columns.
      */
    var columnCount: Double = js.native
    
    /**
      * A callback used to create a new reusable cell widget for a given type. This callback will be called
      * by the framework and the created cell will be reused for different items. The created widget should
      * be populated in the `updateCell` function.
      */
    def createCell(cellType: String): CellWidgetType = js.native
    
    /**
      * Enables the fast scroll thumb that can be dragged to quickly scroll through the list of items. The
      * feature is enabled by default in iOS devices starting from version 13 and cannot be disabled anymore.
      */
    var fastScroll: Boolean = js.native
    
    /**
      * The index of the first item that is currently visible on screen.
      */
    val firstVisibleIndex: Double = js.native
    
    /**
      * Inserts one or more items at the given index. When no *count* is specified, a single item will be
      * added at the given *index*. New cells may be created if needed. The `updateCell` callback will only
      * be called for those new items that become immediately visible. Note that inserting new items changes
      * the index of all subsequent items. This operation will update the `itemCount` property.
      * @param index
      * @param count The position to insert the items at. A negative index is interpreted as relative to the end. If the given index is greater than the item count, new items will be appended at the end.
      */
    def insert(index: Double): Unit = js.native
    def insert(index: Double, count: Double): Unit = js.native
    
    /**
      * The number of items to display. To add or remove items later, use the methods `insert()` and
      * `remove()` instead of setting the `itemCount`. To display a new list of items, use the `load()`
      * method.
      */
    var itemCount: Double = js.native
    
    /**
      * Determines the item index currently associated with the given cell.
      * @param widget A widget instance created by `createCell`, or a child of that widget.
      */
    def itemIndex(widget: Widget[Any]): Double = js.native
    
    /**
      * @constant
      */
    @JSName("jsxAttributes")
    val jsxAttributes_CollectionView: (JSXCompositeAttributes[this.type, Any]) & js.Object & PartialPickthiscellHeightCellHeight = js.native
    
    /**
      * The index of the last item that is currently visible on screen.
      */
    val lastVisibleIndex: Double = js.native
    
    /**
      * Loads a new model with the given *itemCount*. This operation will update the `itemCount` property.
      * @param itemCount The number of items in the model to load.
      */
    def load(itemCount: Double): Unit = js.native
    
    /**
      * Fired when the [*cellHeight*](#cellHeight) property has changed.
      */
    var onCellHeightChanged: ChangeListeners[this.type, cellHeight] = js.native
    
    /**
      * Fired when the [*cellType*](#cellType) property has changed.
      */
    var onCellTypeChanged: ChangeListeners[this.type, cellType] = js.native
    
    /**
      * Fired when the [*columnCount*](#columnCount) property has changed.
      */
    var onColumnCountChanged: ChangeListeners[this.type, columnCount] = js.native
    
    /**
      * Fired when the [*createCell*](#createCell) property has changed.
      */
    var onCreateCellChanged: ChangeListeners[this.type, createCell] = js.native
    
    /**
      * Fired when the [*fastScroll*](#fastScroll) property has changed.
      */
    var onFastScrollChanged: ChangeListeners[this.type, fastScroll] = js.native
    
    /**
      * Fired when the [*firstVisibleIndex*](#firstVisibleIndex) property has changed.
      */
    var onFirstVisibleIndexChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.firstVisibleIndex] = js.native
    
    /**
      * Fired when the [*itemCount*](#itemCount) property has changed.
      */
    var onItemCountChanged: ChangeListeners[this.type, itemCount] = js.native
    
    /**
      * Fired when the [*lastVisibleIndex*](#lastVisibleIndex) property has changed.
      */
    var onLastVisibleIndexChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.lastVisibleIndex] = js.native
    
    /**
      * Fired when the user requested a refresh. An event listener should reset the *refreshIndicator*
      * property when refresh is finished.
      */
    var onRefresh: Listeners[EventObject[this.type]] = js.native
    
    /**
      * Fired when the [*refreshEnabled*](#refreshEnabled) property has changed.
      */
    var onRefreshEnabledChanged: ChangeListeners[this.type, refreshEnabled] = js.native
    
    /**
      * Fired when the [*refreshIndicator*](#refreshIndicator) property has changed.
      */
    var onRefreshIndicatorChanged: ChangeListeners[this.type, refreshIndicator] = js.native
    
    /**
      * Fired when the [*refreshMessage*](#refreshMessage) property has changed.
      */
    var onRefreshMessageChanged: ChangeListeners[this.type, refreshMessage] = js.native
    
    /**
      * Fired while the collection view is scrolling.
      */
    var onScroll: Listeners[CollectionViewScrollEvent[this.type]] = js.native
    
    /**
      * Fired when the [*scrollbarVisible*](#scrollbarVisible) property has changed.
      */
    var onScrollbarVisibleChanged: ChangeListeners[this.type, scrollbarVisible] = js.native
    
    /**
      * Fired when the [*updateCell*](#updateCell) property has changed.
      */
    var onUpdateCellChanged: ChangeListeners[this.type, updateCell] = js.native
    
    /**
      * Triggers an update of the item at the given *index* by calling the `updateCell` callback of the
      * corresponding. If no *index* is given, all visible items will be updated.
      * @param index The index of the item that was changed.
      */
    def refresh(): Unit = js.native
    def refresh(index: Double): Unit = js.native
    
    /**
      * Enables the user to trigger a refresh by using the pull-to-refresh gesture.
      */
    var refreshEnabled: Boolean = js.native
    
    /**
      * Whether the refresh indicator is currently visible. Will be set to `true` when a *refresh* event is
      * triggered. Reset it to `false` when the refresh is finished.
      */
    var refreshIndicator: Boolean = js.native
    
    /**
      * The message text displayed together with the refresh indicator.
      */
    var refreshMessage: String = js.native
    
    /**
      * Removes one or more items beginning with the given index. When no *count* is given, only the item at
      * *index* will be removed. Note that this changes the index of all subsequent items, however. This
      * operation will update the `itemCount` property.
      * @param index The index of the first item to remove. A negative value is interpreted as relative to the end.
      * @param count The number of items to remove.
      */
    def remove(index: Double): Unit = js.native
    def remove(index: Double, count: Double): Unit = js.native
    
    /**
      * Scrolls the item with the given index into view.
      * @param index The index of the item to reveal. If this is negative, it is interpreted as relative to the end
      * @param options An additional object to control the animation.
      - `animate` allows to scroll to an item in an animated fashion. The `animate` property defaults to `true` when no options object is given.
      - `offset` shifts the targeted scroll position by a device independent pixel value. When `offset` is used the targeted reveal scroll position will start from the top of the `CollectionView`. Applying `offset` will perform the `reveal()` operation without an animation, ignoring the `animate` property.
      */
    def reveal(index: Double): Unit = js.native
    def reveal(index: Double, options: Animate): Unit = js.native
    
    /**
      * Allows to show or hide the scroll bar. When the scroll bar is hidden, it will be briefly visible
      * while scrolling.
      */
    var scrollbarVisible: Boolean = js.native
    
    /**
      * A callback used to update a given cell widget to display the item with the given index. This callback
      * will be called by the framework.
      */
    def updateCell(cell: CellWidgetType, index: Double): Unit = js.native
  }
  
  @JSImport("tabris", "widgets.Composite")
  @js.native
  /**
    * An empty widget that can contain other widgets.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Composite[ChildType /* <: Widget[Any] */] () extends Widget[Any] {
    def this(properties: Properties[
            typings.tabris.mod.widgets.Composite[Widget[Any]], 
            OmitCompositeWidgetanyset[ChildType]
          ]) = this()
    
    /* private */ @JSName("$children")
    var $children: js.Array[Widget[Any]] = js.native
    
    /* private */ @JSName("$flushChildren")
    def $flushChildren(): Unit = js.native
    
    /**
      * Called by the framework with each widget that is about to be added as a child of this composite. May
      * be overwritten to reject some or all children by returning `false`.
      * @param child
      */
    /* protected */ def _acceptChild(child: Widget[Any]): Boolean = js.native
    
    /**
      * Called by the framework with a child to be assigned to this composite. Triggers the 'addChild' event.
      * May be overwritten to run any code prior or after the child is inserted.
      * @param child
      * @param index
      */
    /* protected */ def _addChild(child: Widget[Any]): Unit = js.native
    /* protected */ def _addChild(child: Widget[Any], index: Double): Unit = js.native
    
    /**
      * Identical to the `apply(mode, rules)` method, but intended to be used by subclasses in case the
      * `children` method was overwritten . See "[Encapsulation](../selector.md#encapsulation)"
      * @param mode If this is set to `'strict'` the function checks that all selector match at least one widget, and that id selector match exactly one widget.
      * @param rules The ruleset to apply. May also be given as a callback which is passed to the widget instance and must return the actual ruleset.
      */
    /* protected */ def _apply(mode: default | strict, rules: RuleSet[this.type]): this.type = js.native
    /**
      * Identical to the `apply(rules)` method, but intended to be used by subclasses in case the `children`
      * method was overwritten . See "[Encapsulation](../selector.md#encapsulation)"
      * @param rules The ruleset to apply. May also be given as a callback which is passed to the widget instance and must return the actual ruleset.
      */
    /* protected */ def _apply(rules: RuleSet[this.type]): this.type = js.native
    /* protected */ def _apply(trigger: js.Symbol): this.type = js.native
    /**
      * Applies the ruleset from the last call with `trigger` set to `'update' or '*'`.
      * @param trigger
      */
    /* protected */ def _apply(trigger: ListenersKeysOf[this.type]): this.type = js.native
    /**
      * Identical to the `apply(options, rules)` method, but intended to be used by subclasses in case the
      * `children` method was overwritten . See "[Encapsulation](../selector.md#encapsulation)"
      * @param options If mode is set to `'strict'` the function checks that all selector match at least one widget, and that id selector match exactly one widget. <br/>A `trigger` is string to be associated with the given rulset. If set to `'update'`, the ruleset will be applied once immediately and then again every time `apply('update')` is called. If set to any event-attribute name, such as `'onTap'`, it will automatically re-apply the ruleset when this event is triggered.
      * @param rules The ruleset to apply. May also be given as a callback which is passed to the widget instance and must return the actual ruleset.
      */
    /* protected */ def _apply[Target](options: ModeTrigger[Target], rules: RuleSet[this.type]): this.type = js.native
    /* protected */ @JSName("_apply")
    def _apply_update(trigger: update | Asterisk): this.type = js.native
    
    /**
      * Called by the framework with the layout about to be assigned to this composite. May be overwritten to
      * reject a layout by throwing an Error.
      * @param value
      */
    /* protected */ def _checkLayout(value: Layout): Unit = js.native
    
    /**
      * Identical to the `children` method, but intended to be used by subclasses in case the `children`
      * method was overwritten. See "[Encapsulation](../selector.md#encapsulation)".
      * @param selector A selector expression or a predicate function to filter the results.
      */
    /* protected */ def _children[Result /* <: ChildType */](): WidgetCollection[Result] = js.native
    /* protected */ def _children[Result /* <: ChildType */](selector: Selector[ChildType, Result]): WidgetCollection[Result] = js.native
    
    /**
      * Identical to the `find` method, but intended to be used only by subclasses (custom components) that
      * encapsulate their children. This is the case if the `children` method was overwritten or the
      * `@component` decorator is used on the subclass.
      * @param selector A selector expression or a predicate function to filter the results.
      */
    /* protected */ def _find[Result /* <: Widget[Any] */](): WidgetCollection[Result] = js.native
    /* protected */ def _find[Result /* <: Widget[Any] */](selector: Selector[Widget[Any], Result]): WidgetCollection[Result] = js.native
    
    /**
      * Called with the constructor paramter (if any) to initialize the composite's layout manager. May be
      * overwritten to customize/replace the layout. The new implementation must make a super call to
      * initialize the layout.
      * @param props
      */
    /* protected */ def _initLayout(): Unit = js.native
    /* protected */ def _initLayout(props: typings.tabris.anon.Layout): Unit = js.native
    
    /* private */ var _layout: Layout = js.native
    
    /**
      * Called by the framework with a child to be removed from this composite. Triggers the 'removeChild'
      * event. May be overwritten to run any code prior or after the child is removed.
      * @param child
      */
    /* protected */ def _removeChild(child: Widget[Any]): Unit = js.native
    
    /* private */ def _scheduleRenderChildren(): Unit = js.native
    
    /**
      * Adds the given widgets to the composite.
      * @param widgets
      */
    def append(widgets: ChildType*): this.type = js.native
    /**
      * Adds all widgets in the given array to the composite.
      * @param widgets
      */
    def append(widgets: js.Array[ChildType]): this.type = js.native
    /**
      * Adds all widgets in the given collection to the composite.
      * @param widgets
      */
    def append(widgets: WidgetCollection[ChildType]): this.type = js.native
    
    /**
      * Shorthand for `apply({mode: mode}, rules})`
      * @param mode If this is set to `'strict'` the function checks that all selector match at least one widget, and that id selector match exactly one widget.
      * @param rules The ruleset to apply. May also be given as a callback which is passed to the widget instance and must return the actual ruleset.
      */
    @JSName("apply")
    def apply(mode: default | strict, rules: RuleSet[this.type]): this.type = js.native
    /**
      * Shorthand for `apply({mode: 'default'}, rules)`
      * @param rules The ruleset to apply. May also be given as a callback which is passed to the widget instance and must return the actual ruleset.
      */
    @JSName("apply")
    def apply(rules: RuleSet[this.type]): this.type = js.native
    @JSName("apply")
    def apply(trigger: js.Symbol): this.type = js.native
    /**
      * Applies the ruleset from the last call with `trigger` set to `'update' or '*'`.
      * @param trigger
      */
    @JSName("apply")
    def apply(trigger: ListenersKeysOf[this.type]): this.type = js.native
    /**
      * See also the article ["Selector API"](../selector.md#compositeapply).<br/><br/>Applies the given
      * attributes to all descendants that match the associated selector(s). Each attributes object may
      * contain properties to be set and listeners to be registered. An entry will be treated as a listener
      * if it follows the naming scheme "onEventType". IMPORTANT: Listeners previously registered (for the
      * same type) via the `apply` method, a [JSX](../declarative-ui.md) element attribute or a [widget
      * factory](./utils.md#asfactoryconstructor) call will be de-registered. This means you can call apply
      * repeatedly and have a deterministic outcome. Listeners registered programmatically (e.g.
      * `widget.onTap(...)` are not affected by this.) <br/><br/>For better type safety enable [strict
      * mode](#applymode-rules) and use [`Setter`](./Setter.md) to create properties objects.
      * If you wish to always exclude specific "internal" children from this, overwrite the `children` method
      * on their parent. See "[Encapsulation](../selector.md#encapsulation)".<br/><br/>When using
      * [declarative UI](../declarative-ui.md) syntax "apply" is a special attribute that calls this
      * function.
      * @param options If mode is set to `'strict'` the function checks that all selector match at least one widget, and that id selector match exactly one widget. <br/>A `trigger` is string to be associated with the given rulset. If set to `'update'`, the ruleset will be applied once immediately and then again every time `apply('update')` is called. If set to any event-attribute name, such as `'onTap'`, it will automatically re-apply the ruleset when this event is triggered. If set to `'*'` if the widget mutates as described [here](./Observable.md#mutationssource).
      * @param rules The ruleset to apply. May also be given as a callback which is passed to the widget instance and must return the actual ruleset. This parameter can also be `null` if the `trigger` option is set. This will stop re-applying the ruleset previously associated with that trigger.
      */
    @JSName("apply")
    def apply[Target](options: ModeTrigger[Target], rules: RuleSet[this.type]): this.type = js.native
    @JSName("apply")
    def apply_update(trigger: update | Asterisk): this.type = js.native
    
    /**
      * Returns a (possibly empty) collection of all children of this widget that match the given selector.
      * When writing custom UI components it may be useful to overwrite this method to prevent access to the
      * internal children by external code. Doing so also affects `find` and `apply`, on this widget as well
      * as on all parents, thereby preventing accidental clashes of widget id or class values. See
      * "[Encapsulation](../selector.md#encapsulation)".
      * @param selector A selector expression or a predicate function to filter the results.
      */
    def children[Result /* <: ChildType */](): WidgetCollection[Result] = js.native
    def children[Result /* <: ChildType */](selector: Selector[ChildType, Result]): WidgetCollection[Result] = js.native
    
    /**
      * Returns a collection containing all descendants of all widgets in this collection that match the
      * given selector.
      * If you wish to always exclude specific "internal" children from the result, overwrite the
      * [`children`](#childrenselector) method ([details](#childrenselector)) to return an empty
      * `WidgetCollection`, or use the [`@component`](../databinding/@component.md) decorator. **These
      * children will then only be visible via the protected `_find` method.** See
      * "[Encapsulation](../selector.md#encapsulation)"
      * @param selector A selector expression or a predicate function to filter the results.
      */
    def find[Result /* <: Widget[Any] */](): WidgetCollection[Result] = js.native
    def find[Result /* <: Widget[Any] */](selector: Selector[Widget[Any], Result]): WidgetCollection[Result] = js.native
    
    /**
      * @constant
      */
    @JSName("jsxAttributes")
    val jsxAttributes_Composite: JSXCompositeAttributes[this.type, ChildType] = js.native
    
    /**
      * The layout manager responsible for interpreting the [`layoutData`](./Widget.md#layoutdata) of the
      * child widgets of this Composite.
      * @constant
      */
    var layout: Layout | Null = js.native
    
    /**
      * Fired when a child is added to this widget.
      */
    var onAddChild: Listeners[CompositeAddChildEvent[this.type]] = js.native
    
    /**
      * Fired when a child is removed from this widget.
      */
    var onRemoveChild: Listeners[CompositeRemoveChildEvent[this.type]] = js.native
  }
  
  @JSImport("tabris", "widgets.ImageView")
  @js.native
  /**
    * A widget to display an image.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class ImageView () extends Widget[Any] {
    def this(properties: Properties[typings.tabris.mod.widgets.ImageView, OmitImageViewset]) = this()
    
    /**
      * The image to display. Providing the `width` and `height` attributes on the image will resize it
      * internally. When no dimensions are given the image will be loaded with its original size. Since the
      * full size image might occupy a lot of memory, it's recommended to provide exact dimensions.
      */
    var image: ImageValue = js.native
    
    /**
      * @constant
      */
    @JSName("jsxAttributes")
    val jsxAttributes_ImageView: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & Children = js.native
    
    /**
      * The highest amount the image can be zoomed in to. Setting the `maxZoomLevel` to a level smaller than
      * the current `zoomLevel` changes the `zoomLevel` to be the same as the new `maxZoomLevel`.
      */
    var maxZoomLevel: Double = js.native
    
    /**
      * The lowest amount the image can be zoomed out to. Setting the `minZoomLevel` to a level larger than
      * the current `zoomLevel` changes the `zoomLevel` to be the same as the new `minZoomLevel`. 
      */
    var minZoomLevel: Double = js.native
    
    /**
      * Fired when the [*image*](#image) property has changed.
      */
    var onImageChanged: ChangeListeners[this.type, image] = js.native
    
    /**
      * Fired when the image loading has finished.
      */
    var onLoad: Listeners[ImageViewLoadEvent[this.type]] = js.native
    
    /**
      * Fired when the [*maxZoomLevel*](#maxZoomLevel) property has changed.
      */
    var onMaxZoomLevelChanged: ChangeListeners[this.type, maxZoomLevel] = js.native
    
    /**
      * Fired when the [*minZoomLevel*](#minZoomLevel) property has changed.
      */
    var onMinZoomLevelChanged: ChangeListeners[this.type, minZoomLevel] = js.native
    
    /**
      * Fired when the [*scaleMode*](#scaleMode) property has changed.
      */
    var onScaleModeChanged: ChangeListeners[this.type, scaleMode] = js.native
    
    /**
      * Fired when the [*tintColor*](#tintColor) property has changed.
      */
    var onTintColorChanged: ChangeListeners[this.type, tintColor] = js.native
    
    /**
      * Fired when the user zooms the image in or out. The `zoom` event indicates a change to the `zoomLevel`
      * property.
      */
    var onZoom: Listeners[ImageViewZoomEvent[this.type]] = js.native
    
    /**
      * Fired when the [*zoomEnabled*](#zoomEnabled) property has changed.
      */
    var onZoomEnabledChanged: ChangeListeners[this.type, zoomEnabled] = js.native
    
    /**
      * Fired when the [*zoomLevel*](#zoomLevel) property has changed.
      */
    var onZoomLevelChanged: ChangeListeners[this.type, zoomLevel] = js.native
    
    /**
      * How to scale the image.
      * - `fit` will scale the image proportionally to fit into the view, possible leaving some empty space
      * at the edges. That is, the image will be displayed as large as possible while being fully contained
      * in the view.
      * - `fill` will scale the image proportionally to fill the entire view, possibly cutting off parts of
      * the image. That is, the image will be displayed as small as possible while covering the entire view.
      * - `auto` will scale *down* the image to *fit* into the view if it is too large, but it won't scale up
      * a smaller image.
      * - `stretch` will resize the image to the actual bounds of the image view.
      * - `none` will not resize the image at all. The image will be displayed in its original size.
      */
    var scaleMode: auto | fill | fit | none | stretch = js.native
    
    /**
      * A color to change the image appearance. All opaque parts of the image will be tinted with the given
      * color. Set to `initial` to remove the effect.
      */
    var tintColor: ColorValue = js.native
    
    /**
      * Enables the pinch-to-zoom gesture on the `ImageView` and makes the properties `zoomLevel`,
      * `minZoomLevel` and `maxZoomLevel` available. Setting `zoomEnabled` to `false` also resets the
      * `zoomLevel`, `minZoomLevel`, `maxZoomLevel` to their respective defaults.
      */
    var zoomEnabled: Boolean = js.native
    
    /**
      * The amount that the image is zoomed in or out. The default position without any zooming has the value
      * 1.0.
      */
    var zoomLevel: Double = js.native
  }
  
  @JSImport("tabris", "widgets.NavigationView")
  @js.native
  /**
    * A widget that displays a stack of [pages](Page) with a toolbar that allows to navigate back. The
    * toolbar also displays the current page's title and the highest priority [actions](Action) that are
    * added to the NavigationView. Only children of type `Page`, `Action` and `SearchAction` are supported.
    * Since the NavigationView does not compute its own size, the width and height must be defined by the
    * respective layout properties (e.g. either `width` or `left` and `right` must be specified).
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class NavigationView[PageType /* <: typings.tabris.mod.Page */, ActionType /* <: typings.tabris.mod.Action */] ()
    extends typings.tabris.mod.widgets.Composite[PageType | ActionType] {
    def this(properties: Properties[
            typings.tabris.mod.widgets.NavigationView[typings.tabris.mod.Page, typings.tabris.mod.Action], 
            OmitNavigationViewPageAct[PageType, ActionType]
          ]) = this()
    
    /**
      * The color used for action icons.
      */
    var actionColor: ColorValue = js.native
    
    /**
      * The color used for action texts. Only applied on Android, IOS uses the `actionColor` to colorize the
      * action text.
      */
    var actionTextColor: ColorValue = js.native
    
    /**
      * Whether to display the so-called "Burger menu" to open the drawer.
      */
    var drawerActionVisible: Boolean = js.native
    
    /**
      * Fired when the [*actionColor*](#actionColor) property has changed.
      */
    var onActionColorChanged: ChangeListeners[this.type, actionColor] = js.native
    
    /**
      * Fired when the [*actionTextColor*](#actionTextColor) property has changed.
      */
    var onActionTextColorChanged: ChangeListeners[this.type, actionTextColor] = js.native
    
    /**
      * Fired when the [*drawerActionVisible*](#drawerActionVisible) property has changed.
      */
    var onDrawerActionVisibleChanged: ChangeListeners[this.type, drawerActionVisible] = js.native
    
    /**
      * Fired when the [*pageAnimation*](#pageAnimation) property has changed.
      */
    var onPageAnimationChanged: ChangeListeners[this.type, pageAnimation] = js.native
    
    /**
      * Fired when the [*titleTextColor*](#titleTextColor) property has changed.
      */
    var onTitleTextColorChanged: ChangeListeners[this.type, titleTextColor] = js.native
    
    /**
      * Fired when the [*toolbarColor*](#toolbarColor) property has changed.
      */
    var onToolbarColorChanged: ChangeListeners[this.type, toolbarColor] = js.native
    
    /**
      * Fired when the height of the toolbar changes, e.g. if it changes visibility.
      */
    var onToolbarHeightChanged: ChangeListeners[this.type, toolbarHeight] = js.native
    
    /**
      * Fired when the [*toolbarVisible*](#toolbarVisible) property has changed.
      */
    var onToolbarVisibleChanged: ChangeListeners[this.type, toolbarVisible] = js.native
    
    /**
      * Controls what animation to use when animating a page transition.
      */
    var pageAnimation: default | none = js.native
    
    /**
      * Returns the ordered list of pages on the page stack, with the bottommost page as the first and the
      * topmost page as the last element. Same as children(), but only returns children that are of type
      * `Page`.
      * @param selector A selector expression or a predicate function to filter the results.
      */
    def pages(): WidgetCollection[PageType] = js.native
    def pages(selector: Selector[Widget[Any], Widget[Any]]): WidgetCollection[PageType] = js.native
    /**
      * Returns the ordered list of pages on the page stack, with the bottommost page as the first and the
      * topmost page as the last element. Same as children(), but only accepts subclasses of `Page`.
      * @param constructor A class to filter the results.
      */
    def pages[U /* <: typings.tabris.mod.Page */](constructor: InstantiableU[U]): WidgetCollection[U] = js.native
    
    /**
      * The text color used for page titles.
      */
    var titleTextColor: ColorValue = js.native
    
    /**
      * The background color of the toolbar.
      */
    var toolbarColor: ColorValue = js.native
    
    /**
      * The height of the toolbar. Is 0 if not visible.
      */
    var toolbarHeight: Double = js.native
    
    /**
      * Whether the toolbar is visible.
      */
    var toolbarVisible: Boolean = js.native
  }
  
  @JSImport("tabris", "widgets.ObservableData")
  @js.native
  open class ObservableData () extends StObject {
    def this(properties: Record[String, Any]) = this()
  }
  
  @JSImport("tabris", "widgets.Page")
  @js.native
  /**
    * A container representing a single page of a NavigationView widget.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Page ()
    extends typings.tabris.mod.widgets.Composite[Widget[Any]] {
    def this(properties: Properties[typings.tabris.mod.widgets.Page, OmitPageset]) = this()
    
    /**
      * Appends this widget to the given `NavigationView` instance.
      * @param parent
      */
    def appendTo(parent: typings.tabris.mod.NavigationView[typings.tabris.mod.Page, typings.tabris.mod.Action]): this.type = js.native
    
    /**
      * Defines whether this page will be automatically disposed when popped from the NavigationView, e.g.
      * using native back navigation.
      */
    var autoDispose: Boolean = js.native
    
    /**
      * An image to be displayed in the navigation bar
      */
    var image: ImageValue = js.native
    
    /**
      * Inserts this widget directly after the given `Action`.
      * @param widget
      */
    def insertAfter(widget: typings.tabris.mod.widgets.Page): this.type = js.native
    
    /**
      * Inserts this widget directly before the given `Page`.
      * @param widget
      */
    def insertBefore(widget: typings.tabris.mod.widgets.Page): this.type = js.native
    
    /**
      * Fired when the page is about to become visible, i.e. it has become the active page.
      */
    var onAppear: Listeners[EventObject[this.type]] = js.native
    
    /**
      * Fired when the [*autoDispose*](#autoDispose) property has changed.
      */
    var onAutoDisposeChanged: ChangeListeners[this.type, autoDispose] = js.native
    
    /**
      * Fired when the page is no longer visible, i.e. another page has become the active page.
      */
    var onDisappear: Listeners[EventObject[this.type]] = js.native
    
    /**
      * Fired when the [*image*](#image) property has changed.
      */
    var onImageChanged: ChangeListeners[this.type, image] = js.native
    
    /**
      * Fired when the [*title*](#title) property has changed.
      */
    var onTitleChanged: ChangeListeners[this.type, title] = js.native
    
    /**
      * The page title to be displayed in the navigation bar.
      */
    var title: String = js.native
  }
  
  @JSImport("tabris", "widgets.PdfView")
  @js.native
  /**
    * A widget to display PDF documents.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class PdfView () extends Widget[Any] {
    def this(properties: Properties[typings.tabris.mod.widgets.PdfView, OmitPdfViewset]) = this()
    
    /**
      * @constant
      */
    @JSName("jsxAttributes")
    val jsxAttributes_PdfView: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & `4` = js.native
    
    /**
      * Fired when the document loading has finished.
      */
    var onLoad: Listeners[PdfViewLoadEvent[this.type]] = js.native
    
    /**
      * Fired when the [*pageBackground*](#pageBackground) property has changed.
      */
    var onPageBackgroundChanged: ChangeListeners[this.type, pageBackground] = js.native
    
    /**
      * Fired when the [*pageElevation*](#pageElevation) property has changed.
      */
    var onPageElevationChanged: ChangeListeners[this.type, pageElevation] = js.native
    
    /**
      * Fired when the [*spacing*](#spacing) property has changed.
      */
    var onSpacingChanged: ChangeListeners[this.type, spacing] = js.native
    
    /**
      * Fired when the [*src*](#src) property has changed.
      */
    var onSrcChanged: ChangeListeners[this.type, src] = js.native
    
    /**
      * Fired when the [*zoomEnabled*](#zoomEnabled) property has changed.
      */
    var onZoomEnabledChanged: ChangeListeners[this.type, zoomEnabled] = js.native
    
    /**
      * Determines the color visible in the transparent areas of a page.
      */
    var pageBackground: ColorValue = js.native
    
    /**
      * Setting this property determines the intensity of the shadow page on the widget background. On iOS
      * the shadow is either visible or not (property set to `0`), but always looks the same.
      */
    var pageElevation: Double = js.native
    
    /**
      * The vertical spacing between the individual pages. The default is specific to the device and can not
      * be changed on iOS.
      */
    var spacing: Dimension = js.native
    
    /**
      * The source of the document. Can be a path on the local file system or a `Blob`/`File` object.
      */
    var src: String | Blob | Null = js.native
    
    /**
      * Enables the pinch-to-zoom gesture. On iOS this will scale the entire document, while on Android each
      * page is scaled individually.
      */
    var zoomEnabled: Boolean = js.native
  }
  
  @JSImport("tabris", "widgets.Picker")
  @js.native
  /**
    * A widget with a drop-down list of items to choose from.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Picker () extends Widget[Any] {
    def this(properties: (Properties[typings.tabris.mod.widgets.Picker, OmitPickerset]) & PartialPickPickeritemText) = this()
    
    /**
      * The color of the Picker border. This can be the surrounding line or the underline of the Picker
      * depending on the `style` property.
      */
    var borderColor: ColorValue = js.native
    
    /**
      * Whether the hint message should float above the Picker when focus is gained.
      */
    var floatMessage: Boolean = js.native
    
    /**
      * The font used for the text inside the Picker.
      */
    var font: FontValue = js.native
    
    /**
      * The number of items to display.
      */
    var itemCount: Double = js.native
    
    /**
      * A function that returns the string to display for a given index.
      */
    def itemText(index: Double): String = js.native
    
    /**
      * @constant
      */
    @JSName("jsxAttributes")
    val jsxAttributes_Picker: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & PartialPickPickeritemText & Children = js.native
    
    /**
      * A hint text that is displayed when the picker has no selection.
      */
    var message: String = js.native
    
    /**
      * Fired when the [*borderColor*](#borderColor) property has changed.
      */
    var onBorderColorChanged: ChangeListeners[this.type, borderColor] = js.native
    
    /**
      * Fired when the [*floatMessage*](#floatMessage) property has changed.
      */
    var onFloatMessageChanged: ChangeListeners[this.type, floatMessage] = js.native
    
    /**
      * Fired when the [*font*](#font) property has changed.
      */
    var onFontChanged: ChangeListeners[this.type, font] = js.native
    
    /**
      * Fired when the [*itemCount*](#itemCount) property has changed.
      */
    var onItemCountChanged: ChangeListeners[this.type, itemCount] = js.native
    
    /**
      * Fired when the [*itemText*](#itemText) property has changed.
      */
    var onItemTextChanged: ChangeListeners[this.type, itemText] = js.native
    
    /**
      * Fired when the [*message*](#message) property has changed.
      */
    var onMessageChanged: ChangeListeners[this.type, message] = js.native
    
    /**
      * Fired when an item was selected by the user.
      */
    var onSelect: Listeners[PickerSelectEvent[this.type]] = js.native
    
    /**
      * Fired when the [*selectionIndex*](#selectionIndex) property has changed.
      */
    var onSelectionIndexChanged: ChangeListeners[this.type, selectionIndex] = js.native
    
    /**
      * Fired when the [*textColor*](#textColor) property has changed.
      */
    var onTextColorChanged: ChangeListeners[this.type, textColor] = js.native
    
    /**
      * The index of the currently selected item.
      */
    var selectionIndex: Double = js.native
    
    /**
      * The visual appearance of the `Picker` widget.
      * With the `style` _outline_, _fill_ or _underline_ the message hint will float above the `Picker` on
      * Android. This behavior can be controlled with the property `floatMessage`. The `style` _none_ will
      * remove any background visualization, allowing to create a custom background. 
      * @constant
      */
    var style: default | fill | none | outline | underline = js.native
    
    /**
      * The color of the text.
      */
    var textColor: ColorValue = js.native
  }
  
  @JSImport("tabris", "widgets.ProgressBar")
  @js.native
  /**
    * A widget representing a numeric value as a horizontal bar with a growing indicator.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class ProgressBar () extends Widget[Any] {
    def this(properties: Properties[typings.tabris.mod.widgets.ProgressBar, OmitProgressBarset]) = this()
    
    /**
      * @constant
      */
    @JSName("jsxAttributes")
    val jsxAttributes_ProgressBar: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & Children = js.native
    
    /**
      * The value that represents a progress of 100%. May be negative.
      */
    var maximum: Double = js.native
    
    /**
      * The value that represents a progress of 0%. May be negative.
      */
    var minimum: Double = js.native
    
    /**
      * Fired when the [*maximum*](#maximum) property has changed.
      */
    var onMaximumChanged: ChangeListeners[this.type, maximum] = js.native
    
    /**
      * Fired when the [*minimum*](#minimum) property has changed.
      */
    var onMinimumChanged: ChangeListeners[this.type, minimum] = js.native
    
    /**
      * Fired when the [*selection*](#selection) property has changed.
      */
    var onSelectionChanged: ChangeListeners[this.type, selection] = js.native
    
    /**
      * Fired when the [*state*](#state) property has changed.
      */
    var onStateChanged: ChangeListeners[this.type, state] = js.native
    
    /**
      * Fired when the [*tintColor*](#tintColor) property has changed.
      */
    var onTintColorChanged: ChangeListeners[this.type, tintColor] = js.native
    
    /**
      * The actual progress to be displayed.
      */
    var selection: Double = js.native
    
    /**
      * This property affects the color of the progress indicator. Not supported on iOS.
      */
    var state: error | normal | paused = js.native
    
    /**
      * The color used to display the current progress.
      */
    var tintColor: ColorValue = js.native
  }
  
  @JSImport("tabris", "widgets.RadioButton")
  @js.native
  /**
    * A radio button. Selecting a radio button de-selects all its siblings (i.e. all radio buttons within
    * the same parent).
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class RadioButton () extends Widget[Any] {
    def this(properties: Properties[typings.tabris.mod.widgets.RadioButton, OmitRadioButtonset]) = this()
    
    /**
      * The checked state of the radio button.
      */
    var checked: Boolean = js.native
    
    /**
      * The color of the selectable area in checked state. Will fall back to `tintColor` if not set.
      */
    var checkedTintColor: ColorValue = js.native
    
    /**
      * The font used for the text.
      */
    var font: FontValue = js.native
    
    /**
      * @constant
      */
    @JSName("jsxAttributes")
    val jsxAttributes_RadioButton: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & Children = js.native
    
    /**
      * Fired when the [*checked*](#checked) property has changed.
      */
    var onCheckedChanged: ChangeListeners[this.type, checked] = js.native
    
    /**
      * Fired when the [*checkedTintColor*](#checkedTintColor) property has changed.
      */
    var onCheckedTintColorChanged: ChangeListeners[this.type, checkedTintColor] = js.native
    
    /**
      * Fired when the [*font*](#font) property has changed.
      */
    var onFontChanged: ChangeListeners[this.type, font] = js.native
    
    /**
      * Fired when the radio button is selected or deselected by the user.
      */
    var onSelect: Listeners[RadioButtonSelectEvent[this.type]] = js.native
    
    /**
      * Fired when the [*text*](#text) property has changed.
      */
    var onTextChanged: ChangeListeners[this.type, text] = js.native
    
    /**
      * Fired when the [*textColor*](#textColor) property has changed.
      */
    var onTextColorChanged: ChangeListeners[this.type, textColor] = js.native
    
    /**
      * Fired when the [*tintColor*](#tintColor) property has changed.
      */
    var onTintColorChanged: ChangeListeners[this.type, tintColor] = js.native
    
    /**
      * The label text of the radio button.
      */
    var text: String = js.native
    
    /**
      * The color of the text.
      */
    var textColor: ColorValue = js.native
    
    /**
      * The color of the selectable area.
      */
    var tintColor: ColorValue = js.native
  }
  
  @JSImport("tabris", "widgets.RefreshComposite")
  @js.native
  /**
    * A composite allowing to use a pull-to-refresh gesture to trigger and visualize a long running
    * operation.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class RefreshComposite ()
    extends typings.tabris.mod.widgets.Composite[Widget[Any]] {
    def this(properties: Properties[typings.tabris.mod.widgets.RefreshComposite, OmitRefreshCompositeset]) = this()
    
    /**
      * Fired when a refresh is triggered by the user.
      */
    var onRefresh: Listeners[EventObject[this.type]] = js.native
    
    /**
      * Fired when the [*refreshEnabled*](#refreshEnabled) property has changed.
      */
    var onRefreshEnabledChanged: ChangeListeners[this.type, refreshEnabled] = js.native
    
    /**
      * Fired when the [*refreshIndicator*](#refreshIndicator) property has changed.
      */
    var onRefreshIndicatorChanged: ChangeListeners[this.type, refreshIndicator] = js.native
    
    /**
      * Fired when the [*refreshMessage*](#refreshMessage) property has changed.
      */
    var onRefreshMessageChanged: ChangeListeners[this.type, refreshMessage] = js.native
    
    /**
      * Whether the pull-to-refresh gesture can be performed by the user. When disabled, the
      * `RefreshComposite` behaves like a regular `Composite`.
      */
    var refreshEnabled: Boolean = js.native
    
    /**
      * Whether to visualize a long running operation. After the user has triggered a manual refresh, this
      * property is `true` and should be set to `false` when the operation ended.
      */
    var refreshIndicator: Boolean = js.native
    
    /**
      * A message to show to the user during the refresh operation.
      */
    var refreshMessage: String = js.native
  }
  
  @JSImport("tabris", "widgets.Row")
  @js.native
  /**
    * A composite with the `layout` property initialized with a `RowLayout`. All children are automatically
    * arranged in one horizontal row, starting from the left.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Row ()
    extends typings.tabris.mod.widgets.Composite[Widget[Any]] {
    def this(properties: Properties[typings.tabris.mod.widgets.Row, OmitRowset]) = this()
    
    /**
      * Determines the vertical placement of the children.
      * For `stretchY` to work correctly the `Row` needs to be given a height either by setting `height` or
      * by setting `top` and `bottom`.
      * If `baseline` is set the first widget in the row will determine where that baseline is. By setting
      * `top`, `bottom` or `centerY` on that widget the baseline can be shifted.
      * @constant
      */
    var alignment: top | centerY | stretchY | bottom | baseline = js.native
    
    /**
      * The row layout manager responsible for interpreting the [`layoutData`](./Widget.md#layoutdata) of the
      * child widgets of this Composite.
      * @constant
      */
    @JSName("layout")
    var layout_Row: RowLayout = js.native
    
    /**
      * The space between the children in device independent pixel.
      * @constant
      */
    var spacing: Double = js.native
  }
  
  @JSImport("tabris", "widgets.ScrollView")
  @js.native
  /**
    * A composite that allows its content to overflow either vertically (default) or horizontally. Since
    * the ScrollView does not compute its own size, the width and height must be defined by the respective
    * layout properties (e.g. either `width` or `left` and `right` must be specified).
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class ScrollView ()
    extends typings.tabris.mod.widgets.Composite[Widget[Any]] {
    def this(properties: Properties[typings.tabris.mod.widgets.ScrollView, OmitScrollViewset]) = this()
    
    /**
      * Specifies the scrolling direction of the scroll composite.
      * @constant
      */
    var direction: horizontal | vertical = js.native
    
    /**
      * The horizontal scrolling position in dip.
      */
    val offsetX: Double = js.native
    
    /**
      * The vertical scrolling position in dip.
      */
    val offsetY: Double = js.native
    
    /**
      * Fired when the [*offsetX*](#offsetX) property has changed.
      */
    var onOffsetXChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.offsetX] = js.native
    
    /**
      * Fired when the [*offsetY*](#offsetY) property has changed.
      */
    var onOffsetYChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.offsetY] = js.native
    
    /**
      * Fired while scrolling horizontally.
      */
    var onScrollX: Listeners[ScrollViewScrollEvent[this.type]] = js.native
    
    /**
      * Fired when the [*scrollXState*](#scrollXState) property has changed.
      */
    var onScrollXStateChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.scrollXState] = js.native
    
    /**
      * Fired while scrolling vertically.
      */
    var onScrollY: Listeners[ScrollViewScrollEvent[this.type]] = js.native
    
    /**
      * Fired when the [*scrollYState*](#scrollYState) property has changed.
      */
    var onScrollYStateChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.scrollYState] = js.native
    
    /**
      * Fired when the [*scrollbarVisible*](#scrollbarVisible) property has changed.
      */
    var onScrollbarVisibleChanged: ChangeListeners[this.type, scrollbarVisible] = js.native
    
    /**
      * Scrolls to the given horizontal offset. Give `{animate: false}` as the second parameter to suppress
      * the animation.
      * @param offset The offset to scroll to in dip.
      * @param options An additional parameter object to control the animation.
      */
    def scrollToX(offset: Double): this.type = js.native
    def scrollToX(offset: Double, options: `7`): this.type = js.native
    
    /**
      * Scrolls to the given vertical offset. Give `{animate: false}` as the second parameter to suppress the
      * animation.
      * @param offset The offset to scroll to in dip.
      * @param options An parameter object to control the animation.
      */
    def scrollToY(offset: Double): this.type = js.native
    def scrollToY(offset: Double, options: `7`): this.type = js.native
    
    /**
      * The scroll state of the `ScrollView` in horizontal direction. The following states are supported:
      * * `rest` - no scrolling
      * * `drag` the user moves the `ScrollView` content with his finger
      * * `scroll` the user has flinged the content with his finger or the `ScrollView` is scrolling
      * programmatically
      */
    val scrollXState: drag | rest | scroll = js.native
    
    /**
      * The scroll state of the `ScrollView` in vertical direction. The following states are supported:
      * * `rest` - no scrolling
      * * `drag` the user moves the `ScrollView` content with his finger
      * * `scroll` the user has flinged the `ScrollView` content with his finger or the `ScrollView` is
      * scrolling programmatically
      */
    val scrollYState: drag | rest | scroll = js.native
    
    /**
      * Allows to show or hide scroll bar for current direction.
      */
    var scrollbarVisible: Boolean = js.native
  }
  
  @JSImport("tabris", "widgets.SearchAction")
  @js.native
  /**
    * An action that displays a search text field with dynamic proposals when selected. Add a listener on
    * *select* to implement the action. On *input*, you may set a list of *proposals*.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class SearchAction ()
    extends typings.tabris.mod.widgets.Action {
    def this(properties: Properties[typings.tabris.mod.widgets.SearchAction, OmitSearchActionset]) = this()
    
    /**
      * A hint text that is displayed when the search input is empty.
      */
    var message: String = js.native
    
    /**
      * Fired when a text input has been submitted by pressing the keyboard's search key.
      */
    var onAccept: Listeners[SearchActionAcceptEvent[this.type]] = js.native
    
    /**
      * Fired when the user inputs text.
      */
    var onInput: Listeners[SearchActionInputEvent[this.type]] = js.native
    
    /**
      * Fired when the [*message*](#message) property has changed.
      */
    var onMessageChanged: ChangeListeners[this.type, message] = js.native
    
    /**
      * Fired when the [*proposals*](#proposals) property has changed.
      */
    var onProposalsChanged: ChangeListeners[this.type, proposals] = js.native
    
    /**
      * Fired when the [*text*](#text) property has changed.
      */
    var onTextChanged: ChangeListeners[this.type, text] = js.native
    
    /**
      * Invokes the search action, i.e. displays the UI to perform a search.
      */
    def open(): Unit = js.native
    
    /**
      * The list of proposals to display.
      */
    var proposals: js.Array[String] = js.native
    
    /**
      * The text in the search input field.
      */
    var text: String = js.native
  }
  
  @JSImport("tabris", "widgets.Slider")
  @js.native
  /**
    * A widget representing a numeric value as an movable indicator on a horizontal line.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Slider () extends Widget[Any] {
    def this(properties: Properties[typings.tabris.mod.widgets.Slider, OmitSliderset]) = this()
    
    /**
      * @constant
      */
    @JSName("jsxAttributes")
    val jsxAttributes_Slider: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & Children = js.native
    
    /**
      * The maximum value.
      */
    var maximum: Double = js.native
    
    /**
      * The minimum value.
      */
    var minimum: Double = js.native
    
    /**
      * Fired when the [*maximum*](#maximum) property has changed.
      */
    var onMaximumChanged: ChangeListeners[this.type, maximum] = js.native
    
    /**
      * Fired when the [*minimum*](#minimum) property has changed.
      */
    var onMinimumChanged: ChangeListeners[this.type, minimum] = js.native
    
    /**
      * Fired when the selection property is changed by the user.
      */
    var onSelect: Listeners[SliderSelectEvent[this.type]] = js.native
    
    /**
      * Fired when the [*selection*](#selection) property has changed.
      */
    var onSelectionChanged: ChangeListeners[this.type, selection] = js.native
    
    /**
      * Fired when the [*tintColor*](#tintColor) property has changed.
      */
    var onTintColorChanged: ChangeListeners[this.type, tintColor] = js.native
    
    /**
      * The actual value.
      */
    var selection: Double = js.native
    
    /**
      * The color used to display the current selection.
      */
    var tintColor: ColorValue = js.native
  }
  
  @JSImport("tabris", "widgets.Stack")
  @js.native
  /**
    * A composite with the `layout` property initialized with a `StackLayout`. All children are
    * automatically arranged in one vertical stack, starting from the top. The `layoutData` on the children
    * is ignored.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Stack ()
    extends typings.tabris.mod.widgets.Composite[Widget[Any]] {
    def this(properties: Properties[typings.tabris.mod.widgets.Stack, OmitStackset]) = this()
    
    /**
      * Determines the horizontal placement of the children. For the `stretchX` value to work correctly the
      * `Stack` needs to be given a width either by setting `width` or by setting `left` and `right`.
      * @constant
      */
    var alignment: left | centerX | stretchX | right = js.native
    
    /**
      * The stack layout manager responsible for interpreting the [`layoutData`](./Widget.md#layoutdata) of
      * the child widgets of this Composite.
      * @constant
      */
    @JSName("layout")
    var layout_Stack: StackLayout = js.native
    
    /**
      * Additional space to add between the children in device independent pixel.
      * @constant
      */
    var spacing: Double = js.native
  }
  
  @JSImport("tabris", "widgets.Switch")
  @js.native
  /**
    * A switch widget that can be toggled.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Switch () extends Widget[Any] {
    def this(properties: Properties[typings.tabris.mod.widgets.Switch, OmitSwitchset]) = this()
    
    /**
      * The checked state of the switch.
      */
    var checked: Boolean = js.native
    
    /**
      * @constant
      */
    @JSName("jsxAttributes")
    val jsxAttributes_Switch: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & Children = js.native
    
    /**
      * Fired when the [*checked*](#checked) property has changed.
      */
    var onCheckedChanged: ChangeListeners[this.type, checked] = js.native
    
    /**
      * Fired when the switch is toggled by the user.
      */
    var onSelect: Listeners[SwitchSelectEvent[this.type]] = js.native
    
    /**
      * Fired when the [*thumbOffColor*](#thumbOffColor) property has changed.
      */
    var onThumbOffColorChanged: ChangeListeners[this.type, thumbOffColor] = js.native
    
    /**
      * Fired when the [*thumbOnColor*](#thumbOnColor) property has changed.
      */
    var onThumbOnColorChanged: ChangeListeners[this.type, thumbOnColor] = js.native
    
    /**
      * Fired when the [*trackOffColor*](#trackOffColor) property has changed.
      */
    var onTrackOffColorChanged: ChangeListeners[this.type, trackOffColor] = js.native
    
    /**
      * Fired when the [*trackOnColor*](#trackOnColor) property has changed.
      */
    var onTrackOnColorChanged: ChangeListeners[this.type, trackOnColor] = js.native
    
    /**
      * The color of the movable thumb, when switched *off*.
      */
    var thumbOffColor: ColorValue = js.native
    
    /**
      * The color of the movable thumb, when switched *on*.
      */
    var thumbOnColor: ColorValue = js.native
    
    /**
      * The color of the track that holds the thumb, when switched *off*.
      */
    var trackOffColor: ColorValue = js.native
    
    /**
      * The color of the track that holds the thumb, when switched *on*.
      */
    var trackOnColor: ColorValue = js.native
  }
  
  @JSImport("tabris", "widgets.Tab")
  @js.native
  /**
    * A container representing a single tab of a TabFolder widget.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Tab ()
    extends typings.tabris.mod.widgets.Composite[Widget[Any]] {
    def this(properties: Properties[typings.tabris.mod.widgets.Tab, OmitTabset]) = this()
    
    /**
      * Appends this widget to the given `TabFolder` instance.
      * @param parent
      */
    def appendTo(parent: typings.tabris.mod.TabFolder[typings.tabris.mod.Tab]): this.type = js.native
    
    /**
      * A badge to attach on the tab. Setting the `badge` to `0` hides the badge. The background color of the
      * badge can be controlled with the `badgeColor` property.
      * On iOS the property only has an effect when the parent `TabFolder` has its `tabBarLocation` set to
      * `bottom`.
      */
    var badge: Double = js.native
    
    /**
      * The background color used for the `badge` indicator.
      */
    var badgeColor: ColorValue = js.native
    
    /**
      * An image to be displayed on the tab.  Will not be shown on iOS if the `TabFolder`'s `tabBarLocation`
      * is set to `top`
      */
    var image: ImageValue = js.native
    
    /**
      * Inserts this widget directly after the given `Tab`.
      * @param widget
      */
    def insertAfter(widget: typings.tabris.mod.widgets.Tab): this.type = js.native
    
    /**
      * Inserts this widget directly before the given `Tab`.
      * @param widget
      */
    def insertBefore(widget: typings.tabris.mod.widgets.Tab): this.type = js.native
    
    /**
      * Fired when the tab will become visible, i.e. the selection of its TabFolder.
      */
    var onAppear: Listeners[EventObject[this.type]] = js.native
    
    /**
      * Fired when the [*badge*](#badge) property has changed.
      */
    var onBadgeChanged: ChangeListeners[this.type, badge] = js.native
    
    /**
      * Fired when the [*badgeColor*](#badgeColor) property has changed.
      */
    var onBadgeColorChanged: ChangeListeners[this.type, badgeColor] = js.native
    
    /**
      * Fired when the tab is no longer visible, i.e. it no longer is the selection of its TabFolder.
      */
    var onDisappear: Listeners[EventObject[this.type]] = js.native
    
    /**
      * Fired when the [*image*](#image) property has changed.
      */
    var onImageChanged: ChangeListeners[this.type, image] = js.native
    
    /**
      * Fired when the tab is tapped by the user while it is already visible.
      */
    var onReselect: Listeners[EventObject[this.type]] = js.native
    
    /**
      * Fired when the tab is tapped by the user. The event is fired either when the tab is first selected or
      * when it is already visible and tapped.
      */
    var onSelect: Listeners[EventObject[this.type]] = js.native
    
    /**
      * Fired when the [*selectedImage*](#selectedImage) property has changed.
      */
    var onSelectedImageChanged: ChangeListeners[this.type, selectedImage] = js.native
    
    /**
      * Fired when the [*title*](#title) property has changed.
      */
    var onTitleChanged: ChangeListeners[this.type, title] = js.native
    
    /**
      * An image to be displayed on the currently active tab.
      */
    var selectedImage: ImageValue = js.native
    
    /**
      * The title to be displayed on the tab.
      */
    var title: String = js.native
  }
  
  @JSImport("tabris", "widgets.TabFolder")
  @js.native
  /**
    * A widget that can switch between [tabs](Tab). Only children of type `Tab` are supported. Since the
    * TabFolder does not compute its own size, the width and height must be defined by the respective
    * layout properties (e.g. either `width` or `left` and `right` must be specified).
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class TabFolder[TabType /* <: typings.tabris.mod.Tab */] ()
    extends typings.tabris.mod.widgets.Composite[TabType] {
    def this(properties: Properties[
            typings.tabris.mod.widgets.TabFolder[typings.tabris.mod.Tab], 
            OmitTabFolderTabset[TabType]
          ]) = this()
    
    /**
      * Fired when the [*paging*](#paging) property has changed.
      */
    var onPagingChanged: ChangeListeners[this.type, paging] = js.native
    
    /**
      * Fired when `paging` is enabled and a tab is scrolled. The `event` parameter contains position
      * information relative to the currently selected `Tab`. Eg.: scrolling a 500px wide tab 10% to the left
      * sets `offset` to `50`. Scrolling 10% to the right sets `offset` to `-50`.
      */
    var onScroll: Listeners[TabFolderScrollEvent[this.type]] = js.native
    
    /**
      * Fired when the user taps on a tab. The event also fires when the same tab is tapped multiple times.
      */
    var onSelect: Listeners[TabFolderSelectEvent[this.type]] = js.native
    
    /**
      * Fired when the [*selectedTabIndicatorTintColor*](#selectedTabIndicatorTintColor) property has
      * changed.
      */
    var onSelectedTabIndicatorTintColorChanged: ChangeListeners[this.type, selectedTabIndicatorTintColor] = js.native
    
    /**
      * Fired when the [*selectedTabTintColor*](#selectedTabTintColor) property has changed.
      */
    var onSelectedTabTintColorChanged: ChangeListeners[this.type, selectedTabTintColor] = js.native
    
    /**
      * Fired when the [*selection*](#selection) property has changed.
      */
    var onSelectionChanged: ChangeListeners[this.type, selection] = js.native
    
    /**
      * Fired when the [*selectionIndex*](#selectionIndex) property has changed.
      */
    var onSelectionIndexChanged: ChangeListeners[this.type, selectionIndex] = js.native
    
    /**
      * Fired when the [*tabBarBackground*](#tabBarBackground) property has changed.
      */
    var onTabBarBackgroundChanged: ChangeListeners[this.type, tabBarBackground] = js.native
    
    /**
      * Fired when the [*tabBarElevation*](#tabBarElevation) property has changed.
      */
    var onTabBarElevationChanged: ChangeListeners[this.type, tabBarElevation] = js.native
    
    /**
      * Fired when the [*tabTintColor*](#tabTintColor) property has changed.
      */
    var onTabTintColorChanged: ChangeListeners[this.type, tabTintColor] = js.native
    
    /**
      * Enables swiping through tabs.
      */
    var paging: Boolean = js.native
    
    /**
      * The color used for the indicator of the selected tab. Only applies when the `tabBarLocation` is
      * `top`. Available on Android and iOS 13+.
      */
    var selectedTabIndicatorTintColor: ColorValue = js.native
    
    /**
      * The color used for the text and icon of a selected tab.
      */
    var selectedTabTintColor: ColorValue = js.native
    
    /**
      * The currently selected tab.
      */
    var selection: TabType = js.native
    
    /**
      * The index of the currently selected tab.
      */
    var selectionIndex: Double = js.native
    
    /**
      * The color used for the background of the bar containing the tabs.
      */
    var tabBarBackground: ColorValue = js.native
    
    /**
      * The elevation of the tab bar. Depending on the `tabBarLocation` different defaults are applied.
      */
    var tabBarElevation: Double = js.native
    
    /**
      * The placement of the tab titles. When set to `"hidden"`, the tab bar will not be visible. When set to
      * `"auto"`, the position is platform dependent.
      * @constant
      */
    var tabBarLocation: auto | bottom | hidden | top = js.native
    
    /**
      * Controls how the tabs make use of the available horizontal space. Setting the `tabMode` to `"fixed"`
      * makes the tabs span the entire available space. In case of a very wide `TabFolder` the `"fixed"` mode
      * centers the tabs. The mode `"scrollable"` left aligns the tabs and allows to scroll the tabs if there
      * are more tabs than would fit in the available space. Available on Android only.
      * @constant
      */
    var tabMode: fixed | scrollable = js.native
    
    /**
      * The color used for the text and icon of a tab.
      * When the `tabBarLocation` is `top` on iOS, this property affects the entire appearance of the bar. No
      * other color properties have an effect in that configuration.
      */
    var tabTintColor: ColorValue = js.native
  }
  
  @JSImport("tabris", "widgets.TextInput")
  @js.native
  /**
    * A widget that allows to enter text.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class TextInput () extends Widget[Any] {
    def this(properties: Properties[typings.tabris.mod.widgets.TextInput, OmitTextInputset]) = this()
    
    /**
      * The horizontal alignment of the text.
      */
    var alignment: centerX | left | right = js.native
    
    /**
      * Control how text input is capitalized.
      * * `none` - Do not change any text input
      * * `sentence` - Capitalize the first word of a sentence
      * * `word` - Capitalize every word
      * * `all` - Capitalize every letter
      * The boolean value `false` maps to `none` whereas `true` is equal to `all`.
      */
    var autoCapitalize: all | `false` | none | sentence | `true` | word = js.native
    
    /**
      * Enables the spell checker and auto-correction feature.
      */
    var autoCorrect: Boolean = js.native
    
    /**
      * The color of the border of the TextInput. On iOS this is a rectangular border around the TextInput,
      * on Android it is a single line below the TextInput.
      */
    var borderColor: ColorValue = js.native
    
    /**
      * The color of the cursor in the `TextInput`.
      */
    var cursorColor: ColorValue = js.native
    
    /**
      * Whether the text can be edited or not.
      */
    var editable: Boolean = js.native
    
    /**
      * Label or icon to display on the keyboard 'confirmation' key. The key press can be captured via the
      * `accept` event. Setting an `enterKeyType` other than `default` will change the key behavior to not
      * close the keyboard automatically. The developer is able close the keyboard by removing the focus from
      * the `TextInput`.
      */
    var enterKeyType: default | done | go | next | search | send = js.native
    
    /**
      * Should the hint message float above the TextInput when focus is gained.
      */
    var floatMessage: Boolean = js.native
    
    /**
      * Reflects whether this widget has the keyboard focus. Setting this property to `true` will focus the
      * widget and open the virtual keyboard, setting it to `false` will remove the focus and hide the
      * virtual keyboard.
      */
    var focused: Boolean = js.native
    
    /**
      * The font used for the text.
      */
    var font: FontValue = js.native
    
    /**
      * @constant
      */
    @JSName("jsxAttributes")
    val jsxAttributes_TextInput: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & Children = js.native
    
    /**
      * When `true` the `TextInput` will keep its focus, even when tapped outside of the widget bounds.
      */
    var keepFocus: Boolean = js.native
    
    /**
      * Selects the keyboard type to use for editing this widget. Has no effect when `type` is set to
      * `multiline`.
      */
    var keyboard: ascii | decimal | default | email | number | numbersAndPunctuation | phone | url = js.native
    
    /**
      * Allows to control when to show the virtual keyboard.
      * - `'never'` - The keyboard is never shown when focus is gained.
      * - `'ontouch'` - The keyboard is not shown when the `focused` property is set to `true`
      * programmatically. Only the blinking cursor will be shown. Touching the `TextInput` will show the
      * keyboard.
      * - `'onfocus'` - The keyboard is always shown when the `TextInput` gains focus.
      */
    var keyboardAppearanceMode: never | ontouch | onfocus = js.native
    
    /**
      * The maximum number of characters that can be entered into a `TextInput`.
      */
    var maxChars: Double = js.native
    
    /**
      * A hint text that is displayed when the input field is empty. Does not apply on iOS when `type` is set
      * to `multiline`.
      */
    var message: String = js.native
    
    /**
      * Color of the `message` text.
      */
    var messageColor: ColorValue = js.native
    
    /**
      * Fired when a text input has been finished by pressing the keyboard's Enter key. The label of this key
      * may vary depending on the platform and locale.
      */
    var onAccept: Listeners[TextInputAcceptEvent[this.type]] = js.native
    
    /**
      * Fired when the [*alignment*](#alignment) property has changed.
      */
    var onAlignmentChanged: ChangeListeners[this.type, alignment] = js.native
    
    /**
      * Fired when the [*autoCapitalize*](#autoCapitalize) property has changed.
      */
    var onAutoCapitalizeChanged: ChangeListeners[this.type, autoCapitalize] = js.native
    
    /**
      * Fired when the [*autoCorrect*](#autoCorrect) property has changed.
      */
    var onAutoCorrectChanged: ChangeListeners[this.type, autoCorrect] = js.native
    
    /**
      * Fired when the text value is about to change due to a user action.
      */
    var onBeforeTextChange: Listeners[TextInputBeforeTextChangeEvent[this.type]] = js.native
    
    /**
      * Fired when the widget lost focus.
      */
    var onBlur: Listeners[EventObject[this.type]] = js.native
    
    /**
      * Fired when the [*borderColor*](#borderColor) property has changed.
      */
    var onBorderColorChanged: ChangeListeners[this.type, borderColor] = js.native
    
    /**
      * Fired when the [*cursorColor*](#cursorColor) property has changed.
      */
    var onCursorColorChanged: ChangeListeners[this.type, cursorColor] = js.native
    
    /**
      * Fired when the [*editable*](#editable) property has changed.
      */
    var onEditableChanged: ChangeListeners[this.type, editable] = js.native
    
    /**
      * Fired when the [*enterKeyType*](#enterKeyType) property has changed.
      */
    var onEnterKeyTypeChanged: ChangeListeners[this.type, enterKeyType] = js.native
    
    /**
      * Fired when the [*floatMessage*](#floatMessage) property has changed.
      */
    var onFloatMessageChanged: ChangeListeners[this.type, floatMessage] = js.native
    
    /**
      * Fired when the widget gains focus.
      */
    var onFocus: Listeners[EventObject[this.type]] = js.native
    
    /**
      * Fired when the [*focused*](#focused) property has changed.
      */
    var onFocusedChanged: ChangeListeners[this.type, focused] = js.native
    
    /**
      * Fired when the [*font*](#font) property has changed.
      */
    var onFontChanged: ChangeListeners[this.type, font] = js.native
    
    /**
      * Fired when the text was changed by the user.
      */
    var onInput: Listeners[TextInputInputEvent[this.type]] = js.native
    
    /**
      * Fired when the [*keepFocus*](#keepFocus) property has changed.
      */
    var onKeepFocusChanged: ChangeListeners[this.type, keepFocus] = js.native
    
    /**
      * Fired when the [*keyboardAppearanceMode*](#keyboardAppearanceMode) property has changed.
      */
    var onKeyboardAppearanceModeChanged: ChangeListeners[this.type, keyboardAppearanceMode] = js.native
    
    /**
      * Fired when the [*keyboard*](#keyboard) property has changed.
      */
    var onKeyboardChanged: ChangeListeners[this.type, keyboard] = js.native
    
    /**
      * Fired when the [*maxChars*](#maxChars) property has changed.
      */
    var onMaxCharsChanged: ChangeListeners[this.type, maxChars] = js.native
    
    /**
      * Fired when the [*message*](#message) property has changed.
      */
    var onMessageChanged: ChangeListeners[this.type, message] = js.native
    
    /**
      * Fired when the [*messageColor*](#messageColor) property has changed.
      */
    var onMessageColorChanged: ChangeListeners[this.type, messageColor] = js.native
    
    /**
      * Fired when the [*revealPassword*](#revealPassword) property has changed.
      */
    var onRevealPasswordChanged: ChangeListeners[this.type, revealPassword] = js.native
    
    /**
      * The `select` event is fired when the user alters the text [`selection`](#selection). Either by
      * dragging the selection handles of a text selection, by moving the cursor inside the text or by typing
      * which also advances the cursor.
      * The event also fires when the user taps inside a `TextInput` since this involves to set the cursor to
      * the tapped position.
      */
    var onSelect: Listeners[TextInputSelectEvent[this.type]] = js.native
    
    /**
      * Fired when the [*selection*](#selection) property has changed.
      */
    var onSelectionChanged: ChangeListeners[this.type, selection] = js.native
    
    /**
      * Fired when the [*text*](#text) property has changed.
      */
    var onTextChanged: ChangeListeners[this.type, text] = js.native
    
    /**
      * Fired when the [*textColor*](#textColor) property has changed.
      */
    var onTextColorChanged: ChangeListeners[this.type, textColor] = js.native
    
    /**
      * Makes the text visible when the `TextInput` has the type `password`.
      */
    var revealPassword: Boolean = js.native
    
    /**
      * The `selection` is a two element number array representing the text selections start and end
      * position. The native platform usually shows selection handles so that the selection can be changed by
      * the user. A `selection` array where both numbers are the same represent a single cursor at the given
      * position. The selection start is the index of the first character where as the end is the index of
      * the last character + 1. E.g. to select the word "ok" the selection would be `[0, 2]`.
      * To make a selection visible the `TextInput` has to be in focus. Consequently the selection is
      * preserved when the focus is lost and regained. When the user gives the `TextInput` focus by tapping
      * on it, the selection is changed to represent his touch position.
      * Getting the `selection` upon user interaction (e.g. a button press) the focus would be lost and
      * possibly the `selection` altered due to user interaction. In such a scenario it is recommended to set
      * the [`keepFocus`](#keepfocus) property to `true`.
      */
    var selection: js.Array[Double] = js.native
    
    /**
      * The visual appearance of the text widget.
      * With the `style` _outline_, _fill_ or _underline_ the message hint will float above the `TextInput`
      * on Android. This behavior can be controlled with the property `floatMessage`. The `style` _none_ will
      * remove any background visualization, allowing to create a custom background. 
      * @constant
      */
    var style: default | fill | none | outline | underline = js.native
    
    /**
      * The text in the input field.
      */
    var text: String = js.native
    
    /**
      * The color of the text.
      */
    var textColor: ColorValue = js.native
    
    /**
      * The type of the text widget.
      * @constant
      */
    var `type`: default | multiline | password | search = js.native
  }
  
  @JSImport("tabris", "widgets.TextView")
  @js.native
  /**
    * A widget to display a text. For images, use ImageView.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class TextView () extends Widget[Any] {
    def this(properties: Properties[typings.tabris.mod.widgets.TextView, OmitTextViewset]) = this()
    
    /**
      * The horizontal alignment of the text.
      */
    var alignment: centerX | left | right = js.native
    
    /**
      * The font used for the text.
      */
    var font: FontValue = js.native
    
    /**
      * @constant
      */
    @JSName("jsxAttributes")
    val jsxAttributes_TextView: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & Children = js.native
    
    /**
      * The amount of space between each line of text. The `lineSpacing` property is a factor with a default
      * value of `1.0`.
      */
    var lineSpacing: Double = js.native
    
    /**
      * Allows for a subset of HTML tags in the text. Supported tags are: `a`, `del`, `ins`, `b`, `i`,
      * `strong`, `em`, `big`, `small`, `br`.
      * All tags except `<br/>` support the attributes "font" and "textColor" with the same values as the
      * `TextView` itself. IOS does not support to colorize links (`<a>`) with the `textColor` attribute.
      * All tags must be closed (e.g. use `<br/>` instead of `<br>`). Nesting tags is not supported on iOS. A
      * platform might allow to use additional tags but cross-platform compatibility is only guaranteed for
      * the tags listed above.
      * When the text is given as the content of a `<TextView>` JSX element, `markupEnabled` will parse the
      * text more like HTML, i.e. consecutive white spaces will be merged.
      */
    var markupEnabled: Boolean = js.native
    
    /**
      * Limit the number of lines to be displayed to the given maximum. `null` disables this limit.
      */
    var maxLines: Double | Null = js.native
    
    /**
      * Fired when the [*alignment*](#alignment) property has changed.
      */
    var onAlignmentChanged: ChangeListeners[this.type, alignment] = js.native
    
    /**
      * Fired when the [*font*](#font) property has changed.
      */
    var onFontChanged: ChangeListeners[this.type, font] = js.native
    
    /**
      * Fired when the [*lineSpacing*](#lineSpacing) property has changed.
      */
    var onLineSpacingChanged: ChangeListeners[this.type, lineSpacing] = js.native
    
    /**
      * Fired when the [*markupEnabled*](#markupEnabled) property has changed.
      */
    var onMarkupEnabledChanged: ChangeListeners[this.type, markupEnabled] = js.native
    
    /**
      * Fired when the [*maxLines*](#maxLines) property has changed.
      */
    var onMaxLinesChanged: ChangeListeners[this.type, maxLines] = js.native
    
    /**
      * Fired when the [*selectable*](#selectable) property has changed.
      */
    var onSelectableChanged: ChangeListeners[this.type, selectable] = js.native
    
    /**
      * Fires when the user clicks on a link in an html text. Requires to set `markupEnabled` to true and to
      * provide a text containing an anchor (`<a>`) with an `href` attribute. Eg. `textView.text = 'Website:
      * <a href="http://example.com>example.com</a>'`. The event object contains a property `url` which
      * provides the anchors `href` url.
      */
    var onTapLink: Listeners[TextViewTapLinkEvent[this.type]] = js.native
    
    /**
      * Fired when the [*text*](#text) property has changed.
      */
    var onTextChanged: ChangeListeners[this.type, text] = js.native
    
    /**
      * Fired when the [*textColor*](#textColor) property has changed.
      */
    var onTextColorChanged: ChangeListeners[this.type, textColor] = js.native
    
    /**
      * Whether the text can be selected or not.
      */
    var selectable: Boolean = js.native
    
    /**
      * The text to display.
      */
    var text: String = js.native
    
    /**
      * The color of the text.
      */
    var textColor: ColorValue = js.native
  }
  
  @JSImport("tabris", "widgets.ToggleButton")
  @js.native
  /**
    * A push button that "snaps in", i.e. it is selected when pressed and deselected when pressed again.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class ToggleButton () extends Widget[Any] {
    def this(properties: Properties[typings.tabris.mod.widgets.ToggleButton, OmitToggleButtonset]) = this()
    
    /**
      * The horizontal alignment of the button text.
      */
    var alignment: centerX | left | right = js.native
    
    /**
      * The checked state of the toggle button.
      */
    var checked: Boolean = js.native
    
    /**
      * The font used for the text.
      */
    var font: FontValue = js.native
    
    /**
      * An image to be displayed on the button.
      */
    var image: ImageValue = js.native
    
    /**
      * @constant
      */
    @JSName("jsxAttributes")
    val jsxAttributes_ToggleButton: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & Children = js.native
    
    /**
      * Fired when the [*alignment*](#alignment) property has changed.
      */
    var onAlignmentChanged: ChangeListeners[this.type, alignment] = js.native
    
    /**
      * Fired when the [*checked*](#checked) property has changed.
      */
    var onCheckedChanged: ChangeListeners[this.type, checked] = js.native
    
    /**
      * Fired when the [*font*](#font) property has changed.
      */
    var onFontChanged: ChangeListeners[this.type, font] = js.native
    
    /**
      * Fired when the [*image*](#image) property has changed.
      */
    var onImageChanged: ChangeListeners[this.type, image] = js.native
    
    /**
      * Fired when the toggle button is selected or deselected by the user.
      */
    var onSelect: Listeners[ToggleButtonSelectEvent[this.type]] = js.native
    
    /**
      * Fired when the [*text*](#text) property has changed.
      */
    var onTextChanged: ChangeListeners[this.type, text] = js.native
    
    /**
      * Fired when the [*textColor*](#textColor) property has changed.
      */
    var onTextColorChanged: ChangeListeners[this.type, textColor] = js.native
    
    /**
      * The button's label text.
      */
    var text: String = js.native
    
    /**
      * The color of the text.
      */
    var textColor: ColorValue = js.native
  }
  
  @JSImport("tabris", "widgets.Video")
  @js.native
  /**
    * A widget that plays a video from an URL.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class Video () extends Widget[Any] {
    def this(properties: Properties[OmitVideospeedpositiondur, OmitOmitVideospeedpositioAbsoluteBounds]) = this()
    
    /**
      * If set to `true`, starts playing the video as soon as the state changes from `open` to `ready`.
      */
    var autoPlay: Boolean = js.native
    
    /**
      * If set to `true`, overlays the video with a native UI for controlling playback.
      */
    var controlsVisible: Boolean = js.native
    
    /**
      * Returns the full length of the current video in milliseconds.
      */
    val duration: Double = js.native
    
    /**
      * @constant
      */
    @JSName("jsxAttributes")
    val jsxAttributes_Video: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & js.Object & Children = js.native
    
    /**
      * Fired when the [*autoPlay*](#autoPlay) property has changed.
      */
    var onAutoPlayChanged: ChangeListeners[this.type, autoPlay] = js.native
    
    /**
      * Fired when the [*controlsVisible*](#controlsVisible) property has changed.
      */
    var onControlsVisibleChanged: ChangeListeners[this.type, controlsVisible] = js.native
    
    /**
      * Fired when the [*duration*](#duration) property has changed.
      */
    var onDurationChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.duration] = js.native
    
    /**
      * Fired when the [*position*](#position) property has changed.
      */
    var onPositionChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.position] = js.native
    
    /**
      * Fired when the [*speed*](#speed) property has changed.
      */
    var onSpeedChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.speed] = js.native
    
    /**
      * Fired when the [*state*](#state) property has changed.
      */
    var onStateChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.state] = js.native
    
    /**
      * Fired when the [*url*](#url) property has changed.
      */
    var onUrlChanged: ChangeListeners[this.type, url] = js.native
    
    /**
      * Pauses the video. *[state](#state)* changes to `pause` and `speed` to `0`. Has no effect when
      * *[state](#state)* is not `play`.
      */
    def pause(): Unit = js.native
    
    /**
      * Starts playing the video, *[state](#state)* changes to `play`. Has no effect unless the current state
      * is either `pause` or `ready`.
      * @param speed Desired playback speed. If the given speed is not supported by the platform or video, the actual playback speed will be `1` - i.e. the natural speed of the video.
      */
    def play(): Unit = js.native
    def play(speed: Double): Unit = js.native
    
    /**
      * Returns the current playback position in milliseconds. This property does not trigger any change
      * events.
      */
    val position: Double = js.native
    
    /**
      * Attempts to change the `position` to the given time index. Success depends on the currently loaded
      * video. Has no effect if the current *[state](#state)* is `empty` or `fail`.
      * @param position Desired position in milliseconds.
      */
    def seek(position: Double): Unit = js.native
    
    /**
      * Returns the current playback speed. The value `1` represents the natural speed of the video. When the
      * *[state](#state)* of the widget is not `play` this property always has the value `0`.
      */
    val speed: Double = js.native
    
    /**
      * The current video playback state of the widget.
      * ![Video widget states](./img/Video-state.png)
      * - `'empty'` -  No `url` has been set.
      * - `'open'` - The `url` has been set to a valid value but the widget is not yet ready to play.
      * - `'ready'` - The widget has loaded enough content to be ready to play, but is not yet playing.
      * - `'play'` - A video is currently playing.
      * - `'stale'` - The video is paused because it is buffering more content and will resume playback once
      * it has enough content.
      * - `'pause'` - Playback is paused because of user input or `pause()` has been called.
      * - `'finish'` - Playback stopped at the end of the video.
      * - `'fail'` - An error occurred preventing video playback.
      */
    val state: empty | fail | finish | open | pause | play | ready | stale = js.native
    
    /**
      * The URL of the video to play. Setting this property to any non-empty string changes the
      * *[state](#state)* to `open` and the video starts loading. Setting this property to an empty string
      * unloads the current video and the *[state](#state)* returns to `empty`.
      */
    var url: String = js.native
  }
  
  @JSImport("tabris", "widgets.WebView")
  @js.native
  /**
    * A widget that can display a web page. Since this widget requires a lot of resources it's recommended
    * to have no more than one instance at a time.
    * 
    * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
    * object which may include (in addition to the properties) children, event listeners and layout
    * shorthands.
    */
  open class WebView () extends Widget[Any] {
    def this(properties: Properties[OmitWebViewcanGoBackcanGo, OmitOmitWebViewcanGoBackcAbsoluteBounds]) = this()
    
    /**
      * Whether there is a previous to navigated to via `goBack()`.
      */
    val canGoBack: Boolean = js.native
    
    /**
      * Whether there is a next page to navigate to via `goForward()`.
      */
    val canGoForward: Boolean = js.native
    
    /**
      * Navigate the `WebView` to the previous page if possible.
      */
    def goBack(): Unit = js.native
    
    /**
      * Navigate the `WebView` to the next page if possible.
      */
    def goForward(): Unit = js.native
    
    /**
      * A complete HTML document to display. Always returns the last set value.
      * Note: `htmlChanged` event will not be fired on iOS when a page is using `history.pushState()` to
      * navigate between pages.
      */
    var html: String = js.native
    
    /**
      * JavaScript code to be executed before page begins loading.
      * @constant
      */
    var initScript: String = js.native
    
    /**
      * @constant
      */
    @JSName("jsxAttributes")
    val jsxAttributes_WebView: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & js.Object = js.native
    
    /**
      * Fired when the [*canGoBack*](#canGoBack) property has changed.
      */
    var onCanGoBackChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.canGoBack] = js.native
    
    /**
      * Fired when the [*canGoForward*](#canGoForward) property has changed.
      */
    var onCanGoForwardChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.canGoForward] = js.native
    
    /**
      * Fired when the WebView requests a download. The download event provides the properties `url`,
      * `mimeType`, `contentLength` and `contentDisposition`. Supported only on Android.
      */
    var onDownload: Listeners[WebViewDownloadEvent[this.type]] = js.native
    
    /**
      * Fired when the [*html*](#html) property has changed.
      */
    var onHtmlChanged: ChangeListeners[this.type, html] = js.native
    
    /**
      * Fired when the url has been loaded.
      * Note: This event will not be fired on iOS when a page is using `history.pushState()` to navigate
      * between pages.
      */
    var onLoad: Listeners[EventObject[this.type]] = js.native
    
    /**
      * Fired when a web message has been sent via `window.parent.postMessage(message, targetOrigin)` from
      * inside the `WebView`.
      */
    var onMessage: Listeners[WebViewMessageEvent[this.type]] = js.native
    
    /**
      * Fired when the WebView is about to navigate to a new URL.
      * Note: This event will not be fired on iOS when a page is using `history.pushState()` to navigate
      * between pages.
      */
    var onNavigate: Listeners[WebViewNavigateEvent[this.type]] = js.native
    
    /**
      * Fired when the [*url*](#url) property has changed.
      */
    var onUrlChanged: ChangeListeners[this.type, url] = js.native
    
    /**
      * Posts a web message to the underlying `window` object of the WebView. The website in the `WebView`
      * can register for the message in the following fashion: `window.addEventListener('message',
      * callbackFunction)`. For more information see
      * [`Window.postMessage()`](https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage) API.
      * @param message The message to send. Supports only strings.
      * @param targetOrigin The URL of the page that receives the message. The message is only sent if the current document URL has the same scheme, domain and path. Use `*` to send to any URL.
      */
    def postMessage(message: String, targetOrigin: String): this.type = js.native
    
    /**
      * The URL of the web page to display. Relative URLs are resolved relative to 'package.json'. Returns
      * empty string when content from *html* property is displayed.
      * Note: `urlChanged` event will not be fired on iOS when a page is using `history.pushState()` to
      * navigate between pages.
      */
    var url: String = js.native
  }
}
