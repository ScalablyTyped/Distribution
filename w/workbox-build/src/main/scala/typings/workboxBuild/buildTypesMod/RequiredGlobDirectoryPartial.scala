package typings.workboxBuild.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequiredGlobDirectoryPartial extends StObject {
  
  /**
    * The local directory you wish to match `globPatterns` against. The path is
    * relative to the current directory.
    */
  var globDirectory: String
}
object RequiredGlobDirectoryPartial {
  
  inline def apply(globDirectory: String): RequiredGlobDirectoryPartial = {
    val __obj = js.Dynamic.literal(globDirectory = globDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredGlobDirectoryPartial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredGlobDirectoryPartial] (val x: Self) extends AnyVal {
    
    inline def setGlobDirectory(value: String): Self = StObject.set(x, "globDirectory", value.asInstanceOf[js.Any])
  }
}
