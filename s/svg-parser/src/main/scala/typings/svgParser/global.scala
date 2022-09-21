package typings.svgParser

import typings.svgParser.mod.RootNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object svgParser {
    
    @JSGlobal("svgParser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(source: String): RootNode = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[RootNode]
  }
}
