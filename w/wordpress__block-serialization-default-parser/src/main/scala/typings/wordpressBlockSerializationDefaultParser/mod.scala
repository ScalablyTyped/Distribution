package typings.wordpressBlockSerializationDefaultParser

import typings.wordpressBlockSerializationSpecParser.mod.Block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/block-serialization-default-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(rawHtml: String): js.Array[Block] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(rawHtml.asInstanceOf[js.Any]).asInstanceOf[js.Array[Block]]
}
