package typings.stylableCore.anon

import typings.stylableCore.cachedProcessFileMod.MinimalFS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fs extends StObject {
  
  var fs: MinimalFS = js.native
  
  def requireModule(id: String): js.Any = js.native
  
  def resolvePath(_ctx: String, path: String): String = js.native
}
object Fs {
  
  @scala.inline
  def apply(fs: MinimalFS, requireModule: String => js.Any, resolvePath: (String, String) => String): Fs = {
    val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any], requireModule = js.Any.fromFunction1(requireModule), resolvePath = js.Any.fromFunction2(resolvePath))
    __obj.asInstanceOf[Fs]
  }
  
  @scala.inline
  implicit class FsMutableBuilder[Self <: Fs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFs(value: MinimalFS): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireModule(value: String => js.Any): Self = StObject.set(x, "requireModule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolvePath(value: (String, String) => String): Self = StObject.set(x, "resolvePath", js.Any.fromFunction2(value))
  }
}
