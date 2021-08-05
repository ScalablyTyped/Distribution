package typings.tzFormat

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(date: Double): String = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(date: Double, offset: Double): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(date: Unit, offset: Double): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(date: Date): String = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(date: Date, offset: Double): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("tz-format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
