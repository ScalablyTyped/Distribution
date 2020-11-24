package typings.stylableCore.cachedProcessFileMod

import typings.stylableCore.anon.Mtime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheItem[T] extends js.Object {
  
  var stat: Mtime = js.native
  
  var value: T = js.native
}
object CacheItem {
  
  @scala.inline
  def apply[T](stat: Mtime, value: T): CacheItem[T] = {
    val __obj = js.Dynamic.literal(stat = stat.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheItem[T]]
  }
  
  @scala.inline
  implicit class CacheItemOps[Self <: CacheItem[_], T] (val x: Self with CacheItem[T]) extends AnyVal {
    
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
    def setStat(value: Mtime): Self = this.set("stat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
