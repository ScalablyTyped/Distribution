package typings.yaml

import typings.yaml.cstMod.CollectionItem
import typings.yaml.cstMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cstStringifyMod {
  
  @JSImport("yaml/dist/parse/cst-stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringify(cst: CollectionItem): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(cst.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(cst: Token): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(cst.asInstanceOf[js.Any]).asInstanceOf[String]
}
