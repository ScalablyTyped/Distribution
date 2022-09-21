package typings.voca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object charAtMod {
  
  // Chop
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(subject: String): String = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(subject: String, position: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, position: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("voca/char_at", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
