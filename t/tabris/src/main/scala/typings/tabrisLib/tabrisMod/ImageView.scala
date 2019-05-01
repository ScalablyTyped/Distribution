package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A widget to display an image.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._ImageViewProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, right, top, transform, visible, width, win_theme. Inlined image, maxZoomLevel, minZoomLevel, scaleMode, tintColor, zoomEnabled, zoomLevel */ @JSImport("tabris", "ImageView")
@js.native
class ImageView () extends Widget {
  def this(properties: Properties[ImageView, TypeScriptPropertiesKey]) = this()
  /**
    * The image to display. Providing the `width` and `height` attributes on the image will resize it
    * internally. When no dimensions are given the image will be loaded with its original size. Since the
    * full size image might occupy a lot of memory, it's recommended to provide exact dimensions.
    */
  var image: Image | scala.Null = js.native
  /**
    * The highest amount the image can be zoomed in to. Setting the `maxZoomLevel` to a level smaller than
    * the current `zoomLevel` changes the `zoomLevel` to be the same as the new `maxZoomLevel`.
    */
  var maxZoomLevel: scala.Double = js.native
  /**
    * The lowest amount the image can be zoomed out to. Setting the `minZoomLevel` to a level larger than
    * the current `zoomLevel` changes the `zoomLevel` to be the same as the new `minZoomLevel`. 
    */
  var minZoomLevel: scala.Double = js.native
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
  var scaleMode: tabrisLib.tabrisLibStrings.auto | tabrisLib.tabrisLibStrings.fill | tabrisLib.tabrisLibStrings.fit | tabrisLib.tabrisLibStrings.none | tabrisLib.tabrisLibStrings.stretch = js.native
  /**
    * A color to change the image appearance. All opaque parts of the image will be tinted with the given
    * color. Set to `initial` to remove the effect.
    */
  var tintColor: tabrisLib.Color = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_ImageView: ImageViewProperties = js.native
  /**
    * Enables the pinch-to-zoom gesture on the `ImageView` and makes the properties `zoomLevel`,
    * `minZoomLevel` and `maxZoomLevel` available. Setting `zoomEnabled` to `false` also resets the
    * `zoomLevel`, `minZoomLevel`, `maxZoomLevel` to their respective defaults.
    */
  var zoomEnabled: scala.Boolean = js.native
  /**
    * The amount that the image is zoomed in or out. The default position without any zooming has the value
    * 1.0.
    */
  var zoomLevel: scala.Double = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: ImageViewEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: ImageViewEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: ImageViewEvents): this.type = js.native
}

