package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverTypes.mod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _PrepareRenameResult extends StObject
object _PrepareRenameResult {
  
  inline def DefaultBehavior(defaultBehavior: Boolean): typings.vscodeLanguageserverProtocol.anon.DefaultBehavior = {
    val __obj = js.Dynamic.literal(defaultBehavior = defaultBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageserverProtocol.anon.DefaultBehavior]
  }
  
  inline def Placeholder(placeholder: String, range: Range): typings.vscodeLanguageserverProtocol.anon.Placeholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vscodeLanguageserverProtocol.anon.Placeholder]
  }
}
