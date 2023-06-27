package typings.untildify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("untildify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(pathWithTilde: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathWithTilde.asInstanceOf[js.Any]).asInstanceOf[String]
}
