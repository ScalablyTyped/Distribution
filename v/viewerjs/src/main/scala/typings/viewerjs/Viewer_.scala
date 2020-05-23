package typings.viewerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Viewer_ extends js.Object {
  def destroy(): Viewer = js.native
  def exit(): Viewer = js.native
  def full(): Viewer = js.native
  def hide(): Viewer = js.native
  def hide(immediate: Boolean): Viewer = js.native
  def move(offsetX: Double): Viewer = js.native
  def move(offsetX: Double, offsetY: Double): Viewer = js.native
  def moveTo(x: Double): Viewer = js.native
  def moveTo(x: Double, y: Double): Viewer = js.native
  def next(): Viewer = js.native
  def next(loop: Boolean): Viewer = js.native
  def play(): Viewer = js.native
  def play(fullscreen: Boolean): Viewer = js.native
  def prev(): Viewer = js.native
  def prev(loop: Boolean): Viewer = js.native
  def reset(): Viewer = js.native
  def rotate(degree: Double): Viewer = js.native
  def rotateTo(degree: Double): Viewer = js.native
  def scale(scaleX: Double): Viewer = js.native
  def scale(scaleX: Double, scaleY: Double): Viewer = js.native
  def scaleX(scaleX: Double): Viewer = js.native
  def scaleY(scaleY: Double): Viewer = js.native
  def show(): Viewer = js.native
  def show(immediate: Boolean): Viewer = js.native
  def stop(): Viewer = js.native
  def toggle(): Viewer = js.native
  def tooltip(): Viewer = js.native
  def update(): Viewer = js.native
  def view(): Viewer = js.native
  def view(index: Double): Viewer = js.native
  def zoom(ratio: Double): Viewer = js.native
  def zoom(ratio: Double, hasTooltip: Boolean): Viewer = js.native
  def zoomTo(ratio: Double): Viewer = js.native
  def zoomTo(ratio: Double, hasTooltip: Boolean): Viewer = js.native
}

