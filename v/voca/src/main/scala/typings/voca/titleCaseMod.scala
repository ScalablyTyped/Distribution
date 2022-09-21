package typings.voca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object titleCaseMod {
  
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(subject: String): String = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(subject: String, ignoreWords: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], ignoreWords.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, ignoreWords: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], ignoreWords.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("voca/title_case", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
