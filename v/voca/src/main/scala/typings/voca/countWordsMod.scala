package typings.voca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object countWordsMod {
  
  inline def apply(): Double = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Double]
  inline def apply(subject: String): Double = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(subject: String, pattern: String): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: String, pattern: String, flags: String): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: String, pattern: js.RegExp): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: String, pattern: js.RegExp, flags: String): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: String, pattern: Unit, flags: String): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: Unit, pattern: String): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: Unit, pattern: String, flags: String): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: Unit, pattern: js.RegExp): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: Unit, pattern: js.RegExp, flags: String): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: Unit, pattern: Unit, flags: String): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("voca/count_words", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
