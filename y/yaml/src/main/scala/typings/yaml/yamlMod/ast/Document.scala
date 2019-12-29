package typings.yaml.yamlMod.ast

import typings.yaml.yamlMod.YAMLError
import typings.yaml.yamlMod.YAMLWarning
import typings.yaml.yamlStrings.DOCUMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  /**
    * Anchors associated with the document's nodes;
    * also provides alias & merge node creators.
    */
  var anchors: Anchors
  /**
    * A comment at the end of the document.
    */
  var comment: Null | String
  /**
    * A comment at the very beginning of the document.
    */
  var commentBefore: Null | String
  /**
    * The document contents.
    */
  var contents: AstNode | Null
  /**
    * only available when `keepCstNodes` is set to `true`
    */
  var cstNode: js.UndefOr[typings.yaml.yamlMod.cst.Document] = js.undefined
  /**
    * Errors encountered during parsing.
    */
  var errors: js.Array[YAMLError]
  /**
    * the [start, end] range of characters of the source parsed
    * into this node (undefined if not parsed)
    */
  var range: Null | (js.Tuple2[Double, Double])
  /**
    * The schema used with the document.
    */
  var schema: Schema
  /**
    * a blank line before this node and its commentBefore
    */
  var spaceBefore: js.UndefOr[Boolean] = js.undefined
  /**
    * Array of prefixes; each will have a string `handle` that
    * starts and ends with `!` and a string `prefix` that the handle will be replaced by.
    */
  var tagPrefixes: js.Array[Prefix]
  var `type`: DOCUMENT
  /**
    * The parsed version of the source document;
    * if true-ish, stringified output will include a `%YAML` directive.
    */
  var version: js.UndefOr[String] = js.undefined
  /**
    * Warnings encountered during parsing.
    */
  var warnings: js.Array[YAMLWarning]
  /**
    * List the tags used in the document that are not in the default `tag:yaml.org,2002:` namespace.
    */
  def listNonDefaultTags(): js.Array[String]
  /**
    * Parse a CST into this document
    */
  def parse(cst: typings.yaml.yamlMod.cst.Document): this.type
  /**
    * Set `handle` as a shorthand string for the `prefix` tag namespace.
    */
  def setTagPrefix(handle: String, prefix: String): Unit
  /**
    * A plain JavaScript representation of the document `contents`.
    */
  def toJSON(): js.Any
}

object Document {
  @scala.inline
  def apply(
    anchors: Anchors,
    errors: js.Array[YAMLError],
    listNonDefaultTags: () => js.Array[String],
    parse: typings.yaml.yamlMod.cst.Document => Document,
    schema: Schema,
    setTagPrefix: (String, String) => Unit,
    tagPrefixes: js.Array[Prefix],
    toJSON: () => js.Any,
    `type`: DOCUMENT,
    warnings: js.Array[YAMLWarning],
    comment: String = null,
    commentBefore: String = null,
    contents: AstNode = null,
    cstNode: typings.yaml.yamlMod.cst.Document = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    version: String = null
  ): Document = {
    val __obj = js.Dynamic.literal(anchors = anchors.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], listNonDefaultTags = js.Any.fromFunction0(listNonDefaultTags), parse = js.Any.fromFunction1(parse), schema = schema.asInstanceOf[js.Any], setTagPrefix = js.Any.fromFunction2(setTagPrefix), tagPrefixes = tagPrefixes.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), warnings = warnings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

