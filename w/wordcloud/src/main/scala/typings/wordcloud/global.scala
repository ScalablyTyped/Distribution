package typings.wordcloud

import typings.std.HTMLElement
import typings.wordcloud.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object WordCloud {
    
    inline def apply(elements: js.Array[HTMLElement], options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(elements.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(elements: HTMLElement, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(elements.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("WordCloud")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("WordCloud.isSupported")
    @js.native
    val isSupported: Boolean = js.native
    
    @JSGlobal("WordCloud.minFontSize")
    @js.native
    val minFontSize: Double = js.native
    
    /** Stop rendering. */
    inline def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
  }
}
