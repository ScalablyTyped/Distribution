package typings.voca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object substrMod {
  
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(subject: String): String = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(subject: String, start: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: String, start: Double, length: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: String, start: Unit, length: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, start: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, start: Double, length: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, start: Unit, length: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("voca/substr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
