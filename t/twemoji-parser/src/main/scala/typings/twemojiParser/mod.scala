package typings.twemojiParser

import typings.twemojiParser.twemojiParserStrings.png
import typings.twemojiParser.twemojiParserStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("twemoji-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twemoji-parser", "TypeName")
  @js.native
  val TypeName: /* "emoji" */ String = js.native
  
  @scala.inline
  def parse(text: String): js.Array[EmojiEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[EmojiEntity]]
  @scala.inline
  def parse(text: String, options: ParsingOptions): js.Array[EmojiEntity] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[EmojiEntity]]
  
  @scala.inline
  def toCodePoints(unicodeSurrogates: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCodePoints")(unicodeSurrogates.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  trait EmojiEntity extends StObject {
    
    /**
      * [startIndex: number, lastIndex: number]
      */
    var indices: js.Tuple2[Double, Double]
    
    var text: String
    
    /**
      * @default 'emoji'
      */
    var `type`: /* "emoji" */ String
    
    /**
      * @default ''
      */
    var url: String
  }
  object EmojiEntity {
    
    @scala.inline
    def apply(indices: js.Tuple2[Double, Double], text: String, `type`: /* "emoji" */ String, url: String): EmojiEntity = {
      val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmojiEntity]
    }
    
    @scala.inline
    implicit class EmojiEntityMutableBuilder[Self <: EmojiEntity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: /* "emoji" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsingOptions extends StObject {
    
    /**
      * @default 'svg'
      */
    var assetType: js.UndefOr[png | svg] = js.undefined
    
    var buildUrl: js.UndefOr[js.Function2[/* codepoints */ String, /* assetType */ String, String]] = js.undefined
  }
  object ParsingOptions {
    
    @scala.inline
    def apply(): ParsingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParsingOptions]
    }
    
    @scala.inline
    implicit class ParsingOptionsMutableBuilder[Self <: ParsingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssetType(value: png | svg): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetTypeUndefined: Self = StObject.set(x, "assetType", js.undefined)
      
      @scala.inline
      def setBuildUrl(value: (/* codepoints */ String, /* assetType */ String) => String): Self = StObject.set(x, "buildUrl", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBuildUrlUndefined: Self = StObject.set(x, "buildUrl", js.undefined)
    }
  }
}
