package typings.wordpressNux

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("@wordpress/nux/store/actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def disableTips(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableTips")().asInstanceOf[Unit]
  
  @scala.inline
  def dismissTip(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissTip")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def enableTips(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableTips")().asInstanceOf[Unit]
  
  @scala.inline
  def triggerGuide(tipIds: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerGuide")(tipIds.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
