package typings.urbanDictionary

import typings.urbanDictionary.mod.WordDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Entries extends StObject {
    
    var entries: js.Array[WordDefinition]
    
    var sounds: js.Array[String]
    
    var tags: js.Array[String]
  }
  object Entries {
    
    @scala.inline
    def apply(entries: js.Array[WordDefinition], sounds: js.Array[String], tags: js.Array[String]): Entries = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], sounds = sounds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entries]
    }
    
    @scala.inline
    implicit class EntriesMutableBuilder[Self <: Entries] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntries(value: js.Array[WordDefinition]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesVarargs(value: WordDefinition*): Self = StObject.set(x, "entries", js.Array(value :_*))
      
      @scala.inline
      def setSounds(value: js.Array[String]): Self = StObject.set(x, "sounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoundsVarargs(value: String*): Self = StObject.set(x, "sounds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
}
