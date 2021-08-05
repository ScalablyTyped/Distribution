package typings.urbanDictionary

import typings.std.Error
import typings.urbanDictionary.anon.Entries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("urban-dictionary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defid(id: Double): js.Promise[WordDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("defid")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WordDefinition]]
  inline def defid(id: Double, callback: js.Function2[/* error */ Error, /* object */ WordDefinition, js.Any]): js.Promise[WordDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("defid")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WordDefinition]]
  
  inline def random(): js.Promise[WordDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[js.Promise[WordDefinition]]
  inline def random(callback: js.Function2[/* error */ Error, /* object */ WordDefinition, js.Any]): js.Promise[WordDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WordDefinition]]
  
  inline def term(word: String): js.Promise[Entries] = ^.asInstanceOf[js.Dynamic].applyDynamic("term")(word.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Entries]]
  inline def term(
    word: String,
    callback: js.Function4[
      /* error */ Error, 
      /* entries */ js.Array[WordDefinition], 
      /* tags */ js.Array[String], 
      /* sounds */ js.Array[String], 
      js.Any
    ]
  ): js.Promise[Entries] = (^.asInstanceOf[js.Dynamic].applyDynamic("term")(word.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Entries]]
  
  trait WordDefinition extends StObject {
    
    var author: String
    
    var current_vote: String
    
    var defid: Double
    
    var definition: String
    
    var example: String
    
    var permalink: String
    
    var sound_urls: js.Array[String]
    
    var thumbs_down: Double
    
    var thumbs_up: Double
    
    var word: String
    
    var written_on: String
  }
  object WordDefinition {
    
    inline def apply(
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
    
    extension [Self <: WordDefinition](x: Self) {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setCurrent_vote(value: String): Self = StObject.set(x, "current_vote", value.asInstanceOf[js.Any])
      
      inline def setDefid(value: Double): Self = StObject.set(x, "defid", value.asInstanceOf[js.Any])
      
      inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setExample(value: String): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
      
      inline def setPermalink(value: String): Self = StObject.set(x, "permalink", value.asInstanceOf[js.Any])
      
      inline def setSound_urls(value: js.Array[String]): Self = StObject.set(x, "sound_urls", value.asInstanceOf[js.Any])
      
      inline def setSound_urlsVarargs(value: String*): Self = StObject.set(x, "sound_urls", js.Array(value :_*))
      
      inline def setThumbs_down(value: Double): Self = StObject.set(x, "thumbs_down", value.asInstanceOf[js.Any])
      
      inline def setThumbs_up(value: Double): Self = StObject.set(x, "thumbs_up", value.asInstanceOf[js.Any])
      
      inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
      
      inline def setWritten_on(value: String): Self = StObject.set(x, "written_on", value.asInstanceOf[js.Any])
    }
  }
}
