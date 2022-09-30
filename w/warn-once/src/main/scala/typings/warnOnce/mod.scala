package typings.warnOnce

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("warn-once", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(condition: Boolean, message: Any, optionalParams: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")((scala.List(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  inline def default(condition: Boolean, message: Unit, optionalParams: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")((scala.List(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
}
