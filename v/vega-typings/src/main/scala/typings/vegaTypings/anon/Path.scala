package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecMarkMod._Clip
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path
  extends StObject
     with _Clip {
  
  var path: String | SignalRef
}
object Path {
  
  inline def apply(path: String | SignalRef): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  extension [Self <: Path](x: Self) {
    
    inline def setPath(value: String | SignalRef): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
