package typings.voca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endsWithMod {
  
  // Query
  inline def apply(): Boolean = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Boolean]
  inline def apply(subject: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply(subject: String, end: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(subject: String, end: String, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], end.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(subject: String, end: Unit, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], end.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(subject: Unit, end: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(subject: Unit, end: String, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], end.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(subject: Unit, end: Unit, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], end.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("voca/ends_with", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
