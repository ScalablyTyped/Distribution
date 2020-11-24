package typings.wordpressNux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/nux/store/actions", JSImport.Namespace)
@js.native
object actionsMod extends js.Object {
  
  def disableTips(): Unit = js.native
  
  def dismissTip(id: String): Unit = js.native
  
  def enableTips(): Unit = js.native
  
  def triggerGuide(tipIds: js.Array[String]): Unit = js.native
}
