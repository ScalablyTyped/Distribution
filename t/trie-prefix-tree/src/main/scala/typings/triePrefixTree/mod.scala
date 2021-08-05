package typings.triePrefixTree

import typings.triePrefixTree.anon.CountPrefix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("trie-prefix-tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(strings: js.Array[String]): CountPrefix = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(strings.asInstanceOf[js.Any]).asInstanceOf[CountPrefix]
}
