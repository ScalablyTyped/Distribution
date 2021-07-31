package typings.winrt.Windows.Storage.Streams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnicodeEncoding extends StObject
@JSGlobal("Windows.Storage.Streams.UnicodeEncoding")
@js.native
object UnicodeEncoding extends StObject {
  
  @js.native
  sealed trait utf16BE
    extends StObject
       with UnicodeEncoding
  
  @js.native
  sealed trait utf16LE
    extends StObject
       with UnicodeEncoding
  
  @js.native
  sealed trait utf8
    extends StObject
       with UnicodeEncoding
}
