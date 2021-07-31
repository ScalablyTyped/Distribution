package typings.terminalKit.terminalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileInputOptions
  extends StObject
     with InputFieldOptions {
  
  var baseDir: String
}
object IFileInputOptions {
  
  @scala.inline
  def apply(baseDir: String): IFileInputOptions = {
    val __obj = js.Dynamic.literal(baseDir = baseDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileInputOptions]
  }
  
  @scala.inline
  implicit class IFileInputOptionsMutableBuilder[Self <: IFileInputOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
  }
}
