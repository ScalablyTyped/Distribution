package typings.yaml.typesMod

import typings.yaml.typesMod.Schema.CreateNodeContext
import typings.yaml.typesMod.Schema.Name
import typings.yaml.typesMod.Schema.Options
import typings.yaml.typesMod.Schema.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yaml/types", "Schema")
@js.native
class Schema_ protected () extends js.Object {
  def this(options: Options) = this()
  
  /**
    * Convert any value into a `Node` using this schema, recursively turning
    * objects into collections.
    *
    * @param wrapScalars If `true`, also wraps plain values in `Scalar` objects;
    *   if undefined or `false` and `value` is not an object, it will be returned
    *   directly.
    * @param tag Use to specify the collection type, e.g. `"!!omap"`. Note that
    *   this requires the corresponding tag to be available in this schema.
    */
  def createNode(value: js.Any): Node = js.native
  def createNode(
    value: js.Any,
    wrapScalars: js.UndefOr[scala.Nothing],
    tag: js.UndefOr[scala.Nothing],
    ctx: CreateNodeContext
  ): Node = js.native
  def createNode(value: js.Any, wrapScalars: js.UndefOr[scala.Nothing], tag: String): Node = js.native
  def createNode(value: js.Any, wrapScalars: js.UndefOr[scala.Nothing], tag: String, ctx: CreateNodeContext): Node = js.native
  def createNode(value: js.Any, wrapScalars: Boolean): Node = js.native
  def createNode(value: js.Any, wrapScalars: Boolean, tag: js.UndefOr[scala.Nothing], ctx: CreateNodeContext): Node = js.native
  def createNode(value: js.Any, wrapScalars: Boolean, tag: String): Node = js.native
  def createNode(value: js.Any, wrapScalars: Boolean, tag: String, ctx: CreateNodeContext): Node = js.native
  
  /**
    * Convert a key and a value into a `Pair` using this schema, recursively
    * wrapping all values as `Scalar` or `Collection` nodes.
    *
    * @param ctx To not wrap scalars, use a context `{ wrapScalars: false }`
    */
  def createPair(key: js.Any, value: js.Any): Pair = js.native
  def createPair(key: js.Any, value: js.Any, ctx: CreateNodeContext): Pair = js.native
  
  var merge: Boolean = js.native
  
  var name: Name = js.native
  
  var sortMapEntries: (js.Function2[/* a */ Pair, /* b */ Pair, Double]) | Null = js.native
  
  var tags: js.Array[Tag] = js.native
}
