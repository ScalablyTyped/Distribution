package typings.stylehacks

import typings.postcss.mod.Result
import typings.postcss.mod.Rule_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trailingSlashCommaMod {
  
  @JSImport("stylehacks/types/plugins/trailingSlashComma", JSImport.Namespace)
  @js.native
  /** @param {import('postcss').Result=} result */
  open class ^ () extends TrailingSlashComma {
    def this(result: Result) = this()
  }
  
  @js.native
  trait TrailingSlashComma
    extends typings.stylehacks.pluginMod.^ {
    
    /**
      * @param {import('postcss').Rule} rule
      * @return {void}
      */
    def detect(rule: Rule_): Unit = js.native
  }
}
