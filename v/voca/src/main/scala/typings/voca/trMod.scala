package typings.voca

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trMod {
  
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(subject: String): String = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(subject: String, from: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: String, from: String, to: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: String, from: StringDictionary[String]): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: String, from: Unit, to: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, from: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, from: String, to: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, from: StringDictionary[String]): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, from: Unit, to: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("voca/tr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
