package typings.voca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object countSubstringsMod {
  
  inline def apply(): Double = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Double]
  inline def apply(subject: String): Double = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(subject: String, substring: String): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], substring.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: Unit, substring: String): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], substring.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("voca/count_substrings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
