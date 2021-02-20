package typings.urbanDictionary

import typings.std.Error
import typings.urbanDictionary.anon.Entries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("urban-dictionary", "defid")
  @js.native
  def defid(id: Double): js.Promise[WordDefinition] = js.native
  @JSImport("urban-dictionary", "defid")
  @js.native
  def defid(id: Double, callback: js.Function2[/* error */ Error, /* object */ WordDefinition, _]): js.Promise[WordDefinition] = js.native
  
  @JSImport("urban-dictionary", "random")
  @js.native
  def random(): js.Promise[WordDefinition] = js.native
  @JSImport("urban-dictionary", "random")
  @js.native
  def random(callback: js.Function2[/* error */ Error, /* object */ WordDefinition, _]): js.Promise[WordDefinition] = js.native
  
  @JSImport("urban-dictionary", "term")
  @js.native
  def term(word: String): js.Promise[Entries] = js.native
  @JSImport("urban-dictionary", "term")
  @js.native
  def term(
    word: String,
    callback: js.Function4[
      /* error */ Error, 
      /* entries */ js.Array[WordDefinition], 
      /* tags */ js.Array[String], 
      /* sounds */ js.Array[String], 
      _
    ]
  ): js.Promise[Entries] = js.native
  
  @js.native
  trait WordDefinition extends StObject {
    
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
    implicit class WordDefinitionMutableBuilder[Self <: WordDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrent_vote(value: String): Self = StObject.set(x, "current_vote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefid(value: Double): Self = StObject.set(x, "defid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExample(value: String): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermalink(value: String): Self = StObject.set(x, "permalink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSound_urls(value: js.Array[String]): Self = StObject.set(x, "sound_urls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSound_urlsVarargs(value: String*): Self = StObject.set(x, "sound_urls", js.Array(value :_*))
      
      @scala.inline
      def setThumbs_down(value: Double): Self = StObject.set(x, "thumbs_down", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbs_up(value: Double): Self = StObject.set(x, "thumbs_up", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritten_on(value: String): Self = StObject.set(x, "written_on", value.asInstanceOf[js.Any])
    }
  }
}
