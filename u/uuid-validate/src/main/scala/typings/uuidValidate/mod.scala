package typings.uuidValidate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(uuid: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(uuid.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply(uuid: String, version: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(uuid.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("uuid-validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def version(uuid: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("version")(uuid.asInstanceOf[js.Any]).asInstanceOf[Double]
}
