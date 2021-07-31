package typings.vegaTypings.anon

import typings.vegaTypings.markMod._Clip
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path
  extends StObject
     with _Clip {
  
  var path: String | SignalRef
}
object Path {
  
  @scala.inline
  def apply(path: String | SignalRef): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String | SignalRef): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
