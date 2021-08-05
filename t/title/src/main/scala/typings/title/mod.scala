package typings.title

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(newtitle: String): Unit = ^.asInstanceOf[js.Dynamic].apply(newtitle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(pattern: String, newtitle: String): Unit = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], newtitle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("title", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
}
