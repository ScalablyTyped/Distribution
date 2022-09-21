package typings.stylehacks

import typings.postcss.mod.Declaration
import typings.postcss.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object leadingUnderscoreMod {
  
  @JSImport("stylehacks/types/plugins/leadingUnderscore", JSImport.Namespace)
  @js.native
  /** @param {import('postcss').Result=} result */
  open class ^ () extends LeadingUnderscore {
    def this(result: Result) = this()
  }
  
  @js.native
  trait LeadingUnderscore
    extends typings.stylehacks.pluginMod.^ {
    
    /**
      * @param {import('postcss').Declaration} decl
      * @return {void}
      */
    def detect(decl: Declaration): Unit = js.native
  }
}
