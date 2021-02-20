package typings.textract

import typings.textract.textractStrings.ASCII7
import typings.textract.textractStrings.Latin1
import typings.textract.textractStrings.Symbol
import typings.textract.textractStrings.ZapfDingbats
import typings.textract.textractStrings.`UCS-2`
import typings.textract.textractStrings.`UTF-8`
import typings.textract.textractStrings.dos
import typings.textract.textractStrings.htmlmeta
import typings.textract.textractStrings.layout
import typings.textract.textractStrings.mac
import typings.textract.textractStrings.raw
import typings.textract.textractStrings.unix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cmd extends StObject {
    
    /**
      * `tesseract.lang` allows a quick means to provide the most popular tesseract option,
      * but if you need to configure more options, you can simply pass `cmd`.
      * `cmd` is the string that matches the command-line options you want to pass to tesseract.
      * For instance, to provide language and psm,
      * you would pass `{ tesseract: { cmd:"-l chi_sim -psm 10" } }`
      */
    var cmd: String = js.native
  }
  object Cmd {
    
    @scala.inline
    def apply(cmd: String): Cmd = {
      val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cmd]
    }
    
    @scala.inline
    implicit class CmdMutableBuilder[Self <: Cmd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Crop extends StObject {
    
    var crop: js.UndefOr[H] = js.native
    
    /**
      * @default "UTF-8"
      */
    var encoding: js.UndefOr[`UCS-2` | ASCII7 | Latin1 | `UTF-8` | ZapfDingbats | Symbol] = js.native
    
    var eol: js.UndefOr[unix | dos | mac] = js.native
    
    var firstPage: js.UndefOr[Double] = js.native
    
    var lastPage: js.UndefOr[Double] = js.native
    
    /**
      * Do not change unless you know what you are doing!
      * @default "raw"
      */
    var layout: js.UndefOr[typings.textract.textractStrings.layout | raw | htmlmeta] = js.native
    
    var ownerPassword: js.UndefOr[String] = js.native
    
    var resolution: js.UndefOr[Double] = js.native
    
    /**
      * @default true
      */
    var splitPages: js.UndefOr[Boolean] = js.native
    
    var userPassword: js.UndefOr[String] = js.native
  }
  object Crop {
    
    @scala.inline
    def apply(): Crop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Crop]
    }
    
    @scala.inline
    implicit class CropMutableBuilder[Self <: Crop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrop(value: H): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      @scala.inline
      def setEncoding(value: `UCS-2` | ASCII7 | Latin1 | `UTF-8` | ZapfDingbats | Symbol): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEol(value: unix | dos | mac): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      @scala.inline
      def setFirstPage(value: Double): Self = StObject.set(x, "firstPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstPageUndefined: Self = StObject.set(x, "firstPage", js.undefined)
      
      @scala.inline
      def setLastPage(value: Double): Self = StObject.set(x, "lastPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastPageUndefined: Self = StObject.set(x, "lastPage", js.undefined)
      
      @scala.inline
      def setLayout(value: layout | raw | htmlmeta): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setOwnerPassword(value: String): Self = StObject.set(x, "ownerPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerPasswordUndefined: Self = StObject.set(x, "ownerPassword", js.undefined)
      
      @scala.inline
      def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      @scala.inline
      def setSplitPages(value: Boolean): Self = StObject.set(x, "splitPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitPagesUndefined: Self = StObject.set(x, "splitPages", js.undefined)
      
      @scala.inline
      def setUserPassword(value: String): Self = StObject.set(x, "userPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPasswordUndefined: Self = StObject.set(x, "userPassword", js.undefined)
    }
  }
  
  @js.native
  trait H extends StObject {
    
    var h: Double = js.native
    
    var w: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object H {
    
    @scala.inline
    def apply(h: Double, w: Double, x: Double, y: Double): H = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[H]
    }
    
    @scala.inline
    implicit class HMutableBuilder[Self <: H] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Lang extends StObject {
    
    /**
      *  A pass-through to tesseract allowing for setting of language for extraction.
      */
    var lang: String = js.native
  }
  object Lang {
    
    @scala.inline
    def apply(lang: String): Lang = {
      val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lang]
    }
    
    @scala.inline
    implicit class LangMutableBuilder[Self <: Lang] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    }
  }
}
