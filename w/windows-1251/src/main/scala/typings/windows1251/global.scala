package typings.windows1251

import typings.windows1251.anon.Mode
import typings.windows1251.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object windows1251 {
    
    @JSGlobal("windows1251")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def decode(text: String, options: `0`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def encode(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def encode(input: String, options: Mode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSGlobal("windows1251.labels")
    @js.native
    def labels: js.Array[String] = js.native
    inline def labels_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labels")(x.asInstanceOf[js.Any])
    
    @JSGlobal("windows1251.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
