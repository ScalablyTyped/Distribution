package typings.yaml.mod

import org.scalablytyped.runtime.Instantiable0
import typings.std.RegExp
import typings.yaml.mod.ast.MapBase
import typings.yaml.mod.ast.Scalar
import typings.yaml.mod.ast.SeqBase
import typings.yaml.mod.cst.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * A JavaScript class that should be matched to this tag, e.g. `Date` for `!!timestamp`.
    */
  var `class`: js.UndefOr[Instantiable0[js.Any]] = js.native
  /**
    * An optional factory function, used e.g. by collections when wrapping JS objects as AST nodes.
    */
  var createNode: js.UndefOr[js.Function1[/* value */ js.Any, MapBase | SeqBase | Scalar]] = js.native
  /**
    * If `true`, the tag should not be explicitly included when stringifying.
    */
  var default: js.UndefOr[Boolean] = js.native
  /**
    * If a tag has multiple forms that should be parsed and/or stringified differently, use `format` to identify them.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The `Node` child class that implements this tag. Required for collections and tags that have overlapping JS representations.
    */
  var nodeClass: js.UndefOr[Instantiable0[js.Any]] = js.native
  /**
    * Used by some tags to configure their stringification, where applicable.
    */
  var options: js.UndefOr[js.Object] = js.native
  /**
    * The fully qualified name of the tag.
    */
  var tag: String = js.native
  /**
    * Used to match string values of scalar nodes; captured parts will be passed as arguments of `resolve()`.
    */
  var test: js.UndefOr[RegExp] = js.native
  /**
    * Should return an instance of a class extending `Node`.
    * If test is set, will be called with the resulting match as arguments.
    * Otherwise, will be called as `resolve(doc, cstNode)`.
    */
  def resolve(doc: typings.yaml.mod.ast.Document, cstNode: Node): typings.yaml.mod.ast.Node = js.native
  def resolve(`match`: String*): typings.yaml.mod.ast.Node = js.native
  /**
    * @param item the node being stringified.
    * @param ctx contains the stringifying context variables.
    * @param onComment a function that should be called if the stringifier includes the item's comment in its output.
    */
  def stringify(item: typings.yaml.mod.ast.Node, ctx: StringifyContext, onComment: js.Function0[Unit]): String = js.native
}

