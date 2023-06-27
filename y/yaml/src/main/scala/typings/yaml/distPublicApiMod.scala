package typings.yaml

import typings.std.Array
import typings.yaml.distDocApplyReviverMod.Reviver
import typings.yaml.distDocDocumentMod.Document.Parsed
import typings.yaml.distDocDocumentMod.Replacer
import typings.yaml.distNodesNodeMod.Node
import typings.yaml.distNodesNodeMod.ParsedNode
import typings.yaml.distOptionsMod.CreateNodeOptions
import typings.yaml.distOptionsMod.DocumentOptions
import typings.yaml.distOptionsMod.ParseOptions
import typings.yaml.distOptionsMod.SchemaOptions
import typings.yaml.distOptionsMod.ToJSOptions
import typings.yaml.distOptionsMod.ToStringOptions
import typings.yaml.yamlBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPublicApiMod {
  
  @JSImport("yaml/dist/public-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(src: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parse(src: String, options: ParseOptions & DocumentOptions & SchemaOptions & ToJSOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(src: String, reviver: Reviver): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(
    src: String,
    reviver: Reviver,
    options: ParseOptions & DocumentOptions & SchemaOptions & ToJSOptions
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseAllDocuments[Contents /* <: Node[Any] */, Strict /* <: Boolean */](source: String): (js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: Contents extends yaml.yaml/dist/nodes/Node.ParsedNode ? yaml.yaml/dist/doc/Document.Document.Parsed<Contents, Strict> : yaml.yaml/dist/doc/Document.Document<Contents, Strict> */ js.Any
  ]) | EmptyStream = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAllDocuments")(source.asInstanceOf[js.Any]).asInstanceOf[(js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: Contents extends yaml.yaml/dist/nodes/Node.ParsedNode ? yaml.yaml/dist/doc/Document.Document.Parsed<Contents, Strict> : yaml.yaml/dist/doc/Document.Document<Contents, Strict> */ js.Any
  ]) | EmptyStream]
  inline def parseAllDocuments[Contents /* <: Node[Any] */, Strict /* <: Boolean */](source: String, options: ParseOptions & DocumentOptions & SchemaOptions): (js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: Contents extends yaml.yaml/dist/nodes/Node.ParsedNode ? yaml.yaml/dist/doc/Document.Document.Parsed<Contents, Strict> : yaml.yaml/dist/doc/Document.Document<Contents, Strict> */ js.Any
  ]) | EmptyStream = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAllDocuments")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: Contents extends yaml.yaml/dist/nodes/Node.ParsedNode ? yaml.yaml/dist/doc/Document.Document.Parsed<Contents, Strict> : yaml.yaml/dist/doc/Document.Document<Contents, Strict> */ js.Any
  ]) | EmptyStream]
  
  inline def parseDocument[Contents /* <: Node[Any] */, Strict /* <: Boolean */](source: String): /* import warning: importer.ImportType#apply Failed type conversion: Contents extends yaml.yaml/dist/nodes/Node.ParsedNode ? yaml.yaml/dist/doc/Document.Document.Parsed<Contents, Strict> : yaml.yaml/dist/doc/Document.Document<Contents, Strict> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDocument")(source.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: Contents extends yaml.yaml/dist/nodes/Node.ParsedNode ? yaml.yaml/dist/doc/Document.Document.Parsed<Contents, Strict> : yaml.yaml/dist/doc/Document.Document<Contents, Strict> */ js.Any]
  inline def parseDocument[Contents /* <: Node[Any] */, Strict /* <: Boolean */](source: String, options: ParseOptions & DocumentOptions & SchemaOptions): /* import warning: importer.ImportType#apply Failed type conversion: Contents extends yaml.yaml/dist/nodes/Node.ParsedNode ? yaml.yaml/dist/doc/Document.Document.Parsed<Contents, Strict> : yaml.yaml/dist/doc/Document.Document<Contents, Strict> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDocument")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: Contents extends yaml.yaml/dist/nodes/Node.ParsedNode ? yaml.yaml/dist/doc/Document.Document.Parsed<Contents, Strict> : yaml.yaml/dist/doc/Document.Document<Contents, Strict> */ js.Any]
  
  inline def stringify(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(
    value: Any,
    options: DocumentOptions & SchemaOptions & ParseOptions & CreateNodeOptions & ToStringOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: Any,
    replacer: Null,
    options: DocumentOptions & SchemaOptions & ParseOptions & CreateNodeOptions & ToStringOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Null, options: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Null, options: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: Any,
    replacer: Unit,
    options: DocumentOptions & SchemaOptions & ParseOptions & CreateNodeOptions & ToStringOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Unit, options: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Unit, options: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Replacer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: Any,
    replacer: Replacer,
    options: DocumentOptions & SchemaOptions & ParseOptions & CreateNodeOptions & ToStringOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Replacer, options: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Replacer, options: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped (): yaml.anon.Directives extends (args : any): infer R ? R : any */ @js.native
  trait EmptyStream
    extends StObject
       with Array[Parsed[ParsedNode, `true`]] {
    
    var empty: `true` = js.native
  }
}
