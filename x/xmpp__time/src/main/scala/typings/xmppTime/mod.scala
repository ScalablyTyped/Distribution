package typings.xmppTime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@xmpp/time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def date(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[String]
  inline def date(date: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def date(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def datetime(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("datetime")().asInstanceOf[String]
  inline def datetime(date: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def datetime(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def offset(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")().asInstanceOf[String]
  inline def offset(date: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def offset(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def time(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("time")().asInstanceOf[String]
  inline def time(date: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def time(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(date.asInstanceOf[js.Any]).asInstanceOf[String]
}
