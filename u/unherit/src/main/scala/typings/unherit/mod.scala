package typings.unherit

import typings.unherit.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unherit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unherit[Class /* <: Instantiable */](Super: Class): Class = ^.asInstanceOf[js.Dynamic].applyDynamic("unherit")(Super.asInstanceOf[js.Any]).asInstanceOf[Class]
}
