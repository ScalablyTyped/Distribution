package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The cover flow view is a container showing animated three-dimensional images in a style
			 * consistent with the cover flow presentation style used for iPod, iTunes, and file browsing.
			 */
@js.native
trait CoverFlowView
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Whether the view should be "hidden" from (i.e., ignored by) the accessibility service.
  				 */
  var accessibilityHidden: scala.Boolean = js.native
  /**
  				 * Briefly describes what performing an action (such as a click) on the view will do.
  				 */
  var accessibilityHint: java.lang.String = js.native
  /**
  				 * A succint label identifying the view for the device's accessibility service.
  				 */
  var accessibilityLabel: java.lang.String = js.native
  /**
  				 * A string describing the value (if any) of the view for the device's accessibility service.
  				 */
  var accessibilityValue: java.lang.String = js.native
  /**
  				 * Coordinate of the view about which to pivot an animation.
  				 */
  var anchorPoint: titaniumLib.Point = js.native
  /**
  				 * Current position of the view during an animation.
  				 */
  val animatedCenter: titaniumLib.Point = js.native
  /**
  				 * Background color of the view, as a color name or hex triplet.
  				 */
  var backgroundColor: java.lang.String = js.native
  /**
  				 * A background gradient for the view.
  				 */
  var backgroundGradient: titaniumLib.Gradient = js.native
  /**
  				 * Background image for the view, specified as a local file path or URL.
  				 */
  var backgroundImage: java.lang.String = js.native
  /**
  				 * Size of the left end cap.
  				 */
  var backgroundLeftCap: scala.Double = js.native
  /**
  				 * Determines whether to tile a background across a view.
  				 */
  var backgroundRepeat: scala.Boolean = js.native
  /**
  				 * Size of the top end cap.
  				 */
  var backgroundTopCap: scala.Double = js.native
  /**
  				 * Border color of the view, as a color name or hex triplet.
  				 */
  var borderColor: java.lang.String = js.native
  /**
  				 * Radius for the rounded corners of the view's border.
  				 */
  var borderRadius: scala.Double = js.native
  /**
  				 * Border width of the view.
  				 */
  var borderWidth: scala.Double = js.native
  /**
  				 * View's bottom position, in platform-specific units.
  				 */
  var bottom: scala.Double | java.lang.String = js.native
  /**
  				 * View's center position, in the parent view's coordinates.
  				 */
  var center: titaniumLib.Point = js.native
  /**
  				 * View's clipping behavior.
  				 */
  var clipMode: scala.Double = js.native
  /**
  				 * View height, in platform-specific units.
  				 */
  var height: scala.Double | java.lang.String = js.native
  /**
  				 * Adds a horizontal parallax effect to the view
  				 */
  var horizontalMotionEffect: js.Any = js.native
  /**
  				 * Determines whether the layout has wrapping behavior.
  				 */
  var horizontalWrap: scala.Boolean = js.native
  /**
  				 * Images to display in the view.
  				 */
  var images: js.Array[java.lang.String] | js.Array[titaniumLib.TitaniumNs.Blob] | js.Array[titaniumLib.TitaniumNs.FilesystemNs.File] | js.Array[titaniumLib.CoverFlowImageType] = js.native
  /**
  				 * Specifies how the view positions its children.
  				 * One of: 'composite', 'vertical', or 'horizontal'.
  				 */
  var layout: java.lang.String = js.native
  /**
  				 * View's left position, in platform-specific units.
  				 */
  var left: scala.Double | java.lang.String = js.native
  /**
  				 * Opacity of this view, from 0.0 (transparent) to 1.0 (opaque).
  				 */
  var opacity: scala.Double = js.native
  /**
  				 * The preview context used in the 3D-Touch feature "Peek and Pop".
  				 */
  var previewContext: PreviewContext = js.native
  /**
  				 * Background color of the wrapper view when this view is used as either <Titanium.UI.ListView.pullView> or <Titanium.UI.TableView.headerPullView>.
  				 */
  var pullBackgroundColor: java.lang.String = js.native
  /**
  				 * The bounding box of the view relative to its parent, in system units.
  				 */
  val rect: titaniumLib.Dimension = js.native
  /**
  				 * View's right position, in platform-specific units.
  				 */
  var right: scala.Double | java.lang.String = js.native
  /**
  				 * Index to make selected.
  				 */
  var selected: scala.Double = js.native
  /**
  				 * The size of the view in system units.
  				 */
  val size: titaniumLib.Dimension = js.native
  /**
  				 * The view's tintColor
  				 */
  var tintColor: java.lang.String = js.native
  /**
  				 * The view's top position.
  				 */
  var top: scala.Double | java.lang.String = js.native
  /**
  				 * Determines whether view should receive touch events.
  				 */
  var touchEnabled: scala.Boolean = js.native
  /**
  				 * Transformation matrix to apply to the view.
  				 */
  var transform: titaniumLib.TitaniumNs.UINs.Matrix2D | titaniumLib.TitaniumNs.UINs.Matrix3D = js.native
  /**
  				 * Adds a vertical parallax effect to the view
  				 */
  var verticalMotionEffect: js.Any = js.native
  /**
  				 * Determines the color of the shadow.
  				 */
  var viewShadowColor: java.lang.String = js.native
  /**
  				 * Determines the offset for the shadow of the view.
  				 */
  var viewShadowOffset: titaniumLib.Point = js.native
  /**
  				 * Determines the blur radius used to create the shadow.
  				 */
  var viewShadowRadius: scala.Double = js.native
  /**
  				 * Determines whether the view is visible.
  				 */
  var visible: scala.Boolean = js.native
  /**
  				 * View's width, in platform-specific units.
  				 */
  var width: scala.Double | java.lang.String = js.native
  /**
  				 * Z-index stack order position, relative to other sibling views.
  				 */
  var zIndex: scala.Double = js.native
  /**
  				 * Animates this view.
  				 */
  def animate(animation: js.Any): scala.Unit = js.native
  def animate(animation: js.Any, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  				 * Translates a point from this view's coordinate system to another view's coordinate system.
  				 */
  def convertPointToView(point: titaniumLib.Point, destinationView: js.Any): titaniumLib.Point = js.native
  /**
  				 * Finishes a batch update of the View's layout properties and schedules a layout pass of the
  				 * view tree.
  				 */
  def finishLayout(): scala.Unit = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.accessibilityHidden> property.
  				 */
  def getAccessibilityHidden(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.accessibilityHint> property.
  				 */
  def getAccessibilityHint(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.accessibilityLabel> property.
  				 */
  def getAccessibilityLabel(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.accessibilityValue> property.
  				 */
  def getAccessibilityValue(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.anchorPoint> property.
  				 */
  def getAnchorPoint(): titaniumLib.Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.animatedCenter> property.
  				 */
  def getAnimatedCenter(): titaniumLib.Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.backgroundColor> property.
  				 */
  def getBackgroundColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.backgroundGradient> property.
  				 */
  def getBackgroundGradient(): titaniumLib.Gradient = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.backgroundImage> property.
  				 */
  def getBackgroundImage(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.backgroundLeftCap> property.
  				 */
  def getBackgroundLeftCap(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.backgroundRepeat> property.
  				 */
  def getBackgroundRepeat(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.backgroundTopCap> property.
  				 */
  def getBackgroundTopCap(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.borderColor> property.
  				 */
  def getBorderColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.borderRadius> property.
  				 */
  def getBorderRadius(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.borderWidth> property.
  				 */
  def getBorderWidth(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.bottom> property.
  				 */
  def getBottom(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.center> property.
  				 */
  def getCenter(): titaniumLib.Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.clipMode> property.
  				 */
  def getClipMode(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.height> property.
  				 */
  def getHeight(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.horizontalMotionEffect> property.
  				 */
  def getHorizontalMotionEffect(): js.Any = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.horizontalWrap> property.
  				 */
  def getHorizontalWrap(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.images> property.
  				 */
  def getImages(): js.Array[java.lang.String] | js.Array[titaniumLib.TitaniumNs.Blob] | js.Array[titaniumLib.TitaniumNs.FilesystemNs.File] | js.Array[titaniumLib.CoverFlowImageType] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.layout> property.
  				 */
  def getLayout(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.left> property.
  				 */
  def getLeft(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.opacity> property.
  				 */
  def getOpacity(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.previewContext> property.
  				 */
  def getPreviewContext(): PreviewContext = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.pullBackgroundColor> property.
  				 */
  def getPullBackgroundColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.rect> property.
  				 */
  def getRect(): titaniumLib.Dimension = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.right> property.
  				 */
  def getRight(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.selected> property.
  				 */
  def getSelected(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.size> property.
  				 */
  def getSize(): titaniumLib.Dimension = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.tintColor> property.
  				 */
  def getTintColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.top> property.
  				 */
  def getTop(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.touchEnabled> property.
  				 */
  def getTouchEnabled(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.transform> property.
  				 */
  def getTransform(): titaniumLib.TitaniumNs.UINs.Matrix2D | titaniumLib.TitaniumNs.UINs.Matrix3D = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.verticalMotionEffect> property.
  				 */
  def getVerticalMotionEffect(): js.Any = js.native
  /**
  				 * Returns the matching view of a given view ID.
  				 */
  def getViewById(id: java.lang.String): titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.viewShadowColor> property.
  				 */
  def getViewShadowColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.viewShadowOffset> property.
  				 */
  def getViewShadowOffset(): titaniumLib.Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.viewShadowRadius> property.
  				 */
  def getViewShadowRadius(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.visible> property.
  				 */
  def getVisible(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.width> property.
  				 */
  def getWidth(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.CoverFlowView.zIndex> property.
  				 */
  def getZIndex(): scala.Double = js.native
  /**
  				 * Hides this view.
  				 */
  def hide(): scala.Unit = js.native
  def hide(options: titaniumLib.AnimationOption): scala.Unit = js.native
  /**
  				 * Inserts a view at the specified position in the [children](Titanium.UI.View.children) array.
  				 */
  def insertAt(params: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.accessibilityHidden> property.
  				 */
  def setAccessibilityHidden(accessibilityHidden: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.accessibilityHint> property.
  				 */
  def setAccessibilityHint(accessibilityHint: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.accessibilityLabel> property.
  				 */
  def setAccessibilityLabel(accessibilityLabel: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.accessibilityValue> property.
  				 */
  def setAccessibilityValue(accessibilityValue: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.anchorPoint> property.
  				 */
  def setAnchorPoint(anchorPoint: titaniumLib.Point): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.backgroundColor> property.
  				 */
  def setBackgroundColor(backgroundColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.backgroundGradient> property.
  				 */
  def setBackgroundGradient(backgroundGradient: titaniumLib.Gradient): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.backgroundImage> property.
  				 */
  def setBackgroundImage(backgroundImage: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.backgroundLeftCap> property.
  				 */
  def setBackgroundLeftCap(backgroundLeftCap: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.backgroundRepeat> property.
  				 */
  def setBackgroundRepeat(backgroundRepeat: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.backgroundTopCap> property.
  				 */
  def setBackgroundTopCap(backgroundTopCap: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.borderColor> property.
  				 */
  def setBorderColor(borderColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.borderRadius> property.
  				 */
  def setBorderRadius(borderRadius: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.borderWidth> property.
  				 */
  def setBorderWidth(borderWidth: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.bottom> property.
  				 */
  def setBottom(bottom: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.bottom> property.
  				 */
  def setBottom(bottom: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.center> property.
  				 */
  def setCenter(center: titaniumLib.Point): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.clipMode> property.
  				 */
  def setClipMode(clipMode: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.height> property.
  				 */
  def setHeight(height: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.height> property.
  				 */
  def setHeight(height: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.horizontalMotionEffect> property.
  				 */
  def setHorizontalMotionEffect(horizontalMotionEffect: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.horizontalWrap> property.
  				 */
  def setHorizontalWrap(horizontalWrap: scala.Boolean): scala.Unit = js.native
  /**
  				 * Changes the image for a specified index.
  				 */
  def setImage(index: scala.Double, image: java.lang.String): scala.Unit = js.native
  /**
  				 * Changes the image for a specified index.
  				 */
  def setImage(index: scala.Double, image: titaniumLib.CoverFlowImageType): scala.Unit = js.native
  /**
  				 * Changes the image for a specified index.
  				 */
  def setImage(index: scala.Double, image: titaniumLib.TitaniumNs.Blob): scala.Unit = js.native
  /**
  				 * Changes the image for a specified index.
  				 */
  def setImage(index: scala.Double, image: titaniumLib.TitaniumNs.FilesystemNs.File): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.images> property.
  				 */
  def setImages(
    images: js.Array[
      titaniumLib.TitaniumNs.Blob | titaniumLib.CoverFlowImageType | titaniumLib.TitaniumNs.FilesystemNs.File | java.lang.String
    ]
  ): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.layout> property.
  				 */
  def setLayout(layout: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.left> property.
  				 */
  def setLeft(left: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.left> property.
  				 */
  def setLeft(left: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.opacity> property.
  				 */
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.previewContext> property.
  				 */
  def setPreviewContext(previewContext: PreviewContext): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.pullBackgroundColor> property.
  				 */
  def setPullBackgroundColor(pullBackgroundColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.right> property.
  				 */
  def setRight(right: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.right> property.
  				 */
  def setRight(right: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.selected> property.
  				 */
  def setSelected(selected: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.tintColor> property.
  				 */
  def setTintColor(tintColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.top> property.
  				 */
  def setTop(top: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.top> property.
  				 */
  def setTop(top: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.touchEnabled> property.
  				 */
  def setTouchEnabled(touchEnabled: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.transform> property.
  				 */
  def setTransform(transform: titaniumLib.TitaniumNs.UINs.Matrix2D): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.transform> property.
  				 */
  def setTransform(transform: titaniumLib.TitaniumNs.UINs.Matrix3D): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.verticalMotionEffect> property.
  				 */
  def setVerticalMotionEffect(verticalMotionEffect: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.viewShadowColor> property.
  				 */
  def setViewShadowColor(viewShadowColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.viewShadowOffset> property.
  				 */
  def setViewShadowOffset(viewShadowOffset: titaniumLib.Point): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.viewShadowRadius> property.
  				 */
  def setViewShadowRadius(viewShadowRadius: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.visible> property.
  				 */
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.width> property.
  				 */
  def setWidth(width: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.width> property.
  				 */
  def setWidth(width: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.CoverFlowView.zIndex> property.
  				 */
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
  /**
  				 * Makes this view visible.
  				 */
  def show(): scala.Unit = js.native
  def show(options: titaniumLib.AnimationOption): scala.Unit = js.native
  /**
  				 * Starts a batch update of this view's layout properties.
  				 */
  def startLayout(): scala.Unit = js.native
  /**
  				 * Returns an image of the rendered view, as a Blob.
  				 */
  def toImage(): titaniumLib.TitaniumNs.Blob = js.native
  def toImage(callback: js.Function1[/* param0 */ titaniumLib.TitaniumNs.Blob, _]): titaniumLib.TitaniumNs.Blob = js.native
  def toImage(
    callback: js.Function1[/* param0 */ titaniumLib.TitaniumNs.Blob, _],
    honorScaleFactor: scala.Boolean
  ): titaniumLib.TitaniumNs.Blob = js.native
  /**
  				 * Performs a batch update of all supplied layout properties and schedules a layout pass after
  				 * they have been updated.
  				 */
  def updateLayout(params: js.Any): scala.Unit = js.native
}

