package typings.urbanDictionary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("urban-dictionary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def autocomplete(term: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("autocomplete")(term.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def autocomplete(term: String, callback: js.Function2[/* error */ js.Error, /* results */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autocomplete")(term.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def autocompleteExtra(term: String): js.Promise[js.Array[AutocompleteExtraObject]] = ^.asInstanceOf[js.Dynamic].applyDynamic("autocompleteExtra")(term.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[AutocompleteExtraObject]]]
  inline def autocompleteExtra(
    term: String,
    callback: js.Function2[/* error */ js.Error, /* results */ js.Array[AutocompleteExtraObject], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autocompleteExtra")(term.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def define(term: String): js.Promise[js.Array[DefinitionObject]] = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(term.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[DefinitionObject]]]
  inline def define(
    term: String,
    callback: js.Function2[/* error */ js.Error, /* results */ js.Array[DefinitionObject], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(term.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getDefinitionByDefid(id: Double): js.Promise[DefinitionObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefinitionByDefid")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DefinitionObject]]
  inline def getDefinitionByDefid(id: Double, callback: js.Function2[/* error */ js.Error, /* results */ DefinitionObject, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefinitionByDefid")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def random(): js.Promise[js.Array[DefinitionObject]] = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[js.Promise[js.Array[DefinitionObject]]]
  inline def random(callback: js.Function2[/* error */ js.Error, /* results */ js.Array[DefinitionObject], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def wordsOfTheDay(): js.Promise[js.Array[DefinitionObject]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wordsOfTheDay")().asInstanceOf[js.Promise[js.Array[DefinitionObject]]]
  inline def wordsOfTheDay(callback: js.Function2[/* error */ js.Error, /* results */ js.Array[DefinitionObject], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("wordsOfTheDay")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait AutocompleteExtraObject extends StObject {
    
    var preview: String
    
    var term: String
  }
  object AutocompleteExtraObject {
    
    inline def apply(preview: String, term: String): AutocompleteExtraObject = {
      val __obj = js.Dynamic.literal(preview = preview.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteExtraObject]
    }
    
    extension [Self <: AutocompleteExtraObject](x: Self) {
      
      inline def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefinitionObject extends StObject {
    
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
  object DefinitionObject {
    
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
    ): DefinitionObject = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], current_vote = current_vote.asInstanceOf[js.Any], defid = defid.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], example = example.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], sound_urls = sound_urls.asInstanceOf[js.Any], thumbs_down = thumbs_down.asInstanceOf[js.Any], thumbs_up = thumbs_up.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any], written_on = written_on.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefinitionObject]
    }
    
    extension [Self <: DefinitionObject](x: Self) {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setCurrent_vote(value: String): Self = StObject.set(x, "current_vote", value.asInstanceOf[js.Any])
      
      inline def setDefid(value: Double): Self = StObject.set(x, "defid", value.asInstanceOf[js.Any])
      
      inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setExample(value: String): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
      
      inline def setPermalink(value: String): Self = StObject.set(x, "permalink", value.asInstanceOf[js.Any])
      
      inline def setSound_urls(value: js.Array[String]): Self = StObject.set(x, "sound_urls", value.asInstanceOf[js.Any])
      
      inline def setSound_urlsVarargs(value: String*): Self = StObject.set(x, "sound_urls", js.Array(value*))
      
      inline def setThumbs_down(value: Double): Self = StObject.set(x, "thumbs_down", value.asInstanceOf[js.Any])
      
      inline def setThumbs_up(value: Double): Self = StObject.set(x, "thumbs_up", value.asInstanceOf[js.Any])
      
      inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
      
      inline def setWritten_on(value: String): Self = StObject.set(x, "written_on", value.asInstanceOf[js.Any])
    }
  }
}
