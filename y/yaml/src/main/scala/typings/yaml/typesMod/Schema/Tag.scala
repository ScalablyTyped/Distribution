package typings.yaml.typesMod.Schema

import typings.std.RegExp
import typings.yaml.mod.Document
import typings.yaml.parseCstMod.CST.Node
import typings.yaml.yamlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.yaml.typesMod.Schema.CustomTag
  - typings.yaml.typesMod.Schema.DefaultTag
*/
trait Tag extends js.Object
object Tag {
  
  @scala.inline
  def CustomTag(
    identify: js.Any => Boolean,
    resolve: (Document, Node) => typings.yaml.typesMod.Node | js.Any,
    tag: String
  ): Tag = {
    val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction2(resolve), tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  def DefaultTag(
    default: `true`,
    identify: js.Any => Boolean,
    resolve: /* repeated */ String => typings.yaml.typesMod.Node | js.Any,
    tag: String,
    test: RegExp
  ): Tag = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction1(resolve), tag = tag.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}
