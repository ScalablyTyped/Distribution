package typings.typeformEmbed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setAutoCloseMod {
  
  @JSImport("@typeform/embed/types/utils/set-auto-close", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setAutoClose(embedId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoClose")(embedId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setAutoClose(embedId: String, autoClose: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAutoClose")(embedId.asInstanceOf[js.Any], autoClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setAutoClose(embedId: String, autoClose: Boolean, closeCallback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAutoClose")(embedId.asInstanceOf[js.Any], autoClose.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setAutoClose(embedId: String, autoClose: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAutoClose")(embedId.asInstanceOf[js.Any], autoClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setAutoClose(embedId: String, autoClose: Double, closeCallback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAutoClose")(embedId.asInstanceOf[js.Any], autoClose.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setAutoClose(embedId: String, autoClose: Unit, closeCallback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAutoClose")(embedId.asInstanceOf[js.Any], autoClose.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
