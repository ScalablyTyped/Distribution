package typings.workboxBuild.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionalGlobDirectoryPartial extends StObject {
  
  /**
    * The local directory you wish to match `globPatterns` against. The path is
    * relative to the current directory.
    */
  var globDirectory: js.UndefOr[String] = js.undefined
}
object OptionalGlobDirectoryPartial {
  
  inline def apply(): OptionalGlobDirectoryPartial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalGlobDirectoryPartial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionalGlobDirectoryPartial] (val x: Self) extends AnyVal {
    
    inline def setGlobDirectory(value: String): Self = StObject.set(x, "globDirectory", value.asInstanceOf[js.Any])
    
    inline def setGlobDirectoryUndefined: Self = StObject.set(x, "globDirectory", js.undefined)
  }
}
