package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Renderer extends js.Object {
  var font: Face
  var renderer: Backend
  var stave: Space
}

object Renderer {
  @scala.inline
  def apply(font: Face, renderer: Backend, stave: Space): Renderer = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], stave = stave.asInstanceOf[js.Any])
    __obj.asInstanceOf[Renderer]
  }
}

