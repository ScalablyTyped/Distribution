package typings.stylehacks

import typings.postcss.mod.AtRule_
import typings.postcss.mod.Declaration
import typings.postcss.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object leadingStarMod {
  
  @JSImport("stylehacks/types/plugins/leadingStar", JSImport.Namespace)
  @js.native
  /** @param {import('postcss').Result=} result */
  open class ^ () extends LeadingStar {
    def this(result: Result) = this()
  }
  
  @js.native
  trait LeadingStar
    extends typings.stylehacks.pluginMod.^ {
    
    def detect(node: AtRule_): Unit = js.native
    /**
      * @param {import('postcss').Declaration | import('postcss').AtRule} node
      * @return {void}
      */
    def detect(node: Declaration): Unit = js.native
  }
}
