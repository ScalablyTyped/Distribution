package typings.timeStamp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("time-stamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[String]
  inline def default(pattern: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(pattern: String, date: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pattern.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(pattern: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(pattern: js.Date, date: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pattern.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(pattern: Unit, date: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pattern.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def utc(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")().asInstanceOf[String]
  inline def utc(pattern: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def utc(pattern: String, date: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(pattern.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def utc(pattern: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def utc(pattern: js.Date, date: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(pattern.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def utc(pattern: Unit, date: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(pattern.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
}
