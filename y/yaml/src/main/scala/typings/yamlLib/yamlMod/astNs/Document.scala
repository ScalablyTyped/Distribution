package typings
package yamlLib.yamlMod.astNs

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
  var comment: scala.Null | java.lang.String
  /**
    * A comment at the very beginning of the document.
    */
  var commentBefore: scala.Null | java.lang.String
  /**
    * The document contents.
    */
  var contents: AstNode | scala.Null
  /**
    * only available when `keepCstNodes` is set to `true`
    */
  var cstNode: js.UndefOr[yamlLib.yamlMod.cstNs.Document] = js.undefined
  /**
    * Errors encountered during parsing.
    */
  var errors: js.Array[yamlLib.yamlMod.YAMLError]
  /**
    * the [start, end] range of characters of the source parsed
    * into this node (undefined if not parsed)
    */
  var range: scala.Null | (js.Tuple2[scala.Double, scala.Double])
  /**
    * The schema used with the document.
    */
  var schema: Schema
  /**
    * Array of prefixes; each will have a string `handle` that
    * starts and ends with `!` and a string `prefix` that the handle will be replaced by.
    */
  var tagPrefixes: js.Array[Prefix]
  var `type`: yamlLib.yamlLibStrings.DOCUMENT
  /**
    * The parsed version of the source document;
    * if true-ish, stringified output will include a `%YAML` directive.
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Warnings encountered during parsing.
    */
  var warnings: js.Array[yamlLib.yamlMod.YAMLWarning]
  /**
    * List the tags used in the document that are not in the default `tag:yaml.org,2002:` namespace.
    */
  def listNonDefaultTags(): js.Array[java.lang.String]
  /**
    * Parse a CST into this document
    */
  def parse(cst: yamlLib.yamlMod.cstNs.Document): this.type
  /**
    * Set `handle` as a shorthand string for the `prefix` tag namespace.
    */
  def setTagPrefix(handle: java.lang.String, prefix: java.lang.String): scala.Unit
  /**
    * A plain JavaScript representation of the document `contents`.
    */
  def toJSON(): js.Any
}

object Document {
  @scala.inline
  def apply(
    anchors: Anchors,
    errors: js.Array[yamlLib.yamlMod.YAMLError],
    listNonDefaultTags: js.Function0[js.Array[java.lang.String]],
    parse: js.Function1[yamlLib.yamlMod.cstNs.Document, Document],
    schema: Schema,
    setTagPrefix: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    tagPrefixes: js.Array[Prefix],
    toJSON: js.Function0[js.Any],
    toString: js.Function0[java.lang.String],
    `type`: yamlLib.yamlLibStrings.DOCUMENT,
    warnings: js.Array[yamlLib.yamlMod.YAMLWarning],
    comment: java.lang.String = null,
    commentBefore: java.lang.String = null,
    contents: AstNode = null,
    cstNode: yamlLib.yamlMod.cstNs.Document = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    version: java.lang.String = null
  ): Document = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("anchors")(anchors)
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("listNonDefaultTags")(listNonDefaultTags)
    __obj.updateDynamic("parse")(parse)
    __obj.updateDynamic("schema")(schema)
    __obj.updateDynamic("setTagPrefix")(setTagPrefix)
    __obj.updateDynamic("tagPrefixes")(tagPrefixes)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("warnings")(warnings)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore)
    if (contents != null) __obj.updateDynamic("contents")(contents)
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode)
    if (range != null) __obj.updateDynamic("range")(range)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Document]
  }
}

