package typings.winrtUwp.Windows.Storage.Streams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnicodeEncoding extends StObject
/** Specifies the type of character encoding for a stream. */
@JSGlobal("Windows.Storage.Streams.UnicodeEncoding")
@js.native
object UnicodeEncoding extends StObject {
  
  /** The encoding is UTF-16, with the most significant byte first in the two eight-bit bytes. */
  @js.native
  sealed trait utf16BE
    extends StObject
       with UnicodeEncoding
  
  /** The encoding is UTF-16, with the least significant byte first in the two eight-bit bytes. */
  @js.native
  sealed trait utf16LE
    extends StObject
       with UnicodeEncoding
  
  /** The encoding is UTF-8. */
  @js.native
  sealed trait utf8
    extends StObject
       with UnicodeEncoding
}
