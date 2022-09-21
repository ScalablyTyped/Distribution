package typings.xmlNameValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xml-name-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def name(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("name")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def qname(qname: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("qname")(qname.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
