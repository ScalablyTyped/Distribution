package typings.stylableCore.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyframesMap extends js.Object {
  
  var keyframesMap: Record[String, String] = js.native
  
  var namedMap: Record[String, String] = js.native
}
object KeyframesMap {
  
  @scala.inline
  def apply(keyframesMap: Record[String, String], namedMap: Record[String, String]): KeyframesMap = {
    val __obj = js.Dynamic.literal(keyframesMap = keyframesMap.asInstanceOf[js.Any], namedMap = namedMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframesMap]
  }
  
  @scala.inline
  implicit class KeyframesMapOps[Self <: KeyframesMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeyframesMap(value: Record[String, String]): Self = this.set("keyframesMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedMap(value: Record[String, String]): Self = this.set("namedMap", value.asInstanceOf[js.Any])
  }
}
