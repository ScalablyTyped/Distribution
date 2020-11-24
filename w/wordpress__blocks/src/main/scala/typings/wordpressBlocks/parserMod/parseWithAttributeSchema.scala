package typings.wordpressBlocks.parserMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ReactChild
import typings.react.mod.global.JSX.Element
import typings.std.Record
import typings.wordpressBlocks.anon.Attributetypeboolean
import typings.wordpressBlocks.parserMod.Schema.Attribute
import typings.wordpressBlocks.parserMod.Schema.Children
import typings.wordpressBlocks.parserMod.Schema.HTML
import typings.wordpressBlocks.parserMod.Schema.Node
import typings.wordpressBlocks.parserMod.Schema.Query
import typings.wordpressBlocks.parserMod.Schema.Tag
import typings.wordpressBlocks.parserMod.Schema.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks/api/parser", "parseWithAttributeSchema")
@js.native
object parseWithAttributeSchema extends js.Object {
  
  def apply(innerHTML: String, schema: Attributetypeboolean): js.UndefOr[Boolean] = js.native
  def apply(innerHTML: String, schema: Attribute): js.UndefOr[String] = js.native
  def apply(innerHTML: String, schema: Children): js.Array[ReactChild] = js.native
  def apply(innerHTML: String, schema: HTML): js.UndefOr[String] = js.native
  def apply(innerHTML: String, schema: Node): Element | Null = js.native
  def apply(innerHTML: String, schema: Tag): js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 173 */ js.Any
  ] = js.native
  def apply(innerHTML: String, schema: Text): js.UndefOr[String] = js.native
  def apply[T /* <: Record[String, Source[_]] */](innerHTML: String, schema: Query[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.parseWithAttributeSchema with TopLevel[T] = js.native
}
