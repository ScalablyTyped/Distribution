package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersServerCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerCapabilities[T]
  extends StObject
     with _ServerCapabilities[T]
     with WorkspaceFoldersServerCapabilities
object ServerCapabilities {
  
  inline def apply[T](): ServerCapabilities[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerCapabilities[T]]
  }
}
