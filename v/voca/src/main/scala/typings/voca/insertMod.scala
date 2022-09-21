package typings.voca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object insertMod {
  
  // Manipulate
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(subject: String): String = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(subject: String, toInsert: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], toInsert.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: String, toInsert: String, position: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], toInsert.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: String, toInsert: Unit, position: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], toInsert.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, toInsert: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], toInsert.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, toInsert: String, position: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], toInsert.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, toInsert: Unit, position: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], toInsert.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("voca/insert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
