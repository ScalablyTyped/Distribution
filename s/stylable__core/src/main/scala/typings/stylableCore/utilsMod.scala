package typings.stylableCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@stylable/core/cjs/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deprecated(staticMessage: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deprecated")(staticMessage.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def filename2varname(filename: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("filename2varname")(filename.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def string2varname(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("string2varname")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stripQuotation(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripQuotation")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
