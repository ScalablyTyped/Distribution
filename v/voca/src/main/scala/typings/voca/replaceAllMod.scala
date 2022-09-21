package typings.voca

import typings.voca.mod.ReplacementFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replaceAllMod {
  
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(subject: String): String = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(subject: String, pattern: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: String, pattern: String, replacement: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: String, pattern: String, replacement: ReplacementFunction): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: String, pattern: js.RegExp): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: String, pattern: js.RegExp, replacement: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: String, pattern: js.RegExp, replacement: ReplacementFunction): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: String, pattern: Unit, replacement: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: String, pattern: Unit, replacement: ReplacementFunction): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, pattern: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, pattern: String, replacement: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, pattern: String, replacement: ReplacementFunction): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, pattern: js.RegExp): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, pattern: js.RegExp, replacement: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, pattern: js.RegExp, replacement: ReplacementFunction): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, pattern: Unit, replacement: String): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, pattern: Unit, replacement: ReplacementFunction): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("voca/replace_all", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
