package typings.vegaTypings.markMod

import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.encodeMod.PathEncodeEntry
import typings.vegaTypings.vegaTypingsStrings.path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMark
  extends StObject
     with BaseMark
     with Encodable[PathEncodeEntry]
     with Mark {
  
  var `type`: path
}
object PathMark {
  
  @scala.inline
  def apply(): PathMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("path")
    __obj.asInstanceOf[PathMark]
  }
  
  @scala.inline
  implicit class PathMarkMutableBuilder[Self <: PathMark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: path): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
