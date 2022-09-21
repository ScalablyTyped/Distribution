package typings.wordfilter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wordfilter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addWords(array: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addWords")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addWords(array: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addWords")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def blacklisted(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("blacklisted")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def clearList(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearList")().asInstanceOf[Unit]
  
  inline def removeWord(word: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeWord")(word.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
