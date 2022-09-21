package typings.voca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object capitalizeMod {
  
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(subject: String): String = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(subject: String, restToLower: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], restToLower.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, restToLower: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], restToLower.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("voca/capitalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
