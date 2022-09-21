package typings.voca

import typings.voca.mod.WordWrapOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordWrapMod {
  
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(subject: String): String = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(subject: String, options: WordWrapOptions): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, options: WordWrapOptions): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("voca/word_wrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
