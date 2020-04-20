package typings.tabris.mod

import typings.tabris.OmitCameraViewset
import typings.tabris.tabrisStrings.camera
import typings.tabris.tabrisStrings.fill
import typings.tabris.tabrisStrings.fit
import typings.tabris.tabrisStrings.scaleMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "CameraView")
@js.native
class CameraView () extends Widget {
  def this(properties: Properties[CameraView, OmitCameraViewset]) = this()
  /**
    * The source video feed to display. In order to show a preview the `Camera` has to be in an active
    * state. When the `Camera` is inactive or no `Camera` is assigned the `CameraView` shows a blank
    * screen. 
    * It is recommended to deactivate the `Camera` when not in use in order to preserve battery life.
    */
  var camera: Camera = js.native
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

