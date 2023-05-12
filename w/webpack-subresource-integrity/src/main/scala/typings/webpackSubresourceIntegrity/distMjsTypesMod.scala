package typings.webpackSubresourceIntegrity

import typings.htmlWebpackPlugin.mod.Hooks
import typings.std.Map
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.Set
import typings.webpack.mod.Compilation
import typings.webpackSubresourceIntegrity.webpackSubresourceIntegrityBooleans.`false`
import typings.webpackSubresourceIntegrity.webpackSubresourceIntegrityBooleans.`true`
import typings.webpackSubresourceIntegrity.webpackSubresourceIntegrityStrings.`lazy`
import typings.webpackSubresourceIntegrity.webpackSubresourceIntegrityStrings.auto
import typings.webpackSubresourceIntegrity.webpackSubresourceIntegrityStrings.eager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.webpackSubresourceIntegrity.webpackSubresourceIntegrityStrings.js_
    - typings.webpackSubresourceIntegrity.webpackSubresourceIntegrityStrings.css
  */
  trait AssetType extends StObject
  object AssetType {
    
    inline def css: typings.webpackSubresourceIntegrity.webpackSubresourceIntegrityStrings.css = "css".asInstanceOf[typings.webpackSubresourceIntegrity.webpackSubresourceIntegrityStrings.css]
    
    inline def js_ : typings.webpackSubresourceIntegrity.webpackSubresourceIntegrityStrings.js_ = "js".asInstanceOf[typings.webpackSubresourceIntegrity.webpackSubresourceIntegrityStrings.js_]
  }
  
  trait Graph[T] extends StObject {
    
    var edges: Map[T, Set[T]]
    
    var vertices: Set[T]
  }
  object Graph {
    
    inline def apply[T](edges: Map[T, Set[T]], vertices: Set[T]): Graph[T] = {
      val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Graph[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Graph[?], T] (val x: Self & Graph[T]) extends AnyVal {
      
      inline def setEdges(value: Map[T, Set[T]]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      inline def setVertices(value: Set[T]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    }
  }
  
  trait HWPAssets extends StObject {
    
    var css: js.Array[String]
    
    var favicon: js.UndefOr[String] = js.undefined
    
    @JSName("js")
    var js_ : js.Array[String]
    
    var manifest: js.UndefOr[String] = js.undefined
    
    var publicPath: String
  }
  object HWPAssets {
    
    inline def apply(css: js.Array[String], js_ : js.Array[String], publicPath: String): HWPAssets = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any])
      __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
      __obj.asInstanceOf[HWPAssets]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HWPAssets] (val x: Self) extends AnyVal {
      
      inline def setCss(value: js.Array[String]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssVarargs(value: String*): Self = StObject.set(x, "css", js.Array(value*))
      
      inline def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      inline def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
      
      inline def setJs_(value: js.Array[String]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      inline def setJs_Varargs(value: String*): Self = StObject.set(x, "js", js.Array(value*))
      
      inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    }
  }
  
  type HtmlTagObject = typings.htmlWebpackPlugin.mod.HtmlTagObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends webpack-subresource-integrity.webpack-subresource-integrity/dist/mjs/types.ImmutablePrimitive ? T : T extends std.Map<infer K, infer V> ? webpack-subresource-integrity.webpack-subresource-integrity/dist/mjs/types.ImmutableMap<K, V> : T extends std.Set<infer M> ? webpack-subresource-integrity.webpack-subresource-integrity/dist/mjs/types.ImmutableSet<M> : webpack-subresource-integrity.webpack-subresource-integrity/dist/mjs/types.ImmutableObject<T>
    }}}
    */
  type Immutable[T] = T
  
  type ImmutableMap[K, V] = ReadonlyMap[Immutable[K], Immutable[V]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {readonly [ P in keyof T ]: webpack-subresource-integrity.webpack-subresource-integrity/dist/mjs/types.Immutable<T[P]>}
    }}}
    */
  @js.native
  trait ImmutableObject[T] extends StObject
  
  type ImmutablePrimitive = js.UndefOr[String | Double | Boolean | Null]
  
  type ImmutableSet[T] = ReadonlySet[Immutable[T]]
  
  type KeysOfType[T, TProp] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P] extends TProp? P : never}[keyof T] */ js.Any
  
  trait StronglyConnectedComponent[T] extends StObject {
    
    var nodes: Set[T]
  }
  object StronglyConnectedComponent {
    
    inline def apply[T](nodes: Set[T]): StronglyConnectedComponent[T] = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[StronglyConnectedComponent[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StronglyConnectedComponent[?], T] (val x: Self & StronglyConnectedComponent[T]) extends AnyVal {
      
      inline def setNodes(value: Set[T]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubresourceIntegrityPluginOptions extends StObject {
    
    val enabled: js.UndefOr[auto | `true` | `false`] = js.undefined
    
    val hashFuncNames: js.UndefOr[Array[String]] = js.undefined
    
    val hashLoading: js.UndefOr[eager | `lazy`] = js.undefined
  }
  object SubresourceIntegrityPluginOptions {
    
    inline def apply(): SubresourceIntegrityPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubresourceIntegrityPluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubresourceIntegrityPluginOptions] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: auto | `true` | `false`): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHashFuncNames(value: Array[String]): Self = StObject.set(x, "hashFuncNames", value.asInstanceOf[js.Any])
      
      inline def setHashFuncNamesUndefined: Self = StObject.set(x, "hashFuncNames", js.undefined)
      
      inline def setHashLoading(value: eager | `lazy`): Self = StObject.set(x, "hashLoading", value.asInstanceOf[js.Any])
      
      inline def setHashLoadingUndefined: Self = StObject.set(x, "hashLoading", js.undefined)
    }
  }
  
  /* Inlined std.Required<webpack-subresource-integrity.webpack-subresource-integrity/dist/mjs/types.SubresourceIntegrityPluginOptions> */
  trait SubresourceIntegrityPluginResolvedOptions extends StObject {
    
    var enabled: auto | `true` | `false`
    
    var hashFuncNames: Array[String]
    
    var hashLoading: eager | `lazy`
  }
  object SubresourceIntegrityPluginResolvedOptions {
    
    inline def apply(enabled: auto | `true` | `false`, hashFuncNames: Array[String], hashLoading: eager | `lazy`): SubresourceIntegrityPluginResolvedOptions = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], hashFuncNames = hashFuncNames.asInstanceOf[js.Any], hashLoading = hashLoading.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubresourceIntegrityPluginResolvedOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubresourceIntegrityPluginResolvedOptions] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: auto | `true` | `false`): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setHashFuncNames(value: Array[String]): Self = StObject.set(x, "hashFuncNames", value.asInstanceOf[js.Any])
      
      inline def setHashLoading(value: eager | `lazy`): Self = StObject.set(x, "hashLoading", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ key in webpack-subresource-integrity.webpack-subresource-integrity/dist/mjs/types.AssetType ]: std.Array<string>} */
  trait TemplateFiles extends StObject {
    
    var css: js.Array[String]
    
    @JSName("js")
    var js_ : js.Array[String]
  }
  object TemplateFiles {
    
    inline def apply(css: js.Array[String], js_ : js.Array[String]): TemplateFiles = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
      __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateFiles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TemplateFiles] (val x: Self) extends AnyVal {
      
      inline def setCss(value: js.Array[String]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssVarargs(value: String*): Self = StObject.set(x, "css", js.Array(value*))
      
      inline def setJs_(value: js.Array[String]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      inline def setJs_Varargs(value: String*): Self = StObject.set(x, "js", js.Array(value*))
    }
  }
  
  trait WSIHWPAssets
    extends StObject
       with HWPAssets {
    
    var cssIntegrity: js.Array[String]
    
    var jsIntegrity: js.Array[String]
  }
  object WSIHWPAssets {
    
    inline def apply(
      css: js.Array[String],
      cssIntegrity: js.Array[String],
      jsIntegrity: js.Array[String],
      js_ : js.Array[String],
      publicPath: String
    ): WSIHWPAssets = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], cssIntegrity = cssIntegrity.asInstanceOf[js.Any], jsIntegrity = jsIntegrity.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any])
      __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
      __obj.asInstanceOf[WSIHWPAssets]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WSIHWPAssets] (val x: Self) extends AnyVal {
      
      inline def setCssIntegrity(value: js.Array[String]): Self = StObject.set(x, "cssIntegrity", value.asInstanceOf[js.Any])
      
      inline def setCssIntegrityVarargs(value: String*): Self = StObject.set(x, "cssIntegrity", js.Array(value*))
      
      inline def setJsIntegrity(value: js.Array[String]): Self = StObject.set(x, "jsIntegrity", value.asInstanceOf[js.Any])
      
      inline def setJsIntegrityVarargs(value: String*): Self = StObject.set(x, "jsIntegrity", js.Array(value*))
    }
  }
  
  type WSIHWPAssetsIntegrityKey = KeysOfType[WSIHWPAssets, js.Array[String]]
  
  type getHtmlWebpackPluginHooksType = js.Function1[/* compilation */ Compilation, Hooks]
}
