package typings.urlJoin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("url-join", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(parts: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(parts.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  inline def default(parts: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(parts.asInstanceOf[js.Any]).asInstanceOf[String]
}
