package typings.typedoc.anon

import typings.typedoc.optionsDeclarationMod.SourceFileMode.Modules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends StObject {
  
  var file: typings.typedoc.optionsDeclarationMod.SourceFileMode.File = js.native
  
  var modules: Modules = js.native
}
object File {
  
  @scala.inline
  def apply(file: typings.typedoc.optionsDeclarationMod.SourceFileMode.File, modules: Modules): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: typings.typedoc.optionsDeclarationMod.SourceFileMode.File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModules(value: Modules): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
  }
}
