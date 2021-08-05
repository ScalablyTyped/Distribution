package typings.timeout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def timeout(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")().asInstanceOf[String]
  inline def timeout(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def timeout(name: String, ms: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(name.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def timeout(name: String, ms: Double, callback: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(name.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def timeout(name: String, ms: Unit, callback: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(name.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def timeout(name: Unit, ms: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(name.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def timeout(name: Unit, ms: Double, callback: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(name.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def timeout(name: Unit, ms: Unit, callback: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(name.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
}
