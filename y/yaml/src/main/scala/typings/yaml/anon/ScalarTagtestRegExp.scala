package typings.yaml.anon

import typings.yaml.createNodeMod.CreateNodeContext
import typings.yaml.optionsMod.ParseOptions
import typings.yaml.scalarMod.Scalar
import typings.yaml.schemaSchemaMod.Schema
import typings.yaml.stringifyMod.StringifyContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined yaml.yaml/dist/schema/types.ScalarTag & {  test :std.RegExp} */
trait ScalarTagtestRegExp extends StObject {
  
  /**
    * If `true`, together with `test` allows for values to be stringified without
    * an explicit tag. For most cases, it's unlikely that you'll actually want to
    * use this, even if you first think you do.
    */
  var default: Boolean
  
  var collection: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * An optional factory function, used e.g. by collections when wrapping JS objects as AST nodes.
    */
  var createNode: js.UndefOr[
    js.Function3[
      /* schema */ Schema, 
      /* value */ Any, 
      /* ctx */ CreateNodeContext, 
      typings.yaml.nodeMod.Node[Any]
    ]
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
    * The identifier for your data type, with which its stringified form will be
    * prefixed. Should either be a !-prefixed local `!tag`, or a fully qualified
    * `tag:domain,date:foo`.
    */
  var tag: String
  
  /**
    * Together with `default` allows for values to be stringified without an
    * explicit tag and detected using a regular expression. For most cases, it's
    * unlikely that you'll actually want to use these, even if you first think
    * you do.
    */
  var test: js.UndefOr[js.RegExp] & js.RegExp
}
object ScalarTagtestRegExp {
  
  inline def apply(
    default: Boolean,
    resolve: (String, js.Function1[/* message */ String, Unit], ParseOptions) => Any,
    tag: String,
    test: js.UndefOr[js.RegExp] & js.RegExp
  ): ScalarTagtestRegExp = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], resolve = js.Any.fromFunction3(resolve), tag = tag.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalarTagtestRegExp]
  }
  
  extension [Self <: ScalarTagtestRegExp](x: Self) {
    
    inline def setCreateNode(
      value: (/* schema */ Schema, /* value */ Any, /* ctx */ CreateNodeContext) => typings.yaml.nodeMod.Node[Any]
    ): Self = StObject.set(x, "createNode", js.Any.fromFunction3(value))
    
    inline def setCreateNodeUndefined: Self = StObject.set(x, "createNode", js.undefined)
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIdentify(value: /* value */ Any => Boolean): Self = StObject.set(x, "identify", js.Any.fromFunction1(value))
    
    inline def setIdentifyUndefined: Self = StObject.set(x, "identify", js.undefined)
    
    inline def setResolve(value: (String, js.Function1[/* message */ String, Unit], ParseOptions) => Any): Self = StObject.set(x, "resolve", js.Any.fromFunction3(value))
    
    inline def setStringify(
      value: (/* item */ Scalar[Any], /* ctx */ StringifyContext, /* onComment */ js.UndefOr[js.Function0[Unit]], /* onChompKeep */ js.UndefOr[js.Function0[Unit]]) => String
    ): Self = StObject.set(x, "stringify", js.Any.fromFunction4(value))
    
    inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTest(value: js.UndefOr[js.RegExp] & js.RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
