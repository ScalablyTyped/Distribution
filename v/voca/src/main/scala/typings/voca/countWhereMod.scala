package typings.voca

import typings.voca.mod.CountPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object countWhereMod {
  
  inline def apply(): Double = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Double]
  inline def apply(subject: String): Double = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(subject: String, predicate: Unit, context: Any): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: String, predicate: CountPredicate): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: String, predicate: CountPredicate, context: Any): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: Unit, predicate: Unit, context: Any): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: Unit, predicate: CountPredicate): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(subject: Unit, predicate: CountPredicate, context: Any): Double = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("voca/count_where", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
