package typings.wordpressWordcount.mod

import typings.wordpressWordcount.anon.PartialSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/wordcount", "count")
@js.native
object count extends js.Object {
  
  def apply(text: String, `type`: CountType): Double = js.native
  def apply(text: String, `type`: CountType, userSettings: PartialSettings): Double = js.native
}
