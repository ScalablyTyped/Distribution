package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueAudioTrack extends js.Object {
  /** The audio tracks that start at startIndex in the list. */ var items: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.AudioTrack
  /** The number of audio tracks retrieved. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueAudioTrack {
  @scala.inline
  def apply(items: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.AudioTrack, returnValue: scala.Double): Anon_ItemsReturnValueAudioTrack = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueAudioTrack]
  }
}

