package typings.vscodeLanguageclient.mod

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
  @JSImport("vscode-languageclient", "PositionEncodingKind.UTF16")
  @js.native
  val UTF16: typings.vscodeLanguageserverProtocol.protocolMod.PositionEncodingKind = js.native
  
  /**
    * Character offsets count UTF-32 code units.
    *
    * Implementation note: these are the same as Unicode code points,
    * so this `PositionEncodingKind` may also be used for an
    * encoding-agnostic representation of character offsets.
    */
  @JSImport("vscode-languageclient", "PositionEncodingKind.UTF32")
  @js.native
  val UTF32: typings.vscodeLanguageserverProtocol.protocolMod.PositionEncodingKind = js.native
  
  /**
    * Character offsets count UTF-8 code units.
    */
  @JSImport("vscode-languageclient", "PositionEncodingKind.UTF8")
  @js.native
  val UTF8: typings.vscodeLanguageserverProtocol.protocolMod.PositionEncodingKind = js.native
}
