package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Media.Core.AudioTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsReturnValue extends js.Object {
  /** The audio tracks that start at startIndex in the list. */ var items: AudioTrack
  /** The number of audio tracks retrieved. */ var returnValue: Double
}

object ItemsReturnValue {
  @scala.inline
  def apply(items: AudioTrack, returnValue: Double): ItemsReturnValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsReturnValue]
  }
}

