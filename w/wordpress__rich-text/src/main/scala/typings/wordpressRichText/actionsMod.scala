package typings.wordpressRichText

import typings.wordpressRichText.mod.NamedFormatConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/rich-text/store/actions", JSImport.Namespace)
@js.native
object actionsMod extends js.Object {
  
  def addFormatTypes(configs: js.Array[NamedFormatConfiguration]): Unit = js.native
  def addFormatTypes(configs: NamedFormatConfiguration): Unit = js.native
  
  def removeFormatTypes(names: String): Unit = js.native
  def removeFormatTypes(names: js.Array[String]): Unit = js.native
}
