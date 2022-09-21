package typings.v8flags

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(cb: js.Function2[/* err */ Any, /* flags */ js.Array[String], Unit]): Unit = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("v8flags", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("v8flags", "configPath")
  @js.native
  val configPath: String = js.native
  
  @JSImport("v8flags", "configfile")
  @js.native
  val configfile: String = js.native
}
