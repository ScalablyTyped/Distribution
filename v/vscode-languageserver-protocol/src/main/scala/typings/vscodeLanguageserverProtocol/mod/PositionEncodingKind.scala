package typings.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PositionEncodingKind {
  
  /**
    * Character offsets count UTF-16 code units.
    *
    * This is the default and must always be supported
    * by servers
    */
  @JSImport("vscode-languageserver-protocol", "PositionEncodingKind.UTF16")
  @js.native
  val UTF16: typings.vscodeLanguageserverProtocol.libCommonProtocolMod.PositionEncodingKind = js.native
  
  /**
    * Character offsets count UTF-32 code units.
    *
    * Implementation note: these are the same as Unicode code points,
    * so this `PositionEncodingKind` may also be used for an
    * encoding-agnostic representation of character offsets.
    */
  @JSImport("vscode-languageserver-protocol", "PositionEncodingKind.UTF32")
  @js.native
  val UTF32: typings.vscodeLanguageserverProtocol.libCommonProtocolMod.PositionEncodingKind = js.native
  
  /**
    * Character offsets count UTF-8 code units.
    */
  @JSImport("vscode-languageserver-protocol", "PositionEncodingKind.UTF8")
  @js.native
  val UTF8: typings.vscodeLanguageserverProtocol.libCommonProtocolMod.PositionEncodingKind = js.native
}
