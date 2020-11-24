package typings.urbanDictionary.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WordDefinition extends js.Object {
  
  var author: String = js.native
  
  var current_vote: String = js.native
  
  var defid: Double = js.native
  
  var definition: String = js.native
  
  var example: String = js.native
  
  var permalink: String = js.native
  
  var sound_urls: js.Array[String] = js.native
  
  var thumbs_down: Double = js.native
  
  var thumbs_up: Double = js.native
  
  var word: String = js.native
  
  var written_on: String = js.native
}
object WordDefinition {
  
  @scala.inline
  def apply(
    author: String,
    current_vote: String,
    defid: Double,
    definition: String,
    example: String,
    permalink: String,
    sound_urls: js.Array[String],
    thumbs_down: Double,
    thumbs_up: Double,
    word: String,
    written_on: String
  ): WordDefinition = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], current_vote = current_vote.asInstanceOf[js.Any], defid = defid.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], example = example.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], sound_urls = sound_urls.asInstanceOf[js.Any], thumbs_down = thumbs_down.asInstanceOf[js.Any], thumbs_up = thumbs_up.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any], written_on = written_on.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordDefinition]
  }
  
  @scala.inline
  implicit class WordDefinitionOps[Self <: WordDefinition] (val x: Self) extends AnyVal {
    
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
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent_vote(value: String): Self = this.set("current_vote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefid(value: Double): Self = this.set("defid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: String): Self = this.set("definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExample(value: String): Self = this.set("example", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermalink(value: String): Self = this.set("permalink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSound_urlsVarargs(value: String*): Self = this.set("sound_urls", js.Array(value :_*))
    
    @scala.inline
    def setSound_urls(value: js.Array[String]): Self = this.set("sound_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbs_down(value: Double): Self = this.set("thumbs_down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbs_up(value: Double): Self = this.set("thumbs_up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWord(value: String): Self = this.set("word", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritten_on(value: String): Self = this.set("written_on", value.asInstanceOf[js.Any])
  }
}
