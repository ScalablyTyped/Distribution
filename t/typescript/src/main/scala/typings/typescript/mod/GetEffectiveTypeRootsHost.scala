package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEffectiveTypeRootsHost extends StObject {
  
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ java.lang.String, Boolean]] = js.native
  
  var getCurrentDirectory: js.UndefOr[js.Function0[java.lang.String]] = js.native
}
object GetEffectiveTypeRootsHost {
  
  @scala.inline
  def apply(): GetEffectiveTypeRootsHost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEffectiveTypeRootsHost]
  }
  
  @scala.inline
  implicit class GetEffectiveTypeRootsHostMutableBuilder[Self <: GetEffectiveTypeRootsHost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryExists(value: /* directoryName */ java.lang.String => Boolean): Self = StObject.set(x, "directoryExists", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDirectoryExistsUndefined: Self = StObject.set(x, "directoryExists", js.undefined)
    
    @scala.inline
    def setGetCurrentDirectory(value: () => java.lang.String): Self = StObject.set(x, "getCurrentDirectory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentDirectoryUndefined: Self = StObject.set(x, "getCurrentDirectory", js.undefined)
  }
}
