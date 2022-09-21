package typings.voca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchMod {
  
  inline def apply(): Double = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Double]
  inline def apply(subject: String): Double = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(subject: String, pattern: String): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: String, pattern: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: String, pattern: js.RegExp): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: String, pattern: js.RegExp, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: String, pattern: Unit, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: Unit, pattern: String): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: Unit, pattern: String, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: Unit, pattern: js.RegExp): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: Unit, pattern: js.RegExp, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: Unit, pattern: Unit, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("voca/search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
