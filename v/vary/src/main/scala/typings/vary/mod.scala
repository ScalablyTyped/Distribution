package typings.vary

import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(res: ServerResponse, field: String): Unit = (^.asInstanceOf[js.Dynamic].apply(res.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(res: ServerResponse, field: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].apply(res.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("vary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def append(header: String, field: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(header.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def append(header: String, field: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(header.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[String]
}
