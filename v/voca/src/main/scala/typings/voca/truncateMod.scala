package typings.voca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object truncateMod {
  
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(subject: String): String = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(subject: String, length: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: String, length: Double, end: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], length.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: String, length: Unit, end: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], length.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, length: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, length: Double, end: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], length.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, length: Unit, end: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], length.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("voca/truncate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
