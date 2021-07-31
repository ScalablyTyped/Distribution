package typings.stylableCore.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mtime extends StObject {
  
  var mtime: Date
}
object Mtime {
  
  @scala.inline
  def apply(mtime: Date): Mtime = {
    val __obj = js.Dynamic.literal(mtime = mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mtime]
  }
  
  @scala.inline
  implicit class MtimeMutableBuilder[Self <: Mtime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMtime(value: Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
  }
}
