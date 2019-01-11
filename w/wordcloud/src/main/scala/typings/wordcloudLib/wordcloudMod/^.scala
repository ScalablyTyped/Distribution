package typings
package wordcloudLib.wordcloudMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wordcloud", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val isSupported: scala.Boolean = js.native
  var miniumFontSize: scala.Double = js.native
  def apply(
    elements: stdLib.HTMLElement | js.Array[stdLib.HTMLElement],
    options: wordcloudLib.wordcloudMod.WordCloudNs.Options
  ): scala.Unit = js.native
}

