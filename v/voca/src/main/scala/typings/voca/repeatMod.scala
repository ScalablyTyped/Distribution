package typings.voca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repeatMod {
  
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(subject: String): String = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(subject: String, times: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], times.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(subject: Unit, times: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], times.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("voca/repeat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
