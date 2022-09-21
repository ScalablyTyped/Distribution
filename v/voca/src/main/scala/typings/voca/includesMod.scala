package typings.voca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object includesMod {
  
  inline def apply(): Boolean = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Boolean]
  inline def apply(subject: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply(subject: String, search: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], search.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(subject: String, search: String, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], search.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(subject: String, search: Unit, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], search.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(subject: Unit, search: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], search.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(subject: Unit, search: String, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], search.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(subject: Unit, search: Unit, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], search.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("voca/includes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
