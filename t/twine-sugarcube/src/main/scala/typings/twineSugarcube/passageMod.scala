package typings.twineSugarcube

import typings.twineSugarcube.extensionsMod.global.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object passageMod {
  
  trait Passage
    extends StObject
       with PassageBase {
    
    /**
      * Returns the description of the passage (created from either an excerpt of the passage or the
      * Config.passages.descriptions object).
      * @since 2.0.0
      */
    def description(): String
    
    /**
      * The DOM ID of the passage (created from the slugified passage title).
      * @since 2.0.0
      */
    var domId: String
    
    /**
      * Returns the text of the Passage object (similar to <Passage>.text) after applying nobr tag and image passage
      * processing to it.
      * @since 2.0.0
      */
    def processText(): String
  }
  object Passage {
    
    @scala.inline
    def apply(
      description: () => String,
      domId: String,
      processText: () => String,
      tags: Array[String],
      text: String,
      title: String
    ): Passage = {
      val __obj = js.Dynamic.literal(description = js.Any.fromFunction0(description), domId = domId.asInstanceOf[js.Any], processText = js.Any.fromFunction0(processText), tags = tags.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Passage]
    }
    
    @scala.inline
    implicit class PassageMutableBuilder[Self <: Passage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: () => String): Self = StObject.set(x, "description", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDomId(value: String): Self = StObject.set(x, "domId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessText(value: () => String): Self = StObject.set(x, "processText", js.Any.fromFunction0(value))
    }
  }
  
  trait PassageBase extends StObject {
    
    /**
      * The tags of the passage.
      * @since 2.0.0
      */
    var tags: Array[String]
    
    /**
      * The raw text of the passage.
      * @since 2.0.0
      */
    var text: String
    
    /**
      * The title of the passage.
      * @since 2.0.0
      */
    var title: String
  }
  object PassageBase {
    
    @scala.inline
    def apply(tags: Array[String], text: String, title: String): PassageBase = {
      val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[PassageBase]
    }
    
    @scala.inline
    implicit class PassageBaseMutableBuilder[Self <: PassageBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTags(value: Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
