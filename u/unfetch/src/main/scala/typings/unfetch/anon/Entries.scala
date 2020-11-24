package typings.unfetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entries extends js.Object {
  
  def entries(): js.Array[js.Tuple2[String, String]] = js.native
  
  def get(key: String): js.UndefOr[String] = js.native
  
  def has(key: String): Boolean = js.native
  
  def keys(): js.Array[String] = js.native
}
object Entries {
  
  @scala.inline
  def apply(
    entries: () => js.Array[js.Tuple2[String, String]],
    get: String => js.UndefOr[String],
    has: String => Boolean,
    keys: () => js.Array[String]
  ): Entries = {
    val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys))
    __obj.asInstanceOf[Entries]
  }
  
  @scala.inline
  implicit class EntriesOps[Self <: Entries] (val x: Self) extends AnyVal {
    
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
    def setEntries(value: () => js.Array[js.Tuple2[String, String]]): Self = this.set("entries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: String => js.UndefOr[String]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeys(value: () => js.Array[String]): Self = this.set("keys", js.Any.fromFunction0(value))
  }
}
