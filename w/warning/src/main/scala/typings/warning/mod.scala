package typings.warning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(condition: Any, format: String, extra: Any*): Unit = (^.asInstanceOf[js.Dynamic].apply((scala.List(condition.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).`++`(extra.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  inline def apply(condition: Any, format: Unit, extra: Any*): Unit = (^.asInstanceOf[js.Dynamic].apply((scala.List(condition.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).`++`(extra.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  
  @JSImport("warning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
