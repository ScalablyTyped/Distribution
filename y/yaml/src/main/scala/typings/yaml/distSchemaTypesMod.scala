package typings.yaml

import org.scalablytyped.runtime.Instantiable0
import typings.yaml.distDocCreateNodeMod.CreateNodeContext
import typings.yaml.distNodesNodeMod.Node
import typings.yaml.distNodesNodeMod.ParsedNode
import typings.yaml.distNodesScalarMod.Scalar
import typings.yaml.distNodesYamlmapMod.YAMLMap.Parsed
import typings.yaml.distOptionsMod.ParseOptions
import typings.yaml.distSchemaSchemaMod.Schema
import typings.yaml.distStringifyStringifyMod.StringifyContext
import typings.yaml.yamlStrings.map
import typings.yaml.yamlStrings.seq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaTypesMod {
  
  @js.native
  trait CollectionTag
    extends StObject
       with TagBase {
    
    /** The source collection type supported by this tag. */
    var collection: map | seq = js.native
    
    /**
      * The `Node` child class that implements this tag.
      * If set, used to select this tag when stringifying.
      */
    var nodeClass: js.UndefOr[Instantiable0[Node[Any]]] = js.native
    
    /**
      * Turns a value into an AST node.
      * If returning a non-`Node` value, the output will be wrapped as a `Scalar`.
      */
    def resolve(
      value: Parsed[ParsedNode, ParsedNode | Null],
      onError: js.Function1[/* message */ String, Unit],
      options: ParseOptions
    ): Any = js.native
    def resolve(
      value: typings.yaml.distNodesYamlseqMod.YAMLSeq.Parsed[ParsedNode],
      onError: js.Function1[/* message */ String, Unit],
      options: ParseOptions
    ): Any = js.native
    
    var stringify: js.UndefOr[scala.Nothing] = js.native
    
    var test: js.UndefOr[scala.Nothing] = js.native
  }
  
  trait ScalarTag
    extends StObject
       with TagBase {
    
    var collection: js.UndefOr[scala.Nothing] = js.undefined
    
    var nodeClass: js.UndefOr[scala.Nothing] = js.undefined
    
    /**
      * Turns a value into an AST node.
      * If returning a non-`Node` value, the output will be wrapped as a `Scalar`.
      */
    def resolve(value: String, onError: js.Function1[/* message */ String, Unit], options: ParseOptions): Any
    
    /**
      * Optional function stringifying a Scalar node. If your data includes a
      * suitable `.toString()` method, you can probably leave this undefined and
      * use the default stringifier.
      *
      * @param item The node being stringified.
      * @param ctx Contains the stringifying context variables.
      * @param onComment Callback to signal that the stringifier includes the
      *   item's comment in its output.
      * @param onChompKeep Callback to signal that the output uses a block scalar
      *   type with the `+` chomping indicator.
      */
    var stringify: js.UndefOr[
        js.Function4[
          /* item */ Scalar[Any], 
          /* ctx */ StringifyContext, 
          /* onComment */ js.UndefOr[js.Function0[Unit]], 
          /* onChompKeep */ js.UndefOr[js.Function0[Unit]], 
          String
        ]
      ] = js.undefined
    
    /**
      * Together with `default` allows for values to be stringified without an
      * explicit tag and detected using a regular expression. For most cases, it's
      * unlikely that you'll actually want to use these, even if you first think
      * you do.
      */
    var test: js.UndefOr[js.RegExp] = js.undefined
  }
  object ScalarTag {
    
    inline def apply(
      default: Boolean,
      resolve: (String, js.Function1[/* message */ String, Unit], ParseOptions) => Any,
      tag: String
    ): ScalarTag = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], resolve = js.Any.fromFunction3(resolve), tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScalarTag]
    }
    
    extension [Self <: ScalarTag](x: Self) {
      
      inline def setResolve(value: (String, js.Function1[/* message */ String, Unit], ParseOptions) => Any): Self = StObject.set(x, "resolve", js.Any.fromFunction3(value))
      
      inline def setStringify(
        value: (/* item */ Scalar[Any], /* ctx */ StringifyContext, /* onComment */ js.UndefOr[js.Function0[Unit]], /* onChompKeep */ js.UndefOr[js.Function0[Unit]]) => String
      ): Self = StObject.set(x, "stringify", js.Any.fromFunction4(value))
      
      inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
      
      inline def setTest(value: js.RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    }
  }
  
  trait TagBase extends StObject {
    
    /**
      * If `true`, together with `test` allows for values to be stringified without
      * an explicit tag. For most cases, it's unlikely that you'll actually want to
      * use this, even if you first think you do.
      */
    var default: Boolean
    
    /**
      * An optional factory function, used e.g. by collections when wrapping JS objects as AST nodes.
      */
    var createNode: js.UndefOr[
        js.Function3[/* schema */ Schema, /* value */ Any, /* ctx */ CreateNodeContext, Node[Any]]
      ] = js.undefined
    
    /**
      * If a tag has multiple forms that should be parsed and/or stringified
      * differently, use `format` to identify them.
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * Used by `YAML.createNode` to detect your data type, e.g. using `typeof` or
      * `instanceof`.
      */
    var identify: js.UndefOr[js.Function1[/* value */ Any, Boolean]] = js.undefined
    
    /**
      * The identifier for your data type, with which its stringified form will be
      * prefixed. Should either be a !-prefixed local `!tag`, or a fully qualified
      * `tag:domain,date:foo`.
      */
    var tag: String
  }
  object TagBase {
    
    inline def apply(default: Boolean, tag: String): TagBase = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagBase]
    }
    
    extension [Self <: TagBase](x: Self) {
      
      inline def setCreateNode(value: (/* schema */ Schema, /* value */ Any, /* ctx */ CreateNodeContext) => Node[Any]): Self = StObject.set(x, "createNode", js.Any.fromFunction3(value))
      
      inline def setCreateNodeUndefined: Self = StObject.set(x, "createNode", js.undefined)
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIdentify(value: /* value */ Any => Boolean): Self = StObject.set(x, "identify", js.Any.fromFunction1(value))
      
      inline def setIdentifyUndefined: Self = StObject.set(x, "identify", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
}
