package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def cloneBlock[T /* <: typings.std.Record[java.lang.String, js.Any] */](block: typings.wordpressBlocks.mod.BlockInstance[T]): typings.wordpressBlocks.mod.BlockInstance[T] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any]).asInstanceOf[typings.wordpressBlocks.mod.BlockInstance[T]]
inline def cloneBlock[T /* <: typings.std.Record[java.lang.String, js.Any] */](
  block: typings.wordpressBlocks.mod.BlockInstance[T],
  mergeAttributes: scala.Unit,
  newInnerBlocks: js.Array[
  typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]
]
): typings.wordpressBlocks.mod.BlockInstance[T] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any], mergeAttributes.asInstanceOf[js.Any], newInnerBlocks.asInstanceOf[js.Any])).asInstanceOf[typings.wordpressBlocks.mod.BlockInstance[T]]
inline def cloneBlock[T /* <: typings.std.Record[java.lang.String, js.Any] */](block: typings.wordpressBlocks.mod.BlockInstance[T], mergeAttributes: typings.std.Partial[T]): typings.wordpressBlocks.mod.BlockInstance[T] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any], mergeAttributes.asInstanceOf[js.Any])).asInstanceOf[typings.wordpressBlocks.mod.BlockInstance[T]]
inline def cloneBlock[T /* <: typings.std.Record[java.lang.String, js.Any] */](
  block: typings.wordpressBlocks.mod.BlockInstance[T],
  mergeAttributes: typings.std.Partial[T],
  newInnerBlocks: js.Array[
  typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]
]
): typings.wordpressBlocks.mod.BlockInstance[T] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any], mergeAttributes.asInstanceOf[js.Any], newInnerBlocks.asInstanceOf[js.Any])).asInstanceOf[typings.wordpressBlocks.mod.BlockInstance[T]]

inline def createBlock[T /* <: typings.std.Record[java.lang.String, js.Any] */](name: java.lang.String): typings.wordpressBlocks.mod.BlockInstance[T] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any]).asInstanceOf[typings.wordpressBlocks.mod.BlockInstance[T]]
inline def createBlock[T /* <: typings.std.Record[java.lang.String, js.Any] */](
  name: java.lang.String,
  attributes: scala.Unit,
  innerBlocks: js.Array[
  typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]
]
): typings.wordpressBlocks.mod.BlockInstance[T] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[typings.wordpressBlocks.mod.BlockInstance[T]]
inline def createBlock[T /* <: typings.std.Record[java.lang.String, js.Any] */](name: java.lang.String, attributes: typings.std.Partial[T]): typings.wordpressBlocks.mod.BlockInstance[T] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[typings.wordpressBlocks.mod.BlockInstance[T]]
inline def createBlock[T /* <: typings.std.Record[java.lang.String, js.Any] */](
  name: java.lang.String,
  attributes: typings.std.Partial[T],
  innerBlocks: js.Array[
  typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]
]
): typings.wordpressBlocks.mod.BlockInstance[T] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[typings.wordpressBlocks.mod.BlockInstance[T]]

inline def doBlocksMatchTemplate(): scala.Boolean = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")().asInstanceOf[scala.Boolean]
inline def doBlocksMatchTemplate(
  blocks: js.Array[
  typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]
]
): scala.Boolean = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
inline def doBlocksMatchTemplate(
  blocks: js.Array[
  typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]
],
  template: typings.wordpressBlocks.templatesMod.TemplateArray
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def doBlocksMatchTemplate(blocks: scala.Unit, template: typings.wordpressBlocks.templatesMod.TemplateArray): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def findTransform[T /* <: typings.wordpressBlocks.mod.Transform[typings.std.Record[java.lang.String, js.Any]] */, U /* <: typings.std.Record[java.lang.String, js.Any] */](transforms: js.Array[T], predicate: js.Function1[/* transform */ T, scala.Boolean]): typings.wordpressBlocks.mod.Transform[U] | scala.Null = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findTransform")(transforms.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[typings.wordpressBlocks.mod.Transform[U] | scala.Null]

inline def getBlockAttributes(blockTypeOrName: java.lang.String, innerHTML: java.lang.String): typings.std.Record[java.lang.String, js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any])).asInstanceOf[typings.std.Record[java.lang.String, js.Any]]
inline def getBlockAttributes(
  blockTypeOrName: java.lang.String,
  innerHTML: java.lang.String,
  attributes: typings.std.Record[java.lang.String, js.Any]
): typings.std.Record[java.lang.String, js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[typings.std.Record[java.lang.String, js.Any]]
inline def getBlockAttributes[T /* <: typings.wordpressBlocks.mod.Block[js.Any] */](blockTypeOrName: T, innerHTML: java.lang.String): js.Any = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any])).asInstanceOf[js.Any]
inline def getBlockAttributes[T /* <: typings.wordpressBlocks.mod.Block[js.Any] */](
  blockTypeOrName: T,
  innerHTML: java.lang.String,
  attributes: typings.std.Record[java.lang.String, js.Any]
): js.Any = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[js.Any]

inline def getBlockContent(
  block: typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]
): java.lang.String = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockContent")(block.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def getBlockDefaultClassName(blockName: java.lang.String): java.lang.String = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockDefaultClassName")(blockName.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def getBlockMenuDefaultClassName(blockName: java.lang.String): java.lang.String = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockMenuDefaultClassName")(blockName.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def getBlockSupport_align(nameOrType: java.lang.String, feature: typings.wordpressBlocks.wordpressBlocksStrings.align): js.UndefOr[js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
inline def getBlockSupport_align(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.align
): js.UndefOr[js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
inline def getBlockSupport_align[T](
  nameOrType: java.lang.String,
  feature: typings.wordpressBlocks.wordpressBlocksStrings.align,
  defaultSupports: T
): T | scala.Boolean | scala.Double | java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
inline def getBlockSupport_align[T](
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.align,
  defaultSupports: T
): T | scala.Boolean | scala.Double | java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]

inline def getBlockSupport_alignWide(nameOrType: java.lang.String, feature: typings.wordpressBlocks.wordpressBlocksStrings.alignWide): js.UndefOr[js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
inline def getBlockSupport_alignWide(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.alignWide
): js.UndefOr[js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
inline def getBlockSupport_alignWide[T](
  nameOrType: java.lang.String,
  feature: typings.wordpressBlocks.wordpressBlocksStrings.alignWide,
  defaultSupports: T
): T | scala.Boolean | scala.Double | java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
inline def getBlockSupport_alignWide[T](
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.alignWide,
  defaultSupports: T
): T | scala.Boolean | scala.Double | java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]

inline def getBlockSupport_anchor(nameOrType: java.lang.String, feature: typings.wordpressBlocks.wordpressBlocksStrings.anchor): js.UndefOr[js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
inline def getBlockSupport_anchor(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.anchor
): js.UndefOr[js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
inline def getBlockSupport_anchor[T](
  nameOrType: java.lang.String,
  feature: typings.wordpressBlocks.wordpressBlocksStrings.anchor,
  defaultSupports: T
): T | scala.Boolean | scala.Double | java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
inline def getBlockSupport_anchor[T](
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.anchor,
  defaultSupports: T
): T | scala.Boolean | scala.Double | java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]

inline def getBlockSupport_className(nameOrType: java.lang.String, feature: typings.wordpressBlocks.wordpressBlocksStrings.className): js.UndefOr[js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
inline def getBlockSupport_className(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.className
): js.UndefOr[js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
inline def getBlockSupport_className[T](
  nameOrType: java.lang.String,
  feature: typings.wordpressBlocks.wordpressBlocksStrings.className,
  defaultSupports: T
): T | scala.Boolean | scala.Double | java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
inline def getBlockSupport_className[T](
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.className,
  defaultSupports: T
): T | scala.Boolean | scala.Double | java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]

inline def getBlockSupport_customClassName(
  nameOrType: java.lang.String,
  feature: typings.wordpressBlocks.wordpressBlocksStrings.customClassName
): js.UndefOr[js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
inline def getBlockSupport_customClassName(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.customClassName
): js.UndefOr[js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
inline def getBlockSupport_customClassName[T](
  nameOrType: java.lang.String,
  feature: typings.wordpressBlocks.wordpressBlocksStrings.customClassName,
  defaultSupports: T
): T | scala.Boolean | scala.Double | java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
inline def getBlockSupport_customClassName[T](
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.customClassName,
  defaultSupports: T
): T | scala.Boolean | scala.Double | java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]

inline def getBlockSupport_html(nameOrType: java.lang.String, feature: typings.wordpressBlocks.wordpressBlocksStrings.html): js.UndefOr[js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
inline def getBlockSupport_html(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.html
): js.UndefOr[js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
inline def getBlockSupport_html[T](
  nameOrType: java.lang.String,
  feature: typings.wordpressBlocks.wordpressBlocksStrings.html,
  defaultSupports: T
): T | scala.Boolean | scala.Double | java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
inline def getBlockSupport_html[T](
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.html,
  defaultSupports: T
): T | scala.Boolean | scala.Double | java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]

inline def getBlockSupport_inserter(nameOrType: java.lang.String, feature: typings.wordpressBlocks.wordpressBlocksStrings.inserter): js.UndefOr[js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
inline def getBlockSupport_inserter(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.inserter
): js.UndefOr[js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
inline def getBlockSupport_inserter[T](
  nameOrType: java.lang.String,
  feature: typings.wordpressBlocks.wordpressBlocksStrings.inserter,
  defaultSupports: T
): T | scala.Boolean | scala.Double | java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
inline def getBlockSupport_inserter[T](
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.inserter,
  defaultSupports: T
): T | scala.Boolean | scala.Double | java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]

inline def getBlockSupport_multiple(nameOrType: java.lang.String, feature: typings.wordpressBlocks.wordpressBlocksStrings.multiple): js.UndefOr[js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
inline def getBlockSupport_multiple(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.multiple
): js.UndefOr[js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
inline def getBlockSupport_multiple[T](
  nameOrType: java.lang.String,
  feature: typings.wordpressBlocks.wordpressBlocksStrings.multiple,
  defaultSupports: T
): T | scala.Boolean | scala.Double | java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
inline def getBlockSupport_multiple[T](
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.multiple,
  defaultSupports: T
): T | scala.Boolean | scala.Double | java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]

inline def getBlockSupport_reusable(nameOrType: java.lang.String, feature: typings.wordpressBlocks.wordpressBlocksStrings.reusable): js.UndefOr[js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
inline def getBlockSupport_reusable(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.reusable
): js.UndefOr[js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
inline def getBlockSupport_reusable[T](
  nameOrType: java.lang.String,
  feature: typings.wordpressBlocks.wordpressBlocksStrings.reusable,
  defaultSupports: T
): T | scala.Boolean | scala.Double | java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
inline def getBlockSupport_reusable[T](
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.reusable,
  defaultSupports: T
): T | scala.Boolean | scala.Double | java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]

inline def getBlockTransforms_from[T /* <: typings.std.Record[java.lang.String, js.Any] */](direction: typings.wordpressBlocks.wordpressBlocksStrings.from): js.Array[
typings.wordpressBlocks.mod.Transform[T] & typings.wordpressBlocks.anon.BlockName] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any]).asInstanceOf[js.Array[
typings.wordpressBlocks.mod.Transform[T] & typings.wordpressBlocks.anon.BlockName]]
inline def getBlockTransforms_from[T /* <: typings.std.Record[java.lang.String, js.Any] */](direction: typings.wordpressBlocks.wordpressBlocksStrings.from, blockTypeOrName: java.lang.String): js.Array[
typings.wordpressBlocks.mod.Transform[T] & typings.wordpressBlocks.anon.BlockName] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any], blockTypeOrName.asInstanceOf[js.Any])).asInstanceOf[js.Array[
typings.wordpressBlocks.mod.Transform[T] & typings.wordpressBlocks.anon.BlockName]]
inline def getBlockTransforms_from[T /* <: typings.std.Record[java.lang.String, js.Any] */](
  direction: typings.wordpressBlocks.wordpressBlocksStrings.from,
  blockTypeOrName: typings.wordpressBlocks.mod.Block[js.Object]
): js.Array[
typings.wordpressBlocks.mod.Transform[T] & typings.wordpressBlocks.anon.BlockName] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any], blockTypeOrName.asInstanceOf[js.Any])).asInstanceOf[js.Array[
typings.wordpressBlocks.mod.Transform[T] & typings.wordpressBlocks.anon.BlockName]]

inline def getBlockTransforms_to[T /* <: typings.std.Record[java.lang.String, js.Any] */](direction: typings.wordpressBlocks.wordpressBlocksStrings.to): js.Array[
typings.wordpressBlocks.mod.Transform[T] & typings.wordpressBlocks.anon.BlockName] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any]).asInstanceOf[js.Array[
typings.wordpressBlocks.mod.Transform[T] & typings.wordpressBlocks.anon.BlockName]]
inline def getBlockTransforms_to[T /* <: typings.std.Record[java.lang.String, js.Any] */](direction: typings.wordpressBlocks.wordpressBlocksStrings.to, blockTypeOrName: java.lang.String): js.Array[
typings.wordpressBlocks.mod.Transform[T] & typings.wordpressBlocks.anon.BlockName] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any], blockTypeOrName.asInstanceOf[js.Any])).asInstanceOf[js.Array[
typings.wordpressBlocks.mod.Transform[T] & typings.wordpressBlocks.anon.BlockName]]
inline def getBlockTransforms_to[T /* <: typings.std.Record[java.lang.String, js.Any] */](
  direction: typings.wordpressBlocks.wordpressBlocksStrings.to,
  blockTypeOrName: typings.wordpressBlocks.mod.Block[js.Object]
): js.Array[
typings.wordpressBlocks.mod.Transform[T] & typings.wordpressBlocks.anon.BlockName] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any], blockTypeOrName.asInstanceOf[js.Any])).asInstanceOf[js.Array[
typings.wordpressBlocks.mod.Transform[T] & typings.wordpressBlocks.anon.BlockName]]

inline def getBlockType[T](): js.UndefOr[typings.wordpressBlocks.mod.Block[T]] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockType")().asInstanceOf[js.UndefOr[typings.wordpressBlocks.mod.Block[T]]]
inline def getBlockType[T](name: java.lang.String): js.UndefOr[typings.wordpressBlocks.mod.Block[T]] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockType")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.wordpressBlocks.mod.Block[T]]]

inline def getBlockTypes(): js.Array[typings.wordpressBlocks.mod.Block[js.Any]] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTypes")().asInstanceOf[js.Array[typings.wordpressBlocks.mod.Block[js.Any]]]

inline def getCategories(): js.Array[typings.wordpressBlocks.categoriesMod.Category] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getCategories")().asInstanceOf[js.Array[typings.wordpressBlocks.categoriesMod.Category]]

inline def getChildBlockNames(blockName: java.lang.String): js.Array[java.lang.String] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getChildBlockNames")(blockName.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]

inline def getDefaultBlockName(): js.UndefOr[java.lang.String] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultBlockName")().asInstanceOf[js.UndefOr[java.lang.String]]

inline def getFreeformContentHandlerName(): js.UndefOr[java.lang.String] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getFreeformContentHandlerName")().asInstanceOf[js.UndefOr[java.lang.String]]

inline def getGroupingBlockName(): js.UndefOr[java.lang.String] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getGroupingBlockName")().asInstanceOf[js.UndefOr[java.lang.String]]

inline def getPhrasingContentSchema(): typings.wordpressBlocks.rawHandlingMod.PhrasingContentSchema = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getPhrasingContentSchema")().asInstanceOf[typings.wordpressBlocks.rawHandlingMod.PhrasingContentSchema]

inline def getPossibleBlockTransformations(
  blocks: js.Array[
  typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]
]
): js.Array[typings.wordpressBlocks.mod.Block[typings.std.Record[java.lang.String, js.Any]]] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getPossibleBlockTransformations")(blocks.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.wordpressBlocks.mod.Block[typings.std.Record[java.lang.String, js.Any]]]]

inline def getSaveContent[T](blockTypeOrName: java.lang.String, attributes: T): java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def getSaveContent[T](
  blockTypeOrName: java.lang.String,
  attributes: T,
  innerBlocks: js.Array[
  typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]
]
): java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def getSaveContent[T](blockTypeOrName: typings.wordpressBlocks.mod.Block[T], attributes: T): java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def getSaveContent[T](
  blockTypeOrName: typings.wordpressBlocks.mod.Block[T],
  attributes: T,
  innerBlocks: js.Array[
  typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]
]
): java.lang.String = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def getSaveElement[T](blockTypeOrName: java.lang.String, attributes: T): typings.react.mod.ReactChild = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactChild]
inline def getSaveElement[T](
  blockTypeOrName: java.lang.String,
  attributes: T,
  innerBlocks: js.Array[
  typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]
]
): typings.react.mod.ReactChild = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactChild]
inline def getSaveElement[T](blockTypeOrName: typings.wordpressBlocks.mod.Block[T], attributes: T): typings.react.mod.ReactChild = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactChild]
inline def getSaveElement[T](
  blockTypeOrName: typings.wordpressBlocks.mod.Block[T],
  attributes: T,
  innerBlocks: js.Array[
  typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]
]
): typings.react.mod.ReactChild = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactChild]

inline def getUnregisteredTypeHandlerName(): js.UndefOr[java.lang.String] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getUnregisteredTypeHandlerName")().asInstanceOf[js.UndefOr[java.lang.String]]

inline def hasBlockSupport_align(nameOrType: java.lang.String, feature: typings.wordpressBlocks.wordpressBlocksStrings.align): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_align(
  nameOrType: java.lang.String,
  feature: typings.wordpressBlocks.wordpressBlocksStrings.align,
  defaultSupports: scala.Boolean
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_align(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.align
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_align(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.align,
  defaultSupports: scala.Boolean
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def hasBlockSupport_alignWide(nameOrType: java.lang.String, feature: typings.wordpressBlocks.wordpressBlocksStrings.alignWide): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_alignWide(
  nameOrType: java.lang.String,
  feature: typings.wordpressBlocks.wordpressBlocksStrings.alignWide,
  defaultSupports: scala.Boolean
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_alignWide(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.alignWide
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_alignWide(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.alignWide,
  defaultSupports: scala.Boolean
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def hasBlockSupport_anchor(nameOrType: java.lang.String, feature: typings.wordpressBlocks.wordpressBlocksStrings.anchor): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_anchor(
  nameOrType: java.lang.String,
  feature: typings.wordpressBlocks.wordpressBlocksStrings.anchor,
  defaultSupports: scala.Boolean
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_anchor(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.anchor
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_anchor(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.anchor,
  defaultSupports: scala.Boolean
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def hasBlockSupport_className(nameOrType: java.lang.String, feature: typings.wordpressBlocks.wordpressBlocksStrings.className): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_className(
  nameOrType: java.lang.String,
  feature: typings.wordpressBlocks.wordpressBlocksStrings.className,
  defaultSupports: scala.Boolean
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_className(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.className
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_className(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.className,
  defaultSupports: scala.Boolean
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def hasBlockSupport_customClassName(
  nameOrType: java.lang.String,
  feature: typings.wordpressBlocks.wordpressBlocksStrings.customClassName
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_customClassName(
  nameOrType: java.lang.String,
  feature: typings.wordpressBlocks.wordpressBlocksStrings.customClassName,
  defaultSupports: scala.Boolean
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_customClassName(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.customClassName
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_customClassName(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.customClassName,
  defaultSupports: scala.Boolean
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def hasBlockSupport_html(nameOrType: java.lang.String, feature: typings.wordpressBlocks.wordpressBlocksStrings.html): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_html(
  nameOrType: java.lang.String,
  feature: typings.wordpressBlocks.wordpressBlocksStrings.html,
  defaultSupports: scala.Boolean
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_html(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.html
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_html(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.html,
  defaultSupports: scala.Boolean
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def hasBlockSupport_inserter(nameOrType: java.lang.String, feature: typings.wordpressBlocks.wordpressBlocksStrings.inserter): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_inserter(
  nameOrType: java.lang.String,
  feature: typings.wordpressBlocks.wordpressBlocksStrings.inserter,
  defaultSupports: scala.Boolean
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_inserter(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.inserter
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_inserter(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.inserter,
  defaultSupports: scala.Boolean
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def hasBlockSupport_multiple(nameOrType: java.lang.String, feature: typings.wordpressBlocks.wordpressBlocksStrings.multiple): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_multiple(
  nameOrType: java.lang.String,
  feature: typings.wordpressBlocks.wordpressBlocksStrings.multiple,
  defaultSupports: scala.Boolean
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_multiple(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.multiple
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_multiple(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.multiple,
  defaultSupports: scala.Boolean
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def hasBlockSupport_reusable(nameOrType: java.lang.String, feature: typings.wordpressBlocks.wordpressBlocksStrings.reusable): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_reusable(
  nameOrType: java.lang.String,
  feature: typings.wordpressBlocks.wordpressBlocksStrings.reusable,
  defaultSupports: scala.Boolean
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_reusable(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.reusable
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasBlockSupport_reusable(
  nameOrType: typings.wordpressBlocks.mod.Block[js.Any],
  feature: typings.wordpressBlocks.wordpressBlocksStrings.reusable,
  defaultSupports: scala.Boolean
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def hasChildBlocks(blockName: java.lang.String): scala.Boolean = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasChildBlocks")(blockName.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def hasChildBlocksWithInserterSupport(blockName: java.lang.String): scala.Boolean = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasChildBlocksWithInserterSupport")(blockName.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isReusableBlock(blockOrType: typings.wordpressBlocks.mod.Block[js.Any]): scala.Boolean = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isReusableBlock")(blockOrType.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
inline def isReusableBlock(
  blockOrType: typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]
): scala.Boolean = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isReusableBlock")(blockOrType.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isUnmodifiedDefaultBlock(
  block: typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]
): scala.Boolean = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isUnmodifiedDefaultBlock")(block.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isValidBlockContent[T](blockTypeOrName: java.lang.String, attributes: T, originalBlockContent: java.lang.String): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidBlockContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], originalBlockContent.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def isValidBlockContent[T](
  blockTypeOrName: typings.wordpressBlocks.mod.Block[T],
  attributes: T,
  originalBlockContent: java.lang.String
): scala.Boolean = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidBlockContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], originalBlockContent.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def isValidIcon(icon: js.Any): scala.Boolean = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidIcon")(icon.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def normalizeIconObject(): typings.wordpressBlocks.mod.BlockIconNormalized = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeIconObject")().asInstanceOf[typings.wordpressBlocks.mod.BlockIconNormalized]
inline def normalizeIconObject(icon: typings.wordpressBlocks.mod.BlockIcon): typings.wordpressBlocks.mod.BlockIconNormalized = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeIconObject")(icon.asInstanceOf[js.Any]).asInstanceOf[typings.wordpressBlocks.mod.BlockIconNormalized]

inline def parse(content: java.lang.String): js.Array[
typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(content.asInstanceOf[js.Any]).asInstanceOf[js.Array[
typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]]]

inline def parseWithAttributeSchema(innerHTML: java.lang.String, schema: typings.wordpressBlocks.anon.Attributetypeboolean): js.UndefOr[scala.Boolean] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[scala.Boolean]]
inline def parseWithAttributeSchema(innerHTML: java.lang.String, schema: typings.wordpressBlocks.parserMod.Schema.Attribute): js.UndefOr[java.lang.String] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
inline def parseWithAttributeSchema(innerHTML: java.lang.String, schema: typings.wordpressBlocks.parserMod.Schema.Children): js.Array[typings.react.mod.ReactChild] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.react.mod.ReactChild]]
inline def parseWithAttributeSchema(innerHTML: java.lang.String, schema: typings.wordpressBlocks.parserMod.Schema.HTML): js.UndefOr[java.lang.String] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
inline def parseWithAttributeSchema(innerHTML: java.lang.String, schema: typings.wordpressBlocks.parserMod.Schema.Node): typings.react.mod.global.JSX.Element | scala.Null = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.global.JSX.Element | scala.Null]
inline def parseWithAttributeSchema(innerHTML: java.lang.String, schema: typings.wordpressBlocks.parserMod.Schema.Tag): js.UndefOr[
/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 173 */ js.Any] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 173 */ js.Any]]
inline def parseWithAttributeSchema(innerHTML: java.lang.String, schema: typings.wordpressBlocks.parserMod.Schema.Text): js.UndefOr[java.lang.String] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
inline def parseWithAttributeSchema[T /* <: typings.std.Record[java.lang.String, typings.wordpressBlocks.parserMod.Source[js.Any]] */](innerHTML: java.lang.String, schema: typings.wordpressBlocks.parserMod.Schema.Query[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<T[k]>}
  */ typings.wordpressBlocks.wordpressBlocksStrings.parseWithAttributeSchema & org.scalablytyped.runtime.TopLevel[T] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<T[k]>}
  */ typings.wordpressBlocks.wordpressBlocksStrings.parseWithAttributeSchema & org.scalablytyped.runtime.TopLevel[T]]

inline def pasteHandler(
  options: typings.wordpressBlocks.rawHandlingMod.pasteHandler.Options & typings.wordpressBlocks.anon.`0`
): js.Array[
typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pasteHandler")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[
typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]]]
inline def pasteHandler(
  options: typings.wordpressBlocks.rawHandlingMod.pasteHandler.Options & typings.wordpressBlocks.anon.Mode
): java.lang.String = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pasteHandler")(options.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def pasteHandler(options: typings.wordpressBlocks.rawHandlingMod.pasteHandler.Options): (js.Array[
typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]]) | java.lang.String = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pasteHandler")(options.asInstanceOf[js.Any]).asInstanceOf[(js.Array[
typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]]) | java.lang.String]

inline def rawHandler(options: typings.wordpressBlocks.anon.HTML): js.Array[
typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rawHandler")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[
typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]]]

inline def registerBlockCollection(namespace: java.lang.String, settings: typings.wordpressBlocks.anon.Icon): scala.Unit = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockCollection")(namespace.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def registerBlockStyle(blockName: java.lang.String, styleVariation: typings.wordpressBlocks.mod.BlockStyle): scala.Unit = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockStyle")(blockName.asInstanceOf[js.Any], styleVariation.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def registerBlockType[T /* <: typings.std.Record[java.lang.String, js.Any] */](name: java.lang.String, settings: typings.wordpressBlocks.mod.BlockConfiguration[T]): js.UndefOr[typings.wordpressBlocks.mod.Block[T]] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockType")(name.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.wordpressBlocks.mod.Block[T]]]

inline def serialize(
  blocks: js.Array[
  typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]
]
): java.lang.String = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(blocks.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def setCategories(categories: js.Array[typings.wordpressBlocks.categoriesMod.Category]): scala.Unit = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setCategories")(categories.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def setDefaultBlockName(name: java.lang.String): scala.Unit = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultBlockName")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def setFreeformContentHandlerName(blockName: java.lang.String): scala.Unit = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setFreeformContentHandlerName")(blockName.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def setGroupingBlockName(name: java.lang.String): scala.Unit = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setGroupingBlockName")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def setUnregisteredTypeHandlerName(blockName: java.lang.String): scala.Unit = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setUnregisteredTypeHandlerName")(blockName.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def switchToBlockType(
  blocks: js.Array[
  typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]
],
  name: java.lang.String
): (js.Array[
typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]]) | scala.Null = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("switchToBlockType")(blocks.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[(js.Array[
typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]]) | scala.Null]
inline def switchToBlockType(
  blocks: typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]],
  name: java.lang.String
): (js.Array[
typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]]) | scala.Null = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("switchToBlockType")(blocks.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[(js.Array[
typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]]) | scala.Null]

inline def synchronizeBlocksWithTemplate(): js.Array[
typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")().asInstanceOf[js.Array[
typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]]]
inline def synchronizeBlocksWithTemplate(
  blocks: js.Array[
  typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]
]
): js.Array[
typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any]).asInstanceOf[js.Array[
typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]]]
inline def synchronizeBlocksWithTemplate(
  blocks: js.Array[
  typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]
],
  template: typings.wordpressBlocks.templatesMod.TemplateArray
): js.Array[
typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[js.Array[
typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]]]
inline def synchronizeBlocksWithTemplate(blocks: scala.Unit, template: typings.wordpressBlocks.templatesMod.TemplateArray): js.Array[
typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]] = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[js.Array[
typings.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[js.Any]]]]

inline def unregisterBlockStyle(blockName: java.lang.String, styleVariationName: java.lang.String): scala.Unit = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unregisterBlockStyle")(blockName.asInstanceOf[js.Any], styleVariationName.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def unregisterBlockType(name: java.lang.String): js.UndefOr[typings.wordpressBlocks.mod.Block[js.Any]] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unregisterBlockType")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.wordpressBlocks.mod.Block[js.Any]]]

inline def updateCategory(slug: java.lang.String, category: typings.wordpressBlocks.anon.PartialCategory): scala.Unit = (typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("updateCategory")(slug.asInstanceOf[js.Any], category.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def withBlockContentContext[T /* <: typings.react.mod.ComponentType[js.Any] */](wrapped: T): typings.react.mod.ComponentType[
typings.std.Omit[js.Any, typings.wordpressBlocks.wordpressBlocksStrings.BlockContent]] = typings.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withBlockContentContext")(wrapped.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentType[
typings.std.Omit[js.Any, typings.wordpressBlocks.wordpressBlocksStrings.BlockContent]]]

/* Rewritten from type alias, can be one of: 
  - typings.wordpressBlocks.mod.AttributeSource.Attribute
  - typings.wordpressBlocks.mod.AttributeSource.Children
  - typings.wordpressBlocks.mod.AttributeSource.HTML
  - typings.wordpressBlocks.mod.AttributeSource.Meta
  - typings.wordpressBlocks.mod.AttributeSource.Query[T]
  - typings.wordpressBlocks.mod.AttributeSource.Text
  - typings.wordpressBlocks.mod.AttributeSource.None
*/
type BlockAttribute[T] = typings.wordpressBlocks.mod._BlockAttribute[T] | typings.wordpressBlocks.mod.AttributeSource.Attribute | typings.wordpressBlocks.mod.AttributeSource.None
