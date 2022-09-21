package typings.vueServerRenderer

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Readable
import typings.vueRuntimeCore.mod.RendererElement
import typings.vueRuntimeCore.mod.RendererNode
import typings.vueRuntimeCore.mod.VNode
import typings.vueServerRenderer.vueServerRendererStrings.once
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vue-server-renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBundleRenderer(bundle: String): BundleRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("createBundleRenderer")(bundle.asInstanceOf[js.Any]).asInstanceOf[BundleRenderer]
  inline def createBundleRenderer(bundle: String, options: BundleRendererOptions): BundleRenderer = (^.asInstanceOf[js.Dynamic].applyDynamic("createBundleRenderer")(bundle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BundleRenderer]
  inline def createBundleRenderer(bundle: js.Object): BundleRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("createBundleRenderer")(bundle.asInstanceOf[js.Any]).asInstanceOf[BundleRenderer]
  inline def createBundleRenderer(bundle: js.Object, options: BundleRendererOptions): BundleRenderer = (^.asInstanceOf[js.Dynamic].applyDynamic("createBundleRenderer")(bundle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BundleRenderer]
  
  inline def createRenderer(): Renderer = ^.asInstanceOf[js.Dynamic].applyDynamic("createRenderer")().asInstanceOf[Renderer]
  inline def createRenderer(options: RendererOptions): Renderer = ^.asInstanceOf[js.Dynamic].applyDynamic("createRenderer")(options.asInstanceOf[js.Any]).asInstanceOf[Renderer]
  
  @js.native
  trait BundleRenderer extends StObject {
    
    def renderToStream(): Readable = js.native
    def renderToStream(context: js.Object): Readable = js.native
    
    def renderToString(): js.Promise[String] = js.native
    def renderToString(callback: RenderCallback): Unit = js.native
    def renderToString(context: js.Object): js.Promise[String] = js.native
    def renderToString(context: js.Object, callback: RenderCallback): Unit = js.native
  }
  
  trait BundleRendererOptions
    extends StObject
       with RendererOptions {
    
    var basedir: js.UndefOr[String] = js.undefined
    
    var clientManifest: js.UndefOr[js.Object] = js.undefined
    
    var runInNewContext: js.UndefOr[Boolean | once] = js.undefined
    
    var serializer: js.UndefOr[js.Function1[/* state */ js.Object, String]] = js.undefined
  }
  object BundleRendererOptions {
    
    inline def apply(): BundleRendererOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundleRendererOptions]
    }
    
    extension [Self <: BundleRendererOptions](x: Self) {
      
      inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      inline def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      inline def setClientManifest(value: js.Object): Self = StObject.set(x, "clientManifest", value.asInstanceOf[js.Any])
      
      inline def setClientManifestUndefined: Self = StObject.set(x, "clientManifest", js.undefined)
      
      inline def setRunInNewContext(value: Boolean | once): Self = StObject.set(x, "runInNewContext", value.asInstanceOf[js.Any])
      
      inline def setRunInNewContextUndefined: Self = StObject.set(x, "runInNewContext", js.undefined)
      
      inline def setSerializer(value: /* state */ js.Object => String): Self = StObject.set(x, "serializer", js.Any.fromFunction1(value))
      
      inline def setSerializerUndefined: Self = StObject.set(x, "serializer", js.undefined)
    }
  }
  
  @js.native
  trait RenderCache extends StObject {
    
    def get(key: String): String | Unit = js.native
    def get(key: String, cb: js.Function1[/* res */ String, Unit]): String | Unit = js.native
    
    var has: js.UndefOr[
        js.Function2[
          /* key */ String, 
          /* cb */ js.UndefOr[js.Function1[/* hit */ Boolean, Unit]], 
          Boolean | Unit
        ]
      ] = js.native
    
    def set(key: String, `val`: String): Unit = js.native
  }
  
  type RenderCallback = js.Function2[/* err */ js.Error | Null, /* html */ String, Unit]
  
  @js.native
  trait Renderer extends StObject {
    
    def renderToStream(
      vm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
    ): Readable = js.native
    def renderToStream(
      vm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any,
      context: js.Object
    ): Readable = js.native
    
    def renderToString(
      vm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
    ): js.Promise[String] = js.native
    def renderToString(
      vm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any,
      callback: RenderCallback
    ): Unit = js.native
    def renderToString(
      vm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any,
      context: js.Object
    ): js.Promise[String] = js.native
    def renderToString(
      vm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any,
      context: js.Object,
      callback: RenderCallback
    ): Unit = js.native
  }
  
  trait RendererOptions extends StObject {
    
    var cache: js.UndefOr[RenderCache] = js.undefined
    
    var directives: js.UndefOr[
        StringDictionary[
          js.Function2[
            /* vnode */ VNode[RendererNode, RendererElement, StringDictionary[Any]], 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNodeDirective */ /* dir */ Any, 
            Unit
          ]
        ]
      ] = js.undefined
    
    var inject: js.UndefOr[Boolean] = js.undefined
    
    var shouldPrefetch: js.UndefOr[js.Function2[/* file */ String, /* type */ String, Boolean]] = js.undefined
    
    var shouldPreload: js.UndefOr[js.Function2[/* file */ String, /* type */ String, Boolean]] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
  }
  object RendererOptions {
    
    inline def apply(): RendererOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RendererOptions]
    }
    
    extension [Self <: RendererOptions](x: Self) {
      
      inline def setCache(value: RenderCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setDirectives(
        value: StringDictionary[
              js.Function2[
                /* vnode */ VNode[RendererNode, RendererElement, StringDictionary[Any]], 
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNodeDirective */ /* dir */ Any, 
                Unit
              ]
            ]
      ): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
      
      inline def setInject(value: Boolean): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      inline def setShouldPrefetch(value: (/* file */ String, /* type */ String) => Boolean): Self = StObject.set(x, "shouldPrefetch", js.Any.fromFunction2(value))
      
      inline def setShouldPrefetchUndefined: Self = StObject.set(x, "shouldPrefetch", js.undefined)
      
      inline def setShouldPreload(value: (/* file */ String, /* type */ String) => Boolean): Self = StObject.set(x, "shouldPreload", js.Any.fromFunction2(value))
      
      inline def setShouldPreloadUndefined: Self = StObject.set(x, "shouldPreload", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
}
