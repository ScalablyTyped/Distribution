package typings.urbanDictionary.anon

import typings.urbanDictionary.mod.WordDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entries extends js.Object {
  
  var entries: js.Array[WordDefinition] = js.native
  
  var sounds: js.Array[String] = js.native
  
  var tags: js.Array[String] = js.native
}
object Entries {
  
  @scala.inline
  def apply(entries: js.Array[WordDefinition], sounds: js.Array[String], tags: js.Array[String]): Entries = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], sounds = sounds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
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
    def setEntriesVarargs(value: WordDefinition*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[WordDefinition]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundsVarargs(value: String*): Self = this.set("sounds", js.Array(value :_*))
    
    @scala.inline
    def setSounds(value: js.Array[String]): Self = this.set("sounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
}
