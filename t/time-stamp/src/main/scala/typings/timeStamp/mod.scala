package typings.timeStamp

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("time-stamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[String]
  inline def default(pattern: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(pattern: String, date: Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pattern.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(pattern: Unit, date: Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pattern.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(pattern: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(pattern: Date, date: Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pattern.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def utc(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")().asInstanceOf[String]
  inline def utc(pattern: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def utc(pattern: String, date: Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(pattern.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def utc(pattern: Unit, date: Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(pattern.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def utc(pattern: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def utc(pattern: Date, date: Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(pattern.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
}
