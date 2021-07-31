package typings.winrt.Windows.Security.Cryptography

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BinaryStringEncoding extends StObject
@JSGlobal("Windows.Security.Cryptography.BinaryStringEncoding")
@js.native
object BinaryStringEncoding extends StObject {
  
  @js.native
  sealed trait utf16BE
    extends StObject
       with BinaryStringEncoding
  
  @js.native
  sealed trait utf16LE
    extends StObject
       with BinaryStringEncoding
  
  @js.native
  sealed trait utf8
    extends StObject
       with BinaryStringEncoding
}
