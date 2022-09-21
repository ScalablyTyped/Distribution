package typings.voca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliceMod {
  
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(subject: String): String = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(subject: String, start: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: String, start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: String, start: Unit, end: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, start: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, start: Unit, end: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("voca/slice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
