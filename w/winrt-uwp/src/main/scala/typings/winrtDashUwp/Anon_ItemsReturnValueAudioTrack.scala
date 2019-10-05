package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Media.Core.AudioTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueAudioTrack extends js.Object {
  /** The audio tracks that start at startIndex in the list. */ var items: AudioTrack
  /** The number of audio tracks retrieved. */ var returnValue: Double
}

object Anon_ItemsReturnValueAudioTrack {
  @scala.inline
  def apply(items: AudioTrack, returnValue: Double): Anon_ItemsReturnValueAudioTrack = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueAudioTrack]
  }
}

