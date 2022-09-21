package typings.stylehacks

import typings.postcss.mod.AtRule_
import typings.postcss.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaSlash0Slash9Mod {
  
  @JSImport("stylehacks/types/plugins/mediaSlash0Slash9", JSImport.Namespace)
  @js.native
  open class ^ protected () extends MediaSlash0Slash9 {
    /** @param {import('postcss').Result} result */
    def this(result: Result) = this()
  }
  
  @js.native
  trait MediaSlash0Slash9
    extends typings.stylehacks.pluginMod.^ {
    
    /**
      * @param {import('postcss').AtRule} rule
      * @return {void}
      */
    def detect(rule: AtRule_): Unit = js.native
  }
}
