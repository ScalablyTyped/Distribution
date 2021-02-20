package typings.wordpressRichText

import typings.wordpressRichText.mod.NamedFormatConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("@wordpress/rich-text/store/actions", "addFormatTypes")
  @js.native
  def addFormatTypes(configs: js.Array[NamedFormatConfiguration]): Unit = js.native
  @JSImport("@wordpress/rich-text/store/actions", "addFormatTypes")
  @js.native
  def addFormatTypes(configs: NamedFormatConfiguration): Unit = js.native
  
  @JSImport("@wordpress/rich-text/store/actions", "removeFormatTypes")
  @js.native
  def removeFormatTypes(names: String): Unit = js.native
  @JSImport("@wordpress/rich-text/store/actions", "removeFormatTypes")
  @js.native
  def removeFormatTypes(names: js.Array[String]): Unit = js.native
}
