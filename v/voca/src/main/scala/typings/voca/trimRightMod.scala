package typings.voca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trimRightMod {
  
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(subject: String): String = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(subject: String, whitespace: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], whitespace.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, whitespace: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], whitespace.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("voca/trim_right", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
