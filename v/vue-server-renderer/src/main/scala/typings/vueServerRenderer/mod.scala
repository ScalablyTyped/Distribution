package typings.vueServerRenderer

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Readable
import typings.std.Error
import typings.vue.vnodeMod.VNode
import typings.vue.vnodeMod.VNodeDirective
import typings.vue.vueMod.Vue
import typings.vueServerRenderer.vueServerRendererStrings.once
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vue-server-renderer", "createBundleRenderer")
  @js.native
  def createBundleRenderer(bundle: String): BundleRenderer = js.native
  @JSImport("vue-server-renderer", "createBundleRenderer")
  @js.native
  def createBundleRenderer(bundle: String, options: BundleRendererOptions): BundleRenderer = js.native
  @JSImport("vue-server-renderer", "createBundleRenderer")
  @js.native
  def createBundleRenderer(bundle: js.Object): BundleRenderer = js.native
  @JSImport("vue-server-renderer", "createBundleRenderer")
  @js.native
  def createBundleRenderer(bundle: js.Object, options: BundleRendererOptions): BundleRenderer = js.native
  
  @JSImport("vue-server-renderer", "createRenderer")
  @js.native
  def createRenderer(): Renderer = js.native
  @JSImport("vue-server-renderer", "createRenderer")
  @js.native
  def createRenderer(options: RendererOptions): Renderer = js.native
  
  @js.native
  trait BundleRenderer extends StObject {
    
    def renderToStream(): Readable = js.native
    def renderToStream(context: js.Object): Readable = js.native
    
    def renderToString(): js.Promise[String] = js.native
    def renderToString(callback: RenderCallback): Unit = js.native
    def renderToString(context: js.Object): js.Promise[String] = js.native
    def renderToString(context: js.Object, callback: RenderCallback): Unit = js.native
  }
  
  @js.native
  trait BundleRendererOptions extends RendererOptions {
    
    var basedir: js.UndefOr[String] = js.native
    
    var clientManifest: js.UndefOr[js.Object] = js.native
    
    var runInNewContext: js.UndefOr[Boolean | once] = js.native
    
    var serializer: js.UndefOr[js.Function1[/* state */ js.Object, String]] = js.native
  }
  object BundleRendererOptions {
    
    @scala.inline
    def apply(): BundleRendererOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundleRendererOptions]
    }
    
    @scala.inline
    implicit class BundleRendererOptionsMutableBuilder[Self <: BundleRendererOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      @scala.inline
      def setClientManifest(value: js.Object): Self = StObject.set(x, "clientManifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientManifestUndefined: Self = StObject.set(x, "clientManifest", js.undefined)
      
      @scala.inline
      def setRunInNewContext(value: Boolean | once): Self = StObject.set(x, "runInNewContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunInNewContextUndefined: Self = StObject.set(x, "runInNewContext", js.undefined)
      
      @scala.inline
      def setSerializer(value: /* state */ js.Object => String): Self = StObject.set(x, "serializer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSerializerUndefined: Self = StObject.set(x, "serializer", js.undefined)
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
  
  type RenderCallback = js.Function2[/* err */ Error | Null, /* html */ String, Unit]
  
  @js.native
  trait Renderer extends StObject {
    
    def renderToStream(vm: Vue): Readable = js.native
    def renderToStream(vm: Vue, context: js.Object): Readable = js.native
    
    def renderToString(vm: Vue): js.Promise[String] = js.native
    def renderToString(vm: Vue, callback: RenderCallback): Unit = js.native
    def renderToString(vm: Vue, context: js.Object): js.Promise[String] = js.native
    def renderToString(vm: Vue, context: js.Object, callback: RenderCallback): Unit = js.native
  }
  
  @js.native
  trait RendererOptions extends StObject {
    
    var cache: js.UndefOr[RenderCache] = js.native
    
    var directives: js.UndefOr[
        StringDictionary[js.Function2[/* vnode */ VNode, /* dir */ VNodeDirective, Unit]]
      ] = js.native
    
    var inject: js.UndefOr[Boolean] = js.native
    
    var shouldPrefetch: js.UndefOr[js.Function2[/* file */ String, /* type */ String, Boolean]] = js.native
    
    var shouldPreload: js.UndefOr[js.Function2[/* file */ String, /* type */ String, Boolean]] = js.native
    
    var template: js.UndefOr[String] = js.native
  }
  object RendererOptions {
    
    @scala.inline
    def apply(): RendererOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RendererOptions]
    }
    
    @scala.inline
    implicit class RendererOptionsMutableBuilder[Self <: RendererOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: RenderCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setDirectives(value: StringDictionary[js.Function2[/* vnode */ VNode, /* dir */ VNodeDirective, Unit]]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
      
      @scala.inline
      def setInject(value: Boolean): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      @scala.inline
      def setShouldPrefetch(value: (/* file */ String, /* type */ String) => Boolean): Self = StObject.set(x, "shouldPrefetch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShouldPrefetchUndefined: Self = StObject.set(x, "shouldPrefetch", js.undefined)
      
      @scala.inline
      def setShouldPreload(value: (/* file */ String, /* type */ String) => Boolean): Self = StObject.set(x, "shouldPreload", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShouldPreloadUndefined: Self = StObject.set(x, "shouldPreload", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
}
