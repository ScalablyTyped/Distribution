package typings.uid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singleMod {
  
  @JSImport("uid/single", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def uid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")().asInstanceOf[String]
  inline def uid(len: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")(len.asInstanceOf[js.Any]).asInstanceOf[String]
}
