package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.anon.Rest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Base64VLQFormat")
@js.native
class Base64VLQFormat ()
  extends StObject
     with typings.typescriptServices.TypeScript.Base64VLQFormat
object Base64VLQFormat {
  
  @JSGlobal("TypeScript.Base64VLQFormat")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def decode(inString: String): Rest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(inString.asInstanceOf[js.Any]).asInstanceOf[Rest]
  
  /* static member */
  inline def encode(inValue: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(inValue.asInstanceOf[js.Any]).asInstanceOf[String]
}
