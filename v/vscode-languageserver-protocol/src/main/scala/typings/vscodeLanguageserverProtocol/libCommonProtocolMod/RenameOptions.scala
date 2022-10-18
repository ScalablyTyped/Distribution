package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameOptions
  extends StObject
     with WorkDoneProgressOptions {
  
  /**
    * Renames should be checked and tested before being executed.
    *
    * @since version 3.12.0
    */
  var prepareProvider: js.UndefOr[Boolean] = js.undefined
}
object RenameOptions {
  
  inline def apply(): RenameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenameOptions]
  }
  
  extension [Self <: RenameOptions](x: Self) {
    
    inline def setPrepareProvider(value: Boolean): Self = StObject.set(x, "prepareProvider", value.asInstanceOf[js.Any])
    
    inline def setPrepareProviderUndefined: Self = StObject.set(x, "prepareProvider", js.undefined)
  }
}
