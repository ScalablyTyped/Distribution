package typings.twemojiParser

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
  
  inline def parse(text: String): js.Array[EmojiEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[EmojiEntity]]
  inline def parse(text: String, options: ParsingOptions): js.Array[EmojiEntity] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[EmojiEntity]]
  
  inline def toCodePoints(unicodeSurrogates: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCodePoints")(unicodeSurrogates.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.twemojiParser.twemojiParserStrings.png
    - typings.twemojiParser.twemojiParserStrings.svg
  */
  trait AssetType extends StObject
  object AssetType {
    
    inline def png: typings.twemojiParser.twemojiParserStrings.png = "png".asInstanceOf[typings.twemojiParser.twemojiParserStrings.png]
    
    inline def svg: typings.twemojiParser.twemojiParserStrings.svg = "svg".asInstanceOf[typings.twemojiParser.twemojiParserStrings.svg]
  }
  
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
    
    inline def apply(indices: js.Tuple2[Double, Double], text: String, `type`: /* "emoji" */ String, url: String): EmojiEntity = {
      val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmojiEntity]
    }
    
    extension [Self <: EmojiEntity](x: Self) {
      
      inline def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "emoji" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsingOptions extends StObject {
    
    /**
      * @default 'svg'
      */
    var assetType: js.UndefOr[AssetType] = js.undefined
    
    var buildUrl: js.UndefOr[js.Function2[/* codepoints */ String, /* assetType */ AssetType, String]] = js.undefined
  }
  object ParsingOptions {
    
    inline def apply(): ParsingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParsingOptions]
    }
    
    extension [Self <: ParsingOptions](x: Self) {
      
      inline def setAssetType(value: AssetType): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
      
      inline def setAssetTypeUndefined: Self = StObject.set(x, "assetType", js.undefined)
      
      inline def setBuildUrl(value: (/* codepoints */ String, /* assetType */ AssetType) => String): Self = StObject.set(x, "buildUrl", js.Any.fromFunction2(value))
      
      inline def setBuildUrlUndefined: Self = StObject.set(x, "buildUrl", js.undefined)
    }
  }
}
