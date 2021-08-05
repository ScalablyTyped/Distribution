package typings.textversionjs

import typings.textversionjs.textversionjsStrings.hashify
import typings.textversionjs.textversionjsStrings.indentation
import typings.textversionjs.textversionjsStrings.linebreak
import typings.textversionjs.textversionjsStrings.underline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(html: String): String = ^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(html: String, styleConfig: styleConfig): String = (^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any], styleConfig.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("textversionjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type imgProcess = js.Function2[/* src */ String, /* alt */ String, String]
  
  type linkProcess = js.Function2[/* href */ String, /* linkText */ String, String]
  
  trait styleConfig extends StObject {
    
    var headingStyle: js.UndefOr[underline | linebreak | hashify] = js.undefined
    
    var imgProcess: js.UndefOr[typings.textversionjs.mod.imgProcess] = js.undefined
    
    var keepNbsps: js.UndefOr[Boolean] = js.undefined
    
    var linkProcess: js.UndefOr[typings.textversionjs.mod.linkProcess] = js.undefined
    
    var listIndentionTabs: js.UndefOr[Double] = js.undefined
    
    var listStyle: js.UndefOr[indentation | linebreak] = js.undefined
    
    var oIndentionChar: js.UndefOr[String] = js.undefined
    
    var uIndentionChar: js.UndefOr[String] = js.undefined
  }
  object styleConfig {
    
    inline def apply(): styleConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[styleConfig]
    }
    
    extension [Self <: styleConfig](x: Self) {
      
      inline def setHeadingStyle(value: underline | linebreak | hashify): Self = StObject.set(x, "headingStyle", value.asInstanceOf[js.Any])
      
      inline def setHeadingStyleUndefined: Self = StObject.set(x, "headingStyle", js.undefined)
      
      inline def setImgProcess(value: (/* src */ String, /* alt */ String) => String): Self = StObject.set(x, "imgProcess", js.Any.fromFunction2(value))
      
      inline def setImgProcessUndefined: Self = StObject.set(x, "imgProcess", js.undefined)
      
      inline def setKeepNbsps(value: Boolean): Self = StObject.set(x, "keepNbsps", value.asInstanceOf[js.Any])
      
      inline def setKeepNbspsUndefined: Self = StObject.set(x, "keepNbsps", js.undefined)
      
      inline def setLinkProcess(value: (/* href */ String, /* linkText */ String) => String): Self = StObject.set(x, "linkProcess", js.Any.fromFunction2(value))
      
      inline def setLinkProcessUndefined: Self = StObject.set(x, "linkProcess", js.undefined)
      
      inline def setListIndentionTabs(value: Double): Self = StObject.set(x, "listIndentionTabs", value.asInstanceOf[js.Any])
      
      inline def setListIndentionTabsUndefined: Self = StObject.set(x, "listIndentionTabs", js.undefined)
      
      inline def setListStyle(value: indentation | linebreak): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      inline def setOIndentionChar(value: String): Self = StObject.set(x, "oIndentionChar", value.asInstanceOf[js.Any])
      
      inline def setOIndentionCharUndefined: Self = StObject.set(x, "oIndentionChar", js.undefined)
      
      inline def setUIndentionChar(value: String): Self = StObject.set(x, "uIndentionChar", value.asInstanceOf[js.Any])
      
      inline def setUIndentionCharUndefined: Self = StObject.set(x, "uIndentionChar", js.undefined)
    }
  }
}
