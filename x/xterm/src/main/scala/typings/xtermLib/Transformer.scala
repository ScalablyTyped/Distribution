package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Transformer[I, O] extends js.Object {
  var flush: js.UndefOr[TransformStreamDefaultControllerCallback[O]] = js.undefined
  var readableType: js.UndefOr[scala.Nothing] = js.undefined
  var start: js.UndefOr[TransformStreamDefaultControllerCallback[O]] = js.undefined
  var transform: js.UndefOr[TransformStreamDefaultControllerTransformCallback[I, O]] = js.undefined
  var writableType: js.UndefOr[scala.Nothing] = js.undefined
}

