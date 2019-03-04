package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnderlyingByteSource extends js.Object {
  var autoAllocateChunkSize: js.UndefOr[scala.Double] = js.undefined
  var cancel: js.UndefOr[ReadableStreamErrorCallback] = js.undefined
  var pull: js.UndefOr[ReadableByteStreamControllerCallback] = js.undefined
  var start: js.UndefOr[ReadableByteStreamControllerCallback] = js.undefined
  var `type`: xtermLib.xtermLibStrings.bytes
}

object UnderlyingByteSource {
  @scala.inline
  def apply(
    `type`: xtermLib.xtermLibStrings.bytes,
    autoAllocateChunkSize: scala.Int | scala.Double = null,
    cancel: ReadableStreamErrorCallback = null,
    pull: ReadableByteStreamControllerCallback = null,
    start: ReadableByteStreamControllerCallback = null
  ): UnderlyingByteSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (autoAllocateChunkSize != null) __obj.updateDynamic("autoAllocateChunkSize")(autoAllocateChunkSize.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (pull != null) __obj.updateDynamic("pull")(pull)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[UnderlyingByteSource]
  }
}

