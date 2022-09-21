package typings.voca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchesMod {
  
  inline def apply(): Boolean = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Boolean]
  inline def apply(subject: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply(subject: String, pattern: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(subject: String, pattern: String, flags: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(subject: String, pattern: js.RegExp): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(subject: String, pattern: js.RegExp, flags: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(subject: String, pattern: Unit, flags: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(subject: Unit, pattern: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(subject: Unit, pattern: String, flags: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(subject: Unit, pattern: js.RegExp): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(subject: Unit, pattern: js.RegExp, flags: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(subject: Unit, pattern: Unit, flags: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("voca/matches", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
