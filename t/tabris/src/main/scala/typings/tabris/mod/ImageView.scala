package typings.tabris.mod

import typings.tabris.OmitImageViewset
import typings.tabris.tabrisStrings.auto
import typings.tabris.tabrisStrings.fill
import typings.tabris.tabrisStrings.fit
import typings.tabris.tabrisStrings.image
import typings.tabris.tabrisStrings.maxZoomLevel
import typings.tabris.tabrisStrings.minZoomLevel
import typings.tabris.tabrisStrings.none
import typings.tabris.tabrisStrings.scaleMode
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.stretch
import typings.tabris.tabrisStrings.tintColor
import typings.tabris.tabrisStrings.zoomEnabled
import typings.tabris.tabrisStrings.zoomLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "ImageView")
@js.native
class ImageView () extends Widget {
  def this(properties: Properties[ImageView, OmitImageViewset]) = this()
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
  val jsxAttributes_ImageView: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) with js.Object = js.native
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

